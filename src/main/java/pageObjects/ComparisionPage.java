package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverFactory;
import utils.DriverUtils;

public class ComparisionPage {

    WebDriver driver;

    @FindBy(xpath = "(//a[contains(text(),'Buy Now')])[2]") public WebElement buyNowBtn2;



   ComparisionPage(WebDriver driver)
   {
       this.driver = driver;
       PageFactory.initElements(driver,this);
   }


    public void clickBuyNowBtn2()
    {
        DriverUtils.waitForElementClickable(DriverFactory.driver,buyNowBtn2);
        DriverUtils.click(buyNowBtn2);
    }



}
