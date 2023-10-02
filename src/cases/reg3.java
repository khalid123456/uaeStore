package cases;
import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;
import pages.RegistraionPage;
public class reg3 extends BaseTest {

	

	
	@Test(description = "checking the registration-New account", priority = 1)
	public void checking_the_registration_New_account_KSA_Store8() throws Exception {
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

		registrationPage.getEmailFieldReg().sendKeys("fahed+" + randomInt + "77@gmail.com");
		registrationPage.getPasslFieldReg().sendKeys("Fahed@1234");
		registrationPage.getConfirmPasslFieldReg().sendKeys("Fahed@1234");
		registrationPage.getRegSubmitBtn().click();
		registrationPage.getFirstNameReg().sendKeys("fahed");
		registrationPage.getLasttNameReg().sendKeys("fahed");
		registrationPage.getSubSecondReg().click();
		homePage.getMyAccountIcon().click();
		Assert.assertTrue(registrationPage.getMyaccountLink().isDisplayed());

	}
	

	
}
