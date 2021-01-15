package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverFactory;
import utils.DriverUtils;

public class ReviewPage {

    WebDriver driver;

    @FindBy(xpath = "//input[@placeholder='MM-DD-YYYY']") public WebElement selectvisitingdate;

    @FindBy(linkText = "Continue to payment") public  WebElement continuepaymentbtn;


    ReviewPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void clickVisitingDate()
    {

        DriverUtils.waitForElementClickable(DriverFactory.driver,selectvisitingdate);

        DriverUtils.click(selectvisitingdate);


    }

    public void clickContinuePaymentbtn()
    {
        DriverUtils.click(continuepaymentbtn);
        DriverUtils.waitForElementClickable(DriverFactory.driver,continuepaymentbtn);
    }
}
