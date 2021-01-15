package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverFactory;
import utils.DriverUtils;

public class PricingPage {

    WebDriver driver;

    @FindBy(xpath = "(//button[contains(text(),'Select')])[1]") public WebElement selectBtn1;



    @FindBy(xpath = "//span[contains(text(),'2 Choice Pass')]") public WebElement choicePassText;


   PricingPage(WebDriver driver)
   {
       this.driver = driver;
       PageFactory.initElements(driver,this);
   }


    public void clickSelectBtn1()
    {
        DriverUtils.waitForElementClickable(DriverFactory.driver,selectBtn1);
        DriverUtils.click(selectBtn1);
    }


    public void verifyAdditionalInfo2ChoicePass()
    {
        DriverUtils.isElementPresent(choicePassText);
    }

}
