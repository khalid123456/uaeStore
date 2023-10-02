package cases;

import static org.testng.Assert.assertFalse;

import java.io.File;
import java.io.IOException;
//import java.awt.List;
import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.HomePage;

public class ksa_Homepage_Cases extends BaseTest {

	@Test(description = "checking_the_main_slider_homepage_KSA", priority = 1)
	public void checking_the_main_slider_homepage_KSA() throws Exception {
   HomePage home = new HomePage();
  // goToPage(home);
  
	
		
		Assert.assertTrue(home.getMainSlider().isDisplayed());
		

	}

	
	
	@Test(description = "checking_the_first_offer_in_the_Main_Slider_homepage_KSA", priority = 2)
	public void checking_the_first_offer_in_the_Main_Slider_homepage_KSA() throws Exception {
   HomePage home = new HomePage();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Thread.sleep(2000);
        home.getFirstofferClickMainBanner().click();
        Thread.sleep(2000);
		Assert.assertTrue(home.getFirstImageinMainBanner().isDisplayed());
		

	}
	
	@Test(description = "checking_the_second_offer_in_the_Main_Slider_homepage_KSA ", priority = 3)
	public void checking_the_second_offer_in_the_Main_Slider_homepage_KSA() throws Exception {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   HomePage home = new HomePage();
    //goToPage(home);
	Thread.sleep(2000);
   home.getSecondofferClickMainBanner().click();
		
		Assert.assertTrue(home.getSecondImageinMainBanner().isDisplayed());
		

	}

	@Test(description = "checking_the_First_Side_Banner_offer_of_the_Main_Slider_homepage_KSA", priority = 4)
	public void checking_the_First_Side_Banner_offer_of_the_Main_Slider_homepage_KSA() throws Exception {
   HomePage home = new HomePage();
   // goToPage(home);
	
		
		Assert.assertTrue(home.getSideBanner1().isDisplayed());
		

	}
	
	@Test(description = "checking_the_Second_Side_Banner_offer_of_the_Main_Slider_homepage_KSA ", priority = 5)
	public void checking_the_Second_Side_Banner_offer_of_the_Main_Slider_homepage_KSA() throws Exception {
   HomePage home = new HomePage();
   // goToPage(home);
	
		
		Assert.assertTrue(home.getSideBanner2().isDisplayed());
		

	}
	
	@Test(description = "checking_The_TOP_Banner_homepage_KSA ", priority = 6)
	public void checking_The_TOP_Banner_homepage_KSA() throws Exception {
   HomePage home = new HomePage();
   // goToPage(home);
	
		
		Assert.assertTrue(home.getTopBannerHomepage().isDisplayed());
		

	}
	
	@Test(description = "checking_The_Shop_BY_Category_Title_homepage_KSA ", priority = 7)
	public void checking_The_Shop_BY_Category_Title_homepage_KSA() throws Exception {
   HomePage home = new HomePage();
   // goToPage(home);
	
		
		Assert.assertTrue(home.getShopByCategoryTitle().isDisplayed());
		

	}
	
	@Test(description = "checking_The_Shop_BY_Category_Block_homepage_KSA ", priority = 8)
	public void checking_The_Shop_BY_Category_Block_homepage_KSA() throws Exception {
   HomePage home = new HomePage();
   // goToPage(home);
	
		
		Assert.assertTrue(home.getShopByCategoryBlock().isDisplayed());
		

	}
	
	@Test(description = "checking_The_Shop_BY_Category_Block_homepage_KSA ", priority = 9)
	public void checking_The_Button_Of_First_item_In_Shop_BY_Category_Block_homepage_KSA() throws Exception {
   HomePage home = new HomePage();
   // goToPage(home);
	
		
		Assert.assertTrue(home.getShopByCategoryFirsItemtBtn().isDisplayed());
		

	}
	
	@Test(description = "checking_The_Shop_BY_Category_Block_homepage_KSA ", priority = 10)
	public void checking_The_Button_Of_Second_item_In_Shop_BY_Category_Block_homepage_KSA() throws Exception {
   HomePage home = new HomePage();
   // goToPage(home);
	
		
		Assert.assertTrue(home.getShopByCategorysecondItemBtn().isDisplayed());
		

	}
	@Test(description = "checking_The_Shop_BY_Category_Block_homepage_KSA ", priority = 11)
	public void checking_The_Button_Of_3d_item_In_Shop_BY_Category_Block_homepage_KSA() throws Exception {
   HomePage home = new HomePage();
   // goToPage(home);
	
		
		Assert.assertTrue(home.getShopByCategory3dItemBtn().isDisplayed());
		

	}
	
	@Test(description = "checking_The_Button_Of_4th_item_In_Shop_BY_Category_Block_homepage_KSA ", priority = 12)
	public void checking_The_Button_Of_4th_item_In_Shop_BY_Category_Block_homepage_KSA() throws Exception {
   HomePage home = new HomePage();
   // goToPage(home);
	
		
		Assert.assertTrue(home.getShopByCategory4thItemBtn().isDisplayed());
		
	}
		//-----------------------------
		
		
		@Test(description = "checking_The_Shop_BY_Category_Block_homepage_KSA ", priority = 13)
		public void checking_The_Image_Of_First_item_In_Shop_BY_Category_Block_homepage_KSA() throws Exception {
	   HomePage home = new HomePage();
	   // goToPage(home);
		
			
			Assert.assertTrue(home.getShopByCategoryItemfirstImg().isDisplayed());
			

		}
		
		@Test(description = "checking_The_Shop_BY_Category_Block_homepage_KSA ", priority = 14)
		public void checking_The_Image_Of_Second_item_In_Shop_BY_Category_Block_homepage_KSA() throws Exception {
	   HomePage home = new HomePage();
	   // goToPage(home);
		
			
			Assert.assertTrue(home.getShopByCategorysecondItemImg().isDisplayed());
			

		}
		@Test(description = "checking_The_Shop_BY_Category_Block_homepage_KSA ", priority = 15)
		public void checking_The_Image_Of_3d_item_In_Shop_BY_Category_Block_homepage_KSA() throws Exception {
	   HomePage home = new HomePage();
	   // goToPage(home);
		
			
			Assert.assertTrue(home.getShopByCategory3dItemImg().isDisplayed());
			

		}
		
		@Test(description = "checking_The_Button_Of_4th_item_In_Shop_BY_Category_Block_homepage_KSA ", priority = 16)
		public void checking_The_Image_Of_4th_item_In_Shop_BY_Category_Block_homepage_KSA() throws Exception {
	   HomePage home = new HomePage();
	   // goToPage(home);
		
			
			Assert.assertTrue(home.getShopByCategory4thItemImg().isDisplayed());
			

	}
		
		@Test(description = "checking_The_First_Banner_Of_Three_Banner_homepage_KSA ", priority = 17)
		public void checking_The_First_Banner_Of_Three_Banner_homepage_KSA() throws Exception {
	   HomePage home = new HomePage();
	   // goToPage(home);
		
			
			Assert.assertTrue(home.getFirstImageBanner3Images().isDisplayed());
			

	}
		
		@Test(description = "checking_The_First_Banner_Of_Three_Banner_homepage_KSA ", priority = 18)
		public void checking_The_Second_Banner_Of_Three_Banner_homepage_KSA() throws Exception {
	   HomePage home = new HomePage();
	   // goToPage(home);
		
			
			Assert.assertTrue(home.getSecondImageBanner3Images().isDisplayed());
			

	}
		
		@Test(description = "checking_The_First_Banner_Of_Three_Banner_homepage_KSA ", priority = 19)
		public void checking_The_last_Banner_Of_Three_Banner_homepage_KSA() throws Exception {
	   HomePage home = new HomePage();
	   // goToPage(home);
		
			
			Assert.assertTrue(home.getLastImageBanner3Images().isDisplayed());
			

	}
		
		
		
		@Test(description = "checking_The_First_Banner_Of_Three_Banner_homepage_KSA ", priority = 20)
		public void checking_The_title_Of_Top_Selling_stack_homepage_KSA() throws Exception {
	   HomePage home = new HomePage();
	   // goToPage(home);
		
			
			Assert.assertTrue(home.getCategoryProductsTitle_TopSellingStack().isDisplayed());
			

	}
		
		@Test(description = "checking_The_First_Banner_Of_Three_Banner_homepage_KSA ", priority = 21)
		public void checking_The_Block_Of_Top_Selling_stack_homepage_KSA() throws Exception {
	   HomePage home = new HomePage();
	   // goToPage(home);
		
			
			Assert.assertTrue(home.getCategoryProducts_TopSellingStackBlock().isDisplayed());
			

	}
		
		@Test(description = "checking_The_First_Banner_Of_Three_Banner_homepage_KSA ", priority = 22)
		public void checking_All_Link_Of_Top_Selling_stack_homepage_KSA() throws Exception {
	   HomePage home = new HomePage();
	   // goToPage(home);
		
			
			Assert.assertTrue(home.getAllLinkInTopSellingstack().isDisplayed());
			
			
			

	}
		
		@Test(description = "checking_The_First_Banner_Of_Three_Banner_homepage_KSA ", priority = 23)
		public void checking_Title_top_Sellere_Block_homepage_KSA() throws Exception {
	   HomePage home = new HomePage();
	   // goToPage(home);
		
			
			Assert.assertTrue(home.getTitle_topSellerHomepage().isDisplayed());
			
			
			

	}
		
		@Test(description = "checking_The_First_Banner_Of_Three_Banner_homepage_KSA ", priority = 24)
		public void checking_top_Sellere_Block_homepage_KSA() throws Exception {
	   HomePage home = new HomePage();
	   // goToPage(home);
		
			
			Assert.assertTrue(home.getTopSellerBlock().isDisplayed());
			
			
			

	}
		
		
		@Test(description = "checking_The_First_Banner_Of_Three_Banner_homepage_KSA ", priority = 25)
		public void checking_All_Link_top_Sellere_Block_homepage_KSA() throws Exception {
	   HomePage home = new HomePage();
	   // goToPage(home);
		
			
			Assert.assertTrue(home.getAll_TopSellerHomepage().isDisplayed());
			
			
			

	}
		
		@Test(description = "checking_The_First_Banner_Of_Three_Banner_homepage_KSA ", priority = 26)
		public void checking_Supplement_Link_top_Sellere_Block_homepage_KSA() throws Exception {
	   HomePage home = new HomePage();
	   // goToPage(home);
		
			
			Assert.assertTrue(home.getSupplement_TopSellerHomepage().isDisplayed());
			
			
			

	}
		
		@Test(description = "checking_The_First_Banner_Of_Three_Banner_homepage_KSA ", priority = 27)
		public void checking_Healthyfood_Link_top_Sellere_Block_homepage_KSA() throws Exception {
	   HomePage home = new HomePage();
	   // goToPage(home);
		
			
			Assert.assertTrue(home.getHealthyfood_TopSellerHomepage().isDisplayed());
			
			
			

	}
		
		@Test(description = "checking_Sportwear_Link_top_Sellere_Block_homepage_KSA ", priority = 28)
		public void checking_Sportwear_Link_top_Sellere_Block_homepage_KSA() throws Exception {
	   HomePage home = new HomePage();
	   // goToPage(home);
		
			
			Assert.assertTrue(home.getSportwear_TopSellerHomepage().isDisplayed());
			
			
			

	}
		
		@Test(description = "checking_Trending_Sporter_Title_Block_homepage_KSA ", priority = 29)
		public void checking_Trending_Sporter_Title_Block_homepage_KSA() throws Exception {
	   HomePage home = new HomePage();
	   // goToPage(home);
		
			
			Assert.assertTrue(home.getTrendingSporterTitle().isDisplayed());
			
			
			

	}
		
//		@Test(description = "checking_Sportwear_Link_top_Sellere_Block_homepage_KSA ", priority = 2)
//		public void checking_Trending_first_Category_homepage_KSA() throws Exception {
//	   HomePage home = new HomePage();
//	   // goToPage(home);
//		
//			
//			Assert.assertTrue(home.getTrending1().isDisplayed());
//			
//			
//			
//
//	}
		
//		@Test(description = "checking_Sportwear_Link_top_Sellere_Block_homepage_KSA ", priority = 2)
//		public void checking_Trending_Secpnd_Category_homepage_KSA() throws Exception {
//	   HomePage home = new HomePage();
//	   // goToPage(home);
//		
//			
//			Assert.assertTrue(home.getTrending2().isDisplayed());
//			
//			
//			
//
//	}
//		@Test(description = "checking_Sportwear_Link_top_Sellere_Block_homepage_KSA ", priority = 2)
//		public void checking_Trending_3d_Category_homepage_KSA() throws Exception {
//	   HomePage home = new HomePage();
//	   // goToPage(home);
//		
//			
//			Assert.assertTrue(home.getTrending3().isDisplayed());
//			
//			
//			
//
//	}
//	
//		@Test(description = "checking_Sportwear_Link_top_Sellere_Block_homepage_KSA ", priority = 2)
//		public void checking_Trending_4th_Category_homepage_KSA() throws Exception {
//	   HomePage home = new HomePage();
//	   // goToPage(home);
//		
//			
//			Assert.assertTrue(home.getTrending4().isDisplayed());
//			
//			
//			
//
//	}
		
//		@Test(description = "checking_Sportwear_Link_top_Sellere_Block_homepage_KSA ", priority = 2)
//		public void checking_Trending_5th_Category_homepage_KSA() throws Exception {
//	   HomePage home = new HomePage();
//	   // goToPage(home);
//		
//			
//			Assert.assertTrue(home.getTrending5().isDisplayed());
//			
//			
//			
//
//	}
		
//		@Test(description = "checking_Sportwear_Link_top_Sellere_Block_homepage_KSA ", priority = 2)
//		public void checking_Trending_6th_Category_homepage_KSA() throws Exception {
//	   HomePage home = new HomePage();
//	   // goToPage(home);
//		
//			
//			Assert.assertTrue(home.getTrending6().isDisplayed());
//			
//			
//			
//
//	}
//		@Test(description = "checking_Sportwear_Link_top_Sellere_Block_homepage_KSA ", priority = 2)
//		public void checking_Trending_7th_Category_homepage_KSA() throws Exception {
//	   HomePage home = new HomePage();
//	   // goToPage(home);
//		
//			
//			Assert.assertTrue(home.getTrending7().isDisplayed());
//			
//			
//			
//
//	}
////		
//		@Test(description = "checking_Sportwear_Link_top_Sellere_Block_homepage_KSA ", priority = 2)
//		public void checking_Trending_8th_Category_homepage_KSA() throws Exception {
//	   HomePage home = new HomePage();
//	   // goToPage(home);
//		
//			
//			Assert.assertTrue(home.getTrending8().isDisplayed());
//			
//			
//			
//
//	}
		
//		@Test(description = "checking_Sportwear_Link_top_Sellere_Block_homepage_KSA ", priority = 2)
//		public void checking_Trending_9th_Category_homepage_KSA() throws Exception {
//	   HomePage home = new HomePage();
//	   // goToPage(home);
//		
//			
//			Assert.assertTrue(home.getTrending9().isDisplayed());
//			
//			
//			
//
//	}
//		
//		@Test(description = "checking_Sportwear_Link_top_Sellere_Block_homepage_KSA ", priority = 2)
//		public void checking_Trending_10th_Category_homepage_KSA() throws Exception {
//	   HomePage home = new HomePage();
//	   // goToPage(home);
//		
//			
//			Assert.assertTrue(home.getTrending10().isDisplayed());
//			
//			
//			
//
//	}
		
		
		@Test(description = "checking_The_Shop_BY_Category_Title_homepage_KSA ", priority = 30)
		public void checking_The_New_Arrivals_Title_homepage_KSA() throws Exception {
	   HomePage home = new HomePage();
	   // goToPage(home);
		
			
			Assert.assertTrue(home.getNewArrivalTitle().isDisplayed());
			

		}
		
		@Test(description = "checking_The_Shop_BY_Category_Block_homepage_KSA ", priority = 31)
		public void checking_The_New_Arrivals_Block_homepage_KSA() throws Exception {
	   HomePage home = new HomePage();
	   // goToPage(home);
		
			
			Assert.assertTrue(home.getNewArrivalBlock().isDisplayed());
			

		}
		
		

		@Test(description = "checking_The_First_Banner_Of_Three_Banner_homepage_KSA ", priority = 32)
		public void checking_All_Link_top_New_Arrivals_homepage_KSA() throws Exception {
	   HomePage home = new HomePage();
	   // goToPage(home);
		
			
			Assert.assertTrue(home.getAllnewArrival().isDisplayed());
			
			
			

	}
		
		@Test(description = "checking_The_First_Banner_Of_Three_Banner_homepage_KSA ", priority = 33)
		public void checking_Supplement_Link_New_Arrivals_Block_homepage_KSA() throws Exception {
	   HomePage home = new HomePage();
	   // goToPage(home);
		
			
			Assert.assertTrue(home.getSupplementnewArrival().isDisplayed());
			
			
			

	}
		
		@Test(description = "checking_The_First_Banner_Of_Three_Banner_homepage_KSA ", priority = 34)
		public void checking_Healthyfood_Link_New_Arrivals_Block_homepage_KSA() throws Exception {
	   HomePage home = new HomePage();
	   // goToPage(home);
		
			
			Assert.assertTrue(home.getHealthynewArrival().isDisplayed());
			
			
			

	}
		
		@Test(description = "checking_Sportwear_Link_top_Sellere_Block_homepage_KSA ", priority = 35)
		public void checking_Sportwear_Link_New_Arrivals_Block_homepage_KSA() throws Exception {
	   HomePage home = new HomePage();
	   // goToPage(home);
		
			
			Assert.assertTrue(home.getSportwearnewArrival().isDisplayed());
			
			
			

	}
		
		@Test(description = "checking_Sportwear_Link_top_Sellere_Block_homepage_KSA ", priority = 36)
		public void checking_Got_A_Quastion_Block_homepage_KSA() throws Exception {
	   HomePage home = new HomePage();
	   // goToPage(home);
		
			
			Assert.assertTrue(home.getContactFormHP().isDisplayed());
			
			
			

	}
		
		@Test(description = "checking_Sportwear_Link_top_Sellere_Block_homepage_KSA ", priority = 37)
		public void checking_phone_Btn_Got_A_Quastion_Block_homepage_KSA() throws Exception {
	   HomePage home = new HomePage();
	   // goToPage(home);
		
			
			Assert.assertTrue(home.getPhoneButtonGotAQuastion().isDisplayed());
			
			
			

	}
		
		@Test(description = "checking_Sportwear_Link_top_Sellere_Block_homepage_KSA ", priority = 38)
		public void checking_Email_Btn_Got_A_Quastion_Block_homepage_KSA() throws Exception {
	   HomePage home = new HomePage();
	   // goToPage(home);
		
			
			Assert.assertTrue(home.getEmailButtonGotAQuastion().isDisplayed());
			
			
			

	}
		@Test(description = "checking_Sportwear_Link_top_Sellere_Block_homepage_KSA ", priority = 39)
		public void checking_100_Secure_Payments_badget_Text_Got_A_Quastion_Block_homepage_KSA() throws Exception {
	   HomePage home = new HomePage();
	   // goToPage(home);
		
			
			Assert.assertTrue(home.getEmailButtonGotAQuastion().isDisplayed());
		SoftAssert softassert = new SoftAssert();
		String actualRersult = home.getOnehandredSecurePayments().getText();
		String expectedResult = "100% Secure Payments";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "text is not Matching");
		softassert.assertAll();
		
		}
		
		@Test(description = "checking_Sportwear_Link_top_Sellere_Block_homepage_KSA ", priority = 40)
		public void checking_100_Authentic_Products_badget_Text_Got_A_Quastion_Block_homepage_KSA() throws Exception {
	   HomePage home = new HomePage();
	   // goToPage(home);
		
			
			Assert.assertTrue(home.getEmailButtonGotAQuastion().isDisplayed());
		SoftAssert softassert = new SoftAssert();
		String actualRersult = home.getAuthenticProducts().getText();
		String expectedResult = "100% Authentic Products";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "text is not Matching");
		softassert.assertAll();
		
		}
		
		@Test(description = "checking_Sportwear_Link_top_Sellere_Block_homepage_KSA ", priority = 41)
		public void checking_Fast_Delivery_Service_badget_Text_Got_A_Quastion_Block_homepage_KSA() throws Exception {
	   HomePage home = new HomePage();
	   // goToPage(home);
 
	   String x = driver.findElement(By.xpath("//*[@id=\"label\"]")).getAttribute("label");
	 
	   System.out.println(x);
	   Thread.sleep(5000);
			
	Assert.assertTrue(home.getEmailButtonGotAQuastion().isDisplayed());
		SoftAssert softassert = new SoftAssert();
		String actualRersult = home.getFastDeliveryService().getText();
		String expectedResult = "Fast Delivery Service";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "text is not Matching");
		softassert.assertAll();
		
		}
		
		@Test(description = "checking_Sportwear_Link_top_Sellere_Block_homepage_KSA ", priority = 42)
		public void checking_Newsletter_Block_is_avialable_In_homepage_KSA() throws Exception {
	   HomePage home = new HomePage();

	   
	   Assert.assertTrue(home.getNewsLetterBlock().isDisplayed());
		
		
		
		}
		
		@Test(description = "checking_Sportwear_Link_top_Sellere_Block_homepage_KSA ", priority = 43)
		public void checking_Newsletter_Text_is_avialable_In_homepage_KSA() throws Exception {
	   HomePage home = new HomePage();

	   
	   Assert.assertTrue(home.getNewsLettertext().isDisplayed());
		
		
		
		}
		@Test(description = "checking_Newsletter_Female_Subscribe_homepage_KSA ", priority = 44)
		public void checking_Newsletter_Female_Subscribe_homepage_KSA() throws Exception {
	   HomePage home = new HomePage();
	   // goToPage(home);
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	   WebElement gender =  driver.findElement(By.id("email_radioContainer__QmsGs"));
//	   List<WebElement>xx=gender.findElements(By.tagName("svg"));
//	   System.out.println(xx.get(0).getText());
	   Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		home.getNewsLetterEmail().clear();
		home.getNewsLetterEmail().sendKeys("khalid.test+" + randomInt + "2023@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[2]/div[2]/div/div[2]/span")).click();
		home.getNewsLetterJOINBtn().click();
		Thread.sleep(1000);
		driver.findElement(By.id("popUpSubmit")).click();
		
		}
		
		@Test(description = "checking_Newsletter_Male_Subscribe_homepage_KSA ", priority = 45)
		public void checking_Newsletter_Male_Subscribe_homepage_KSA() throws Exception {
	   HomePage home = new HomePage();
	   // goToPage(home);
		
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		home.getNewsLetterEmail().clear();
		home.getNewsLetterEmail().sendKeys("khalid.test+" + randomInt + "2023@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[2]/div[2]/div/div[1]/span")).click();
		home.getNewsLetterJOINBtn().click();
		Thread.sleep(1000);
		driver.findElement(By.id("popUpSubmit")).click();
		
		
		}
		
		@Test(description = "checking_Newsletter_Male_Subscribe_homepage_KSA ", priority = 46)
		public void checking_Incorrect_Email_Validation_Message_Newsletter_homepage_KSA() throws Exception {
	   HomePage home = new HomePage();
	   // goToPage(home);
		
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		home.getNewsLetterEmail().clear();
		home.getNewsLetterEmail().sendKeys("khalid");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[2]/div[2]/div/div[1]/span")).click();
		home.getNewsLetterJOINBtn().click();
		SoftAssert softassert = new SoftAssert();
		String actualRersult = home.getNewsLetterValidationmessage().getText();
		String expectedResult = "Please enter a valid email address (Ex: johndoe@domain.com).";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "error is not Matching");
		softassert.assertAll();
		
		
		}
		
		@Test(description = "checking_Newsletter_Male_Subscribe_homepage_KSA ", priority = 47)
		public void checking_Empty_Email_Validation_Message_Newsletter_homepage_KSA() throws Exception {
	   HomePage home = new HomePage();
	   // goToPage(home);
		
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		home.getNewsLetterEmail().clear();
		home.getNewsLetterEmail().sendKeys("");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[2]/div[2]/div/div[1]/span")).click();
		home.getNewsLetterJOINBtn().click();
		SoftAssert softassert = new SoftAssert();
		String actualRersult = home.getNewsLetterValidationmessage().getText();
		String expectedResult = "This is a required field.";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "error is not Matching");
		softassert.assertAll();
		
		
		}
		
		@Test(description = "checking_already_subscribed_Message_Newsletter_homepage_KSA ", priority = 48)
		public void checking_already_subscribed_Message_Newsletter_homepage_KSA() throws Exception {
	   HomePage home = new HomePage();
	   // goToPage(home);
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		home.getNewsLetterEmail().clear();
		home.getNewsLetterEmail().sendKeys("k.shareef@sporter.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[2]/div[2]/div/div[1]/span")).click();
		home.getNewsLetterJOINBtn().click();
		home.getAlreaySubscSubmitBtn().click();
	
		
		
		}
		
		@Test(description = "checking_the_first_banner_of_horizontal3bannershomepage_KSA ", priority = 49)
		public void checking_the_first_banner_of_horizontal3bannershomepage_KSA() throws Exception {
	   HomePage home = new HomePage();
	    goToPage(home);
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       Thread.sleep(3000); 
	   home.getFirstImageBanner3Images().click();
	   emptyand404error();
	   Thread.sleep(3000);
		//home.getLogoSporter().click();
		
		}
		
		
		@Test(description = "checking_the_Second_banner_of_horizontal3bannershomepage_KSA ", priority = 50)
		public void checking_the_Second_banner_of_horizontal3bannershomepage_KSA() throws Exception {
	   HomePage home = new HomePage();
	    goToPage(home);
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       Thread.sleep(3000); 
	   home.getSecondImageBanner3Images().click();
	   emptyand404error();
	   Thread.sleep(3000);
		//home.getLogoSporter().click();
		
		}
			
		@Test(description = "checking_the_3rd_banner_of_horizontal3bannershomepage_KSA ", priority = 51)
		public void checking_the_3rd_banner_of_horizontal3bannershomepage_KSA() throws Exception {
	   HomePage home = new HomePage();
	   goToPage(home);
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       Thread.sleep(3000); 
	   home.getLastImageBanner3Images().click();
	   emptyand404error();
	   Thread.sleep(3000);
		//home.getLogoSporter().click();
		
		}
		
		@Test(description = "checking_the_Horizontal_Top_banner_of_horizontal3bannershomepage_KSA ", priority = 52)
		public void checking_the_Horizontal_Top_banner_of_horizontal3bannershomepage_KSA() throws Exception {
	   HomePage home = new HomePage();
	    goToPage(home);
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       Thread.sleep(3000); 
	   home.getTopBannerHomepage().click();
	   emptyand404error();
	   Thread.sleep(3000);
		//home.getLogoSporter().click();
		
		}
		
		@Test(description = "checking_the_Gaming_Focus_category_in_trending_block_Homepage_KSA ", priority = 53)
		public void checking_the_Gaming_Focus_category_in_trending_block() throws Exception {
	   HomePage home = new HomePage();
	   goToPage(home);
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       Thread.sleep(3000); 
	   home.getTrendingONsporterGaming_Focus().click();
	   emptyand404error();
		
	   Thread.sleep(3000); 
		//home.getLogoSporter().click();
		
		}
		@Test(description = "checking_The_Packcategory_in_trending_block_Homepage_Kuwai", priority = 54)
		public void checking_The_Packcategory_in_trending_block() throws Exception {
	   HomePage home = new HomePage();
	   goToPage(home);
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       Thread.sleep(3000); 
	   home.getTrendingONsporter_The_Back().click();
	   emptyand404error();
	   Thread.sleep(3000);
		//home.getLogoSporter().click();
		
		}
		@Test(description = "checking_the_Natures_Way_in_trending_block_Homepage_KSA ", priority = 55)
		public void checking_the_Natures_Way_Category_in_trending_block() throws Exception {
	   HomePage home = new HomePage();
	   goToPage(home);
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       Thread.sleep(3000); 
	   home.getTrendingONsporter_Natures_Way().click();
	   emptyand404error();
	   Thread.sleep(3000);
		//home.getLogoSporter().click();
		
		}
		@Test(description = "checking_the_Owala_category_in_trending_block_homepage_KSA ", priority = 56)
		public void checking_the_Owala_category_in_trending_block_homepage_KSA() throws Exception {
	   HomePage home = new HomePage();
	   goToPage(home);
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       Thread.sleep(3000); 
	   home.getTrendingONsporter_Owala().click();
	   emptyand404error();
	   Thread.sleep(3000);
		//home.getLogoSporter().click();
		
		}
		
		@Test(description = "checking_the_Sexual_Health_category_in_trending_block_homepage_KSA ", priority = 57)
		public void checking_the_Sexual_Health_category_in_trending_block_homepage_KSA() throws Exception {
	   HomePage home = new HomePage();
	   goToPage(home);
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       Thread.sleep(2000); 
	   home.getTrendingONsporter_Sexual_Health().click();
	   emptyand404error();
	   Thread.sleep(3000);
		//home.getLogoSporter().click();
		
		}
		
	
		public void emptyand404error() throws InterruptedException, IOException, Exception {
			 Thread.sleep(3000);
			boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
				System.out.println(verifyTitle);
				System.out.println(driver.getTitle());
				//assertFalse(verifyTitle, "Page Not Found Is Displayed");
			if(verifyTitle == false)
			
			{
				System.out.println(driver.getCurrentUrl()+" 404 Error Not  found "); 
			}
			else 
				
			{
				System.out.println(driver.getCurrentUrl()+"***********************************Error 404 found******************************** ");
				Thread.sleep(2000);
				File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshotfirst.png"));
				throw new Exception("Error 404 found");
			}
			
				boolean EmptyPage = driver.getPageSource().contains("find products matching the selection");
			//ssertFalse(EmptyPage, "The page is empty");
				if(EmptyPage == false)
					
				{
					System.out.println(driver.getCurrentUrl()+"Is Working properly and the items are availabe"); 
				}
				else 
					
				{
					System.out.println(driver.getCurrentUrl()+"***********************************Empty Page*********************** "); 
					Thread.sleep(2000);
					File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshotfirstbanner.png"));
					throw new Exception("empty page ");
				}
		}
		@Test(description = "checking_already_subscribed_Message_Newsletter_homepage_KSA ", priority = 58)
		public void checking_alrddeady_subscribed_Message_Newsletter_homepage_KSA() throws Exception {
	   HomePage home = new HomePage();
	    goToPage(home);
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		List<WebElement> kkk =  driver.findElements(By.className("OptionsContainerIcon_topSeller"));
		System.out.println(kkk.size());
	
		
		
		}
	@BeforeClass
	public void beforeTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 HomePage home = new HomePage();
		goToPage(home);
		 //driver.get("http://new.sporter.com");
		 switchToksaStore(home);
		   
}

	public void switchToksaStore(HomePage home) {
	
		//*home.getSwitchLangLink().click();
			//*home.getswitchTOksaStore().click();
	}
	
}