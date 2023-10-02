package cases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import pages.CartPage;
import pages.HomePage;
import pages.ProductPage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



import org.testng.annotations.BeforeClass;

import java.text.BreakIterator;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class KSA_Store_cart_page_cases extends BaseTest {

	@Test(description = "view the cart page after adding simple item ", priority = 2)
	public void view_cart_page() throws Exception {

		HomePage homePage = new HomePage();
		Thread.sleep(3000);

	}

	@Test(description = "to check the cart URL ", priority = 3)
	public void to_check_the_Cart_URL() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		Assert.assertEquals(driver.getCurrentUrl(), cartURL, "The current URL is not matched with the Cart URL");
	}

	@Test(description = "to check increase QTY ", priority = 1)
	public void to_check_Increase_QTY() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		CartPage cartPage = new CartPage();
		Thread.sleep(3000);
		for (int x = 1; x <= 1; x++) {
			Thread.sleep(3000);
			cartPage.getIncreaseQtybutton().click();
			
		}
		Thread.sleep(5000);
		Assert.assertEquals(cartPage.getQtyBox().getText(), "2", "Incresing quatity does not work");

	}

	@Test(description = "to check decrease QTY ", priority = 1)
	public void to_check_decrease_QTY() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		CartPage cartPage = new CartPage();
		/*
		 * Thread.sleep(3000); for (int x = 1; x <= 2; x++) { Thread.sleep(2000);
		 * cartPage.getIncreaseQtybutton().click(); Thread.sleep(3000);
		 * 
		 * }
		 */
	
		cartPage.getDecreaseQty().click();
		Thread.sleep(5000);
		Assert.assertEquals(cartPage.getQtyBox().getText(), "1", "decrease quatity does not work");
		//Assert.assertEquals(cartPage.getQtyBox().getAttribute("value"), "2", "decrease quatity does not work");

	}

	@Test(description = "to check  MYACarttext ", priority = 3)
	public void to_check_MY_Cart_text() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		CartPage cartPage = new CartPage();
		Assert.assertTrue(cartPage.getmyShoppingCartText().isDisplayed());

	}

	@Test(description = "to check the getPriceField ", priority = 3)
	public void to_check_Price_Field() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		CartPage cartPage = new CartPage();
		Assert.assertTrue(cartPage.getPriceField().isDisplayed());

	}

	@Test(description = "to_check_Title page", priority = 3)
	public void to_check_Title_Page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle = "Shopping Cart";
		Assert.assertEquals(actualTitle, expectedTitle);

	}

	@Test(description = "to_check_QTY_Field ", priority = 3)
	public void to_check_QTY_Field() throws Exception {
		CartPage cartPage = new CartPage();
		Assert.assertTrue(cartPage.getQTYField().isDisplayed());

	}

	@Test(description = "to_check_Total_Field ", priority = 3)
	public void to_check_Total_Field() throws Exception {
		CartPage cartPage = new CartPage();
		Assert.assertTrue(cartPage.getTotalField().isDisplayed());

	}

	@Test(description = "to_check_SubTotal_Field ", priority = 3)
	public void to_check_SubTotal_Field() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		CartPage cartPage = new CartPage();
		//driver.manage().window().maximize();
		Thread.sleep(7000);
		Assert.assertTrue(cartPage.getSubTotalField().isDisplayed());

	}

	@Test(description = "to_check_CODFieldInCartPage_Field ", priority = 3)
	public void to_check_COD_Field_In_Cart_Page_Field() throws Exception {
		CartPage cartPage = new CartPage();
		Thread.sleep(5000);
		// Assert.assertTrue(cartPage.getCODFieldInCartPage().isDisplayed());
		if (driver.getPageSource().contains("Payment on Delivery")) {
			System.out.println("Payment on Delivery is available");
		} else {
			System.out.println("not available");
			throw new Exception("max qty alert message not found ");
		}

	}

	@Test(description = "to_check_CCFieldInCartPage_Field", priority = 3)
	public void to_check_CreditCard_Field_In_Cart_Page_Field() throws Exception {
		CartPage cartPage = new CartPage();
		Thread.sleep(5000);
		// Assert.assertTrue(cartPage.getCCFieldInCartPage().isDisplayed());

		if (driver.getPageSource().contains("Pay by Credit Card")) {
			System.out.println("Pay by Credit Card is available");
		} else {
			System.out.println("not available");
			throw new Exception("max qty alert message not found ");
		}

	}

	@Test(description = "to_check_OrderTotalField", priority = 3)
	public void to_check_Order_Total_Field() throws Exception {
		CartPage cartPage = new CartPage();
		Assert.assertTrue(cartPage.getOrderTotalField().isDisplayed());

	}

	@Test(description = "to_check_ExpectedDeliveryFieldInCart", priority = 3)
	public void to_check_Expected_Delivery_Field_In_Cart() throws Exception {
		CartPage cartPage = new CartPage();
		System.out.println(cartPage.getExpectedDeliveryFieldInCart().getText());
		Assert.assertTrue(cartPage.getExpectedDeliveryFieldInCart().isDisplayed());

	}

	@Test(description = "to_check_ExpectedDeliveryFieldInCart", priority = 3)
	public void to_check_Proceed_TO_Checkout_Btn() throws Exception {
		CartPage cartPage = new CartPage();
		waitUntilClickable(cartPage.getProceedTOCheckout());
		Assert.assertTrue(cartPage.getProceedTOCheckout().isDisplayed());

	}

	@Test(description = "to_check_DoYouHaveCoupoTxtInCart", priority = 3)
	public void to_check_Do_You_Have_Coupon_Txt() throws Exception {
		CartPage cartPage = new CartPage();
		Assert.assertTrue(cartPage.getDoYouHaveCoupon().isDisplayed());
		//driver.findElement(By.id("closeAddToCartErrBtn")).click();

	}

	@Test(description = "to_check_GenuienProductsTexInCart", priority = 3)
	public void to_check_Genuien_Products_Tex_InCart() throws Exception {
		CartPage cartPage = new CartPage();
		//Assert.assertTrue(cartPage.getGenuienProductsTexInCart().isDisplayed());
		if (driver.getPageSource().contains("100% GENUINE PRODUCTS")) {

			System.out.println("available");
		} else {
			throw new Exception("element not found");
		}

	}

	@Test(description = "to_check_Delivery2DaysTexInCart", priority = 3)
	public void to_check_Delivery_2Days_Tex_InCart() throws Exception {
		CartPage cartPage = new CartPage();
		//Assert.assertTrue(cartPage.getDelivery2daysTexInCart().isDisplayed());
		if (driver.getPageSource().contains("SUPER DELIVERY WITHIN 2 WORKING DAYS")) {
			                                 
			System.out.println("available 2 days");
		} else {
			throw new Exception("element not found");
		}

	}

	@Test(description = "to_check_IncorrectCouponCode", priority = 1)
	public void to_check_Coupon_Code_value() throws Exception {
		CartPage cartPage = new CartPage();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);
		cartPage.getCuponCodeBox().sendKeys("sporte5");
		cartPage.getCuponCodeApplyBtn().click();
		System.out.println(cartPage.getCuponCodeErrorMsg().getText());
		Assert.assertTrue(cartPage.getCuponCodeErrorMsg().isDisplayed());
		
		driver.findElement(By.id("closeAddToCartErrBtn")).click();
		

	}

	@Test(description = "to_check_EmptyCouponCode", priority = 3)
	public void to_check_Empty_Coupon_code_value() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		CartPage cartPage = new CartPage();
		cartPage.getCuponCodeBox().sendKeys(Keys.CONTROL,"a");
		cartPage.getCuponCodeBox().sendKeys(Keys.DELETE);
		cartPage.getCuponCodeApplyBtn().click();
		Assert.assertTrue(cartPage.getEmptyCuponCodeErrorMsg().isDisplayed());

	}

	@Test(description = "to_check_Spaces_CouponCode", priority = 3)
	public void to_check_Spaces_Coupon_code_value() throws Exception {
		CartPage cartPage = new CartPage();
		//goToPage(cartPage);
		cartPage.getCuponCodeBox().sendKeys("       ");
		cartPage.getCuponCodeApplyBtn().click();
		Assert.assertTrue(cartPage.getCuponCodeErrorMsg().isDisplayed());
		driver.findElement(By.id("closeAddToCartErrBtn")).click();

	}

	@Test(description = "to_check_SubTotal_Value", priority = 100) ////////////////////////////////////////////////////////////////
	public void to_check_SubTotal_Value() throws Exception {
		CartPage cartPage = new CartPage();
		//goToPage(cartPage);
		//System.out.println(cartPage.getSubTotalField().getAttribute("value"));
		System.out.println(cartPage.getSubTotalField().getText());
		Assert.assertTrue(cartPage.getSubTotalField().isDisplayed());

	}

	@Test(description = "to_check_SizeItemTxtIncart", priority = 3)
	public void to_check_Size_Item_Txt_In_cart() throws Exception {
		CartPage cartPage = new CartPage();
		Assert.assertTrue(cartPage.getProceedTOCheckout().isDisplayed());

	}

	@Test(description = "to_check_flavorItemTxtIncart", priority = 3)
	public void to_check_Flavor_Item_TxtIn_cart() throws Exception {
		CartPage cartPage = new CartPage();
		Assert.assertTrue(cartPage.getProceedTOCheckout().isDisplayed());

	}

	@Test(description = "to_check_ExpirydateItemTxtIncart", priority = 3)
	public void to_check_Expiry_Date_ItemTxt_In_cart() throws Exception {
		CartPage cartPage = new CartPage();
		Assert.assertTrue(cartPage.getProceedTOCheckout().isDisplayed());

	}

	@Test(description = "to_check_sporterLogoNavigation", priority = 350)
	public void to_check_sporter_Logo_Navigation() throws Exception {
		
		CartPage cartPage = new CartPage();
		cartPage.getSporterLogoBtn().click();
		Assert.assertEquals(driver.getCurrentUrl(), hompageURL, "The current URL is not matched with the homepage URL");

	}

	@Test(description = "to_check_shopBy hover", priority = 3)
	public void to_check_hover_shopBy_Menu() throws Exception {
		CartPage cartPage = new CartPage();
		// cartPage.getShopByMenu();
		Actions actions = new Actions(driver);
		actions.moveToElement(cartPage.getShopByMenu());

	}

	@Test(description = "to_check_supplement hover", priority = 3)
	public void to_check_hover_Supplement_Category() throws Exception {
		CartPage cartPage = new CartPage();
		// cartPage.getShopByMenu();
		Actions actions = new Actions(driver);
		actions.moveToElement(cartPage.getShopByMenu());

	}

	@Test(description = "to_check_vitamins hover", priority = 3)
	public void to_check_hover_vitamins() throws Exception {
		CartPage cartPage = new CartPage();
		// cartPage.getShopByMenu();
		Actions actions = new Actions(driver);
		actions.moveToElement(cartPage.getShopByMenu());

	}

	@Test(description = "to_check_healthy food hover", priority = 3)
	public void to_check_hover_HealthyFood() throws Exception {
		CartPage cartPage = new CartPage();
		// cartPage.getShopByMenu();
		Actions actions = new Actions(driver);
		actions.moveToElement(cartPage.getShopByMenu());

	}

	@Test(description = "to_check_Sports hover", priority = 3)
	public void to_check_hover_Sports() throws Exception {
		CartPage cartPage = new CartPage();
		// cartPage.getShopByMenu();
		Actions actions = new Actions(driver);
		actions.moveToElement(cartPage.getShopByMenu());

	}

	@Test(description = "to_check_Sports hover", priority = 3)
	public void to_check_hover_Women_ONly() throws Exception {
		CartPage cartPage = new CartPage();
		// cartPage.getShopByMenu();
		Actions actions = new Actions(driver);
		actions.moveToElement(cartPage.getShopByMenu());

	}

	@Test(description = "to_check_AED_Currency_InCart", priority = 3)
	public void to_check_QAR_Currency_InCart() throws Exception {
		CartPage cartPage = new CartPage();
		// Assert.assertTrue(cartPage.getDelivery2daysTexInCart().isDisplayed());
		Thread.sleep(5000);
		String x = cartPage.getorderTotalAmount().getText();
		System.out.println(x);
		if (x.contains("SAR")) {

			System.out.println("available SAR");
		} else {
			throw new Exception("SAR currency not showing");
		}

	}

	@Test(description = "adding bundle 1 simple", priority = 400)
	public void to_check_Adding_Bundle_item_One_Simple() throws Exception {
		CartPage cartPage = new CartPage();
		driver.get("https://www.sporter.com/en-ae/healthy-food//grenade-carb-killa-protein-bar-box-of-12");
		// Assert.assertTrue(cartPage.getDelivery2daysTexInCart().isDisplayed());
		ProductPage productpage = new ProductPage();
		Thread.sleep(5000);
		WebElement option = productpage.getBundleOption();

		Select select = new Select(option);
		Thread.sleep(5000);
		select.selectByIndex(1);
		productpage.getAddToCartButton().click();
		waitUntilClickable(cartPage.getKeepShoppingbutton());

		cartPage.getKeepShoppingbutton().click();
	}

	@Test(description = "adding bundle 2 simple ", priority = 401)
	public void to_check_Adding_Bundle_item_2_Simple() throws Exception {
		CartPage cartPage = new CartPage();
		driver.get("https://www.sporter.com/en-ae/healthy-food//grenade-carb-killa-protein-bar-box-of-12");

		// Assert.assertTrue(cartPage.getDelivery2daysTexInCart().isDisplayed());
		ProductPage productpage = new ProductPage();
		WebElement option = productpage.getBundleOption();
		for (int i = 3; i <= 4; i++) {
			Select select = new Select(option);

			select.selectByIndex(i);
			productpage.getAddToCartButton().click();

			waitUntilClickable(cartPage.getKeepShoppingbutton());
			cartPage.getKeepShoppingbutton().click();
		}
	}

	@Test(description = "adding bundle 2 simple ", priority = 402)
	public void to_check_AddingBunleitem_2_Simplettt() throws Exception {

//		CartPage cartPage = new CartPage();
//		driver.get("https://www.sporter.com/en-ae/healthy-food//grenade-carb-killa-protein-bar-box-of-12");
//
//		// Assert.assertTrue(cartPage.getDelivery2daysTexInCart().isDisplayed());
//		ProductPage productpage = new ProductPage();
//		WebElement option = productpage.getBundleOption();
//		for (int i = 5; i <= 10; i++) {
//			Select select = new Select(option);
//
//			select.selectByIndex(i);
//			productpage.getAddToCartButton().click();
//
//			// WebElement m=driver.findElement(By.xpath("//*[contains(text(),'Sorry')]"));
//
//			// System.out.println("Element with contains(): " + m.getText());
//
//			if (productpage.getQtyNotAvailableMsg().isDisplayed()) {
//
//				// tenSecWaiting.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"error-block\"]/div[2]/button")));
//				driver.findElement(By.xpath("//*[@id=\"error-block\"]/div[2]/button")).click();
//				// oos
//				System.out.println("oos");
			}
	//	}

	//}

	@Test(description = "to check remove button QTY ", priority = 300)
	public void to_check_remove_Button_Is_Working() throws Exception {
		CartPage cartPage = new CartPage();
		//goToPage(cartPage);
		// MaxPriceTest maxprice = new MaxPriceTest();
		// addingItemToCart();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		waitUntilClickable(cartPage.getItemRemoveLink());
		Thread.sleep(5000);
		for (int i = 1; i <= 5; i++) {
			if (driver.getPageSource().contains("My Shopping Cart")) {// to remove all the items from the cart page
				cartPage.getItemRemoveLink().click();
				Thread.sleep(3000);
			} else {
				break;
			}

			Assert.assertTrue(cartPage.getNoItemINCartTxt().isDisplayed());
		}
	}

	@BeforeClass
	public void beforeClass() throws InterruptedException {
		HomePage homePage = new HomePage();
		driver.manage().window().maximize();
//		goToPage(homePage);
//		waitUntilClickable(homePage.getSwitchLangLink());
//		homePage.getSwitchLangLink().click();
//		homePage.getswitchTOksaStore().click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(3000);

		ProductPage productpage = new ProductPage();
		goToPage(productpage);
		waitUntilClickable(homePage.getSwitchLangLink());
		//* homePage.getSwitchLangLink().click();
	//*	homePage.getswitchTOksaStore().click();
		waitUntilClickable(productpage.getAddToCartButton());
		Thread.sleep(10000);
		productpage.getAddToCartButton().click();
		CartPage cartPage = new CartPage();
		waitUntilClickable(cartPage.getViewCartPopupButton());
		Thread.sleep(3000);
		cartPage.getViewCartPopupButton().click();

	}

	@AfterClass
	public void afterClass() throws InterruptedException {
		// driver.close();
	}

	private void addingItemToCart() throws InterruptedException {
		HomePage homePage = new HomePage();

//		goToPage(homePage);
//		waitUntilClickable(homePage.getSwitchLangLink());
//		homePage.getSwitchLangLink().click();
//		homePage.getswitchTOksaStore().click();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		ProductPage productpage = new ProductPage();
		goToPage(productpage);
		waitUntilClickable(homePage.getSwitchLangLink());
	//*	homePage.getSwitchLangLink().click();
		//*homePage.getswitchTOksaStore().click();
		
		// waitUntilClickable(productpage.getAddToCartButton());
		productpage.getAddToCartButton().click();
		CartPage cartPage = new CartPage();
		waitUntilClickable(cartPage.getViewCartPopupButton());
		Thread.sleep(3000);
		cartPage.getViewCartPopupButton().click();
	}

}
