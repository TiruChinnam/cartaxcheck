package Ho.IdentityE2E.qa.pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


//@DefaultUrl("https://cartaxcheck.co.uk/")
public class StartPage extends BasePage {
    WebDriver driver;
    @FindBy(css = "input[id=\'vrm-input\']") public WebElement enterRegNumber;
    @FindBy(css = "button[class=\'jsx-4156453853 \']") public WebElement freeCarCheckButton;

//    public void navigateUrl(){ getDriver().navigate().to("prop");    }

    public StartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
//    public void navigateUrl(){getDriver().navigate().to("https://cartaxcheck.co.uk/");     }


//        public void addRegistrationNumber(){ enterRegNumber.sendKeys("car1");  }

    public void enterRegNum(String em)
    {
        enterRegNumber.sendKeys(em);


    }

    public void clickfreeCarCheckButton(){
        freeCarCheckButton.click();

    }


}
