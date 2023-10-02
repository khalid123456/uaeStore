package cases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.github.dockerjava.api.model.Driver;

import com.sun.mail.handlers.text_html;

import pages.VitaminsPage;

import org.testng.annotations.BeforeMethod;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Random;

import javax.xml.xpath.XPath;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class Vitamins_Page_KSA extends BaseTest {

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 1)
	public void checking_the_main_slider_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		VitaminsPage vitamin = new VitaminsPage();
		driver.findElement(By.cssSelector(".flex-control-nav > li:nth-child(2) > a")).click();
		Thread.sleep(3000);
		Assert.assertTrue(vitamin.getFirstBannerVitaminsSlider().isDisplayed());

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 2)
	public void checking_the_First_side_banner_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		VitaminsPage vitamin = new VitaminsPage();
		Assert.assertTrue(vitamin.getFirstSideBannerVitaminsPage().isDisplayed());

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 3)
	public void checking_the_Second_side_banner_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		VitaminsPage vitamin = new VitaminsPage();
		Assert.assertTrue(vitamin.getSecondSideBannerVitaminsPage().isDisplayed());

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 4)
	public void checking_the_shop_by_category_title_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		VitaminsPage vitamin = new VitaminsPage();
		Assert.assertTrue(vitamin.getShopByCategorTitle().isDisplayed());

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 5)
	public void checking_the_Fish_Oil_Omegas_shop_by_category_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		VitaminsPage vitamin = new VitaminsPage();
		Assert.assertTrue(vitamin.getFishOilOmegas().isDisplayed());

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 6)
	public void checking_the_Multivitamins_shop_by_category_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		VitaminsPage vitamin = new VitaminsPage();
		Assert.assertTrue(vitamin.getMultivitamins().isDisplayed());

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 7)
	public void checking_the_VitaminsA_Z_shop_by_category_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		VitaminsPage vitamin = new VitaminsPage();
		Assert.assertTrue(vitamin.getVitaminsA_Z().isDisplayed());

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 8)
	public void checking_the_Minerals_shop_by_category_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		VitaminsPage vitamin = new VitaminsPage();
		Assert.assertTrue(vitamin.getMinerals().isDisplayed());

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 9)
	public void checking_the_Antioxidants_shop_by_category_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		VitaminsPage vitamin = new VitaminsPage();
		Assert.assertTrue(vitamin.getAntioxidants().isDisplayed());

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 10)
	public void checking_the_Superfoods_shop_by_category_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		VitaminsPage vitamin = new VitaminsPage();
		Assert.assertTrue(vitamin.getSuperfoods().isDisplayed());

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 11)
	public void checking_the_Collagen_shop_by_category_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		VitaminsPage vitamin = new VitaminsPage();
		Assert.assertTrue(vitamin.getCollagen().isDisplayed());

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 12)
	public void checking_the_Melatonin_shop_by_category_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		VitaminsPage vitamin = new VitaminsPage();
		Assert.assertTrue(vitamin.getMelatonin().isDisplayed());

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 13)
	public void checking_the_Herbal_title_Trending_sporter_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		VitaminsPage vitamin = new VitaminsPage();
		Assert.assertTrue(vitamin.getHerbaltitle().isDisplayed());

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 14)
	public void checking_the_Dandelion_Trending_sporter_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		VitaminsPage vitamin = new VitaminsPage();
		Assert.assertTrue(vitamin.getDandelion().isDisplayed());

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 15)
	public void checking_the_Tumeric_Trending_sporter_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		VitaminsPage vitamin = new VitaminsPage();
		Assert.assertTrue(vitamin.getTumeric().isDisplayed());

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 16)
	public void checking_the_Ginseng_Trending_sporter_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		VitaminsPage vitamin = new VitaminsPage();
		Assert.assertTrue(vitamin.getGinseng().isDisplayed());

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 17)
	public void checking_the_Milk_Thistle_Trending_sporter_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		VitaminsPage vitamin = new VitaminsPage();
		Assert.assertTrue(vitamin.getMilk_Thistle().isDisplayed());

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 18)
	public void checking_the_Alfalfa_Trending_sporter_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		VitaminsPage vitamin = new VitaminsPage();
		Assert.assertTrue(vitamin.getAlfalfa().isDisplayed());

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 19)
	public void checking_Shop_By_Health_Trending_sporter_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		VitaminsPage vitamin = new VitaminsPage();
		Assert.assertTrue(vitamin.getShopByHealth().isDisplayed());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='trending-swiper-button-next']//i[@class='fas fa-chevron-right']"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='trending-swiper-button-next']//i[@class='fas fa-chevron-right']"))
				.click();

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 20)
	public void checking_Heart_Health_Trending_sporter_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Assert.assertTrue(driver.getPageSource().contains("Heart Health"));

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 21)
	public void checking_Immunity_Support_Trending_sporter_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Assert.assertTrue(driver.getPageSource().contains("Immunity Support"));

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 22)
	public void checking_Kids_Health_Trending_sporter_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		VitaminsPage vitamin = new VitaminsPage();
		Assert.assertTrue(driver.getPageSource().contains("Kid's Health"));

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 23)
	public void checking_Men_Health_Trending_sporter_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		VitaminsPage vitamin = new VitaminsPage();
		Assert.assertTrue(driver.getPageSource().contains("Men's Health"));

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 24)
	public void checking_Sexual_Health_Trending_sporter_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		VitaminsPage vitamin = new VitaminsPage();
		Assert.assertTrue(driver.getPageSource().contains("Sexual Health"));

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 25)
	public void checking_Sleep_Support_Trending_sporter_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		VitaminsPage vitamin = new VitaminsPage();
		Assert.assertTrue(driver.getPageSource().contains("Sleep Support"));

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 26)
	public void checking_Diet_Weight_Management_Trending_sporter_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		VitaminsPage vitamin = new VitaminsPage();
		Assert.assertTrue(driver.getPageSource().contains("Diet Weight Management"));

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 27)
	public void checking_Womens_Health_Trending_sporter_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		VitaminsPage vitamin = new VitaminsPage();
		Assert.assertTrue(driver.getPageSource().contains("Women's Health"));

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 28)
	public void checking_Beauty_Trending_sporter_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		VitaminsPage vitamin = new VitaminsPage();
		Assert.assertTrue(driver.getPageSource().contains("Beauty"));

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 29)
	public void checking_Bone_and_Joint_Trending_sporter_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		VitaminsPage vitamin = new VitaminsPage();
		Assert.assertTrue(driver.getPageSource().contains("Bone"));

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 29)
	public void checking_Brain_Support_Trending_sporter_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		VitaminsPage vitamin = new VitaminsPage();
		Assert.assertTrue(driver.getPageSource().contains("Brain Support"));

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 29)
	public void checking_Liver_Support_Trending_sporter_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		VitaminsPage vitamin = new VitaminsPage();
		Assert.assertTrue(driver.getPageSource().contains("Liver Support"));

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 29)
	public void checking_Digestive_Support_Trending_sporter_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		VitaminsPage vitamin = new VitaminsPage();
		Assert.assertTrue(driver.getPageSource().contains("Digestive Support"));

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 29)
	public void checking_Energy_Formulas_Trending_sporter_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		VitaminsPage vitamin = new VitaminsPage();
		Assert.assertTrue(driver.getPageSource().contains("Energy Formulas"));

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 29)
	public void checking_Hair_Skin_Nail_Trending_sporter_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		VitaminsPage vitamin = new VitaminsPage();
		Assert.assertTrue(driver.getPageSource().contains("Hair Skin Nail"));

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 30)
	public void checking_Fish_Oil_Omegas_Block_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		VitaminsPage vitamin = new VitaminsPage();
		Assert.assertTrue(vitamin.getFishOilOmegasBlock().isDisplayed());

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 31)
	public void checking_Multivitamins_Block_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		VitaminsPage vitamin = new VitaminsPage();
		Assert.assertTrue(vitamin.getMultivitaminsBlock().isDisplayed());

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 32)
	public void checking_VitaminsA_Z_Omegas_Block_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		VitaminsPage vitamin = new VitaminsPage();
		Assert.assertTrue(vitamin.getVitaminsA_ZBlock().isDisplayed());

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 33)
	public void checking_Minerals_Block_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		VitaminsPage vitamin = new VitaminsPage();
		Assert.assertTrue(vitamin.getMineralsBlock().isDisplayed());

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 34)
	public void checking_Antioxidants_Block_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		VitaminsPage vitamin = new VitaminsPage();
		Assert.assertTrue(vitamin.getAntioxidantsBlock().isDisplayed());

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 35)
	public void checking_Super_foods_Block_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		VitaminsPage vitamin = new VitaminsPage();
		Assert.assertTrue(vitamin.getSuperfoodsBlock().isDisplayed());

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 36)
	public void checking_Melatonin_Block_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		VitaminsPage vitamin = new VitaminsPage();
		Assert.assertTrue(vitamin.getMelatoninBlock().isDisplayed());

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 37)
	public void checking_Collagen_Block_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		VitaminsPage vitamin = new VitaminsPage();
		Assert.assertTrue(vitamin.getCollagenBlock().isDisplayed());

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 38)
	public void checking_the_First_side_bananer_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		VitaminsPage vitamin = new VitaminsPage();
		goToPage(vitamin);
		vitamin.getFirstSideBannerVitaminsPage().click();
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		Thread.sleep(1000);
		checking404AndEmptyPage(randomInt);
		

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 39)
	public void achecking_the_Second_side_banner_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		VitaminsPage vitamin = new VitaminsPage();
		goToPage(vitamin);
		vitamin.getSecondSideBannerVitaminsPage().click();
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		Thread.sleep(1000);
		checking404AndEmptyPage(randomInt);
		

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 40)
	public void achecking_the_Fish_Oil_Omegas_shop_by_category_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		VitaminsPage vitamin = new VitaminsPage();
		goToPage(vitamin);
		vitamin.getFishOilOmegas().click();
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		Thread.sleep(1000);
		checking404AndEmptyPage(randomInt);
		

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 41)
	public void achecking_the_Multivitamins_shop_by_category_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		VitaminsPage vitamin = new VitaminsPage();
		goToPage(vitamin);
		vitamin.getMultivitamins().click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		Thread.sleep(1000);
		checking404AndEmptyPage(randomInt);
		
		

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 42)
	public void achecking_the_VitaminsA_Z_shop_by_category_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		VitaminsPage vitamin = new VitaminsPage();
		goToPage(vitamin);
		vitamin.getVitaminsA_Z().click();
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		Thread.sleep(1000);
		checking404AndEmptyPage(randomInt);
		

	}

	public void checking404AndEmptyPage(int randomInt) throws IOException, Exception {
		Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		if (verifyTitle == true) {
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("c:\\vitaminCategory\\404error[" + randomInt + "].png"));
		}
		assertFalse(verifyTitle);

		if (driver.getPageSource().contains("We can't find products matching"))

		{
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("c:\\vitaminCategory\\emptypage[" + randomInt + "].png"));
			System.out.println("All the items are missing");
			throw new Exception("We can't find products matching ");
		} else {
			System.out.println("The items are showing ");
		}
	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 43)
	public void achecking_the_Minerals_shop_by_category_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		VitaminsPage vitamin = new VitaminsPage();
		goToPage(vitamin);
		Assert.assertTrue(vitamin.getMinerals().isDisplayed());
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		Thread.sleep(1000);
		checking404AndEmptyPage(randomInt);
		goToPage(vitamin);

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 44)
	public void achecking_the_Antioxidants_shop_by_category_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		VitaminsPage vitamin = new VitaminsPage();
		goToPage(vitamin);
		vitamin.getAntioxidants().click();
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		Thread.sleep(1000);
		checking404AndEmptyPage(randomInt);
		

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 45)
	public void achecking_the_Superfoods_shop_by_category_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		VitaminsPage vitamin = new VitaminsPage();
		goToPage(vitamin);
		vitamin.getSuperfoods().click();
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		Thread.sleep(1000);
		checking404AndEmptyPage(randomInt);
		

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 46)
	public void achecking_the_Collagen_shop_by_category_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		VitaminsPage vitamin = new VitaminsPage();
		goToPage(vitamin);
		vitamin.getCollagen().click();
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		Thread.sleep(1000);
		checking404AndEmptyPage(randomInt);
		

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 47)
	public void achecking_the_Melatonin_shop_by_category_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		VitaminsPage vitamin = new VitaminsPage();
		goToPage(vitamin);
		vitamin.getMelatonin().click();
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		Thread.sleep(1000);
		checking404AndEmptyPage(randomInt);
		

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 48)
	public void achecking_the_Dandelion_Trending_sporter_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		VitaminsPage vitamin = new VitaminsPage();
		goToPage(vitamin);
		vitamin.getDandelion().click();
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		Thread.sleep(1000);
		checking404AndEmptyPage(randomInt);
	

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 49)
	public void achecking_the_Tumeric_Trending_sporter_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		VitaminsPage vitamin = new VitaminsPage();
		goToPage(vitamin);
		vitamin.getTumeric().click();
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		Thread.sleep(1000);
		checking404AndEmptyPage(randomInt);
		

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 50)
	public void achecking_the_Ginseng_Trending_sporter_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		VitaminsPage vitamin = new VitaminsPage();
		goToPage(vitamin);
		vitamin.getGinseng().click();
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		Thread.sleep(1000);
		checking404AndEmptyPage(randomInt);
		

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 51)
	public void achecking_the_Milk_Thistle_Trending_sporter_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		VitaminsPage vitamin = new VitaminsPage();
		goToPage(vitamin);

		vitamin.getMilk_Thistle().click();
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		Thread.sleep(1000);
		checking404AndEmptyPage(randomInt);
	

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 5218)
	
	public void achecking_the_Alfalfa_Trending_sporter_in_vitamins_page() throws Exception {
		VitaminsPage vitamin = new VitaminsPage();
		goToPage(vitamin);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		vitamin.getAlfalfa().click();
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		Thread.sleep(1000);
	 checking404AndEmptyPage(randomInt);
	 
	}

	@BeforeClass
	public void beforeMethod() {
		VitaminsPage vitamin = new VitaminsPage();
		goToPage(vitamin);
	}

	@AfterMethod
	public void afterMethod() {
	}

}
