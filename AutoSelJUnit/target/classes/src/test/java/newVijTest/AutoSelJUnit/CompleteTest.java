package newVijTest.AutoSelJUnit;
/**
 * Created By VijayaB on Apr 25, 2018
 */


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import newVijTest.AutoSelJUnit.driver.BrowserDriver;
import newVijTest.AutoSelJUnit.elements.ElementsContext;
import newVijTest.AutoSelJUnit.elements.HomePageElements;
import newVijTest.AutoSelJUnit.elements.SignUpPageElements;
import newVijTest.AutoSelJUnit.pages.HomePage;
import newVijTest.AutoSelJUnit.pages.LoginPage;
import newVijTest.AutoSelJUnit.pages.PagesContext;
import newVijTest.AutoSelJUnit.pages.SignUpPage;



public class CompleteTest extends BrowserDriver {
	SignUpPageElements signUpPageElements = ElementsContext.getSignUpPageElements();
	HomePageElements homePageElements = ElementsContext.getHomePageElements();
	HomePage homePage = PagesContext.homePage();
	SignUpPage signUpPage = PagesContext.signUpPage();
	LoginPage loginPage = PagesContext.loginPage();


	@Before
	public void setUp() throws InterruptedException {
		getDriver();
		loginPage.loginWithUrl("https://fiber.google.com/about/");
	}
	
	@Test
	public void performActionsOnPage() throws InterruptedException { 
		homePage.clickFindCities();
		homePage.clickViewAllCitiesButton();
		homePage.clickWebPassBalloonIcon();
		homePage.clickWatchNowLink();
		BrowserDriver.switchToWindow();
		homePage.clickPauseButton();
		BrowserDriver.switchToParentWindow();
		homePage.clickSignUpButton();
		signUpPage.enterPersonAddressIncomplete();
		signUpPage.clickContinueButton();
		signUpPage.enterPersonAddressComplete();
		signUpPage.clickContinueButton();
		signUpPage.isSignUpSuccessMessageDisplayed();
	}
	
	@Test
	public void testUserOneOnSignUpPage() throws Throwable { 
		signUpPage.testdataOneFromExcel();
		signUpPage.clickContinueButton();
		signUpPage.isSignUpSuccessMessageDisplayed();
		signUpPage.testdataTwoFromExcel();
		signUpPage.clickContinueButton();
		signUpPage.isSignUpSuccessMessageDisplayed();
	}
	
	@After
	public static void closeBrowser() {
		BrowserDriver.close();
	}

}
