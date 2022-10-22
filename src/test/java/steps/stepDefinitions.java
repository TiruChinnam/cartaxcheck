package steps;

import base.BasePage;
import io.cucumber.java.en.*;
import org.apache.commons.collections.bag.SynchronizedSortedBag;

public class stepDefinitions {


    @Given("person navigate to {string}")
    public void person_navigate_to(String string) throws InterruptedException {
        BasePage.driverUtils.navigateToUrl(string);
    }
    @When("user enter car registration number {string}")
    public void user_enter_car_registration_number(String reg){
        BasePage.startPage.enterRegNum(reg);
        BasePage.driverUtils.waits();

    }
    @When("click Free Car check button to get Vehicle details")
    public void click_free_car_check_button_to_get_vehicle_details() {
        BasePage.startPage.clickfreeCarCheckButton();
    }


    @Then("user should be on Vehicle Identity page and get text")
    public void user_should_be_on_vehicle_identity_page_and_get_text() {

       BasePage.resultPage.readRegtext();

    }

}
