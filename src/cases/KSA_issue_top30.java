package cases;

import org.testng.annotations.Test;

import pages.CategoryPage;
import pages.HomePage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class KSA_issue_top30 extends BaseTest {

	@Test(description = "checking OGSW item is OOS ", priority = 1)
	public void OGSW_IS_instock_And_enabled_KSA_Store() throws Exception {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		driver.get("https://www.sporter.com/en-sa/optimum-gold-standard-100-whey-6202/");

		Thread.sleep(2000);
//		Boolean redirction = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[1]/button]")).isDisplayed();
//		//System.out.println(redirction);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[1]/button")).click();
		String item = driver.findElement(By.id("productTitle")).getText();
		Boolean addtocart = driver.findElement(By.xpath("//*[@id=\"addToCartBtn\"]")).isDisplayed();

		System.out.println(addtocart);
		if (addtocart == true)

		{

			System.out.println("this item is instock and enabled in KSA store --- " + item);
		} else {
			System.out.println("this item is OOS or disabled in KSA store --- " + item);
		}
		
	}

	public void switchToKSAStore() {
		HomePage homePage = new HomePage();
		CategoryPage cat = new CategoryPage();
		homePage.getSwitchLangLink().click();
		homePage.getswitchTOksaStore().click();
	}

	@Test(description = "checking ISO 100 item is OOS ", priority = 2)
	public void ISO100Item_IS_instock_And_enabled_KSA_Store() throws Exception {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.sporter.com/en-sa/dymatize-iso-100-6350/");
		Thread.sleep(2000);
//		Boolean redirction = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[1]/button]")).isDisplayed();
//		if(redirction== true)
//		{
//		System.out.println(redirction);
//		//
//		}
//		else 
//		{
//			
//		}
		String item = driver.findElement(By.id("productTitle")).getText();
		Boolean addtocart = driver.findElement(By.xpath("//*[@id=\"addToCartBtn\"]")).isDisplayed();

		System.out.println(addtocart);
		if (addtocart == true)

		{

			System.out.println("this item is instock and enabled in KSA store --- " + item);
		} else {
			System.out.println("this item is OOS or disabled in KSA store --- " + item);
		}
		
	}

	@Test(description = "checking optimum-superior-amino item is OOS ", priority = 3)
	public void optimum_superior_amino_IS_instock_And_enabled_KSA_StoreR() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		driver.get("https://www.sporter.com/en-sa/sport-supplements//optimum-superior-amino-2222-6234/");
		Thread.sleep(2000);
		//
		String item = driver.findElement(By.id("productTitle")).getText();
		Boolean addtocart = driver.findElement(By.xpath("//*[@id=\"addToCartBtn\"]")).isDisplayed();

		System.out.println(addtocart);
		if (addtocart == true)

		{

			System.out.println("this item is instock and enabled  --- " + item);
		} else {
			System.out.println("this item is OOS or disabled --- " + item);
		}

	}

	@Test(description = "checking MuscleTech Nitro Tech item is OOS ", priority = 4)
	public void nitrotech_IS_instock_And_enabled_KSA_Store() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		driver.get("https://www.sporter.com/en-sa/muscletech-nitro-tech-performance-series-6876/");
		//
		
//	Thread.sleep(2000);

		String item = driver.findElement(By.id("productTitle")).getText();
		Boolean addtocart = driver.findElement(By.xpath("//*[@id=\"addToCartBtn\"]")).isDisplayed();
		Thread.sleep(3000);
		System.out.println(addtocart);
		System.out.println(item);
		if (addtocart == true)

		{

			System.out.println("this item is instock and enabled  --- " + item);
		} else {
			System.out.println("this item is OOS or disabled --- " + item);
		}

	}

	@Test(description = "checking The Pack - BCAAS Flow item is OOS ", priority = 5)
	public void ThePackBCAASFlow_IS_instock_And_enabled_KSA_Store() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		driver.get("https://www.sporter.com/en-sa/the-pack-bcaas-flow-32569/");
		Thread.sleep(2000);
		//
		String item = driver.findElement(By.id("productTitle")).getText();
		Boolean addtocart = driver.findElement(By.xpath("//*[@id=\"addToCartBtn\"]")).isDisplayed();

		System.out.println(addtocart);
		if (addtocart == true)

		{

			System.out.println("this item is instock and enabled  --- " + item);
		} else {
			System.out.println("this item is OOS or disabled --- " + item);
		}

	}

	@Test(description = "checking Optimum Nutrition Serious Mass Weight Gainer_IS_instock_And_enabled_KSA_Store ", priority = 6)
	public void Optimum_Nutrition_Serious_Mass_Weight_GainerIS_instock_And_enabled_KSA_Store() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		driver.get("https://www.sporter.com/en-sa/sport-supplements//optimum-serious-mass");
		Thread.sleep(2000);
		//
		String item = driver.findElement(By.id("productTitle")).getText();
		Boolean addtocart = driver.findElement(By.xpath("//*[@id=\"addToCartBtn\"]")).isDisplayed();

		System.out.println(addtocart);
		if (addtocart == true)

		{

			System.out.println("this item is instock and enabled  --- " + item);
		} else {
			System.out.println("this item is OOS or disabled --- " + item);
		}

	}

	@Test(description = "checking The_Pack_Wild_Pre_Workout_IS_instock_And_enabled_KSA_Store ", priority = 7)
	public void The_Pack_Wild_Pre_Workout_IS_instock_And_enabled_KSA_Store() throws Exception {

		driver.get("https://www.sporter.com/en-sa/the-pack-wild-pre-workout-32565/");
		Thread.sleep(2000);
		//
		String item = driver.findElement(By.id("productTitle")).getText();
		Boolean addtocart = driver.findElement(By.xpath("//*[@id=\"addToCartBtn\"]")).isDisplayed();

		System.out.println(addtocart);
		if (addtocart == true)

		{

			System.out.println("this item is instock and enabled  --- " + item);
		} else {
			System.out.println("this item is OOS or disabled --- " + item);
		}

	}

	@Test(description = "checking soulution-high-protein-blend-pancake-mix_IS_instock_And_enabled_KSA_Store ", priority = 8)
	public void soulution_high_protein_blend_pancake_mixIS_instock_And_enabled_KSA_Store() throws Exception {

		driver.get("https://www.sporter.com/en-sa/soulution-high-protein-blend-pancake-mix-32474/");
		Thread.sleep(2000);
		//
		String item = driver.findElement(By.id("productTitle")).getText();
		Boolean addtocart = driver.findElement(By.xpath("//*[@id=\"addToCartBtn\"]")).isDisplayed();

		System.out.println(addtocart);
		if (addtocart == true)

		{

			System.out.println("this item is instock and enabled  --- " + item);
		} else {
			System.out.println("this item is OOS or disabled --- " + item);
		}

	}

	@Test(description = "checking EFX Karbolyn Fuel_IS_instock_And_enabled_KSA_Store ", priority = 9)
	public void EFX_Karbolyn_Fuel_instock_And_enabled_KSA_Store() throws Exception {

		driver.get("https://www.sporter.com/en-sa/efx-karbolyn-fuel-25818/");
		Thread.sleep(2000);
		//
		String item = driver.findElement(By.id("productTitle")).getText();
		Boolean addtocart = driver.findElement(By.xpath("//*[@id=\"addToCartBtn\"]")).isDisplayed();

		System.out.println(addtocart);
		if (addtocart == true)

		{

			System.out.println("this item is instock and enabled  --- " + item);
		} else {
			System.out.println("this item is OOS or disabled --- " + item);
		}

	}

	@Test(description = "checking Xtend Original 7g Bcaa_IS_instock_And_enabled_KSA_Store ", priority = 10)
	public void Xtend_Original_7g_Bcaa_instock_And_enabled_KSA_Store() throws Exception {

		driver.get("https://www.sporter.com/en-sa/sport-supplements//scivation-xtend-original-7g-bcaa-26533/");
		Thread.sleep(2000);
		//
		String item = driver.findElement(By.id("productTitle")).getText();
		Boolean addtocart = driver.findElement(By.xpath("//*[@id=\"addToCartBtn\"]")).isDisplayed();

		System.out.println(addtocart);
		if (addtocart == true)

		{

			System.out.println("this item is instock and enabled  --- " + item);
		} else {
			System.out.println("this item is OOS or disabled --- " + item);
		}

	}

	@Test(description = "checking Quest Nutrition - Bars - Box of 12_IS_instock_And_enabled_KSA_Store ", priority = 11)
	public void Quest_Nutrition_Bars_Box_of_12_instock_And_enabled_KSA_Store() throws Exception {

		driver.get("https://www.sporter.com/en-sa/quest-nutrition-bars-pack-of-12-00715");
		Thread.sleep(2000);
		//
		String item = driver.findElement(By.id("productTitle")).getText();
		Boolean addtocart = driver.findElement(By.xpath("//*[@id=\"addToCartBtn\"]")).isDisplayed();

		System.out.println(addtocart);
		if (addtocart == true)

		{

			System.out.println("this item is instock and enabled  --- " + item);
		} else {
			System.out.println("this item is OOS or disabled --- " + item);
		}

	}

	@Test(description = "checking  Grenade Carb- Killa Protein Bar - Box Of 12_IS_instock_And_enabled_KSA_Store ", priority = 12)
	public void Grenade_Carb_Killa_Protein_BarBoxOf12_instock_And_enabled_KSA_Store() throws Exception {

		driver.get("https://www.sporter.com/en-sa/healthy-food//grenade-carb-killa-protein-bar-box-of-12");
		Thread.sleep(2000);
		//
		String item = driver.findElement(By.id("productTitle")).getText();
		Boolean addtocart = driver.findElement(By.xpath("//*[@id=\"addToCartBtn\"]")).isDisplayed();

		System.out.println(addtocart);
		if (addtocart == true)

		{

			System.out.println("this item is instock and enabled  --- " + item);
		} else {
			System.out.println("this item is OOS or disabled --- " + item);
		}

	}

	@Test(description = "checking grenade-carb-killa-protein-spread_IS_instock_And_enabled_KSA_Store ", priority = 13)
	public void grenade_carb_killa_protein_spread_instock_And_enabled_KSA_Store() throws Exception {

		driver.get("https://www.sporter.com/en-sa/grenade-carb-killa-protein-spread/");
		Thread.sleep(2000);
		//
		String item = driver.findElement(By.id("productTitle")).getText();
		Boolean addtocart = driver.findElement(By.xpath("//*[@id=\"addToCartBtn\"]")).isDisplayed();

		System.out.println(addtocart);
		if (addtocart == true)

		{

			System.out.println("this item is instock and enabled  --- " + item);
		} else {
			System.out.println("this item is OOS or disabled --- " + item);
		}

	}

	@Test(description = "checking now-zma_IS_instock_And_enabled_KSA_Store ", priority = 14)
	public void now_zma_instock_And_enabled_KSA_Store() throws Exception {

		driver.get("https://www.sporter.com/en-sa/now-zma");
		Thread.sleep(2000);
		//
		String item = driver.findElement(By.id("productTitle")).getText();
		Boolean addtocart = driver.findElement(By.xpath("//*[@id=\"addToCartBtn\"]")).isDisplayed();

		System.out.println(addtocart);
		if (addtocart == true)

		{

			System.out.println("this item is instock and enabled  --- " + item);
		} else {
			System.out.println("this item is OOS or disabled --- " + item);
		}

	}

	@Test(description = "checking Grenade Carb Killa Protein Shake - Box Of 8_IS_instock_And_enabled_KSA_Store ", priority = 15)
	public void Grenade_Carb_Killa_Protein_Shake_Box_Of_8_instock_And_enabled_KSA_Store() throws Exception {

		driver.get("https://www.sporter.com/en-sa/grenade-carb-killa-protein-shake-box-of-8");
		Thread.sleep(2000);
		//
		String item = driver.findElement(By.id("productTitle")).getText();
		Boolean addtocart = driver.findElement(By.xpath("//*[@id=\"addToCartBtn\"]")).isDisplayed();

		System.out.println(addtocart);
		if (addtocart == true)

		{

			System.out.println("this item is instock and enabled  --- " + item);
		} else {
			System.out.println("this item is OOS or disabled --- " + item);
		}

	}

	@Test(description = "checking Neocell - Super Collagen + Vitamin C_IS_instock_And_enabled_KSA_Store ", priority = 16)
	public void Neocell_Super_Collagen_Vitamin_C_instock_And_enabled_KSA_Store() throws Exception {

		driver.get("https://www.sporter.com/en-sa/neocell-super-collagen-c-with-biotin-54263/");
		Thread.sleep(2000);
		//
		String item = driver.findElement(By.id("productTitle")).getText();
		Boolean addtocart = driver.findElement(By.xpath("//*[@id=\"addToCartBtn\"]")).isDisplayed();

		System.out.println(addtocart);
		if (addtocart == true)

		{

			System.out.println("this item is instock and enabled  --- " + item);
		} else {
			System.out.println("this item is OOS or disabled --- " + item);
		}

	}

	@Test(description = "checking Sugar Bear Hair - Hair Vitamins IS_instock_And_enabled_KSA_Store ", priority = 17)
	public void Sugar_Bear_Hair_Hair_Vitamins_instock_And_enabled_KSA_Store() throws Exception {

		driver.get("https://www.sporter.com/en-sa/sugar-bear-hair-hair-vitamins-37928/");
		Thread.sleep(2000);
		//
		String item = driver.findElement(By.id("productTitle")).getText();
		Boolean addtocart = driver.findElement(By.xpath("//*[@id=\"addToCartBtn\"]")).isDisplayed();

		System.out.println(addtocart);
		if (addtocart == true)

		{

			System.out.println("this item is instock and enabled  --- " + item);
		} else {
			System.out.println("this item is OOS or disabled --- " + item);
		}

	}

	@Test(description = "checking Centrum Men Multivitamin IS_instock_And_enabled_KSA_Store ", priority = 18)
	public void Centrum_Men_Multivitamin_instock_And_enabled_KSA_Store() throws Exception {

		driver.get("https://www.sporter.com/en-sa/centrum-men-multivitamin-35445/");
		Thread.sleep(2000);
		//
		String item = driver.findElement(By.id("productTitle")).getText();
		Boolean addtocart = driver.findElement(By.xpath("//*[@id=\"addToCartBtn\"]")).isDisplayed();

		System.out.println(addtocart);
		if (addtocart == true)

		{

			System.out.println("this item is instock and enabled  --- " + item);
		} else {
			System.out.println("this item is OOS or disabled --- " + item);
		}

	}

	@Test(description = "checking Gumnum - Hair, Skin & Nails IS_instock_And_enabled_KSA_Store ", priority = 19)
	public void Gumnum_Hair_Skin_Nails_instock_And_enabled_KSA_Store() throws Exception {

		driver.get("https://www.sporter.com/en-sa/gumnum-hair-skin-nails-45406/");
		Thread.sleep(2000);
		//
		String item = driver.findElement(By.id("productTitle")).getText();
		Boolean addtocart = driver.findElement(By.xpath("//*[@id=\"addToCartBtn\"]")).isDisplayed();

		System.out.println(addtocart);
		if (addtocart == true)

		{

			System.out.println("this item is instock and enabled  --- " + item);
		} else {
			System.out.println("this item is OOS or disabled --- " + item);
		}

	}

	@Test(description = "checking Webber Naturals - Joint Ease IS_instock_And_enabled_KSA_Store ", priority = 20)
	public void Webber_Naturals_Joint_Ease_instock_And_enabled_KSA_Store() throws Exception {

		driver.get("https://www.sporter.com/en-sa/webber-naturals-joint-ease-glucosamine-chondroitin-21037/");
		Thread.sleep(2000);
		//
		String item = driver.findElement(By.id("productTitle")).getText();
		Boolean addtocart = driver.findElement(By.xpath("//*[@id=\"addToCartBtn\"]")).isDisplayed();

		System.out.println(addtocart);
		if (addtocart == true)

		{

			System.out.println("this item is instock and enabled  --- " + item);
		} else {
			System.out.println("this item is OOS or disabled --- " + item);
		}

	}

	@Test(description = "checking Centrum Advance Multivitamin IS_instock_And_enabled_KSA_Store ", priority = 21)
	public void Centrum_Advance_Multivitamin_instock_And_enabled_KSA_Store() throws Exception {

		driver.get("https://www.sporter.com/en-sa/centrum-advance-multivitamin-35440/");
		Thread.sleep(2000);
		//
		String item = driver.findElement(By.id("productTitle")).getText();
		Boolean addtocart = driver.findElement(By.xpath("//*[@id=\"addToCartBtn\"]")).isDisplayed();

		System.out.println(addtocart);
		if (addtocart == true)

		{

			System.out.println("this item is instock and enabled  --- " + item);
		} else {
			System.out.println("this item is OOS or disabled --- " + item);
		}

	}

	@Test(description = "checking Goli Nutrition - Multivitamin Bites For Daily HealthIS_instock_And_enabled_KSA_Store ", priority = 22)
	public void Goli_Nutrition_Multivitamin_Bites_For_Daily_Health_instock_And_enabled_KSA_Store() throws Exception {

		driver.get("https://www.sporter.com/en-sa/goli-nutrition-multivitamin-bites-for-daily-health-52124/");
		Thread.sleep(2000);
		//
		String item = driver.findElement(By.id("productTitle")).getText();
		Boolean addtocart = driver.findElement(By.xpath("//*[@id=\"addToCartBtn\"]")).isDisplayed();

		System.out.println(addtocart);
		if (addtocart == true)

		{

			System.out.println("this item is instock and enabled  --- " + item);
		} else {
			System.out.println("this item is OOS or disabled --- " + item);
		}

	}

	@Test(description = "checking Natrol_Omega_3_Fish_Oil_1000mg instock_And_enabled_KSA_Store ", priority = 23)
	public void Natrol_Omega_3_Fish_Oil_1000mg_instock_And_enabled_KSA_Store() throws Exception {

		driver.get("https://www.sporter.com/en-sa/natrol-omega-3-fish-oil-1000mg-22835/");
		Thread.sleep(2000);
		//
		String item = driver.findElement(By.id("productTitle")).getText();
		Boolean addtocart = driver.findElement(By.xpath("//*[@id=\"addToCartBtn\"]")).isDisplayed();

		System.out.println(addtocart);
		if (addtocart == true)

		{

			System.out.println("this item is instock and enabled  --- " + item);
		} else {
			System.out.println("this item is OOS or disabled --- " + item);
		}

	}

	@Test(description = "checking Now Horny Goat Weed Extract 750 Mg instock_And_enabled_KSA_Store ", priority = 24)
	public void Now_Horny_Goat_Weed_Extract_750_Mg_instock_And_enabled_KSA_Store() throws Exception {

		driver.get("https://www.sporter.com/en-sa/now-horny-goat-weed-extract-750-mg-23840/");
		Thread.sleep(2000);
		//
		String item = driver.findElement(By.id("productTitle")).getText();
		Boolean addtocart = driver.findElement(By.xpath("//*[@id=\"addToCartBtn\"]")).isDisplayed();

		System.out.println(addtocart);
		if (addtocart == true)

		{

			System.out.println("this item is instock and enabled  --- " + item);
		} else {
			System.out.println("this item is OOS or disabled --- " + item);
		}

	}

	@Test(description = "checking Windmill - Omega-3 1000mg With Epa & Dha instock_And_enabled_KSA_Store ", priority = 25)
	public void Windmill_Omega_3_1000mg_With_Epa_Dha_instock_And_enabled_KSA_Store() throws Exception {

		driver.get("https://www.sporter.com/en-sa/windmill-natural-vitamins-omega-3-1000mg-with-epa-dha-22069/");
		Thread.sleep(2000);
		//
		String item = driver.findElement(By.id("productTitle")).getText();
		Boolean addtocart = driver.findElement(By.xpath("//*[@id=\"addToCartBtn\"]")).isDisplayed();

		System.out.println(addtocart);
		if (addtocart == true)

		{

			System.out.println("this item is instock and enabled  --- " + item);
		} else {
			System.out.println("this item is OOS or disabled --- " + item);
		}

	}

	@Test(description = "checking Swedish Posture Flexi - Black instock_And_enabled_KSA_Store ", priority = 26)
	public void Swedish_Posture_Flexi_Black_instock_And_enabled_KSA_Store() throws Exception {

		driver.get("https://www.sporter.com/en-sa/swedish-posture-flexi-17294/");
		Thread.sleep(2000);
		//
		String item = driver.findElement(By.id("productTitle")).getText();
		Boolean addtocart = driver.findElement(By.xpath("//*[@id=\"addToCartBtn\"]")).isDisplayed();

		System.out.println(addtocart);
		if (addtocart == true)

		{

			System.out.println("this item is instock and enabled  --- " + item);
		} else {
			System.out.println("this item is OOS or disabled --- " + item);
		}

	}

	@Test(description = "checking Sporter Ladies Weightlifting Gloves instock_And_enabled_KSA_Store ", priority = 27)
	public void Sporter_Ladies_Weightlifting_Gloves_instock_And_enabled_KSA_Store() throws Exception {

		driver.get("https://www.sporter.com/en-sa/sporter-ladies-weightlifting-gloves-23077/");
		Thread.sleep(2000);
		//
		String item = driver.findElement(By.id("productTitle")).getText();
		Boolean addtocart = driver.findElement(By.xpath("//*[@id=\"addToCartBtn\"]")).isDisplayed();

		System.out.println(addtocart);
		if (addtocart == true)

		{

			System.out.println("this item is instock and enabled  --- " + item);
		} else {
			System.out.println("this item is OOS or disabled --- " + item);
		}

	}

	@Test(description = "checking Sporter Ladies Weightlifting Gloves instock_And_enabled_KSA_Store ", priority = 28)
	public void Sporter_Weightlifting_Gel_Performer_Gloves_instock_And_enabled_KSA_Store() throws Exception {

		driver.get("https://www.sporter.com/en-sa/sporter-weightlifting-gel-performer-gloves-23074/");
		Thread.sleep(2000);
		//
		String item = driver.findElement(By.id("productTitle")).getText();
		Boolean addtocart = driver.findElement(By.xpath("//*[@id=\"addToCartBtn\"]")).isDisplayed();

		System.out.println(addtocart);
		if (addtocart == true)

		{

			System.out.println("this item is instock and enabled  --- " + item);
		} else {
			System.out.println("this item is OOS or disabled --- " + item);
		}

	}

	@Test(description = "checking Under Armour - Project Rock instock_And_enabled_KSA_Store ", priority = 29)
	public void Under_Armour_Project_Rock_instock_And_enabled_KSA_Store() throws Exception {

		driver.get("https://www.sporter.com/en-sa/under-armour-project-rock-19675/");
		Thread.sleep(2000);
		//
		String item = driver.findElement(By.id("productTitle")).getText();
		Boolean addtocart = driver.findElement(By.xpath("//*[@id=\"addToCartBtn\"]")).isDisplayed();

		System.out.println(addtocart);
		if (addtocart == true)

		{

			System.out.println("this item is instock and enabled  --- " + item);
		} else {
			System.out.println("this item is OOS or disabled --- " + item);
		}

	}

	@Test(description = "checking Blenderbottle Radian Insulated Stainless Steel instock_And_enabled_KSA_Store ", priority = 30)
	public void Blenderbottle_Radian_Insulated_Stainless_Steel_instock_And_enabled_KSA_Store() throws Exception {

		driver.get("https://www.sporter.com/en-sa/blenderbottle-radian-insulated-stainless-steel");
		Thread.sleep(2000);
		//
		String item = driver.findElement(By.id("productTitle")).getText();
		Boolean addtocart = driver.findElement(By.xpath("//*[@id=\"addToCartBtn\"]")).isDisplayed();

		System.out.println(addtocart);
		if (addtocart == true)

		{

			System.out.println("this item is instock and enabled  --- " + item);
		} else {
			System.out.println("this item is OOS or disabled --- " + item);
		}

	}

	@Test(description = "checking 2xu - Mcs Run Compression Tights instock_And_enabled_KSA_Store ", priority = 31)
	public void xu_Mcs_Run_Compression_Tights_instock_And_enabled_KSA_Store() throws Exception {

		driver.get("https://www.sporter.com/en-sa/blenderbottle-radian-insulated-stainless-steel");
		Thread.sleep(2000);
		//
		String item = driver.findElement(By.id("productTitle")).getText();
		Boolean addtocart = driver.findElement(By.xpath("//*[@id=\"addToCartBtn\"]")).isDisplayed();

		System.out.println(addtocart);
		if (addtocart == true)

		{

			System.out.println("this item is instock and enabled  --- " + item);
		} else {
			System.out.println("this item is OOS or disabled --- " + item);
		}

	}
	
	 

	  @AfterTest
	  public void afterMethod() {
		  //driver.close();
		  driver.quit();
	  }

}
