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

    public AdminPanelPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//span[normalize-space()='Nombuso']")
    WebElement userMenu_xpath;

    @FindBy(xpath = "//button[@class='nav-dropdown-item']//span[contains(text(),'Admin Panel')]")
    WebElement adminPanel_xpath;
    @FindBy(xpath = "//button[.//span[contains(text(),'\uD83D\uDCC1')] and contains(.,'Groups')]")
    WebElement groupsSidebar_xpath;

    @FindBy(xpath = " //button[normalize-space()='+ Create New Group']")
    WebElement createNewGroupButton_xpath;

    @FindBy(xpath = "//input[@placeholder='e.g., 2nd Group 2026']")
    WebElement groupName_xpath;
    @FindBy(xpath = "//textarea[@placeholder='Group description...']")
    WebElement groupDescription_xpath;

    @FindBy(xpath = "//input[@name='year']")
    //@FindBy(xpath = "input[value='2026']")
    WebElement groupYear_xpath;

    @FindBy(xpath = "//input[@placeholder='Unlimited']")
    WebElement groupCapacity_xpath;



    public void clickUserMenu(){
        new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf( userMenu_xpath));
        userMenu_xpath.click();
    }
    public void  clickOnAdminPanel(){
        new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf( adminPanel_xpath));
        adminPanel_xpath.click();
    }

    public void clickGroupsOnSidebar(){
        new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf( groupsSidebar_xpath));
        groupsSidebar_xpath.click();
    }

    public void clickOnCreateNewGroupButton(){

        new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf( createNewGroupButton_xpath));
        createNewGroupButton_xpath.click();
    }

    public void enterGroupName(String groupName ){
        groupName_xpath.sendKeys(groupName);

    }
    public void enterGroupDescription(String description){
        groupDescription_xpath.sendKeys(description);
    }
    public void enterGroupYear(String year){
        groupYear_xpath.sendKeys(year);
    }

    public void enterGroupMaxCapacity(String maxCapacity){
        groupCapacity_xpath.sendKeys(maxCapacity);
    }

    //public void selectStartDate(String startDate) {

       // driver.findElement(
               //         By.xpath("//label[contains(text(),'Start Date')]/following::input[1]"))
               // .click();

       // driver.findElement(
                      //  By.xpath("//button[normalize-space()='" + startDate + "']"))
                //.click();
    //}





}
