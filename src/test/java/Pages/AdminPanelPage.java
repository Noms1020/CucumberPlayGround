package Pages;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AdminPanelPage {

    WebDriver driver;
    WebDriverWait wait;

    @Before
    public void openBrowser() {
        driver = new ChromeDriver();
       // wait = new WebDriverWait(driver, Duration.ofSeconds(15));


    }


    @FindBy(xpath = "//span[normalize-space()='Nombuso']")
    WebElement userMenu_xpath;


    public void clickUserMenu(){
        new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf( userMenu_xpath));
        //wait.until(ExpectedConditions.visibilityOf(userMenu_xpath));
       // wait.until(ExpectedConditions.elementToBeClickable(By.xpath("userMenu_xpath)")));
        userMenu_xpath.click();

    }


    @After
    public void closeBrowser() {
        driver.quit();
    }

}
