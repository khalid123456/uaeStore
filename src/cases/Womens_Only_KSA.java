package cases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.github.dockerjava.api.model.Driver;

import pages.VitaminsPage;
import pages.womensonlypage;

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

public class Womens_Only_KSA extends BaseTest {

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 1)
	public void checking_the_main_slider_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		womensonlypage women = new womensonlypage();
		driver.findElement(By.cssSelector(".flex-control-nav > li:nth-child(2) > a")).click();
		Thread.sleep(3000);
		Assert.assertTrue(women.getFirstBannerWomenSlider().isDisplayed());

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 2)
	public void checking_the_First_side_banner_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		womensonlypage women = new womensonlypage();
		Assert.assertTrue(women.getFirstSideBannerWomenPage().isDisplayed());

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 3)
	public void checking_the_Second_side_banner_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		womensonlypage women = new womensonlypage();
		Assert.assertTrue(women.getSecondSideBannerWomenPage().isDisplayed());

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 4)
	public void checking_the_shop_by_category_title_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		womensonlypage women = new womensonlypage();
		Assert.assertTrue(women.getShopByCategorTitle().isDisplayed());

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 5)
	public void checking_the_Fish_Oil_Omegas_shop_by_category_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		womensonlypage women = new womensonlypage();
		Assert.assertTrue(women.getSupplementsForHer().isDisplayed());

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 6)
	public void checking_the_Multivitamins_shop_by_category_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		womensonlypage women = new womensonlypage();
		Assert.assertTrue(women.getWomenDailyVitamins().isDisplayed());

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 7)
	public void checking_the_VitaminsA_Z_shop_by_category_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		womensonlypage women = new womensonlypage();
		Assert.assertTrue(women.getSnacksFood().isDisplayed());

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 8)
	public void checking_the_Minerals_shop_by_category_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		womensonlypage women = new womensonlypage();
		Assert.assertTrue(women.getActiveLifestyle().isDisplayed());

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 9)
	public void checking_the_Antioxidants_shop_by_category_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		womensonlypage women = new womensonlypage();
		Assert.assertTrue(women.getSnacksFood().isDisplayed());

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 10)
	public void checking_the_Superfoods_shop_by_category_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		womensonlypage women = new womensonlypage();
		Assert.assertTrue(women.getShopByGoalTitle().isDisplayed());

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 11)
	public void checking_the_Collagen_shop_by_category_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		womensonlypage women = new womensonlypage();
		Assert.assertTrue(women.getSkinandNails().isDisplayed());

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 12)
	public void checking_the_Melatonin_shop_by_category_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		womensonlypage women = new womensonlypage();
		Assert.assertTrue(women.getWeightLoss().isDisplayed());

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 13)
	public void checking_the_Herbal_title_Trending_sporter_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		womensonlypage women = new womensonlypage();
		Assert.assertTrue(women.getMoodSupport().isDisplayed());

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 14)
	public void checking_the_Dandelion_Trending_sporter_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		womensonlypage women = new womensonlypage();
		Assert.assertTrue(women.getDetoxCleanse().isDisplayed());

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 15)
	public void checking_the_Tumeric_Trending_sporter_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		womensonlypage women = new womensonlypage();
		Assert.assertTrue(women.getPMSRelief().isDisplayed());

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 16)
	public void checking_the_Ginseng_Trending_sporter_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		womensonlypage women = new womensonlypage();
		Assert.assertTrue(women.getEnergyEndurance().isDisplayed());

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 17)
	public void checking_the_Milk_Thistle_Trending_sporter_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		womensonlypage women = new womensonlypage();
		Assert.assertTrue(women.getPrenatalCare().isDisplayed());

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 18)
	public void checking_the_Alfalfa_Trending_sporter_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		womensonlypage women = new womensonlypage();
		Assert.assertTrue(women.getMuscleWeightGain().isDisplayed());

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 18)
	public void checking_athe_Alfalfa_Trending_sporter_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		womensonlypage women = new womensonlypage();
		Assert.assertTrue(women.getFashionStyle().isDisplayed());

	}
	
	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 18)
	public void checking_the_aAlfalfa_Trending_sporter_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		womensonlypage women = new womensonlypage();
		Assert.assertTrue(women.getPersonalCare().isDisplayed());

	}
	
	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 18)
	public void checking_the_dAlfalfa_Trending_sporter_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		womensonlypage women = new womensonlypage();
		Assert.assertTrue(women.getSupplementsForHerTitle().isDisplayed());

	}
	
	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 18)
	public void checking_the_dgAlfalfa_Trending_sporter_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		womensonlypage women = new womensonlypage();
		
		Assert.assertTrue(driver.getPageSource().contains("Women's Vitamins"));

	}
	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 18)
	public void checking_the_dAlfalssfa_Trending_sporter_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		womensonlypage women = new womensonlypage();
		Assert.assertTrue(women.getWorkoutInStyle().isDisplayed());

	}

	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 18)
	public void checking_the_dAlfalssfaaa_Trending_sporter_in_vitamins_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		womensonlypage women = new womensonlypage();
		Assert.assertTrue(women.getFEMALEGALLERY().isDisplayed());

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
		womensonlypage women = new womensonlypage();
		 goToPage (women);
	}

	@AfterMethod
	public void afterMethod() {
	}

}
