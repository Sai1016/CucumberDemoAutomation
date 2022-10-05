package StepDefinition;

import PageObjectPackage.DemoPageClass;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Step {
    WebDriver driver;
    DemoPageClass dp;
    @Given("chrome browser is open")
    public void chrome_browser_is_open() {
        System.setProperty("webdriver.chrome.driver","//Users//saimadhavi//Downloads//chromedriver");
        driver = new ChromeDriver();
        dp = new DemoPageClass(driver);
    }
    @When("user opens url {string}  webpage")
    public void user_opens_url_webpage(String string) throws InterruptedException {
        driver.get(string);
        Thread.sleep(3000);
        driver.manage().window().maximize();

    }
    @When("user enters FullName as {string} and {string}")
    public void user_enters_full_name_as_and(String string, String string2) {
        dp.VerifyFname(string);
        dp.VerifyLName(string2);
    }
    @When("user enters {string}")
    public void user_enters(String string) {
        dp.VerifyLAddress(string);
    }
    @When("user enter {string}")
    public void user_enter(String string) {
        dp.VerifyLEmail(string);
    }
    @When("user clicks on {string}")
    public void user_clicks_on(String string) {
        dp.VerifyLPhone(string);
    }
    @When("user clicks on Cricket as hobbies;")
    public void user_clicks_on_cricket_as_hobbies() {
        dp.VerifyCricket("Cricket");
    }
    @When("user clicks on Language")
    public void user_clicks_on_language() {
        dp.VerifyLang();
    }
    @When("user clicks on Skills")
    public void user_clicks_on_skills() {
        dp.Verifydrop();
    }
    @When("user clicks on Country")
    public void user_clicks_on_country() {
       dp.VerifyCounty();
    }
    @When("user selects on {string}")
    public void user_selects_on(String string) {
        dp.VerifyDOB();
    }
    @When("clicks on {string}")
    public void clicks_on(String string) {
        dp.Verifypwd(string);
    }
    @Then("user clicks on Submit button")
    public void user_clicks_on_submit_button() {
        dp.VerifySignin();
    }
    @Then("close browser")
    public void close_browser() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
