package newVijTest.AutoSelJUnit.pages;
/**
 * Created By VijayaB on Apr 25, 2018
 */

import newVijTest.AutoSelJUnit.driver.BrowserDriver;

public class LoginPage {
	


    public void loginWithUrl(String url)throws InterruptedException {
    	String url1 = "www.fibre.google.com/about";
        BrowserDriver.loadPage( url );
        BrowserDriver.waitForPageToBeLoaded();
        Thread.sleep(5000);
    }

}
