# Flipkart Automation Testing Project

## Project Name
Flipkart Automation using Selenium WebDriver, Java, Cucumber, Maven, and Page Object Model (POM).

## Tools Used
- Java
- Selenium WebDriver
- Cucumber
- Maven
- Eclipse IDE
- JUnit
- WebDriverManager

## Project Structure

src/main/java
│
├── base
│   └── Baseclass.java
│
└── pom
    └── flipkartpage.java

src/test/java
│
├── com.stepdefinition
│   └── Stepdefinition.java
│
├── hooks
│   └── Hooks.java
│
└── runnerfile
    └── TestRunner.java

src/test/resources
│
└── FeatureFile
    └── flipkart.feature

pom.xml

## Scenario Automated

1. Launch Flipkart
2. Close Login Popup
3. Search Product (iPhone 17)
4. Select First Product
5. Switch to New Window
6. Add Product to Cart
7. Click Place Order
8. Verify Checkout Page
9. Capture Screenshot
10. Close Browser

## Baseclass Methods

- launchBrowser()
- button()
- setText()
- scrollDown()
- scrollUp()
- scrollToElement()
- clickByJS()
- sendTextByJS()
- mouseHover()
- dragAndDrop()
- doubleClick()
- rightClick()
- acceptAlert()
- dismissAlert()
- getAlertText()
- takeScreenshot()

## Design Pattern

Page Object Model (POM)

## Framework

BDD Framework using Cucumber

## Dependencies

- Selenium Java
- Cucumber Java
- Cucumber JUnit
- JUnit
- WebDriverManager
- Apache Commons IO

## Run the Project

1. Import project into Eclipse.
2. Right-click the project.
3. Maven → Update Project.
4. Run TestRunner.java as JUnit Test.

## Reports

After execution, reports are generated in:

target/cucumber-report.html

## Author

Name : Sanjay
Technology : Selenium Automation Testing
Framework : Java + Selenium + Cucumber + Maven + POM
