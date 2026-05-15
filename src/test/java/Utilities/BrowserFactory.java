package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {

    static WebDriver driver;

    public static WebDriver startBrowser(String MyBrowserChoice, String url) {
        ChromeOptions chromeOptions = new ChromeOptions();

        if (MyBrowserChoice.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver(chromeOptions);
        } else if (MyBrowserChoice.equalsIgnoreCase("edge")) {

            driver = new EdgeDriver();
        } else {
            driver = new SafariDriver();
        }
        driver.manage().window().maximize();
        driver.get(url);
        return driver;
    }


}
