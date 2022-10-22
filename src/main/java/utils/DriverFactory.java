package utils;

import base.BasePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Properties;


public class DriverFactory {
    public static WebDriver driver;

    public static WebDriverWait wait;
    public static Properties prop;

    public static WebDriver getDriver()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        BasePage.initPages();

        return driver;
    }


    public static void closeDriver()  { driver.quit(); }


}
