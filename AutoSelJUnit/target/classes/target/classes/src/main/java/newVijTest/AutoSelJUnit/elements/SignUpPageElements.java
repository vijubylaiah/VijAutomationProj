package newVijTest.AutoSelJUnit.elements;
/**
 * Created By VijayaB on Apr 25, 2018
 */


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignUpPageElements {
	
	
	@FindBy(how = How.CLASS_NAME, using = "sign-up")
	public WebElement signUpButton;
	
	@FindBy(how = How.ID, using = "address")
	public WebElement addressBox;
	
	@FindBy(how = How.ID, using = "unit")
	public WebElement unitBox;
	
	@FindBy(how = How.ID, using = "zipcode")
	public WebElement zipcodeBox;

	@FindBy(how = How.NAME, using = "commit")
	public WebElement continueButton;
	
	@FindBy(how = How.ID, using = "email")
	public WebElement emailBox;
	
	@FindBy(how = How.ID, using = "first_name")
	public WebElement firstNameBox;
	
	@FindBy(how = How.ID, using = "last_name")
	public WebElement lastNameBox;
	
	@FindBy(how = How.ID, using = "phone")
	public WebElement phoneBox;
	
	@FindBy(how = How.ID, using = "potential_customer_referral_id")
	public WebElement hearAboutBox;
	
	@FindBy(how = How.CLASS_NAME, using = "flash-notice")
	public WebElement successMsg;
	
   
}
