package stepDefinitions;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class QAassessmentsteps {

    public static WebDriver driver;

    @Given("I open visp.net in Chrome browser")

    public void i_open_visp_net_in_chrome_browser() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://visp.net");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    //navigate to pricing page
    @When("I go to pricing page")
    public void i_go_to_pricing_page() {

        driver.findElement(By.id("menu-item-40520")).click();
        System.out.println("Pricing page is displayed");
    }

    @Then("I should see three pricing options i.e. {string}, {string}, {string}")
    public void i_should_see_three_pricing_options_i_e(String string, String string2, String string3) {
        System.out.println("The pricing options are:");
        System.out.println(string);
        System.out.println(string2);
        System.out.println(string3);
        driver.close();
    }

    //navigate to bill page
    @When("I go to Bill page")
    public void i_go_to_bill_page() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Bill")).click();
        System.out.println("Billing page is displayed");
    }
    @Then("I should billing features i.e. {string}, {string}")
    public void i_should_billing_features_i_e(String string, String string2) {
        System.out.println("2 sample billing features:");
        System.out.println(string);
        System.out.println(string2);
        driver.close();
    }
    //navigate to grow page
    @When("I go to Grow page")
    public void i_go_to_grow_page() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Grow")).click();
        System.out.println("Grow page is displayed");
    }

    @Then("I should see three steps i.e. {string}, {string}, {string}")
    public void i_should_see_three_steps_i_e(String string, String string2, String string3) {
        System.out.println("There are 3 ways to grow:");
        System.out.println(string);
        System.out.println(string2);
        System.out.println(string3);
        driver.close();
    }

    @When("I click on login")
    public void i_click_on_login() {
        WebElement login = driver.findElement(By.id("et-secondary-nav"));
        login.click();
        System.out.println("Login page is displayed");
    }

    @Then("httpsAppVispNetLoginIsOpenedInANewTab")
    public void httpsappvispnetloginisopenedinanewtab() {
        //get window handlers as list
        List<String> browserTabs = new ArrayList<String>(driver.getWindowHandles());
        //switch to new tab
        driver.switchTo().window(browserTabs.get(1));
        System.out.println("Login page opens in new tab");
    }

    @Then("I can see Username, password, and Sign-in web elements")
    public void i_can_see_username_password_and_sign_in_web_elements()  {

        WebElement username = driver.findElement (By.name("username"));
        WebElement password = driver.findElement (By.name("password"));
        WebElement sign = driver.findElement(By.className("MuiButton-label"));
        System.out.println("3 elements found!");

        String user = username.getAttribute("name");
        String user1 = password.getAttribute("name");
        String user2 = sign.getText();

        System.out.println("first web element is: "+user);
        System.out.println("second web element is: "+user1);
        System.out.println("third web element is: "+user2);
        driver.quit();
        }
}



