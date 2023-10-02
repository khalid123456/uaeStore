package cases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import pages.HomePage;



import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.time.Duration;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class KSA_Footer_Links extends BaseTest {
	
	@Test(description = "to check 404 track order ", priority = 1)
	public void checking_404_TrackOrder_KSA() throws Exception {
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);

	
	//KSAStoreFooter KSAStorefooter = new KSAStoreFooter();
	//KSAStorefooter.getTrackYourOrderOption().click();
		driver.get("https://www.sporter.com/en-sa/track");
	
	Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
	if(verifyTitle == true)
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	}
	assertFalse(verifyTitle);

	
	if(driver.getPageSource().contains("We can't find products matching"))
		
		
	{
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	System.out.println("All the items are missing");
	throw new Exception("We can't find products matching ");
}
	else
	{
		System.out.println("The items are showing ");
	}
}

	
	
	//HomePage homepage = new HomePage();
	//Assert.assertTrue(homepage.getEmptycategorymsg().isDisplayed());
	//Boolean Display = (homepage.getEmptycategorymsg().isDisplayed());
	//System.out.println("Element displayed is :"+Display);

		
		
	@Test(description = "to check 404_ShippingAnddelivery ", priority = 2)
	public void checking_404_Shipping_And_delivery_KSA() throws Exception {
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		//KSAStoreFooter KSAStorefooter = new KSAStoreFooter();
		//KSAStorefooter.getShippingAndDeliveryOption().click();
		driver.get("https://www.sporter.com/en-sa/orders-delivery");
	Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
	assertFalse(verifyTitle);
	if (verifyTitle== true )
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	}
	if(driver.getPageSource().contains("We can't find products matching"))
		
		
	{
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	System.out.println("All the items are missing");
	throw new Exception("We can't find products matching ");
}
	else
	{
		System.out.println("The items are showing ");
	}
}
	
	@Test(description = "to check 404_ShippingAnddelivery ", priority = 3)
	public void checking_404_returns_page_KSA() throws Exception {
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		driver.get("https://www.sporter.com/en-sa/refund");
		
		//KSAStoreFooter KSAStorefooter = new KSAStoreFooter();
		//KSAStorefooter.getRefundAndReturns().click();
		
	Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
	assertFalse(verifyTitle);
	if (verifyTitle== true )
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	}
	if(driver.getPageSource().contains("We can't find products matching"))
		
		
	{
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	System.out.println("All the items are missing");
	throw new Exception("We can't find products matching ");
}
	else
	{
		System.out.println("The items are showing ");
	}
}
	
	@Test(description = "to check wow page ", priority = 4)
	public void checking_404_Error_WOW_page_KSA() throws Exception {
		driver.get("https://www.sporter.com/en-sa/customer-service");
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		//KSAStoreFooter KSAStorefooter = new KSAStoreFooter();
		//KSAStorefooter.getWowCustomerServiceOption().click();
		
	Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
	assertFalse(verifyTitle);
	if (verifyTitle== true )
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	}
	if(driver.getPageSource().contains("We can't find products matching"))
		
		
	{
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	System.out.println("All the items are missing");
	throw new Exception("We can't find products matching ");
}
	else
	{
		System.out.println("The items are showing ");
	}
}
	
	@Test(description = "to check FAQ page ", priority = 5)
	public void checking_404_Error_FAQ_page_KSA() throws Exception {
		driver.get("https://www.sporter.com/en-sa/faq/");
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		//KSAStoreFooter KSAStorefooter = new KSAStoreFooter();
		//KSAStorefooter.getWowCustomerServiceOption().click();
		
	Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
	assertFalse(verifyTitle);
	if (verifyTitle== true )
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	}
	if(driver.getPageSource().contains("We can't find products matching"))
		
		
	{
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	System.out.println("All the items are missing");
	throw new Exception("We can't find products matching ");
}
	else
	{
		System.out.println("The items are showing ");
	}
}
	
	@Test(description = "to check AboutSporter page ", priority = 6)
	public void checking_404_Error_AboutSporterPage_KSA() throws Exception {
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		driver.get("https://www.sporter.com/en-sa/about");
		//KSAStoreFooter KSAStorefooter = new KSAStoreFooter();
		//KSAStorefooter.getAboutSporterPage().click();
		
	Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
	assertFalse(verifyTitle);
	if (verifyTitle== true )
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	}
	if(driver.getPageSource().contains("We can't find products matching"))
		
		
	{
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	System.out.println("All the items are missing");
	throw new Exception("We can't find products matching ");
}
	else
	{
		System.out.println("The items are showing ");
	}
}
	
	@Test(description = "to check Careerspage page ", priority = 7)
	public void checking_404_Error_Careerspage() throws Exception {
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		driver.get("https://www.sporter.com/en-sa/products-quality");
		//KSAStoreFooter KSAStorefooter = new KSAStoreFooter();
		//KSAStorefooter.getCareerspage().click();
		
	Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
	assertFalse(verifyTitle);
	if (verifyTitle== true )
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	}
	if(driver.getPageSource().contains("We can't find products matching"))
		
		
	{
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	System.out.println("All the items are missing");
	throw new Exception("We can't find products matching ");
}
	else
	{
		System.out.println("The items are showing ");
	}
}
	
	@Test(description = "to check ProductAuthenticityPage ", priority = 8)
	public void checking_404_Error_ProductAuthenticityPage_KSA() throws Exception {
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		driver.get("https://www.sporter.com/en-sa/official-supplier");
		//KSAStoreFooter KSAStorefooter = new KSAStoreFooter();
		//KSAStorefooter.getProductAuthenticityPage().click();
		
	Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
	assertFalse(verifyTitle);
	if (verifyTitle== true )
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	}
	if(driver.getPageSource().contains("We can't find products matching"))
		
		
	{
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	System.out.println("All the items are missing");
	throw new Exception("We can't find products matching ");
}
	else
	{
		System.out.println("The items are showing ");
	}
}
	
	@Test(description = "to check ProductQualityPage ", priority = 9)
	public void checking_404_Error_ProductQualityPage_KSA() throws Exception {
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		driver.get("https://www.sporter.com/en-sa/products-quality");
		
		//KSAStoreFooter KSAStorefooter = new KSAStoreFooter();
		//KSAStorefooter.getProductQualityPage().click();
		
	Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
	assertFalse(verifyTitle);
	if (verifyTitle== true )
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	}
	if(driver.getPageSource().contains("We can't find products matching"))
		
		
	{
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	System.out.println("All the items are missing");
	throw new Exception("We can't find products matching ");
}
	else
	{
		System.out.println("The items are showing ");
	}
}
	
	@Test(description = "to check ContactInfo page ", priority = 10)
	public void checking_404_Error_ContactInfoPage_KSA() throws Exception {
		driver.get("https://www.sporter.com/en-sa/contacts-us");
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		//KSAStoreFooter KSAStorefooter = new KSAStoreFooter();
		//KSAStorefooter.getContactInfoOption().click();
		
	Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
	assertFalse(verifyTitle);
	if (verifyTitle== true )
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	}
	if(driver.getPageSource().contains("We can't find products matching"))
		
		
	{
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	System.out.println("All the items are missing");
	throw new Exception("We can't find products matching ");
}
	else
	{
		System.out.println("The items are showing ");
	}
}
	
	@Test(description = "to check wholesale page ", priority = 11)
	public void checking_404_Error_wholesale_offere_KSA() throws Exception {
		driver.get("https://www.sporter.com/en-sa/wholesale-offers");
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		//KSAStoreFooter KSAStorefooter = new KSAStoreFooter();
		//KSAStorefooter.getContactInfoOption().click();
		
	Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
	assertFalse(verifyTitle);
	if (verifyTitle== true )
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	}
	if(driver.getPageSource().contains("We can't find products matching"))
		
		
	{
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	System.out.println("All the items are missing");
	throw new Exception("We can't find products matching ");
}
	else
	{
		System.out.println("The items are showing ");
	}
}
	
	@Test(description = "to check Blog page ", priority = 12)
	public void checking_404_Error_Blog_KSA() throws Exception {
		driver.get("https://www.sporter.com/en-sa/blog/");
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		//KSAStoreFooter KSAStorefooter = new KSAStoreFooter();
		//KSAStorefooter.getContactInfoOption().click();
		
	Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
	if (verifyTitle== true )
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	}
	assertFalse(verifyTitle);
	
	if(driver.getPageSource().contains("We can't find products matching"))
		
		
	{
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	System.out.println("All the items are missing");
	throw new Exception("We can't find products matching ");
}
	else
	{
		System.out.println("The items are showing ");
	}
}
	@Test(description = "to check isolate page ", priority = 13)
	public void checking_404_Error_whey_protein_KSA() throws Exception {
		driver.get("https://www.sporter.com/en-sa/sport-supplements/protein/whey-protein-isolate/");
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		//KSAStoreFooter KSAStorefooter = new KSAStoreFooter();
		//KSAStorefooter.getContactInfoOption().click();
		
	Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
	assertFalse(verifyTitle);
	if (verifyTitle== true )
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	}
	if(driver.getPageSource().contains("We can't find products matching"))
		
		
	{
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	System.out.println("All the items are missing");
	throw new Exception("We can't find products matching ");
}
	else
	{
		System.out.println("The items are showing ");
	}
}
	@Test(description = "to check casein-protei page ", priority = 14)
	public void checking_404_Error_KSA_casein_protein_KSA() throws Exception {
		driver.get("https://www.sporter.com/en-sa/sport-supplements/protein/casein-protein/");
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		//KSAStoreFooter KSAStorefooter = new KSAStoreFooter();
		//KSAStorefooter.getContactInfoOption().click();
		
	Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
	assertFalse(verifyTitle);
	if (verifyTitle== true )
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	}
	if(driver.getPageSource().contains("We can't find products matching"))
		
		
	{
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	System.out.println("All the items are missing");
	throw new Exception("We can't find products matching ");
}
	else
	{
		System.out.println("The items are showing ");
	}
}
	@Test(description = "to check mass-gaine page ", priority = 15)
	public void checking_404_Error_KSA_mass_gaine_KSA() throws Exception {
		driver.get("https://www.sporter.com/en-sa/sport-supplements/protein/mass-gainer/");
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		//KSAStoreFooter KSAStorefooter = new KSAStoreFooter();
		//KSAStorefooter.getContactInfoOption().click();
		
	Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
	assertFalse(verifyTitle);
	
	if (verifyTitle== true )
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	}
	if(driver.getPageSource().contains("We can't find products matching"))
		
		
	{
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	System.out.println("All the items are missing");
	throw new Exception("We can't find products matching ");
}
	else
	{
		System.out.println("The items are showing ");
	}
}
	@Test(description = "to check amino-acids page ", priority = 16)
	public void checking_404_Error_KSA_amino_acidsKSA() throws Exception {
		driver.get("https://www.sporter.com/en-sa/sport-supplements/amino-acids/");
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		//KSAStoreFooter KSAStorefooter = new KSAStoreFooter();
		//KSAStorefooter.getContactInfoOption().click();
		
	Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
	assertFalse(verifyTitle);
	
	if (verifyTitle== true )
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	}
	if(driver.getPageSource().contains("We can't find products matching"))
		
		
	{
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	System.out.println("All the items are missing");
	throw new Exception("We can't find products matching ");
}
	else
	{
		System.out.println("The items are showing ");
	}
}
	
	@Test(description = "to check energy-endurance page ", priority = 17)
	public void checking_404_KSA_Error_energy_endurance() throws Exception {
		driver.get("https://www.sporter.com/en-sa/sport-supplements/energy-endurance/");
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		//KSAStoreFooter KSAStorefooter = new KSAStoreFooter();
		//KSAStorefooter.getContactInfoOption().click();
		
	Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
	assertFalse(verifyTitle);
	if (verifyTitle== true )
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	}
	if(driver.getPageSource().contains("We can't find products matching"))
		
		
	{
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	System.out.println("All the items are missing");
	throw new Exception("We can't find products matching ");
}
	else
	{
		System.out.println("The items are showing ");
	}
}
	
	@Test(description = "to check recovery page ", priority = 18)
	public void checking_404_KSA_Error_recovery() throws Exception {
		driver.get("https://www.sporter.com/en-sa/sport-supplements/recovery/");
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		//KSAStoreFooter KSAStorefooter = new KSAStoreFooter();
		//KSAStorefooter.getContactInfoOption().click();
		
	Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
	assertFalse(verifyTitle);
	if (verifyTitle== true )
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	}
	if(driver.getPageSource().contains("We can't find products matching"))
		
		
	{
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	System.out.println("All the items are missing");
	throw new Exception("We can't find products matching ");
}
	else
	{
		System.out.println("The items are showing ");
	}
}
	@Test(description = "to check weight-management page ", priority = 19)
	public void checking_404_KSA_weight_management() throws Exception {
		driver.get("https://www.sporter.com/en-sa/sport-supplements/weight-management/");
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		//KSAStoreFooter KSAStorefooter = new KSAStoreFooter();
		//KSAStorefooter.getContactInfoOption().click();
		
	Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
	assertFalse(verifyTitle);
	if (verifyTitle== true )
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	}
	if(driver.getPageSource().contains("We can't find products matching"))
		
		
	{
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	System.out.println("All the items are missing");
	throw new Exception("We can't find products matching ");
}
	else
	{
		System.out.println("The items are showing ");
	}
}
	
	@Test(description = "to check protein-bars page ", priority = 20)
	public void checking_404_KSA_protein_bars() throws Exception {
		driver.get("https://www.sporter.com/en-sa/healthy-food/snacks-drinks/protein-bars/");
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		//KSAStoreFooter KSAStorefooter = new KSAStoreFooter();
		//KSAStorefooter.getContactInfoOption().click();
		
	Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
	assertFalse(verifyTitle);
	if (verifyTitle== true )
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	}
	if(driver.getPageSource().contains("We can't find products matching"))
		
		
	{
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	System.out.println("All the items are missing");
	throw new Exception("We can't find products matching ");
}
	else
	{
		System.out.println("The items are showing ");
	}
}
	
	@Test(description = "to check healthy-food page ", priority = 21)
	public void checking_404_KSA_healthy_food() throws Exception {
		driver.get("https://www.sporter.com/en-sa/healthy-food/");
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		//KSAStoreFooter KSAStorefooter = new KSAStoreFooter();
		//KSAStorefooter.getContactInfoOption().click();
		
	Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
	assertFalse(verifyTitle);
	if (verifyTitle== true )
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	}
	if(driver.getPageSource().contains("We can't find products matching"))
		
		
	{
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	System.out.println("All the items are missing");
	throw new Exception("We can't find products matching ");
}
	else
	{
		System.out.println("The items are showing ");
	}
}
	@Test(description = "to check multivitamins page ", priority = 22)
	public void checking_404_KSA_multivitamins() throws Exception {
		driver.get("https://www.sporter.com/en-sa/vitamins/multivitamins/");
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		//KSAStoreFooter KSAStorefooter = new KSAStoreFooter();
		//KSAStorefooter.getContactInfoOption().click();
		
	Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
	assertFalse(verifyTitle);
	if (verifyTitle== true )
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	}
		}
	@Test(description = "to check vitamin-dpage ", priority = 23)
	public void checking_404_KSA_vitamin_d() throws Exception {
		driver.get("https://www.sporter.com/en-sa/vitamins/essential-vitamins/vitamin-d/");
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		//KSAStoreFooter KSAStorefooter = new KSAStoreFooter();
		//KSAStorefooter.getContactInfoOption().click();
		
	Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
	assertFalse(verifyTitle);
	if (verifyTitle== true )
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	}
	if(driver.getPageSource().contains("We can't find products matching"))
		
		
	{
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	System.out.println("All the items are missing");
	throw new Exception("We can't find products matching ");
}
	else
	{
		System.out.println("The items are showing ");
	}
}
	@Test(description = "to check vitamin-c page ", priority = 24)
	public void checking_404_KSA_vitamin_c() throws Exception {
		driver.get("https://www.sporter.com/en-sa/vitamins/essential-vitamins/vitamin-c/");
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		//KSAStoreFooter KSAStorefooter = new KSAStoreFooter();
		//KSAStorefooter.getContactInfoOption().click();
		
	Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
	assertFalse(verifyTitle);
	if (verifyTitle== true )
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	}
	if(driver.getPageSource().contains("We can't find products matching"))
		
		
	{
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	System.out.println("All the items are missing");
	throw new Exception("We can't find products matching ");
}
	else
	{
		System.out.println("The items are showing ");
	}
}
	@Test(description = "to check vitamin-e page ", priority = 25)
	public void checking_404_KSA_vitamin_e() throws Exception {
		driver.get("https://www.sporter.com/en-sa/vitamins/essential-vitamins/vitamin-e/");
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		//KSAStoreFooter KSAStorefooter = new KSAStoreFooter();
		//KSAStorefooter.getContactInfoOption().click();
		
	Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
	assertFalse(verifyTitle);
	if (verifyTitle== true )
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	}
	if(driver.getPageSource().contains("We can't find products matching"))
		
		
	{
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	System.out.println("All the items are missing");
	throw new Exception("We can't find products matching ");
}
	else
	{
		System.out.println("The items are showing ");
	}
}
	@Test(description = "to check fish-oil-omegas page ", priority = 26)
	public void checking_404_KSA_fish_oil_omegas() throws Exception {
		driver.get("https://www.sporter.com/en-sa/vitamins/fish-oil-omegas/");
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		//KSAStoreFooter KSAStorefooter = new KSAStoreFooter();
		//KSAStorefooter.getContactInfoOption().click();
		
	Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
	assertFalse(verifyTitle);
	if (verifyTitle== true )
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	}
	if(driver.getPageSource().contains("We can't find products matching"))
		
		
	{
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	System.out.println("All the items are missing");
	throw new Exception("We can't find products matching ");
}
	else
	{
		System.out.println("The items are showing ");
	}
}
	@Test(description = "to check bone-joint page ", priority = 27)
	public void checking_404_KSA_bone_joint() throws Exception {
		driver.get("https://www.sporter.com/en-sa/vitamins/bone-joint/");
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		//KSAStoreFooter KSAStorefooter = new KSAStoreFooter();
		//KSAStorefooter.getContactInfoOption().click();
		
	Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
	assertFalse(verifyTitle);
	if (verifyTitle== true )
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	}
	if(driver.getPageSource().contains("We can't find products matching"))
		
		
	{
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	System.out.println("All the items are missing");
	throw new Exception("We can't find products matching ");
}
	else
	{
		System.out.println("The items are showing ");
	}
}
	@Test(description = "to check fish-oil-omegas page ", priority = 28)
	public void checking_404_KSA_fish_oil_omegas1() throws Exception {
		driver.get("https://www.sporter.com/en-sa/vitamins/fish-oil-omegas/");
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		//KSAStoreFooter KSAStorefooter = new KSAStoreFooter();
		//KSAStorefooter.getContactInfoOption().click();
		
	Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
	assertFalse(verifyTitle);
	if (verifyTitle== true )
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	}
	if(driver.getPageSource().contains("We can't find products matching"))
		
		
	{
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	System.out.println("All the items are missing");
	throw new Exception("We can't find products matching ");
}
	else
	{
		System.out.println("The items are showing ");
	}
}
	@Test(description = "to check collagen page ", priority = 29)
	public void checking_404_KSA_collagen() throws Exception {
		driver.get("https://www.sporter.com/en-sa/vitamins/beauty/collagen/");
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		//KSAStoreFooter KSAStorefooter = new KSAStoreFooter();
		//KSAStorefooter.getContactInfoOption().click();
		
	Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
	assertFalse(verifyTitle);
	if (verifyTitle== true )
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	}
		}
	@Test(description = "to check hair-skin-nails page ", priority = 30)
	public void checking_404_KSA_hair_skin_nailss() throws Exception {
		driver.get("https://www.sporter.com/en-sa/vitamins/beauty/hair-skin-nails/");
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		//KSAStoreFooter KSAStorefooter = new KSAStoreFooter();
		//KSAStorefooter.getContactInfoOption().click();
		
	Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
	assertFalse(verifyTitle);
	if (verifyTitle== true )
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	}
	if(driver.getPageSource().contains("We can't find products matching"))
		
		
	{
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	System.out.println("All the items are missing");
	throw new Exception("We can't find products matching ");
}
	else
	{
		System.out.println("The items are showing ");
	}
}
	@Test(description = "to check testosterone-booster page ", priority = 31)
	public void checking_404_KSA_testosterone_booster() throws Exception {
		driver.get("https://www.sporter.com/en-sa/sport-supplements/muscles-boosters/testosterone-booster/");
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		//KSAStoreFooter KSAStorefooter = new KSAStoreFooter();
		//KSAStorefooter.getContactInfoOption().click();
		
	Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
	assertFalse(verifyTitle);
	if (verifyTitle== true )
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	}
	if(driver.getPageSource().contains("We can't find products matching"))
		
		
	{
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	System.out.println("All the items are missing");
	throw new Exception("We can't find products matching ");
}
	else
	{
		System.out.println("The items are showing ");
	}
}
	@Test(description = "to check sleep-suppor page ", priority = 32)
	public void checking_404_KSA_sleep_suppor_omegas() throws Exception {
		driver.get("https://www.sporter.com/en-sa/vitamins/healthy-lifestyle/sleep-support/");
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		//KSAStoreFooter KSAStorefooter = new KSAStoreFooter();
		//KSAStorefooter.getContactInfoOption().click();
		
	Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
	assertFalse(verifyTitle);
	if (verifyTitle== true )
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	}
		}
	@Test(description = "to check digestion page ", priority = 33)
	public void checking_404_KSA_digestion() throws Exception {
		driver.get("https://www.sporter.com/en-sa/vitamins/digestion/");
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		//KSAStoreFooter KSAStorefooter = new KSAStoreFooter();
		//KSAStorefooter.getContactInfoOption().click();
		
	Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
	assertFalse(verifyTitle);
	if (verifyTitle== true )
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	}
	if(driver.getPageSource().contains("We can't find products matching"))
		
		
	{
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	System.out.println("All the items are missing");
	throw new Exception("We can't find products matching ");
}
	else
	{
		System.out.println("The items are showing ");
	}
}
	
	@Test(description = "to check training-apparel page ", priority = 34)
	public void checking_404_KSA_training_apparel() throws Exception {
		driver.get("https://www.sporter.com/en-sa/accessories-apparel/training-apparel/");
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		//KSAStoreFooter KSAStorefooter = new KSAStoreFooter();
		//KSAStorefooter.getContactInfoOption().click();
		
	Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
	assertFalse(verifyTitle);
	if (verifyTitle== true )
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	}
	if(driver.getPageSource().contains("We can't find products matching"))
		
		
	{
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	System.out.println("All the items are missing");
	throw new Exception("We can't find products matching ");
}
	else
	{
		System.out.println("The items are showing ");
	}
}
	
	@Test(description = "to check fitness-accessories page ", priority = 35)
	public void checking_404_KSA_fitness_accessoriesl() throws Exception {
		driver.get("https://www.sporter.com/en-sa/sportswear-accessories/fitness-accessories/");
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		//KSAStoreFooter KSAStorefooter = new KSAStoreFooter();
		//KSAStorefooter.getContactInfoOption().click();
		
	Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
	assertFalse(verifyTitle);
	if (verifyTitle== true )
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	}
	if(driver.getPageSource().contains("We can't find products matching"))
		
		
	{
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	System.out.println("All the items are missing");
	throw new Exception("We can't find products matching ");
}
	else
	{
		System.out.println("The items are showing ");
	}
}
	@Test(description = "to check shakers page ", priority = 36)
	public void checking_404_KSA_shakers() throws Exception {
		driver.get("https://www.sporter.com/en-sa/sportswear-accessories/fitness-accessories/shakers/");
		
		//KSAStoreFooter KSAStorefooter = new KSAStoreFooter();
		//KSAStorefooter.getContactInfoOption().click();
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
	Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
	assertFalse(verifyTitle);
	if (verifyTitle== true )
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	}
	if(driver.getPageSource().contains("We can't find products matching"))
		
		
	{
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	System.out.println("All the items are missing");
	throw new Exception("We can't find products matching ");
}
	else
	{
		System.out.println("The items are showing ");
	}
}
	@Test(description = "to check home_gyms page ", priority = 1)
	public void checking_404_KSA_home_gyms() throws Exception {
		driver.get("https://www.sporter.com/en-sa/sportswear-accessories/strength-training/home-gyms/");
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		//KSAStoreFooter KSAStorefooter = new KSAStoreFooter();
		//KSAStorefooter.getContactInfoOption().click();
		
	Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
	System.out.println(verifyTitle);
 String fm =driver.getTitle();
 
 System.out.println(fm);
	assertFalse(verifyTitle);
	
	if(verifyTitle == true)
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
		
	}
	
	//
	HomePage homepage = new HomePage();
	//Assert.assertTrue(homepage.getEmptycategorymsg().isDisplayed());
	
//	Boolean Display = (homepage.getEmptycategorymsg().isDisplayed());
//	System.out.println("Element displayed is :"+Display);
	
	if(driver.getPageSource().contains("We can't find products matching"))
	
		
		{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
		System.out.println("All the items are missing");
		throw new Exception("We can't find products matching ");
	}
		else
		{
			System.out.println("The items are showing ");
		}
	}
	
	
		

	@Test(description = "to check shakers page ", priority = 37)
	public void checking_404_KSA_fitbit() throws Exception {
		driver.get("https://www.sporter.com/en-sa/brands/other/fitbit/");
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		//KSAStoreFooter KSAStorefooter = new KSAStoreFooter();
		//KSAStorefooter.getContactInfoOption().click();
		
	Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
	assertFalse(verifyTitle);
	
	if (verifyTitle== true )
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	}
	if(driver.getPageSource().contains("We can't find products matching"))
		
		
	{
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	System.out.println("All the items are missing");
	throw new Exception("We can't find products matching ");
}
	else
	{
		System.out.println("The items are showing ");
	}
}
	
	@Test(description = "to check straps page ", priority = 38)
	public void checking_404_KSA_straps() throws Exception {
		driver.get("https://www.sporter.com/en-sa/portswear-accessories/strength-training/straps/");
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		//KSAStoreFooter KSAStorefooter = new KSAStoreFooter();
		//KSAStorefooter.getContactInfoOption().click();
		
	Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
	assertFalse(verifyTitle);
	if (verifyTitle== true )
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	}
	if(driver.getPageSource().contains("We can't find products matching"))
		
		
	{
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	System.out.println("All the items are missing");
	throw new Exception("We can't find products matching ");
}
	else
	{
		System.out.println("The items are showing ");
	}
}

	@Test(description = "to check bags page ", priority = 39)
	public void checking_404_KSA_bagss() throws Exception {
		driver.get("https://www.sporter.com/en-sa/sportswear-accessories/fitness-accessories/bags/");
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		//KSAStoreFooter KSAStorefooter = new KSAStoreFooter();
		//KSAStorefooter.getContactInfoOption().click();
		
	Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
	assertFalse(verifyTitle);
	if (verifyTitle== true )
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	}
	if(driver.getPageSource().contains("We can't find products matching"))
		
		
	{
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	System.out.println("All the items are missing");
	throw new Exception("We can't find products matching ");
}
	else
	{
		System.out.println("The items are showing ");
	}
}
	@Test(description = "to check dymatize-iso page ", priority = 40)
	public void checking_404_KSA_dymatize_iso() throws Exception {
		driver.get("https://www.sporter.com/en-sa/dymatize-iso-100-6350/");
		
		//KSAStoreFooter KSAStorefooter = new KSAStoreFooter();
		//KSAStorefooter.getContactInfoOption().click();
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
	Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
	assertFalse(verifyTitle);
	if (verifyTitle== true )
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	}
	if(driver.getPageSource().contains("We can't find products matching"))
		
		
	{
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	System.out.println("All the items are missing");
	throw new Exception("We can't find products matching ");
}
	else
	{
		System.out.println("The items are showing ");
	}
}
	@Test(description = "to check grenade-carb page ", priority = 41)
	public void checking_404_KSA_grenade_carb() throws Exception {
		driver.get("https://www.sporter.com/en-sa/grenade-carb-killa-protein-bar-35232/");
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		//KSAStoreFooter KSAStorefooter = new KSAStoreFooter();
		//KSAStorefooter.getContactInfoOption().click();
		
	Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
	assertFalse(verifyTitle);
	if (verifyTitle== true )
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	}
	if(driver.getPageSource().contains("We can't find products matching"))
		
		
	{
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	System.out.println("All the items are missing");
	throw new Exception("We can't find products matching ");
}
	else
	{
		System.out.println("The items are showing ");
	}
}
	@Test(description = "to check bags quest_nutrition ", priority = 42)
	public void checking_404_KSA_quest_nutrition() throws Exception {
		driver.get("https://www.sporter.com/en-sa/quest-nutrition-bars-pack-of-12-00715");
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		//KSAStoreFooter KSAStorefooter = new KSAStoreFooter();
		//KSAStorefooter.getContactInfoOption().click();
		
	Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
	assertFalse(verifyTitle);
	if (verifyTitle== true )
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	}
	else
	{
		
	}
	if(driver.getPageSource().contains("We can't find products matching"))
		
		
	{
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	System.out.println("All the items are missing");
	throw new Exception("We can't find products matching ");
}
	else
	{
		System.out.println("The items are showing ");
	}
}
	@Test(description = "to check optimum-gold page ", priority = 43)
	public void checking_404_KSA_optimum_gold() throws Exception {
		driver.get("https://www.sporter.com/en-sa/optimum-gold-standard-100-whey-6202/");
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		//KSAStoreFooter KSAStorefooter = new KSAStoreFooter();
		//KSAStorefooter.getContactInfoOption().click();
		
	Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
	assertFalse(verifyTitle);
	if (verifyTitle== true )
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	}
	if(driver.getPageSource().contains("We can't find products matching"))
		
		
	{
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile, new File("c:\\footer-KSA\\404error["+ randomInt +"].png"));
	System.out.println("All the items are missing");
	throw new Exception("We can't find products matching ");
}
	else
	{
		System.out.println("The items are showing ");
	}
}

/*@AfterClass
public void afterClass() {
	driver.close();
}*/
}