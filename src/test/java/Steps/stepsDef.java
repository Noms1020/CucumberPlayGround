package Steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class stepsDef {

    WebDriver driver;

    @Before
    public void openBrowser() {
        driver = new ChromeDriver();
    }


    @Given("I am in login page")
    public void i_am_in_login_page() {
        driver.get("https://ndosisimplifiedautomation.vercel.app/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div/div/nav/div[1]/div[3]/button")).click();
    }

    @And("I enter valid username (.*)$")
    public void i_enter_valid_username_noms_gmail_com(String email) {
        driver.findElement(By.id("login-email")).sendKeys(email);

    }

    @And("I enter valid password (.*)$")
    public void i_enter_valid_password_password(String password) {
        driver.findElement(By.id("login-password")).sendKeys(password);
    }

    @When("I clik on login button")
    public void i_clik_on_login_button() {
        driver.findElement(By.id("login-submit")).click();
    }

    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {

        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[4]/button/span[2]")).isDisplayed();

    }

    @After
    public void closeBrowser(){
        driver.quit();
   }



}
