# QA_assessment
1. Install Cypress
Follow these instructions to install Cypress.

## clone this repo to a local directory
git clone https://github.com/<your-username>/QA_assesment.git

## cd into the cloned repo
cd QA_assesment

## install the node_modules
npm install
npm install cypress --save-dev

## start cypress
npx Cypress open
The npm start script will spawn cypress.
Navigate to the spec file

3. Add the project to Cypress
Follow these instructions to add the project to Cypress.

4. Run in Continuous Integration
Follow these instructions to run the tests in CI.


## Getting Started with Selenium installation
Eclipse - https://courses.in28minutes.com/p/eclipse-tutorial-for-beginners
Maven - https://courses.in28minutes.com/p/maven-tutorial-for-beginners-in-5-steps
JUnit - https://courses.in28minutes.com/p/junit-tutorial-for-beginners
Mockito - https://courses.in28minutes.com/p/mockito-for-beginner-in-5-steps

## Installing Tools
Installation Video : https://www.youtube.com/playlist?list=PLBBog2r6uMCSmMVTW_QmDLyASBvovyAO3
GIT Repository For Installation : https://github.com/in28minutes/getting-started-in-5-steps
PDF : https://github.com/in28minutes/SpringIn28Minutes/blob/master/InstallationGuide-JavaEclipseAndMaven_v2.pdf

## Running Examples
Download the zip or clone the Git repository.
Unzip the zip file (if you downloaded one).
Open Command Prompt and Change directory (cd) to folder containing pom.xml
Open Eclipse
File -> Import -> Existing Maven Project -> Navigate to the folder where you unzipped the zip
Select the right project
Choose the Spring Boot Application file (search for file with @SpringBootApplication)
Right Click on the file and Run as Java Application
You are all Set
For help : use our installation guide - https://www.youtube.com/playlist?list=PLBBog2r6uMCSmMVTW_QmDLyASBvovyAO3
References
Selenium Standalone
Manual Installation - https://github.com/lmc-eu/steward/wiki/Selenium-server-&-browser-drivers
Automated Installation - https://www.npmjs.com/package/selenium-standalone
URL - http://localhost:4444/wd/hub
Installation and Launch
Step I : Install NPM
Step II : Install selenium-standalone Terminal or Command Prompt
# In Windows, Run CMD as Administrator

npm install selenium-standalone@latest -g
# If need use sudo npm install selenium-standalone@latest -g

selenium-standalone install
# if needed use sudo 
Step III : Launch Selenium Standalone
selenium-standalone start
By default, google chrome, firefox and phantomjs are available when installed on the host system

# install a single driver within the default list (chrome, ie, edge, firefox) 
selenium-standalone install --singleDriverInstall=chrome
Reference

More Options - https://www.npmjs.com/package/selenium-standalone#command-line-interface
Selenium Grid
URL -http://localhost:4444/grid/console
Installation and Launch
Follow Step I and II of Selenium Standalone
Step III
selenium-standalone start -- -role hub
selenium-standalone start -- -role node -hub http://localhost:4444/grid/register
selenium-standalone start -- -role node -hub http://localhost:4444/grid/register -port 5556

selenium-standalone start -- -role node -hub http://localhost:4444/grid/register -browser browserName=firefox

selenium-andalone start -- -role node -hub http://localhost:4444/grid/register -port 5556 -browser browserName=chrome,maxInstances=2
Code Snippets
Maven Dependencies
JUnit
  <dependencies>
  
    <dependency>
      <groupId>org.seleniumhq.selenium</groupId>
      <artifactId>selenium-java</artifactId>
      <version>3.13.0</version>
      <scope>test</scope>
    </dependency>

  
    <!-- https://github.com/bonigarcia/webdrivermanager -->
    <dependency>
      <groupId>io.github.bonigarcia</groupId>
      <artifactId>webdrivermanager</artifactId>
      <version>2.2.4</version>
      <scope>test</scope>
    </dependency>

    <dependency>
      <groupId>ch.qos.logback</groupId>
      <artifactId>logback-classic</artifactId>
      <version>1.0.13</version>
      <scope>test</scope>
    </dependency>

    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.12</version>
      <scope>test</scope>
    </dependency>
  
  </dependencies>
Test NG
  <dependencies>

    <dependency>
      <groupId>org.seleniumhq.selenium</groupId>
      <artifactId>selenium-java</artifactId>
      <version>3.13.0</version>
      <scope>test</scope>
    </dependency>

    <!-- https://github.com/bonigarcia/webdrivermanager -->
    <dependency>
      <groupId>io.github.bonigarcia</groupId>
      <artifactId>webdrivermanager</artifactId>
      <version>2.2.4</version>
      <scope>test</scope>
    </dependency>

    <dependency>
      <groupId>ch.qos.logback</groupId>
      <artifactId>logback-classic</artifactId>
      <version>1.0.13</version>
      <scope>test</scope>
    </dependency>

    <dependency>
      <groupId>org.testng</groupId>
      <artifactId>testng</artifactId>
      <version>6.14.3</version>
      <scope>test</scope>
    </dependency>

  </dependencies>
Other Dependencies
    <dependency>
      <groupId>org.assertj</groupId>
      <artifactId>assertj-core</artifactId>
      <version>3.10.0</version>
      <scope>test</scope>
    </dependency>

    <dependency>
      <groupId>com.opencsv</groupId>
      <artifactId>opencsv</artifactId>
      <version>3.4</version>
      <scope>test</scope>
    </dependency>

    <dependency>
      <groupId>org.apache.poi</groupId>
      <artifactId>poi</artifactId>
      <version>3.6</version>
      <scope>test</scope>
    </dependency>

    <dependency>
      <groupId>org.apache.poi</groupId>
      <artifactId>poi-ooxml</artifactId>
      <version>3.6</version>
      <scope>test</scope>
    </dependency>
