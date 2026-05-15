package Steps;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Alert;
import org.testng.Assert;

public class regStepsDef {
    WebDriver driver;
    WebElement dropdown;
    Select select;

    @Before
    public void openBrowser() {
        driver = new ChromeDriver();
    }

    @Given("the user is on the {string} registration screen")
    public void the_user_is_on_the_registration_screen(String screenName) {
        driver.get("https://ndosisimplifiedautomation.vercel.app/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[contains(.,'Login')]")).click();
        driver.findElement(By.id("signup-toggle")).click();
    }


    @And("the user enters  First Name (.*)$")
    public void the_user_enters_first_name(String firstName) {
        driver.findElement(By.id("register-firstName")).sendKeys(firstName);

    }
    @And("the user enters Last Name (.*)$")
    public void the_user_enters_last_name(String lastName) {
       driver.findElement(By.id("register-lastName")).sendKeys(lastName);
    }
    @And("the user enters  Email (.*)$")
    public void the_user_enters_email(String email) {

        driver.findElement(By.id("register-email")).sendKeys(email);
    }
    @And("the user enters  Password (.*)$")
    public void the_user_enters_password(String password) {
        driver.findElement(By.id("register-password")).sendKeys(password);
    }
    @And("the user re-enters Password  to Confirm Password (.*)$")
    public void the_user_re_enters_password_to_confirm_password(String ConfirmPassword) {
        driver.findElement(By.id("register-confirmPassword")).sendKeys(ConfirmPassword);

    }
    @And("the user selects QA Group from the Group dropdown (.*)$")
    public void the_user_selects_qa_group_from_the_group_dropdown(String group) {
        dropdown = driver.findElement(By.id("register-group"));
        select = new Select(dropdown);
        select.selectByVisibleText("1st Group 2026 (2026)");
    }
    @And("the user clicks the Create Account button")
    public void the_user_clicks_the_create_account_button() {
        driver.findElement(By.id("register-submit")).click();
    }

    @Then("the account should be created successfully")
    public void the_account_should_be_created_successfully() {
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println("Alert message: " + alertText);
        Assert.assertTrue(alertText.contains("Registration submitted successfully"));
        alert.accept();
    }


    @After
    public void closeBrowser() {
        driver.quit();
    }


}
