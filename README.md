# bdd-gherkin using Java

## Overview:

This is a QA assessment project I created to develop automated test for https://visp.net website.

### **Prerequisites**
-  [Install Java](https://java.com/en/download/)
-  [Install Eclipse IDE for Java](https://www.eclipse.org/downloads/packages/release/indigo/r/eclipse-ide-java-developers)
-  [Install Maven](https://maven.apache.org/download.cgi)
-  [Install Selenium Webdriver](https://www.selenium.dev/documentation/en/selenium_installation/installing_selenium_libraries/)
-  [Install JUnit](https://github.com/junit-team/junit4/wiki/Download-and-Install)
-  [Install Cucumber](https://cucumber.io/docs/installation/java/)
-  [Git for Windows Installer here](https://git-for-windows.github.io/)
-  [Git for Mac installer here](https://sourceforge.net/projects/git-osx-installer/files/)


### **Get Started**
Download the Git repository zip file or clone using git command:
```
$ git clone https://github.com/I-scorpio/bdd-gherkin.git
```
#### **Run code using command line** 
Unzip the zip file (if you downloaded one).
Open the command prompt and cd until the project root directory then execute.
```
mvn test 
```
#### **Running a feature file only from command line**
```
mvn test -Dcucumber.options="QAassessment.feature" 
```
#### **Run code using IDE using IntelliJ** 
-   Unzip the zip file (if you downloaded one).
-   Open IntelliJ
    - File -> New -> Project from Existing Source -> Navigate to the folder where you unzipped the project
    - Select the project name 
######  Proceed to this step if project was cloned
- Navigate to ***src/test/java/runnerTest/runnerTest.java***  
- Right click on the file ***runnerTest.java*** and run 
- You are all Set
