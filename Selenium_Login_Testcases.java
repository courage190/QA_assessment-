import java.net.MalformedURLException;

import java.net.URL;

import java.util.HashMap;



import org.openqa.selenium.By;

import org.openqa.selenium.MutableCapabilities;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.remote.RemoteWebDriver;

import org.testng.Assert;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;



public class LoginAutomation {

    
    public static String username = "<username>";


    WebDriver driver;

    String url = "https://www.automationexercise.com/";

    MutableCapabilities capabilities = new MutableCapabilities();

    HashMap<String, Object> bstackOptions = new HashMap<String, Object>();
    

    @BeforeTest

    public void setUp() throws MalformedURLException {

        capabilities.setCapability("browserName", "Chrome");

        bstackOptions.put("os", "Windows");

        bstackOptions.put("osVersion", "11");

        bstackOptions.put("browserVersion", "latest"); 

        bstackOptions.put("consoleLogs", "info"); 

        bstackOptions.put("seleniumVersion", "3.14.0");

        capabilities.setCapability("bstack:options", bstackOptions);

        driver = new RemoteWebDriver(new URL(URL), capabilities);

        driver.get(url);

        driver.manage().window().maximize();

    }   
    

    @Test

    public void login() {       

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        WebElement username = driver.findElement(By.cssSelector("input#user_email_login"));

        WebElement password = driver.findElement(By.cssSelector("input#user_password"));

        WebElement login = driver.findElement(By.name("commit"));

        username.sendKeys("youremail@domain.com");

        password.sendKeys("yourpassword");

        login.click();

        String actualUrl = "https://www.automationexercise.com/dashboard";

        String expectedUrl = driver.getCurrentUrl();

        Assert.assertEquals(expectedUrl, actualUrl);

    }

    @Test

    public void invalidlogin() {       

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        WebElement username = driver.findElement(By.id("username"));

        WebElement password = driver.findElement(By.cssSelector("password"));

        WebElement login = driver.findElement(By.name("commit"));

        username.sendKeys("your@domain.com");

        password.sendKeys("yourpassword");

        login.click();

        String actualUrl = "https://www.automationexercise.com/dashboard";

        String expectedUrl = driver.getCurrentUrl();

        Assert.assertEquals(expectedUrl, actualUrl);

          //Assertion of invalid login error message

          String actualResponse = "Invalid Username or Password";

          String expectedResponse = driver.getResponse();
  
          Assert.assertEquals(expectedResponse, actualResponse);

    }

    @Test

    public void invalidloginPassword() {    

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        WebElement username = driver.findElement(By.cssSelector("input#user_email_login"));

        WebElement password = driver.findElement(By.cssSelector("input#user_password"));

        WebElement login = driver.findElement(By.name("commit"));

        username.sendKeys("youremail@domain.com");

        password.sendKeys("your");

        login.click();

        String actualUrl = "https://www.automationexercise.com/dashboard";

        String expectedUrl = driver.getCurrentUrl();

        Assert.assertEquals(expectedUrl, actualUrl);

        //Assertion of invalid login error message

        String actualResponse = "Invalid Username or Password";

        String expectedResponse = driver.getResponse();

        Assert.assertEquals(expectedResponse, actualResponse);
    }


}