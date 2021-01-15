package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverUtils;

public class AllInclusivePage
{
    WebDriver driver;


    @FindBy(linkText = "What's included") public WebElement Whatincludedlink;

    @FindBy(linkText = "How it works") public WebElement howitworkslink;

    @FindBy(linkText = "Attractions") public WebElement Attractionslink;

    @FindBy(linkText = "Real customer savings") public WebElement RealCustomerlink;

    @FindBy(linkText = "Plan your trip") public WebElement Planyourtriplink;



    public AllInclusivePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }



   //
    public void ClickWhatincludedLink()
    {

        DriverUtils.click(Whatincludedlink);
    }

    public void ClickhowitworksLink()
    {

        DriverUtils.click(howitworkslink);
    }

    public void ClickAttractionsLink()
    {

        DriverUtils.click(Attractionslink);
    }

    public void ClickRealCustomerLink()
    {

        DriverUtils.click(RealCustomerlink);
    }

    public void ClickplanyouetripLink()
    {

        DriverUtils.click(Planyourtriplink);
    }
}
