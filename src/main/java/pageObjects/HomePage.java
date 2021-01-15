package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverUtils;

public class HomePage  {

    WebDriver driver;

    @FindBy(linkText = "All-Inclusive") public WebElement AllInclusivelink;

   @FindBy(linkText = "Explorer") public WebElement Explorerlink;

    @FindBy(linkText = "Build Your Own") public WebElement BuildYourOwnlink;

    @FindBy(linkText = "FAQs") public WebElement FAQlink;

    @FindBy(linkText = "COVID-19") public WebElement COVIDlink;

    @FindBy(linkText = "New England Aquarium Whale Watch") public WebElement Englandlink;

    @FindBy(className = "attraction-cta") public WebElement Buynowbutton;

    @FindBy(xpath = "(//a[text()='Buy Now']) [3]") public  WebElement ExplorerBuynowBtton;

    @FindBy(xpath = "(//button[text()='Select'])[5]") public WebElement selectchoicepass;

    @FindBy(linkText = "Checkout") public WebElement Checkoutbutton;




    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }




    public void ClickAllInclusiveLink()
    {

        DriverUtils.click(AllInclusivelink);
    }
    public void ClickExplorerLink()
    {

        DriverUtils.click(Explorerlink);
    }
    public void ClickBuildyourownlink()
    {

        DriverUtils.click(BuildYourOwnlink);
    }

    public void ClickFAQlink()
    {

        DriverUtils.click(FAQlink);
    }

    public void ClickCovidlink()
    {

        DriverUtils.click(COVIDlink);
    }

    public void ClickBuynowbutton()
    {

        DriverUtils.click(Buynowbutton);
    }
    public void ClickExplorerBuynowbutton()
    {

        DriverUtils.click(ExplorerBuynowBtton);
    }
    public void Clickselectpassbutton()
    {

        DriverUtils.click(selectchoicepass);
    }
    public void ClickCheckoutbutton()
    {

        DriverUtils.click(Checkoutbutton);
    }



}