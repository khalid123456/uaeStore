package cases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import pages.CartPage;
import pages.HomePage;
import pages.ProductPage;
import pages.ProductPage2;
import pages.RegistraionPage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import org.testng.annotations.BeforeClass;

import java.security.PublicKey;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class MaxPriceTestKSA extends BaseTest {

	@Test(description = "to check the price more than 821 ", priority = 1)
	public void to_Check_The_Price_More_Than_821() throws Exception {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// ================= going to cart page ==================
		CartPage cartPage = new CartPage();
		goToPage(cartPage);
		Thread.sleep(1000);
		HomePage homepage = new HomePage();
		switchToKsaStore(homepage);
		
		removeAlltemsFromCart(cartPage);
		
		Thread.sleep(2000);
		// ================= going to product page ==================
		ProductPage productpage = new ProductPage();
		goToPage(productpage);
		Thread.sleep(2000);
		switchToKsaStore(homepage);
		Thread.sleep(2000);
		waitUntilClickable(productpage.getAddToCartButton());
		productpage.getAddToCartButton().click();
		waitUntilClickable(cartPage.getViewCartPopupButton());
		Thread.sleep(3000);
		cartPage.getViewCartPopupButton().click();
		for (int x = 1; x <= 2; x++) {
			
			//List<WebElement>increase_qty = driver.findElements(By.className("cartItem_qtyContainer__plMYP"));
			//System.out.println(increase_qty.size());
			//System.out.println(increase_qty.get(0));
			//System.out.println(increase_qty.get(1));
			//increase_qty.get(1).click();
			Thread.sleep(5000);
		cartPage.getIncreaseQtybutton().click();
			Thread.sleep(3000);
		}
		Thread.sleep(2000);
//		try {
//			driver.switchTo().alert();
//
//			System.out.println(" Alert Present");
//			String aa = driver.switchTo().alert().getText();
//			System.out.println(aa);
//		} catch (NoAlertPresentException e) {
//			System.out.println("NO Alert  Present");
//			throw new Exception("max price alert message not found ");
//		}
//		driver.switchTo().alert().accept(); // close the alert
		
		
		if ((cartPage.getErrorPopup().isDisplayed()))
			//if (driver.getPageSource().contains("Sorry For The Inconvenience"))// error popup inside the poduct page
			{
				String o = driver.findElement(By.id("AddToCartErrMsg")).getText();// text of error popup
				System.out.println(o);
			} else {
				System.out.println("no error");
				throw new Exception("max qty alert message not found ");
			}
	
			//productPage.getErrorPopupCloseButton().click();

		}


	
	
	@Test(description = "adding more than 3 items have the same sku_in the product_page ", priority = 2)
	public void to_check_adding_more_than_3_items_have_the_same_sku() throws Exception {
		CartPage cartPage = new CartPage();
		goToPage(cartPage);
		Thread.sleep(5000);
		HomePage homepage = new HomePage();
		switchToKsaStore(homepage);
		Thread.sleep(5000);
		
			for (int i = 1; i <= 5; i++) {
				if (driver.getPageSource().contains("My Shopping Cart")) {// to remove all the items from the cart page
					System.out.println("yyyyy");
					Thread.sleep(5000);
					//CartPage cartPage = new CartPage();
					cartPage.getItemRemoveLink().click();
					Thread.sleep(3000);
				} 
				else 
				{
					break;
				}
			}

		Thread.sleep(2000);
		ProductPage productPage = new ProductPage();
// goToPage(productPage);
		driver.get("https://www.sporter.com/en-sa/dymatize-iso-100-53402/");
		Thread.sleep(3000);
		switchToKsaStore(homepage);
		for (int x = 1; x <= 3; x++)// to add more than 3 items (same sku )
		{
			Thread.sleep(3000);
			waitUntilClickable(productPage.getAddToCartButton());
			productPage.getAddToCartButton().click();
			waitUntilClickable(cartPage.getKeepShoppingbutton());
			cartPage.getKeepShoppingbutton().click();
		}
		Thread.sleep(2000);
		waitUntilClickable(productPage.getAddToCartButton());
		productPage.getAddToCartButton().click();
		String winHandleBefore = driver.getWindowHandle();// open the new window(popup)
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
			Thread.sleep(2000);
			if ((cartPage.getErrorPopup().isDisplayed()))
				//if (driver.getPageSource().contains("Sorry For The Inconvenience"))// error popup inside the poduct page
				{
					String o = driver.findElement(By.id("AddToCartErrMsg")).getText();// text of error popup
					System.out.println(o);
				} else {
					System.out.println("no error");
					throw new Exception("max qty alert message not found ");
				}
		
				//productPage.getErrorPopupCloseButton().click();

			}
	}

	@Test(description = "adding more than 5 items ,different sku's ", priority = 2)
	public void to_Check_Adding_more_than_5_Items_Different_skus() throws Exception {

		HomePage homepage = new HomePage();

		CartPage cartPage = new CartPage();
		goToPage(cartPage);
		Thread.sleep(3000);
		switchToKsaStore(homepage);
		Thread.sleep(2000);
		removeAlltemsFromCart(cartPage);
		ProductPage2 productpage2 = new ProductPage2();
		goToPage(productpage2);
		Thread.sleep(2000);
		switchToKsaStore(homepage);
		for (int x = 1; x <= 3; x++)// to add more than 3 items (same sku )
		{
			Thread.sleep(3000);
		
			waitUntilClickable(productpage2.getAddToCartButton());
			// driver.findElement(By.id("product-addtocart-button")).click();// add to cart
			// button
			productpage2.getAddToCartButton().click();
			// tenSecWaiting.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"popup-block\"]/div[2]/a[2]")));
			// driver.findElement(By.xpath("//*[@id=\"popup-block\"]/div[2]/a[1]")).click();
			waitUntilClickable(cartPage.getViewCartPopupButton());
			cartPage.getKeepShoppingbutton().click();
		}
		Thread.sleep(2000);
       driver.get("https://www.sporter.com/en-sa/sporter-shaker-pill-box-yellow-31961/");
       switchToKsaStore(homepage);
      // driver.findElement(By.id("NavContainer")).click();
		for (int x = 1; x <= 2; x++)// to add more than 3 items (same sku )
		{
			Thread.sleep(3000);
	
			waitUntilClickable(productpage2.getAddToCartButton());
			productpage2.getAddToCartButton().click();
		
			waitUntilClickable(cartPage.getKeepShoppingbutton());
			cartPage.getKeepShoppingbutton().click();
		}
		
		waitUntilClickable(productpage2.getAddToCartButton());
		productpage2.getAddToCartButton().click();
		String winHandleBefore = driver.getWindowHandle();// open the new window(popup)

		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
			Thread.sleep(2000);
			if ((cartPage.getErrorPopup().isDisplayed()))
				//if (driver.getPageSource().contains("Sorry For The Inconvenience"))// error popup inside the poduct page
				{
					String o = driver.findElement(By.id("AddToCartErrMsg")).getText();// text of error popup
					System.out.println(o);
					driver.findElement(By.id("closeAddToCartErrBtn"));
					
				} else {
					System.out.println("no error");
					throw new Exception("max qty alert message not found ");
				}
		
				//productPage.getErrorPopupCloseButton().click();

			}
	}
	@Test(description = "adding more than 5 items ,different sku's for the same conf ", priority = 2)
	public void to_Check_Adding_more_than_5_Items_Different_skus_for_the_same_configurable() throws Exception {

		HomePage homepage = new HomePage();

		CartPage cartPage = new CartPage();
		goToPage(cartPage);
		Thread.sleep(3000);
		switchToKsaStore(homepage);
		Thread.sleep(2000);
		removeAlltemsFromCart(cartPage);
		ProductPage2 productpage2 = new ProductPage2();
		goToPage(productpage2);
		Thread.sleep(2000);
		switchToKsaStore(homepage);
		for (int x = 1; x <= 3; x++)// to add more than 3 items (same sku )
		{
			Thread.sleep(3000);
		
			waitUntilClickable(productpage2.getAddToCartButton());
			// driver.findElement(By.id("product-addtocart-button")).click();// add to cart
			// button
			productpage2.getAddToCartButton().click();
			// tenSecWaiting.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"popup-block\"]/div[2]/a[2]")));
			// driver.findElement(By.xpath("//*[@id=\"popup-block\"]/div[2]/a[1]")).click();
			waitUntilClickable(cartPage.getViewCartPopupButton());
			cartPage.getKeepShoppingbutton().click();
		}
		Thread.sleep(2000);
       driver.get("https://www.sporter.com/en-sa/cellucor-c4-21009/");
       switchToKsaStore(homepage);

		for (int x = 1; x <= 2; x++)// to add more than 3 items (same sku )
		{
			Thread.sleep(3000);
	
			waitUntilClickable(productpage2.getAddToCartButton());
			productpage2.getAddToCartButton().click();
		
			waitUntilClickable(cartPage.getKeepShoppingbutton());
			cartPage.getKeepShoppingbutton().click();
		}
		
		waitUntilClickable(productpage2.getAddToCartButton());
		productpage2.getAddToCartButton().click();
		String winHandleBefore = driver.getWindowHandle();// open the new window(popup)

		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
			Thread.sleep(2000);
			if ((cartPage.getErrorPopup().isDisplayed()))
				//if (driver.getPageSource().contains("Sorry For The Inconvenience"))// error popup inside the poduct page
				{
					String o = driver.findElement(By.id("AddToCartErrMsg")).getText();// text of error popup
					System.out.println(o);
					driver.findElement(By.id("closeAddToCartErrBtn"));
					
				} else {
					System.out.println("no error");
					throw new Exception("max qty alert message not found ");
				}
		
				//productPage.getErrorPopupCloseButton().click();

			}
	}
	@Test(description = "adding more than 3 items ,same sku-cart page ", priority = 1)
	public void adding_More_Than_3_Items_Same_Sku_Cart_Page() throws Exception {
		CartPage cartPage = new CartPage();
		goToPage(cartPage);
		HomePage homePage = new HomePage();
		Thread.sleep(2000);
		switchToKsaStore(homePage);
		removeAlltemsFromCart(cartPage);
		Thread.sleep(2000);
		ProductPage2 productPage2 = new ProductPage2();
		goToPage(productPage2);
		switchToKsaStore(homePage);
		waitUntilClickable(productPage2.getAddToCartButton());
		productPage2.getAddToCartButton().click();
		waitUntilClickable(cartPage.getViewCartPopupButton());
		//driver.findElement(By.xpath("//*[@id=\"popup-block\"]/div[2]/a[2]")).click();// view cart popup
		cartPage.getViewCartPopupButton().click();
		System.out.println("zzzzzzzzzzz");
		Thread.sleep(3000);
		for (int x = 1; x <= 3; x++) {
		
			Thread.sleep(2000);
			cartPage.getIncreaseQtybutton().click();
			Thread.sleep(3000);
		}
	
//		try {
//			driver.switchTo().alert();
//
//			System.out.println(" Alert Present");
//			String aa = driver.switchTo().alert().getText();
//			System.out.println(aa);
//		} catch (NoAlertPresentException e) {
//			System.out.println("NO Alert  Present");
//			throw new Exception("max price alert message not found ");
//		}
//		System.out.println("yyyyy");
		//driver.switchTo().alert().accept(); // close the alert
		if ((cartPage.getErrorPopup().isDisplayed()))
			//if (driver.getPageSource().contains("Sorry For The Inconvenience"))// error popup inside the poduct page
			{
				String o = driver.findElement(By.id("AddToCartErrMsg")).getText();// text of error popup
				System.out.println(o);
				driver.findElement(By.id("closeAddToCartErrBtn"));
				
			} else {
				System.out.println("no error");
				throw new Exception("max qty alert message not found ");
			}
	}

	@BeforeClass
	public void beforeClass() throws InterruptedException {

		//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		//driver = new ChromeDriver();
		HomePage homePage = new HomePage();
		goToPage(homePage);
		switchToKsaStore(homePage);
		System.out.println("test");
		maximizeWindow();
		System.out.println("test2");
		loginusingSelAccount(homePage);
		System.out.println("test3");
	}

	public void switchToKsaStore(HomePage homePage) {
		
		//*waitUntilClickable(homePage.getSwitchLangLink());
	//*	homePage.getSwitchLangLink().click();
	//*	homePage.getswitchTOksaStore().click();
	}

	public void loginusingSelAccount(HomePage homePage) throws InterruptedException {
		
		Thread.sleep(3000);
		homePage.getMyAccountIcon().click();
		waitUntilClickable(homePage.getSignInButton());
		homePage.getSignInButton().click();
		RegistraionPage registrationPage = new RegistraionPage();
		Thread.sleep(5000);
		//registrationPage.getEmailField().clear();
		registrationPage.getEmailField().sendKeys("sel@sel.com");
		registrationPage.getPasswordField().sendKeys("Sporter@123");
		driver.findElement(By.id("NavContainer")).click();
		registrationPage.getSignInButton().click();
	}

	
	public void removeAlltemsFromCart(CartPage cartPage) throws InterruptedException {
		for (int i = 1; i <= 5; i++) {
			if (driver.getPageSource().contains("My Shopping Cart")) {// to remove all the items from the cart page
				System.out.println("yyyyy");
				Thread.sleep(5000);
				//CartPage cartPage = new CartPage();
				cartPage.getItemRemoveLink().click();
				Thread.sleep(5000);
			} 
			else 
			{
				break;
			}
		}
	}

}
