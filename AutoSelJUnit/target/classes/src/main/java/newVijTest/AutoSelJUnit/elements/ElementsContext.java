package newVijTest.AutoSelJUnit.elements;
/**
 * Created By VijayaB on Apr 25, 2018
 */

import org.openqa.selenium.support.PageFactory;

import newVijTest.AutoSelJUnit.driver.BrowserDriver;
import newVijTest.AutoSelJUnit.elements.HomePageElements;
import newVijTest.AutoSelJUnit.elements.SignUpPageElements;

public class ElementsContext {

    public static HomePageElements getHomePageElements(){
        return PageFactory.initElements(BrowserDriver.getDriver(), HomePageElements.class );
    }

    public static SignUpPageElements getSignUpPageElements(){
        return PageFactory.initElements(BrowserDriver.getDriver(), SignUpPageElements.class );
    }

}
