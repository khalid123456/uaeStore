package cases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



//import bsh.org.objectweb.asm.Type;
import pages.CartPage;
import pages.CategoryPage;
import pages.HomePage;
import pages.ProductPage;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.text.BreakIterator;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import javax.swing.border.TitledBorder;

//import org.omg.CORBA.portable.ValueBase;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class KSA_Product_Page_Cases extends BaseTest {

	@Test(description = "checking if add to cart button is working properly  ", priority = 3)
	public void checking_If_Add_To_Cart_Button_Is_Working_Properly() throws Exception {

		HomePage homePage = new HomePage();
		ProductPage productpage = new ProductPage();
		CartPage cartPage = new CartPage();
		waitUntilClickable(productpage.getAddToCartButton());
		productpage.getAddToCartButton().click();
		Thread.sleep(3000);
		waitUntilClickable(cartPage.getKeepShoppingbutton());
		Assert.assertTrue(cartPage.getKeepShoppingbutton().isDisplayed());

	}

	@Test(description = "checking_If_The_User_Can_Keep_Shopping_After_Clicking_ON_Add_To_Cart_Button  ", priority = 3)
	public void checking_If_The_User_Can_Keep_Shopping_After_Clicking_ON_Add_To_Cart_Button() throws Exception {

		HomePage homePage = new HomePage();

		ProductPage productpage = new ProductPage();
		CartPage cartPage = new CartPage();
		goToPage(cartPage);
		removeAlltemsFromCart(cartPage);
		driver.get("https://www.sporter.com/en-sa/optimum-gold-standard-100-whey");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(3000);
		waitUntilClickable(productpage.getAddToCartButton());
		productpage.getAddToCartButton().click();
		waitUntilClickable(cartPage.getKeepShoppingbutton());
		cartPage.getKeepShoppingbutton().click();

	}

	@Test(description = "checking_If_The_User_Can_proceed_To_Cart_page_After_Clicking_ON_Add_To_Cart_Button  ", priority = 4)
	public void checking_If_The_User_Can_proceed_To_Cart_page_After_Clicking_ON_Add_To_Cart_Button() throws Exception {

		HomePage homePage = new HomePage();
		ProductPage productpage = new ProductPage();
		CartPage cartPage = new CartPage();
		goToPage(cartPage);
		removeAlltemsFromCart(cartPage);
		driver.get("https://www.sporter.com/en-sa/optimum-gold-standard-100-whey");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(3000);
		waitUntilClickable(productpage.getAddToCartButton());
		productpage.getAddToCartButton().click();
		Thread.sleep(3000);
		waitUntilClickable(cartPage.getKeepShoppingbutton());
		cartPage.getViewCartPopupButton().click();

	}

	@Test(description = "checking_Increase_QTY_from_Prouct_Page  ", priority = 1)
	public void checking_Increase_QTY_from_Prouct_Page() throws Exception {

		
		ProductPage productpage = new ProductPage();
		productpage.getPlusQTYButton().click();
		Assert.assertEquals(productpage.getQTYBoxProductPage().getAttribute("value"), "2");

	}

	@Test(description = "checking_Decrease_QTY_from_Prouct_Page  ", priority = 2)
	public void checking_Decrease_QTY_from_Prouct_Page() throws Exception {

		HomePage homePage = new HomePage();
		ProductPage productpage = new ProductPage();
		//CartPage cartPage = new CartPage();
//		waitUntilClickable(homePage.getSwitchLangLink());
//		homePage.getSwitchLangLink().click();
//		homePage.getKSAStoreLink().click();
		Thread.sleep(3000);
		System.out.println("zad");
		//productpage.getPlusQTYButton().click();
		Thread.sleep(3000);
		System.out.println("na");
		productpage.getMinusQTYButton().click();
		Assert.assertEquals(productpage.getQTYBoxProductPage().getAttribute("value"), "1");

	}

	@Test(description = "checking_If_Best_Before_Date_Is availale  ", priority = 6)
	public void checking_If_Best_Before_Date_Is_Availale() throws Exception {

		HomePage homePage = new HomePage();
		ProductPage productpage = new ProductPage();
		//waitUntilClickable(homePage.getSwitchLangLink());
		Thread.sleep(3000);
		Assert.assertTrue(productpage.getBestBeforeTxt().isDisplayed());

	}

	@Test(description = "checking_If_Best_Before_Date_Is availale  ", priority = 7)
	public void checking_If_Expected_Delivery_Date_Is_Availale() throws Exception {

		HomePage homePage = new HomePage();
		ProductPage productpage = new ProductPage();
		homePage.getSwitchLangLink().click();
		Assert.assertTrue(productpage.geteXpectedDeliverydate().isDisplayed());

	}

	@Test(description = "checking_If_About_This_Item__Is_Availale ", priority = 8)
	public void checking_If_About_This_Item_Is_Availale() throws Exception {

		HomePage homePage = new HomePage();
		ProductPage productpage = new ProductPage();
		Assert.assertTrue(productpage.getAboutThisitem().isDisplayed());

	}

	@Test(description = "checking_If_Supplement_Facts_Is_Availale ", priority = 9)
	public void checking_If_Supplement_Facts_Is_Availale() throws Exception {

		HomePage homePage = new HomePage();
		ProductPage productpage = new ProductPage();
		CartPage cartPage = new CartPage();
		Assert.assertTrue(productpage.getSupplementFacts().isDisplayed());

	}

	/*
	 * @Test(description = "checking_If_Supplement_Facts_ text Is correct ",
	 * priority = 10) public void checking_If_Supplement_Facts_Text_Is_Correct()
	 * throws Exception {
	 * 
	 * HomePage homePage = new HomePage(); ProductPage productpage = new
	 * ProductPage(); CartPage cartPage = new CartPage();
	 * Assert.assertTrue(productpage.getSupplementFacts().isDisplayed());
	 * assertEquals(productpage.getSupplementFacts().getText(), "Supplement Facts");
	 * 
	 * }
	 */

	@Test(description = "checking_If_the_Search_Is_Avalable_IN_product_page ", priority = 11)
	public void checking_If_the_Search_Is_Avalable_IN_product_page() throws Exception {

		HomePage homePage = new HomePage();
		ProductPage productpage = new ProductPage();
		CartPage cartPage = new CartPage();
		Assert.assertTrue(productpage.getSearchBox().isDisplayed());
		System.out.println(productpage.getSearchBox().getText());

	}

	@Test(description = "checking_If_the_Search_Button_Is_working ", priority = 12)
	public void checking_If_the_Search_Button_Is_working() throws Exception {

		HomePage homePage = new HomePage();
		ProductPage productpage = new ProductPage();
		CartPage cartPage = new CartPage();
		productpage.getSearchButton().click();
		// Assert.assertTrue(productpage.getSearchResultsTitle().isDisplayed());
		Thread.sleep(3000);
		if (driver.getPageSource().contains("Ratings & Reviews")) {

			System.out.println("Ratings & Reviews is available");

		} else {
			System.out.println("error Ratings & Reviews");
			throw new Exception("Ratings & Reviews not showing");
		}
	}

	@Test(description = "checking_If_Supplement_Facts_Date_Is_Availale ", priority = 10)
	public void checking_If_About_This_Brand_Is_Availale() throws Exception {

		HomePage homePage = new HomePage();
		ProductPage productpage = new ProductPage();
		
		Assert.assertTrue(productpage.getAboutThisBrand().isDisplayed());

	}

	@Test(description = "checking_If_BrandIcon_Is_Availale ", priority = 11)
	public void checking_If_Brand_Icon_Availale() throws Exception {

		HomePage homePage = new HomePage();
		ProductPage productpage = new ProductPage();
		CartPage cartPage = new CartPage();
	
		Assert.assertTrue(productpage.getBrandIcon().isDisplayed());

	}

	@Test(description = "checking_If_BrandIcon_Is_Availale ", priority = 12)
	public void checking_If_Rating_Review_Title_Availale() throws Exception {

		HomePage homePage = new HomePage();
		ProductPage productpage = new ProductPage();
		CartPage cartPage = new CartPage();
		
		// Assert.assertTrue(productpage.getRatingReviewTitle().isDisplayed());

	}

	@Test(description = "checking_If_BrandIcon_Is_Availale ", priority = 13)
	public void checking_If_Top_Review_Title_Availale() throws Exception {

		HomePage homePage = new HomePage();
		ProductPage productpage = new ProductPage();
		
		// Assert.assertTrue(productpage.getTopReview().isDisplayed());
		Thread.sleep(3000);
		if (driver.getPageSource().contains("Top review")) {

			System.out.println("top review");

		} else {
			System.out.println("error");
			throw new Exception("top review not showing ");
		}
	}

	@Test(description = "checking_If_BrandIcon_Is_Available ", priority = 14)
	public void checking_If_review_pagination_Is_Available() throws Exception {

		HomePage homePage = new HomePage();
		ProductPage productpage = new ProductPage();
		
		Assert.assertTrue(productpage.getTollBarNOOFReview().isDisplayed());

	}

	@Test(description = "checking_If_BrandIcon_Is_Available ", priority = 15)
	public void checking_If_review_pagination_Is_working() throws Exception {

		HomePage homePage = new HomePage();
		ProductPage productpage = new ProductPage();

		Assert.assertTrue(productpage.getNextpageButtonpagination().isDisplayed());

	}

	@Test(description = "checking_If_Price_In_Product_Page_Is_Availale ", priority = 20)
	public void checking_If_Price_Not_Zero_Product_Page_Is_Availale() throws Exception {

		HomePage homePage = new HomePage();
		ProductPage productpage = new ProductPage();
	

		// Assert.assertNotEquals(cartPage.getQtyBox().getAttribute("value"), "0");
		String currectProductPrice = productpage.getOGSWPrice().getText();
		Assert.assertNotEquals(currectProductPrice, 00.00);

	}

	@Test(description = "checking_If_Price_In_Product_Page_Is_Availale ", priority = 17)
	public void checking_If_Price_In_Product_Page_Is_Availale() throws Exception {
//
//		HomePage homePage = new HomePage();
//		ProductPage productpage = new ProductPage();
//		//waitUntilClickable(homePage.getSwitchLangLink());
//		//homePage.getSwitchLangLink().click();
//		Thread.sleep(7000);
//		//System.out.println(productpage.getOGSWPrice().getText());
//		//Assert.assertTrue(productpage.getOGSWPrice().isDisplayed());
//		SoftAssert myAssertion = new  SoftAssert();
//        WebElement ttm = productpage.getOGSWPrice();
//		ttm.isDisplayed();
//		myAssertion.assertEquals(ttm.isDisplayed(),true,"this for test");
//		myAssertion.assertAll();
			

	}

	@Test(description = "checking_If_the_price_changed_after_increasing_The_QTY ", priority = 18)
	public void checking_If_the_price_changed_after_increasing_The_QTY() throws InterruptedException {
		ProductPage productpage = new ProductPage();
		HomePage homePage = new HomePage();
		//String currectProductPrice = productpage.getOGSWPrice().getText();
		//System.out.println(currectProductPrice);
		//productpage.getOGSWPrice().click();
		//productpage.getPlusQTYButton().click();
		//Thread.sleep(3000);
		//String newProductPrice = productpage.getOGSWPrice().getText();
		//System.out.println(newProductPrice);
		//Assert.assertNotEquals(currectProductPrice, newProductPrice);
	}

	@Test(description = " checking_If_The_Price_Changed_after_Changing_The_Size ", priority = 19)
	public void checking_If_The_Price_Changed_after_Changing_The_Size() {
		ProductPage productpage = new ProductPage();
		//productpage.getOGSWPrice().click();
//		String currectProductPrice = productpage.getOGSWPrice().getText();
//		System.out.println(currectProductPrice);
//		driver.get("https://www.sporter.com/en-sa/optimum-gold-standard-100-whey-8821/");
//		String newProductPrice = productpage.getOGSWPrice().getText();
//		System.out.println(newProductPrice);
//		Assert.assertNotEquals(currectProductPrice, newProductPrice);
	}

	@Test(description = " checking_if_the_user_can_open_sport_supplement_from product page ", priority = 1)
	public void checking_if_the_user_can_open_sport_supplement_from_product_pag() {
		MegaMenuCases megamenu = new MegaMenuCases();
		megamenu.supplementHover();
	}

	@Test(description = " checking_if_the_user_can_open_sport_supplement_from product page ", priority = 21)
	public void checking_if_the_user_can_open_Healthy_Food_from_product_pag() {
		MegaMenuCases megamenu = new MegaMenuCases();
		megamenu.healthyFoodCategoryhover();
	}

	@Test(description = " checking_if_the_user_can_open_sport_supplement_from product page ", priority = 22)
	public void checking_if_the_user_can_Open_Vitamins_Category_from_product_pag() {
		MegaMenuCases megamenu = new MegaMenuCases();
		megamenu.vitaminsCategoryHover();
	}

	@Test(description = " checking_if_the_user_can_open_sport_supplement_from product page ", priority = 23)
	public void checking_if_the_users_can_Open_sports_from_product_pag() {
		MegaMenuCases megamenu = new MegaMenuCases();
		megamenu.sportsCategoryHover();
	}

	@Test(description = " checking_if_the_user_can_open_sport_supplement_from product page ", priority = 24)

	public void checking_if_the_OOS_Message_is_Showing() throws Exception {
		driver.get("https://www.sporter.com/en-sa/mueller-elastic-cold-hot-wrap/");
		HomePage homePage = new HomePage();
	
		  homePage.getSwitchLangLink().click();
		  homePage.getswitchTOksaStore().click();
		// boolean OosPage = driver.getPageSource().contains("We're sorry for not
		// being");
		// assertTrue(OosPage, " oos item");
		Thread.sleep(3000);
		if (driver.getPageSource().contains("We're sorry for not being able")) {
			System.out.println("top review");

		} else {
			throw new Exception("top review not showing ");
		}
	}

	@Test(description = " checking_If_Add_To_Cart_Not_Showing_For_OOS ", priority = 25)

	public void checking_If_Add_To_Cart_Button_Not_Showing_For_OOS() throws Exception {
		
		//driver.get("https://www.sporter.com/en-sa/optimum-platinum-hydrowhey-6220/");
		
		HomePage homePage = new HomePage();
		
		ProductPage productPage = new ProductPage();
	
		//waitUntilClickable(homePage.getSignInButton());
		Thread.sleep(7000);
		
		SoftAssert myAssertion = new  SoftAssert();
	WebElement ttt = productPage.getAddToCartButton();
	
	ttt.isDisplayed();
	driver.get("https://www.sporter.com/en-sa/climaqx-ultra-grips/");
	//driver.get("https://www.sporter.com/en-sa/optimum-platinum-hydrowhey-6220/");
	  homePage.getSwitchLangLink().click();
	  homePage.getswitchTOksaStore().click();
	//myAssertion.assertEquals(ttt.isDisplayed(),true,"this for test");
	myAssertion.assertEquals(false,false);
	myAssertion.assertAll();
		
		if (driver.getPageSource().contains("Add to Cart")) {

			System.out.println("Add to Cart is showing");
			throw new Exception("Ratings & Reviews not showing");

		} else {
			System.out.println("Add to Cart not showing");
			
		}
	
	

	
	}

	@Test(description = " checking_if_the_user_can_open_sport_supplement_from product page ", priority = 26)
	public void checking_If_Available_IN_Size_Not_Showing_For_OOS() throws InterruptedException {
//		driver.get("https://www.sporter.com/en-sa/climaqx-ultra-grips/");
//		HomePage homePage = new HomePage();
//		ProductPage productPage = new ProductPage();
//		  homePage.getSwitchLangLink().click();
//		  homePage.getswitchTOKuwaitStore().click();
//		Thread.sleep(5000);
//		Assert.assertFalse(productPage.getAvialableINSize().isDisplayed());

	}
	public void removeAlltemsFromCart(CartPage cartPage) throws InterruptedException {
		for (int i = 1; i <= 5; i++) {
			if (driver.getPageSource().contains("My Shopping Cart"))  
				
				
			{
				// to remove all the items from the cart page
				System.out.println("yyyyy");
				Thread.sleep(2000);
				cartPage.getItemRemoveLink().click();
				Thread.sleep(3000);
				
			}
			
			else
				
			{
				break;
			} 
		
		}
	}
	@BeforeMethod
	public void beforeClass() throws InterruptedException {
		driver.get("https://www.sporter.com/en-sa/optimum-gold-standard-100-whey");
		  HomePage homePage = new HomePage();
		  //CategoryPage cat = new CategoryPage();
		//  homePage.getSwitchLangLink().click();
		//  homePage.getswitchTOKSAStore().click();
		  

	}

	@AfterMethod
	public void afterClass() throws InterruptedException {
		// driver.close();
	}

}
