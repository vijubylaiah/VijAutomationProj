package newVijTest.AutoSelJUnit.driver;
/**
 * Created By VijayaB on Apr 25, 2018
 */

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.openqa.selenium.support.ui.*;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;


public class BrowserDriver {


    private static WebDriver mDriver;
    public static final int WAIT_TIME_IN_SECONDS = 30;
    public static String parentWindow;


    public synchronized static WebDriver getDriver() {
        if ( mDriver==null ) {
            try {

                System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "false");
                mDriver = new FirefoxDriver();
                mDriver.manage().timeouts().implicitlyWait( WAIT_TIME_IN_SECONDS, TimeUnit.SECONDS );

            } catch (Exception ex){
            }
        }
        return mDriver;
    }

    public static WebElement findElementById(String s) {
       return BrowserDriver.getDriver().findElement( By.id (s) );

    }
 
    public static void close() {
        if( mDriver != null ) {
            try {
                mDriver.quit();
                mDriver = null;
            } catch (UnreachableBrowserException e) {
            }
        }
    }

    public static void loadPage(String url){;
        getDriver().get(url);
        getDriver().manage().window().maximize();
        mDriver.manage().timeouts().implicitlyWait( WAIT_TIME_IN_SECONDS, TimeUnit.SECONDS );
    }
    
    public static void waitForPageTitle(String titleContains){
        WebDriverWait wait = new WebDriverWait(getDriver(), WAIT_TIME_IN_SECONDS);
        wait.until(ExpectedConditions.titleContains(titleContains));
    }


    public static boolean isElementDisplayed(WebElement webElement){
        try {
            if(webElement.isDisplayed()){
                return true;
            }
            else {
                return false;
            }

        } catch (NoSuchElementException e) {
            return false;
        }

    }

    public static void waitForPageToBeLoaded() {
        Function<WebDriver, Boolean> pageLoaded= wd -> ((JavascriptExecutor) wd).executeScript( "return document.readyState").equals("complete");
        new FluentWait<WebDriver>( getDriver() ).withTimeout( 30, TimeUnit.SECONDS).pollingEvery( 3, TimeUnit.SECONDS ).until( pageLoaded );
    }

    public static void hoverAndClick(WebElement menu, WebElement link) {
        Actions action = new Actions( BrowserDriver.getDriver() );
        action.moveToElement(menu).build().perform();
        link.click();
    }
    
    public static void getDropDownByIndex(WebElement webElement, int index)
    {
        Select select= new Select(webElement);
        select.selectByIndex(index);
    }
    
    public static void switchToParentWindow(){
        BrowserDriver.getDriver().switchTo().window(parentWindow);
    }
    
    public static void switchToWindow(){
        Set<String> handles = getDriver().getWindowHandles();
        Iterator<String> iterator = handles.iterator();
        String mainWindow = iterator.next();
        String nextWindow = iterator.next();
        try {
            getDriver().switchTo().window(nextWindow);
            getDriver().manage().window().maximize();
        }
        catch(Exception e){
        }
    }


}