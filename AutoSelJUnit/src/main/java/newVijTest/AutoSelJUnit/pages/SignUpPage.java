package newVijTest.AutoSelJUnit.pages;
/**
 * Created By VijayaB on Apr 25, 2018
 */

import java.io.FileInputStream;

import org.junit.Assert;
import newVijTest.AutoSelJUnit.driver.BrowserDriver;
import newVijTest.AutoSelJUnit.elements.ElementsContext;
import newVijTest.AutoSelJUnit.elements.SignUpPageElements;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SignUpPage {
	
	SignUpPageElements signUpPageElements = ElementsContext.getSignUpPageElements();

	public void enterPersonAddressIncomplete() {
    	signUpPageElements.addressBox.sendKeys("123 Hardy ave");
    	signUpPageElements.unitBox.sendKeys("12");
    	signUpPageElements.zipcodeBox.sendKeys("92128");
    }

    
	public void clickContinueButton() {
		signUpPageElements.continueButton.click();
		BrowserDriver.waitForPageToBeLoaded();
  }
  
	public void enterPersonAddressComplete() throws InterruptedException {
		Thread.sleep(1000);
		signUpPageElements.addressBox.clear();  
		signUpPageElements.addressBox.sendKeys("123 hardy ave");
		signUpPageElements.emailBox.sendKeys("abc@gmail.com");
		signUpPageElements.firstNameBox.sendKeys("abc");
		signUpPageElements.lastNameBox.sendKeys("def");
		signUpPageElements.phoneBox.sendKeys("230-567-6456");
		BrowserDriver.getDropDownByIndex(signUpPageElements.hearAboutBox, 2);
  }

	public void isSignUpSuccessMessageDisplayed() {
		Assert.assertTrue(signUpPageElements.successMsg.getText().contains("Thank you for your interest in Webpass. Our sales team will respond to your request shortly."));
	}
	
	public void readTheExcelFile(String arg1) throws Throwable {
		workbook = new XSSFWorkbook(new FileInputStream(System.getProperty("user.dir")+"//"+"src//main//java//newVijTest//AutoSelJUnit//utils//"+arg1));
   }
	
    public void testdataOneFromExcel() throws Throwable {
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        signUpPageElements.addressBox.sendKeys(sheet.getRow(1).getCell(1).getStringCellValue());
        signUpPageElements.addressBox.sendKeys(sheet.getRow(1).getCell(2).getStringCellValue());
        signUpPageElements.addressBox.sendKeys(sheet.getRow(1).getCell(3).getStringCellValue());
        signUpPageElements.addressBox.sendKeys(sheet.getRow(1).getCell(4).getStringCellValue());
        signUpPageElements.addressBox.sendKeys(sheet.getRow(1).getCell(5).getStringCellValue());
        signUpPageElements.addressBox.sendKeys(sheet.getRow(1).getCell(6).getStringCellValue());
    }
    
    public void testdataTwoFromExcel() throws Throwable {
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        signUpPageElements.addressBox.sendKeys(sheet.getRow(2).getCell(1).getStringCellValue());
        signUpPageElements.addressBox.sendKeys(sheet.getRow(2).getCell(2).getStringCellValue());
        signUpPageElements.addressBox.sendKeys(sheet.getRow(2).getCell(3).getStringCellValue());
        signUpPageElements.addressBox.sendKeys(sheet.getRow(2).getCell(4).getStringCellValue());
        signUpPageElements.addressBox.sendKeys(sheet.getRow(2).getCell(5).getStringCellValue());
        signUpPageElements.addressBox.sendKeys(sheet.getRow(2).getCell(6).getStringCellValue());
    }
	   
	   
	
}
