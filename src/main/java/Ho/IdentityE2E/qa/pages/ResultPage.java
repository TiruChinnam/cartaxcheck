package Ho.IdentityE2E.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResultPage {
    WebDriver driver;
    @FindBy(xpath = "//dd[contains(text(),'SG18HT')]") public WebElement car1;
    @FindBy(xpath = "//dd[contains(text(),'DN09HRM')]") public WebElement car2;
    @FindBy(xpath = "//dd[contains(text(),'BW57BOF')]") public WebElement car3;
    @FindBy(xpath = "//dd[contains(text(),'KT17DLX')]") public WebElement car4;
//    @FindBy(xpath = "//dd[@class='jsx-67506509a25110d0']//preceding-sibling::dt[contains(text(), 'Registration')]") public WebElement regText01;
//    @FindBy(xpath = "//*[@id='m']/div[2]/div[3]/div[1]/div/span/div[2]/dl[1]/dd") public WebElement regText01;
//    @FindBy(xpath = "//div[@class ='jsx-964581479 m-w-1 d-w-3 p-w-1']/div[1]/div[1]/span/div[2]/dl[1]/dd") public WebElement regText01;
//    @FindBy(css = "div.jsx-3694524132 div.jsx-fa15d114143bd5a4 div.jsx-964581479.m-w-1.d-w-3.p-w-1:nth-child(5) div.jsx-4143072495 div.jsx-2115732896 span.jsx-1e30cf73c6e96764 div.jsx-3058503346 dl.jsx-1936419074:nth-child(1) > dd.jsx-67506509a25110d0") public WebElement regText01;
//    @FindBy(xpath ="*[@id='m']/div[2]/div[3]/div[1]/div/span/div[2]/dl[1]/d ") public WebElement regText1;


    @FindBy(xpath ="*[@id=\"m\"]/div[2]/div[3]/div[1]/div/span/div[2]/dl[2]/dd") public WebElement makeText;
    @FindBy(xpath ="*[@id=\"m\"]/div[2]/div[3]/div[1]/div/span/div[2]/dl[3]/dd[1]") public WebElement modelText;
    @FindBy(xpath ="//*[@id=\"m\"]/div[2]/div[3]/div[1]/div/span/div[2]/dl[4]/dd[1]") public WebElement yearText;
    @FindBy(xpath ="//*[@id=\"m\"]/div[2]/div[3]/div[1]/div/span/div[2]/dl[6]/dd") public WebElement colorText;
    @FindBy(xpath ="//*[@id=\"m\"]/div[2]/div[3]/div[1]/div/span/div[1]/h4") public WebElement resultHeading;

    public ResultPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String verifyResultHeadingMsg()
    {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(resultHeading));
        return resultHeading.getText();
    }

    public void readRegtext(){  car1.getText();   }

    public void readmakeText(){  makeText.getText();   }

    public void readmodelText(){  modelText.getText();   }

    public void readyearText(){  yearText.getText();   }

    public void readcolorText(){  colorText.getText();   }


}
