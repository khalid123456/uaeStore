package cases;

import org.testng.annotations.Test;

import pages.CartPage;
import pages.Checkoutpage;
import pages.HomePage;
import pages.ProductPage;
import pages.RegistraionPage;
import pages.successpage;

import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class SuccessPageKSA extends BaseTest {


	
	
	@Test(description = "to check placing order on KSA", priority = 1)
	public void to_Check_the_getSporter_Checkout_Logo_Success_page() throws Exception {
		successpage success = new successpage();
		Thread.sleep(3000);
		Assert.assertTrue(success.getSporterCheckoutLogo().isDisplayed());
		
	}

	@Test(description = "to check placing order on KSA", priority = 1)
	public void to_Check_the_quote_id_In_Success_page() throws Exception {
		successpage success = new successpage();
		Assert.assertTrue(success.getQuoteID().isDisplayed());
		
	}
	
	@Test(description = "to check placing order on KSA", priority = 1)
	public void to_Check_the_optional_Text_In_Success_page() throws Exception {
		successpage success = new successpage();
		Assert.assertTrue(success.getOptionalText().isDisplayed());
		
	}
	
	@Test(description = "to check placing order on KSA", priority = 1)
	public void to_Check_the_phone_No_Text_In_Success_page() throws Exception {
		successpage success = new successpage();
		Thread.sleep(2000);
		Assert.assertTrue(success.getPhoneNumberText().isDisplayed());
		
	}
	
	@Test(description = "to check placing order on KSA", priority = 1)
	public void to_Check_the_Edit_phone_No_Link_In_Success_page() throws Exception {
		successpage success = new successpage();
		
		Assert.assertTrue(success.getEditLink().isDisplayed());
		
	}
	
	@Test(description = "to check placing order on KSA", priority = 1)
	public void to_Check_the_SMS_Code_box_In_Success_page() throws Exception {
		successpage success = new successpage();
		Assert.assertTrue(success.getSmsCodeBox().isDisplayed());
		
	}
	
	@Test(description = "to check placing order on KSA", priority = 1)
	public void to_Check_the_SMS_code_Box_In_Success_page() throws Exception {
		successpage success = new successpage();
		Assert.assertTrue(success.getSmsCodeBox().isDisplayed());
		
	}
	@Test(description = "to check placing order on KSA", priority = 1)
	public void to_Check_resend_link_In_Success_page() throws Exception {
		successpage success = new successpage();
		Assert.assertTrue(success.getResendLink().isDisplayed());
		
	}
	
	@Test(description = "to check placing order on KSA", priority = 2)
	public void to_Check_the_ReCaptcha_Block_In_Success_page() throws Exception {
		successpage success = new successpage();
		Thread.sleep(35000);
		Assert.assertTrue(success.getReCaptchaBlock().isDisplayed());
		
	}
	
	@Test(description = "to check placing order on KSA", priority = 1)
	public void to_Check_Confirm_Number_Btn__In_Success_page() throws Exception {
		Thread.sleep(3000);
		successpage success = new successpage();
		Assert.assertTrue(success.getConfirmNymberBtn().isDisplayed());
		
	}
	public void placingKwCodorder() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		HomePage homePage = new HomePage();
		Thread.sleep(3000);
		ProductPage productpage = new ProductPage();
		 //goToPage(productpage);
		driver.get("https://www.sporter.com/en-qa/dymatize-iso-100");
		waitUntilClickable(homePage.getSwitchLangLink());
		//* homePage.getSwitchLangLink().click();
		//* homePage.getKSAswitchStore().click();
		waitUntilClickable(productpage.getAddToCartButton());
		productpage.getAddToCartButton().click();
		CartPage cartPage = new CartPage();
		waitUntilClickable(cartPage.getViewCartPopupButton());
		Thread.sleep(3000);
		cartPage.getViewCartPopupButton().click();
		// CartPage cartPage =new CartPage();
		System.out.println("frefreferf");
		waitUntilClickable(cartPage.getProceedTOCheckout());
		Thread.sleep(3000);
		cartPage.getProceedTOCheckout().click();
		System.out.println("frefreferf");
		Checkoutpage checkoutpage = new Checkoutpage();
		//waitUntilClickable(checkoutpage.getShippingInfoLink());
		//checkoutpage.getShippingInfoLink().click();
		waitUntilClickable(checkoutpage.getContinuButtonShippingINFO());
		checkoutpage.getContinuButtonShippingINFO().click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		checkoutpage.getShippingMethodKSA().click();
		waitUntilClickable(checkoutpage.getContinuShippingMethod());
		checkoutpage.getContinuShippingMethod().click();
		waitUntilClickable(checkoutpage.getCod());
		checkoutpage.getCod().click();
		System.out.println("ahhhhh");
		waitUntilClickable(checkoutpage.getContinuepaymentMethod());
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,250)", "");
		checkoutpage.getContinuepaymentMethod().click();
		System.out.println("mmmmm");
		waitUntilClickable(checkoutpage.getPlaceOrderButton());
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,250)", "");
		checkoutpage.getPlaceOrderButton().click();
	}
	

//	@Test(description = "to check placing order on KSA", priority = 50)
//	public void to_Check_Placing_order_on_KSA_Credit_card() throws Exception {
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		HomePage homePage = new HomePage();
//		Thread.sleep(3000);
//		ProductPage productpage = new ProductPage();
//		 //goToPage(productpage);
//		driver.get("http://www.sporter.com/en-qa/dymatize-iso-100");
//		waitUntilClickable(homePage.getSwitchLangLink());
//		//* homePage.getSwitchLangLink().click();
//	//* 	homePage.getKSAswitchStore().click();
//		waitUntilClickable(productpage.getAddToCartButton());
//		productpage.getAddToCartButton().click();
//		CartPage cartPage = new CartPage();
//		waitUntilClickable(cartPage.getViewCartPopupButton());
//		Thread.sleep(3000);
//		cartPage.getViewCartPopupButton().click();
//		// CartPage cartPage =new CartPage();
//		System.out.println("frefreferf");
//		waitUntilClickable(cartPage.getProceedTOCheckout());
//		Thread.sleep(3000);
//		cartPage.getProceedTOCheckout().click();
//		System.out.println("frefreferf");
//		Checkoutpage checkoutpage = new Checkoutpage();
//		//waitUntilClickable(checkoutpage.getShippingInfoLink());
//		//checkoutpage.getShippingInfoLink().click();
//		waitUntilClickable(checkoutpage.getContinuButtonShippingINFO());
//		checkoutpage.getContinuButtonShippingINFO().click();
//		Thread.sleep(3000);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,250)", "");
//		checkoutpage.getShippingMethodKSA().click();
//		waitUntilClickable(checkoutpage.getContinuShippingMethod());
//		checkoutpage.getContinuShippingMethod().click();
//		waitUntilClickable(checkoutpage.getCreditcardOption());
//		checkoutpage.getCreditcardOption().click();
//		swtichToCCFrame();
//		driver.switchTo().parentFrame();
//		waitUntilClickable(checkoutpage.getContinuepaymentMethod());
//		Thread.sleep(3000);
//		js.executeScript("window.scrollBy(0,250)", "");
//		checkoutpage.getContinuepaymentMethod().click();
//		System.out.println("mmmmm");
//		waitUntilClickable(checkoutpage.getPlaceOrderButton());
//		Thread.sleep(3000);
//		js.executeScript("window.scrollBy(0,250)", "");
//		checkoutpage.getPlaceOrderButton().click();
//	}
	
	private void swtichToCCFrame() throws InterruptedException {
		WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		//WebElement body = driver.findElement(By.tagName("body"));
//		body.sendKeys("5361220010651921");
//		Thread.sleep(200);
//		body.sendKeys("\t");
//		Thread.sleep(200);
//		body.sendKeys("0723");
//		Thread.sleep(200);
//		body.sendKeys("456");
//		Thread.sleep(200);
		 driver.findElement(By.id("checkout-frames-card-number")).click();
		    driver.findElement(By.id("checkout-frames-card-number")).sendKeys("4242 4242 4242 4242");
		    driver.findElement(By.cssSelector(".container")).click();
		    driver.findElement(By.id("checkout-frames-expiry-date")).click();
		    driver.findElement(By.id("checkout-frames-expiry-date")).sendKeys("02/25");
		    driver.findElement(By.id("checkout-frames-cvv")).sendKeys("100");
	}

	@BeforeClass
	public void beforeMetod() throws InterruptedException {

		HomePage homePage = new HomePage();

		goToPage(homePage);
		driver.manage().window().maximize();
		homePage.getMyAccountIcon().click();
		waitUntilClickable(homePage.getSignInButton());
		homePage.getSignInButton().click();
		RegistraionPage registrationPage = new RegistraionPage();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		registrationPage.getEmailField().clear();
		registrationPage.getEmailField().sendKeys("sel@sel.com");
		registrationPage.getPasswordField().sendKeys("Sporter@123");
		driver.findElement(By.id("DesktopTopPanel")).click();
		registrationPage.getSignInButton().click();
		placingKwCodorder();
	}

	/*
	 * @AfterClass public void afterClass() { driver.close(); }
	 */
}
