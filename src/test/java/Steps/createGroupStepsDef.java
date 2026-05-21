package Steps;

import Pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

public class createGroupStepsDef extends Base {

    WebDriver driver;
    WebDriverWait wait;




    @Given("the admin is on the login page")
    public void the_admin_is_on_the_login_page() {
        loginPage.clickLoginButton();
       // loginPage.verifyLoginPageIsDisplayed();

    }

    @And("the admin enters email (.*)$")
    public void the_admin_enters_email(String email) {
        loginPage.enterLoginAdminEmail(email);

    }

    @And("the admin enters password (.*)$")
    public void the_admin_enters_password(String password) {
        loginPage.enterLoginAdminPassword(password);

    }

    @And("the admin clicks the login button")
    public void the_admin_clicks_the_login_button() {
        loginPage.clickSubmitButton();

    }


    @When("the admin clicks on the user menu")
    public void the_admin_clicks_on_the_user_menu() {
        adminPanelPage.clickUserMenu();
    }

    @And("the admin clicks on Admin Panel")
    public void the_admin_clicks_on_admin_panel() {
        adminPanelPage.clickOnAdminPanel();

    }


    @And("the admin clicks on Groups in the sidebar")
    public void the_admin_clicks_on_groups_in_the_sidebar() {
        adminPanelPage.clickGroupsOnSidebar();

    }


    @And("the admin clicks on Create New Group button")
    public void the_admin_clicks_on_create_new_group_button() {
        adminPanelPage.clickOnCreateNewGroupButton();
    }

    @And("the admin enters group name (.*)$")
    public void the_admin_enters_group_name(String groupName) {
        adminPanelPage.enterGroupName(groupName);

    }

    @And("the admin enters group description (.*)$")
    public void the_admin_enters_group_description(String description) {
        adminPanelPage.enterGroupDescription(description);

    }

    @And("the admin enters group year (.*)$")
    public void the_admin_enters_group_year(String year) {
        adminPanelPage.enterGroupYear(year);

    }

    @And("the admin enters max capacity (.*)$")
    public void the_admin_enters_max_capacity(String maxCapacity) {
        adminPanelPage.enterGroupMaxCapacity(maxCapacity);

    }

    @And("the admin enters start date (.*)$")
    public void the_admin_enters_start_date(String startDate) {
       // adminPanelPage.selectStartDate(startDate);

    }

    @And("the admin enters end date (.*)$")
    public void the_admin_enters_end_date(String endDate) {

    }

    @And("the admin clicks the Create Group button")
    public void the_admin_clicks_the_create_group_button() {

    }


    @Then("the admin clicks on the user menu to logout")
    public void the_admin_clicks_on_the_user_menu_to_logout() {

    }

    @And("the admin clicks Logout")
    public void the_admin_clicks_logout() {

    }


    @And("the user navigates to the sign-up page")
    public void the_user_navigates_to_the_sign_up_page() {

    }



    @Then("the group Cucumber First Group {int} with year {int} should be visible in the group dropdown")
    public void the_group_cucumber_first_group_with_year_should_be_visible_in_the_group_dropdown(Integer int1, Integer int2) {
    }






}
