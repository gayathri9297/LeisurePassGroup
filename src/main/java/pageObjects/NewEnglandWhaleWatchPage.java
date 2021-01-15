package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverFactory;
import utils.DriverUtils;

public class NewEnglandWhaleWatchPage {

    WebDriver driver;

    @FindBy(linkText = "Buy a pass") public WebElement buyApassBtn;


   NewEnglandWhaleWatchPage(WebDriver driver)
   {
       this.driver = driver;
       PageFactory.initElements(driver,this);
   }


   public void clickBuyApassBtn()
   {
       DriverUtils.click(buyApassBtn);
   }

}
