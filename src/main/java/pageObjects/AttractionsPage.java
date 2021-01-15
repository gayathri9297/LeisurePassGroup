package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverFactory;
import utils.DriverUtils;

public class AttractionsPage  {

    WebDriver driver;

    @FindBy(linkText = "Attractions") public WebElement Attractionslink;


    @FindBy(xpath = "//span[contains(text(),'Whale Watch')]") public WebElement newEngAqWhaleWatch;

    @FindBy(linkText = "Boston Duck Tour") public WebElement BostonTourlink;

   AttractionsPage(WebDriver driver)
   {
       this.driver = driver;
       PageFactory.initElements(driver,this);
   }


    public void ClickAttractionsLink()
    {

        DriverUtils.click(Attractionslink);
    }


    public void clickNewEnglandAcqWhaleWatch()
    {
        DriverUtils.waitForElementClickable(DriverFactory.driver,newEngAqWhaleWatch);
        DriverUtils.click(newEngAqWhaleWatch);
    }

    public void ClickBostonTourLink()
    {

        DriverUtils.click(BostonTourlink);
    }

}
