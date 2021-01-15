package pageObjects;

import utils.DriverFactory;
import utils.DriverUtils;

public class BasePage
{
    public static HomePage homePage;
    public static AllInclusivePage allInclusivePage;
    public static AttractionsPage attractionsPage;
    public static NewEnglandWhaleWatchPage newEnglandWhaleWatchPage;
    public static ComparisionPage comparisionPage;
    public static PricingPage pricingPage;
    public static ReviewPage reviewPage;

    public static DriverUtils driverUtils;

    public static void initPages()
    {
        homePage = new HomePage(DriverFactory.driver);
        allInclusivePage = new AllInclusivePage(DriverFactory.driver);
        attractionsPage = new AttractionsPage(DriverFactory.driver);
        newEnglandWhaleWatchPage = new NewEnglandWhaleWatchPage(DriverFactory.driver);
        comparisionPage = new ComparisionPage(DriverFactory.driver);
        pricingPage = new PricingPage(DriverFactory.driver);
        reviewPage = new ReviewPage(DriverFactory.driver);

        driverUtils = new DriverUtils();

    }


}
