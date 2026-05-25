package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

    @FindBy(xpath = " //span[normalize-space()='Menu']")
    WebElement userMenu_xpath;


    @FindBy(xpath = "//button[contains(@class,'nav-dropdown-item')]//span[normalize-space()='Admin Panel']")
    //@FindBy(xpath = "//button[@class='nav-dropdown-item']//span[contains(text(),'Admin Panel')]")
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
    WebElement groupYear_xpath;

    @FindBy(xpath = "//input[@placeholder='Unlimited']")
    WebElement groupCapacity_xpath;
    @FindBy(xpath = "//input[@name='startDate']")
    WebElement startdate_xpath;
    @FindBy(xpath = "//input[@name='endDate']")
    WebElement end_date_xpath;
    @FindBy(xpath = " //button[@type='submit']")
    WebElement create_groupButton_xpath;



    public void clickUserMenu(){
        new WebDriverWait(driver,Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf( userMenu_xpath));
        userMenu_xpath.click();
    }
    public void  clickOnAdminPanel(){
        new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf( adminPanel_xpath));
        adminPanel_xpath.click();
    }

    public void clickGroupsOnSidebar(){
        new WebDriverWait(driver,Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf( groupsSidebar_xpath));
        groupsSidebar_xpath.click();
    }

    public void clickOnCreateNewGroupButton(){

        new WebDriverWait(driver,Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf( createNewGroupButton_xpath));
        createNewGroupButton_xpath.click();
    }

    public void enterGroupName(String groupName ){
        groupName_xpath.sendKeys(groupName);

    }
    public void enterGroupDescription(String description){
        groupDescription_xpath.sendKeys(description);
    }
    public void enterGroupYear(String year){
        groupYear_xpath.clear();
        groupYear_xpath.sendKeys(year);
    }

    public void enterGroupMaxCapacity(String maxCapacity){
        groupCapacity_xpath.sendKeys(maxCapacity);
    }

   public void selectStartDate(String startDate)  {

       startdate_xpath.click();
       startdate_xpath.clear();
       startdate_xpath.sendKeys(startDate);
    }

    public void enterEnd_date(String endDate){
        end_date_xpath.click();
        end_date_xpath.clear();
        end_date_xpath.sendKeys(endDate);
    }

    public void clickOnCreateGroupButton(){
        new WebDriverWait(driver,Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(create_groupButton_xpath));
        create_groupButton_xpath.click();
    }


}
