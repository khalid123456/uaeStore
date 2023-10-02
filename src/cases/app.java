package cases;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.asserts.SoftAssert;
import org.testng.Assert;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
//import java.awt.List;
import java.util.List;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;



public class app  {
	DesiredCapabilities caps = new DesiredCapabilities();
	
	@BeforeTest
	
	public void beforeTest() {
		
		
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "khalid");
		
		//caps.setCapability("chromedriverExecutable","C:\\Users\\Ahmad\\Desktop\\my drive\\chromedriver_win32\\chromedriver.exe");
        //caps.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome"); //these 2 comment for browser
	
		File app = new File("src/cases/calculator.apk");
		caps.setCapability(MobileCapabilityType.APP,app.getAbsolutePath());// these 2 lines for the files apk
	}
	
	@Test(priority = 3)
	public void open_app() throws MalformedURLException {
		//File app = new File("src/main/java/com/sporter/testing/cases/calculator.apk");
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
		
		
		driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
		driver.findElement(By.id("com.google.android.calculator:id/op_mul")).click();
		driver.findElement(By.id("com.google.android.calculator:id/digit_5")).click();
		String results = driver.findElement(By.id("com.google.android.calculator:id/result_preview")).getText();
		System.out.println(results);
	}
		@Test(description = "checking_the_clear button", priority = 2)
		public void checking_the_clear_button() throws Exception {
			AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
			driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
			driver.findElement(By.id("com.google.android.calculator:id/clr")).click();
			
			SoftAssert softAssert = new SoftAssert();
			String actualRersult = driver.findElement(By.id("com.google.android.calculator:id/result_preview")).getText();
			System.out.println(actualRersult+"****************");
		
			String expectedResult = "";
			System.out.println(actualRersult);
			softAssert.assertEquals(actualRersult, expectedResult, "error is not Matching");
			softAssert.assertAll();

		
		
		
		}
	

@Test(description = "checking_the_clear button", priority = 4)
public void checking_the_plus_button() throws Exception {
	AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
	driver.findElement(By.id("com.google.android.calculator:id/digit_5")).click();
	driver.findElement(By.id("com.google.android.calculator:id/op_add")).click();
	
	
	SoftAssert softAssert = new SoftAssert();
	String actualRersult = driver.findElement(By.id("com.google.android.calculator:id/formula")).getText();
	//System.out.println(actualRersult+"****************");

	String expectedResult = "5+";
	System.out.println(actualRersult);
	softAssert.assertEquals(actualRersult, expectedResult, "error is not Matching");
	softAssert.assertAll();

	


}

		

@Test(description = "checking_the_delete button", priority = 1)
public void checking_the_delete_button() throws Exception {
	AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
	driver.findElement(By.id("com.google.android.calculator:id/digit_5")).click();
	driver.findElement(By.id("com.google.android.calculator:id/op_add")).click();
	driver.findElement(By.id("com.google.android.calculator:id/del")).click();
	                          
	
	
	SoftAssert softAssert = new SoftAssert();
	String actualRersult = driver.findElement(By.id("com.google.android.calculator:id/formula")).getText();


	String expectedResult = "5";
	System.out.println(actualRersult);
	softAssert.assertEquals(actualRersult, expectedResult, "error is not Matching");
	softAssert.assertAll();

	


}

	
	
//	@Test(priority = 1)
//	public void open_bowser() throws MalformedURLException  {
//		
//		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
//		
//	
//		
//		driver.get("https://www.google.com");
//		
//		
//		
//		
//		
//		
//		}
	}

