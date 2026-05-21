package Pages;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;
    public void clickLoginButton() {
        loginButton_xpath.click();
    }

    @FindBy(xpath = "//span[text()='Login']")
    WebElement loginButton_xpath;

    @FindBy(xpath = "//span[normalize-space()='Access Learning Materials']")
    WebElement loginHeading_xpath;

    @FindBy(id = "login-email")
    WebElement login_emailId;
    @FindBy(id = "login-password")
    WebElement login_passwordId;

    @FindBy(id = "login-submit")
    WebElement login_submitId;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }




    public void verifyLoginPageIsDisplayed() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("loginHeading_xpath")));
        loginHeading_xpath.isDisplayed();
    }

    public void enterLoginAdminEmail(String email) {
        login_emailId.sendKeys(email);
    }

    public void enterLoginAdminPassword(String password) {
        login_passwordId.sendKeys(password);
    }

    public void clickSubmitButton() {
        login_submitId.click();
    }


}
