package newVijTest.AutoSelJUnit.pages;
/**
 * Created By VijayaB on Apr 25, 2018
 */

import newVijTest.AutoSelJUnit.pages.HomePage;
import newVijTest.AutoSelJUnit.pages.LoginPage;
import newVijTest.AutoSelJUnit.pages.SignUpPage;



public class PagesContext {
	
	public static HomePage homePage(){
        return new HomePage();
    }

	public static LoginPage loginPage(){
        return new LoginPage();
    }
	
	public static SignUpPage signUpPage(){
        return new SignUpPage();
    }
 
}
