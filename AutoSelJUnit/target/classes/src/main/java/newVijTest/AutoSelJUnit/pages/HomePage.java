package newVijTest.AutoSelJUnit.pages;
/**
 * Created By VijayaB on Apr 25, 2018
 */

import newVijTest.AutoSelJUnit.elements.ElementsContext;
import newVijTest.AutoSelJUnit.elements.HomePageElements;

import org.openqa.selenium.By;

import newVijTest.AutoSelJUnit.driver.BrowserDriver;

public class HomePage {
	
	HomePageElements homePageElements = ElementsContext.getHomePageElements();
    
    public void clickFindCities() {
     	homePageElements.fibreCitiesMenu.click();   
    }
    
    public void clickViewAllCitiesButton() {
    	homePageElements.viewAllCitiesButton.click();   
    }
    
    public void clickWebPassBalloonIcon() {
    	homePageElements.webpassSandiegoBalloon.click();   
    }
    
    public void clickWatchNowLink() throws InterruptedException {
     	BrowserDriver.waitForPageToBeLoaded();
    	//BrowserDriver.hoverAndClick(homePageElements.watchNowIcon, homePageElements.watchNowLink);
		BrowserDriver.getDriver().findElement(By.linkText("Watch now")).click();
    	Thread.sleep(2000);
    }
    
    public void clickPauseButton() {
    	homePageElements.playIcon.click();   
    }
    
    public void closeWatchnowWindow() {
    	homePageElements.closeIcon.click();  
    }
    
    public void clickSignUpButton() {
    	homePageElements.signUpButton.click();  

    }
 
}
