package base;


import Ho.IdentityE2E.qa.pages.*;
import utils.DriverFactory;
import utils.DriverUtils;

public class BasePage {
    public static DriverUtils driverUtils;
    public static StartPage startPage;
    public static ResultPage resultPage;

    public static void initPages(){
        driverUtils = new DriverUtils();
        startPage = new StartPage(DriverFactory.driver);
        resultPage = new ResultPage(DriverFactory.driver);
    }
}
