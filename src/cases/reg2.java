package cases;
import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;
import pages.RegistraionPage;
public class reg2 extends BaseTest {


	@Test(description = "checking the registration-New account", priority = 2,enabled =false)
	public void checking_the_registration_New_account_KSA_Store2() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		HomePage homePage = new HomePage();
		goToPage(homePage);
		waitUntilClickable(homePage.getSwitchLangLink());
		//homePage.getSwitchLangLink().click();
		Thread.sleep(1000);
		//homePage.getswitchTOksaStore()).click();

		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		RegistraionPage registrationPage = new RegistraionPage();
		homePage.getMyAccountIcon().click();

		registrationPage.getRegBtn().click();

		registrationPage.getEmailFieldReg().sendKeys("soltan+" + randomInt + "moha78@gmail.com");
		registrationPage.getPasslFieldReg().sendKeys("Fahed@1234");
		registrationPage.getConfirmPasslFieldReg().sendKeys("Fahed@1234");
		registrationPage.getRegSubmitBtn().click();
		registrationPage.getFirstNameReg().sendKeys("soltan");
		registrationPage.getLasttNameReg().sendKeys("mohammad");
		registrationPage.getSubSecondReg().click();
	//	homePage.getMyAccountIcon().click();
	//	Assert.assertTrue(registrationPage.getMyaccountLink().isDisplayed());

	}
	
	@Test(description = "checking the registration-New account", priority = 1,invocationCount = 4)
	public void checking_the_registration_New_account_KSA_Store7() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		HomePage homePage = new HomePage();
		goToPage(homePage);
		waitUntilClickable(homePage.getSwitchLangLink());
		//homePage.getSwitchLangLink().click();
		Thread.sleep(1000);
		//homePage.getswitchTOksaStore()).click();

		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		RegistraionPage registrationPage = new RegistraionPage();
		homePage.getMyAccountIcon().click();

		registrationPage.getRegBtn().click();

		registrationPage.getEmailFieldReg().sendKeys("soltan+" + randomInt + "moha88@gmail.com");
		registrationPage.getPasslFieldReg().sendKeys("Fahed@1234");
		registrationPage.getConfirmPasslFieldReg().sendKeys("Fahed@1234");
		registrationPage.getRegSubmitBtn().click();
		registrationPage.getFirstNameReg().sendKeys("soltan");
		registrationPage.getLasttNameReg().sendKeys("mohammad");
		registrationPage.getSubSecondReg().click();
		//homePage.getMyAccountIcon().click();
		//Assert.assertTrue(registrationPage.getMyaccountLink().isDisplayed());

	}
	
	
	

	

}
