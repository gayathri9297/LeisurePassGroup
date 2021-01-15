import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.BasePage;
import utils.DriverFactory;
import utils.DriverUtils;

public class StepDefinitions {

    @Before
    public void setUp() {
        DriverFactory.getDriver();

    }

    @After
    public void tearDown() {
        DriverFactory.closeDriver();
    }


    @Given("I navigate to URL {string}")
    public void i_navigate_to_url(String url) {
        BasePage.driverUtils.navigateToUrl(url);
    }


    @Then("I should be navigated to Home page")
    public void i_should_be_navigated_to_home_page() {
        String homepageTitle = BasePage.driverUtils.getPageTitle();
        System.out.println(homepageTitle);
    }

    @When("I click on All Inclusive link from nav bar")
    public void i_click_on_all_inclusive_link_from_nav_bar() {
        BasePage.homePage.ClickAllInclusiveLink();
    }

    @When("I click on Attractions link from All Inclusive nav bar options")
    public void i_click_on_attractions_link_from_all_inclusive_nav_bar_options() {
        BasePage.allInclusivePage.ClickAttractionsLink();
    }

    @Then("I should be navigated to attractions page")
    public void i_should_be_navigated_to_attractions_page() {

        String title = BasePage.driverUtils.getPageTitle();
        System.out.println(title);

    }

    @When("I click on package new England Aquarium Whale watch")
    public void i_click_on_package_new_england_aquarium_whale_watch() {
        BasePage.attractionsPage.clickNewEnglandAcqWhaleWatch();
    }

    @Then("I should be navigated to corresponding attraction page")
    public void i_should_be_navigated_to_corresponding_attraction_page() {
        String attractionPageTitle = BasePage.driverUtils.getPageTitle();
        System.out.println(attractionPageTitle);
    }

    @When("I click on Buy a Pass button")
    public void i_click_on_buy_a_pass_button() {
        BasePage.newEnglandWhaleWatchPage.clickBuyApassBtn();
    }

    @Then("I should be navigated to attraction comparison page")
    public void i_should_be_navigated_to_attraction_comparison_page() {
        String ComparisionPageTitle = BasePage.driverUtils.getPageTitle();
        System.out.println(ComparisionPageTitle);
    }

    @When("I click on Buy now button for Explorer pass")
    public void i_click_on_buy_now_button_for_explorer_pass() {
        BasePage.comparisionPage.clickBuyNowBtn2();
    }

    @Then("I should be navigated to Pricing page")
    public void i_should_be_navigated_to_pricing_page() {
        String PricingPageTitle = BasePage.driverUtils.getPageTitle();
        System.out.println(PricingPageTitle);
    }

    @When("I click on select button for  2choice pass")
    public void i_click_on_select_button_for_2choice_pass() {
        BasePage.pricingPage.clickSelectBtn1();
    }


    @Then("I should see Additional information about 2choice pass")
    public void i_should_see_additional_information_about_2choice_pass() {
        BasePage.pricingPage.verifyAdditionalInfo2ChoicePass();
    }


    @When("I click on Checkout Button")
    public void i_click_on_checkout_button() {
        BasePage.homePage.ClickCheckoutbutton();
    }

    @Then("I should be navigated to Review Page")
    public void i_should_be_navigated_to_review_page() {
        String ReviewPageTitle = BasePage.driverUtils.getPageTitle();
        System.out.println(ReviewPageTitle);
    }

    @When("I select date of Explorer pass activation")
    public void i_select_date_of_explorer_pass_activation()
    {
        BasePage.reviewPage.clickVisitingDate();
    }


    @When("I click on Continue Payment Button")
    public void i_click_on_continue_payment_button() {
        BasePage.reviewPage.clickContinuePaymentbtn();
    }

    @Then("I should be navigated to Payment Page")
    public void i_should_be_navigated_to_payment_page() {
        String PaymentPage = BasePage.driverUtils.getPageTitle();
        System.out.println(PaymentPage);
    }

}
