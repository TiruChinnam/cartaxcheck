package utils;

import base.BasePage;
import java.util.concurrent.TimeUnit;

public class DriverUtils extends BasePage {

    public void navigateToUrl(String string) throws InterruptedException {
        DriverFactory.driver.navigate().to(string);
        Thread.sleep(2000);
        DriverFactory.driver.manage().getCookies(); // Returns the List of all Cookies

//        Cookie arg0 = null;
//        DriverFactory.driver.manage().getCookieNamed(String.valueOf(arg0)); //Returns the specific cookie according to name
//        DriverFactory.driver.manage().addCookie(arg0); //Creates and adds the cookie

    }

    public void pageRefresh()
    {
        DriverFactory.driver.navigate().refresh();
    }
    public static String getPageTitle()
    {
        return DriverFactory.driver.getTitle();
    }
    public String getUrl()
    {
        return DriverFactory.driver.getCurrentUrl();
    }

    public void waits()

    {
        DriverFactory.driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);

    }


}
