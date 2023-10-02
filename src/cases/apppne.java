package cases;

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



public class apppne  {
	DesiredCapabilities caps = new DesiredCapabilities();
	
	@BeforeTest
	
	public void beforeTest() {
		
		
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "khalid");
		
		//caps.setCapability("chromedriverExecutable","C:\\Users\\Ahmad\\Desktop\\my drive\\chromedriver_win32\\chromedriver.exe");
        //caps.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome"); //these 2 comment for browser
	
		File app = new File("src/myapplication/appone.apk");
		caps.setCapability(MobileCapabilityType.APP,app.getAbsolutePath());// these 2 lines for the files apk
	}
	
	@Test(priority = 1)
	public void open_app() throws MalformedURLException {
		//File app = new File("src/main/java/com/sporter/testing/cases/calculator.apk");
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.id("com.scaleup.chatai:id/btnNext")).click();
		driver.findElement(By.id("com.scaleup.chatai:id/btnNext")).click();
		driver.findElement(By.id("com.scaleup.chatai:id/btnNext")).click();
		


		
		}
	

	}

