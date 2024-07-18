describe('Login Scenarios', () => {
  it('passes with valid Login credentials', () => {
    cy.visit('https://www.automationexercise.com/');
    cy.get('#username').click();
    cy.get('#username').type('standard_user');
    cy.get('#password').click();
    cy.get('#password').type('secret_sauce');
    cy.get('#login-button').click();

    // Verify successful login by checking URL or any element that appears upon successful login
    cy.url().should('include', '/dashboard'); // Assuming /dashboard is the URL after login
  });

  it('Valid username and a wrong password', () => {
    cy.visit('https://www.automationexercise.com/');
    cy.get('#user-name').click();
    cy.get('#user-name').type('standard_user');
    cy.get('#password').click();
    cy.get('#password').type('InvalidPassword');
    cy.get('#login-button').click();
    // Verify the presence of the error message
    cy.get('#errorMessage').should('be.visible');
  });

  it('Non-profiled username and a valid password', () => {
    cy.visit('https://www.automationexercise.com/');
    cy.get('#user-name').click();
    cy.get('#user-name').type('InvalidUsername');
    cy.get('#password').click();
    cy.get('#password').type('secret_sauce');
    cy.get('#login-button').click();
    // Verify the content of the error message
    cy.get('#errorMessage').should('contain.text', 'Invalid username or password');
  });
})
