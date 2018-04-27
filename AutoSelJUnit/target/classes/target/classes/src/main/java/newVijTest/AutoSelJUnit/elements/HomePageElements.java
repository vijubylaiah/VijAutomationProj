package newVijTest.AutoSelJUnit.elements;
/**
 * Created By VijayaB on Apr 25, 2018
 */


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageElements {
	

		//FindCitiesMenuItem
		@FindBy(how = How.CLASS_NAME, using = "global_nav__nav__cities")
		public WebElement fibreCitiesMenu;
		
		//viewAllCitiesButton
		@FindBy(how = How.CLASS_NAME, using = "global_nav__view_cities")
		public WebElement viewAllCitiesButton;
		
		@FindBy(how = How.XPATH, using = "//*[@id='maia-main']//*[@class='webpass sandiego']")
		public WebElement webpassSandiegoBalloon;
		
		@FindBy(how=How.XPATH, using="//*[@class='copy']//*[contains(@id,'Homepage-react-component')]")
		public WebElement watchNowLink;
		
		@FindBy(how=How.XPATH, using="//*[@class='copy']")
		public WebElement watchNowIcon;
		
//		@FindBy(how=How.XPATH, using="//*[@class='copy']//*[contains(text(),'Watch now')]")
//		public WebElement watchNowLink;
		
		@FindBy(how = How.CLASS_NAME, using = "play-icon")
		public WebElement playIcon;
		
		
		@FindBy(how = How.CLASS_NAME, using = "close fa fa-times fa-2x")
		public WebElement closeIcon;
		
		@FindBy(how = How.CLASS_NAME, using = "sign-up")
		public WebElement signUpButton;
  
   
}
