package Steps;

import Pages.AdminPanelPage;
import Pages.LoginPage;
import Utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();
    final WebDriver driver = browserFactory.startBrowser("chrome",
            "https://ndosisimplifiedautomation.vercel.app/");
    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    AdminPanelPage adminPanelPage = PageFactory.initElements(driver,AdminPanelPage.class);


}
