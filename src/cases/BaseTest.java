package cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//import com.sporter.testing.pages.BasePage;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.netty.handler.ssl.OptionalSslHandler;
import pages.BasePage;

public class BaseTest {

	//comment1
	//comment2
	//comment3
	//comment4
	//comment5
	
	public final static String SPORTER_URL = "http://stores.sporter.com/en-sa/";
	
	public final static int WAIT_DEFAULT_TIME_OUT = 10;
	
	public static WebDriver driver;
	
	public static WebDriverWait wait;
	
	public String cartURL= "https://www.sporter.com/en-sa/cart/";
	public String hompageURL= "https://www.sporter.com/en-sa/";
	  
	@BeforeClass
	public void setup() {

		//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe"); 
		
		
		//driver = new ChromeDriver();
		//
		//System.setProperty("webdriver.http.factory", "jdk-http-client");
		

		
WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		
		driver = new ChromeDriver(options);
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(WAIT_DEFAULT_TIME_OUT));
	}

	@AfterClass
	public void tearDown() {
		
		driver.close();
	}
	
	public static void goToPage(BasePage page) {
		
		driver.get(page.getUrl());
	}
	
	public static void maximizeWindow() {
		
		driver.manage().window().maximize();
	}
	
    public static void waitUntilDisplayed(WebElement element) {
        
        wait.until(ExpectedConditions.visibilityOf(element)).isDisplayed();
    }
    
  public static boolean waitUntilDisplayedb(WebElement element) {
        
	  return wait.until(ExpectedConditions.visibilityOf(element)).isDisplayed();
    }
    
    public static void waitUntilClickable(WebElement element) {
        
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    
    public static void waitUntilClickable2(WebElement element) {
        
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
    }
    
    
    
    
  	
}