package cases;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.github.dockerjava.api.model.Driver;


import org.testng.annotations.BeforeMethod;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.Random;

import javax.xml.xpath.XPath;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
public class MyClass extends BaseTest {


	@Test(description = "checking_the_firstName_Error_Message", priority = 3)
	public void checking_the_firstName_Error_Message() throws Exception {
		
		
		driver.get("https://www.sporter.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.findElement(By.id("userIcon_icon__br74m")).click();
	    driver.findElement(By.xpath("//span[contains(.,'Sign In')]")).click();
	  
	    driver.findElement(By.id("emailInput")).sendKeys("ayakreasat@yahoo.com");
	    
	    driver.findElement(By.id("passwordInput")).sendKeys("ayaa@1234");
	    
	    driver.findElement(By.id("submitdBtn")).click();

	}}