package cases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import org.testng.asserts.SoftAssert;

import pages.HomePage;
import pages.RegistraionPage;

import org.testng.annotations.BeforeClass;

import java.security.PublicKey;
import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class KSA_Registration_Cases extends BaseTest {

	
	@Test(description = "Checking_Empty_Email_Error_Message ", priority = 1)
	public void Checking_Empty_Email_Error_Message() throws Exception {
		HomePage homePage = new HomePage();
		goToPage(homePage);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		RegistraionPage registrationPage = new RegistraionPage();
		homePage.getMyAccountIcon().click();

		registrationPage.getRegBtn().click();
		registrationPage.getEmailFieldReg().sendKeys("");
		registrationPage.getPasslFieldReg().sendKeys("Sporter@123");
		registrationPage.getConfirmPasslFieldReg().sendKeys("Sporter@123");
		registrationPage.getRegSubmitBtn().click();
		Assert.assertTrue(registrationPage.getEmailInputErrMsg().isDisplayed());
		// Thread.sleep(5000);
		SoftAssert softassert = new SoftAssert();
		String actualRersult = registrationPage.getEmailInputErrMsg().getText();
		String expectedResult = "This is a required field.";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "error is not Matching");
		softassert.assertAll();

	}

	@Test(description = "Checking_Empty_password_Error_Message ", priority = 1)
	public void Checking_Empty_Password_Error_Message() throws Exception {
		HomePage homePage = new HomePage();
		goToPage(homePage);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		RegistraionPage registrationPage = new RegistraionPage();
		homePage.getMyAccountIcon().click();

		registrationPage.getRegBtn().click();
		registrationPage.getEmailFieldReg().sendKeys("haneen.test+" + randomInt + "92@gmail.com");
		registrationPage.getPasslFieldReg().sendKeys("");
		registrationPage.getConfirmPasslFieldReg().sendKeys("Sporter@123");
		registrationPage.getRegSubmitBtn().click();
		Assert.assertTrue(registrationPage.getPasswordlInputErrMsg().isDisplayed());
		// Thread.sleep(5000);
		SoftAssert softassert = new SoftAssert();
		String actualRersult = registrationPage.getPasswordlInputErrMsg().getText();
		String expectedResult = "This is a required field.";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "error is not Matching");
		softassert.assertAll();

	}

	@Test(description = "Checking_Empty_Confirm_Password_Error_Message ", priority = 1)
	public void Checking_Empty_Confirm_password_Error_Message() throws Exception {
		HomePage homePage = new HomePage();
		goToPage(homePage);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		RegistraionPage registrationPage = new RegistraionPage();
		homePage.getMyAccountIcon().click();

		registrationPage.getRegBtn().click();
		registrationPage.getEmailFieldReg().sendKeys("haneen.test+" + randomInt + "92@gmail.com");
		registrationPage.getPasslFieldReg().sendKeys("Sporter@123");
		registrationPage.getConfirmPasslFieldReg().sendKeys("");
		registrationPage.getRegSubmitBtn().click();
		Assert.assertTrue(registrationPage.getConfirmPasswordlInputErrMsg().isDisplayed());
		// Thread.sleep(5000);
		SoftAssert softassert = new SoftAssert();
		String actualRersult = registrationPage.getConfirmPasswordlInputErrMsg().getText();
		String expectedResult = "This is a required field.";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "error is not Matching");
		softassert.assertAll();

	}

	@Test(description = "Checking_Incorrect_Email_Error_Messag", priority = 1)
	public void Checking_Incorrect_Email_Error_Message() throws Exception {
		HomePage homePage = new HomePage();
		goToPage(homePage);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		RegistraionPage registrationPage = new RegistraionPage();
		homePage.getMyAccountIcon().click();

		registrationPage.getRegBtn().click();
		registrationPage.getEmailFieldReg().sendKeys("haneen");
		registrationPage.getPasslFieldReg().sendKeys("Sporter@123");
		registrationPage.getConfirmPasslFieldReg().sendKeys("Sporter@123");
		registrationPage.getRegSubmitBtn().click();
		Assert.assertTrue(registrationPage.getEmailInputErrMsg().isDisplayed());
		// Thread.sleep(5000);
		SoftAssert softassert = new SoftAssert();
		String actualRersult = registrationPage.getEmailInputErrMsg().getText();
		String expectedResult = "Please enter a valid email address (Ex: johndoe@domain.com).";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "error is not Matching");
		softassert.assertAll();

	}

	@Test(description = "Checking_length_Password_Less_than_8Digit_Error_Message", priority = 1)
	public void Checking_length_Password_Less_than_8Digit_Error_Message() throws Exception {
		HomePage homePage = new HomePage();
		goToPage(homePage);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		RegistraionPage registrationPage = new RegistraionPage();
		homePage.getMyAccountIcon().click();

		registrationPage.getRegBtn().click();
		registrationPage.getEmailFieldReg().sendKeys("haneen.test+" + randomInt + "92@gmail.com");
		registrationPage.getPasslFieldReg().sendKeys("123");
		registrationPage.getConfirmPasslFieldReg().sendKeys("Sporter@123");
		registrationPage.getRegSubmitBtn().click();
		Assert.assertTrue(registrationPage.getPasswordlInputErrMsg().isDisplayed());
		// Thread.sleep(5000);
		SoftAssert softassert = new SoftAssert();
		String actualRersult = registrationPage.getPasswordlInputErrMsg().getText();
		String expectedResult = "Please enter 8 or more characters. Leading and trailing spaces will be ignored.";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "error is not Matching");
		softassert.assertAll();

	}

	@Test(description = "Checking_The_Same_Value_For_Confirm_password_Error_Message ", priority = 1)
	public void Checking_The_Same_Value_For_Confirm_password_Error_Message() throws Exception {
		HomePage homePage = new HomePage();
		goToPage(homePage);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		RegistraionPage registrationPage = new RegistraionPage();
		homePage.getMyAccountIcon().click();

		registrationPage.getRegBtn().click();
		registrationPage.getEmailFieldReg().sendKeys("haneen.test+" + randomInt + "92@gmail.com");
		registrationPage.getPasslFieldReg().sendKeys("Sporter@123");
		registrationPage.getConfirmPasslFieldReg().sendKeys("123");
		registrationPage.getRegSubmitBtn().click();
		Assert.assertTrue(registrationPage.getConfirmPasswordlInputErrMsg().isDisplayed());
		// Thread.sleep(5000);
		SoftAssert softassert = new SoftAssert();
		String actualRersult = registrationPage.getConfirmPasswordlInputErrMsg().getText();
		String expectedResult = "Please enter the same value again.";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "error is not Matching");
		softassert.assertAll();

	}

	@Test(description = "Checking_Special_Char_and_Numbers_passsword_Error_Message ", priority = 1)
	public void Checking_Special_Char_and_Numbers_passsword_Error_Message() throws Exception {
		HomePage homePage = new HomePage();
		goToPage(homePage);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		RegistraionPage registrationPage = new RegistraionPage();
		homePage.getMyAccountIcon().click();

		registrationPage.getRegBtn().click();
		registrationPage.getEmailFieldReg().sendKeys("haneen.test+" + randomInt + "92@gmail.com");
		registrationPage.getPasslFieldReg().sendKeys("123456789");
		registrationPage.getConfirmPasslFieldReg().sendKeys("Sporter@123");
		registrationPage.getRegSubmitBtn().click();
		Assert.assertTrue(registrationPage.getPasswordlInputErrMsg().isDisplayed());
		// Thread.sleep(5000);
		SoftAssert softassert = new SoftAssert();
		String actualRersult = registrationPage.getPasswordlInputErrMsg().getText();
		String expectedResult = "Minimum of different classes of characters in password is 3. Classes of characters: Lower Case, Upper Case, Digits, Special Characters.";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "error is not Matching");
		softassert.assertAll();

	}

//////////////////////////////////////////////////////////

	@Test(description = "checking the registration-New account", priority = 2)
	public void checking_the_registration_New_account_KSA_Store() throws Exception {
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

		registrationPage.getEmailFieldReg().sendKeys("haneen.test+" + randomInt + "92@gmail.com");
		registrationPage.getPasslFieldReg().sendKeys("Sporter@123");
		registrationPage.getConfirmPasslFieldReg().sendKeys("Sporter@123");
		registrationPage.getRegSubmitBtn().click();
		registrationPage.getFirstNameReg().sendKeys("haneen");
		registrationPage.getLasttNameReg().sendKeys("shaheen");
		registrationPage.getSubSecondReg().click();
		homePage.getMyAccountIcon().click();
		Assert.assertTrue(registrationPage.getMyaccountLink().isDisplayed());

	}

	@Test(description = "Checking_Empty_Email_Error_Message ", priority = 1)
	public void Checking_Empty_Email_Error_Message_KSA_Store() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		HomePage homePage = new HomePage();
		goToPage(homePage);
		waitUntilClickable(homePage.getSwitchLangLink());
		//* homePage.getSwitchLangLink().click();
		Thread.sleep(1000);
		//*homePage.getswitchTOksaStore();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		RegistraionPage registrationPage = new RegistraionPage();
		homePage.getMyAccountIcon().click();

		registrationPage.getRegBtn().click();
		registrationPage.getEmailFieldReg().sendKeys("");
		registrationPage.getPasslFieldReg().sendKeys("Sporter@123");
		registrationPage.getConfirmPasslFieldReg().sendKeys("Sporter@123");
		registrationPage.getRegSubmitBtn().click();
		Assert.assertTrue(registrationPage.getEmailInputErrMsg().isDisplayed());
		// Thread.sleep(5000);
		SoftAssert softassert = new SoftAssert();
		String actualRersult = registrationPage.getEmailInputErrMsg().getText();
		String expectedResult = "This is a required field.";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "error is not Matching");
		softassert.assertAll();

	}

	@Test(description = "Checking_Empty_password_Error_Message ", priority = 1)
	public void Checking_Empty_Password_Error_Message_KSA_Store() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		HomePage homePage = new HomePage();
		goToPage(homePage);
		waitUntilClickable(homePage.getSwitchLangLink());
		//* homePage.getSwitchLangLink().click();
		Thread.sleep(1000);
		//* homePage.getswitchTOksaStore()

		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		RegistraionPage registrationPage = new RegistraionPage();
		homePage.getMyAccountIcon().click();

		registrationPage.getRegBtn().click();
		registrationPage.getEmailFieldReg().sendKeys("haneen.test+" + randomInt + "92@gmail.com");
		registrationPage.getPasslFieldReg().sendKeys("");
		registrationPage.getConfirmPasslFieldReg().sendKeys("Sporter@123");
		registrationPage.getRegSubmitBtn().click();
		Assert.assertTrue(registrationPage.getPasswordlInputErrMsg().isDisplayed());
		// Thread.sleep(5000);
		SoftAssert softassert = new SoftAssert();
		String actualRersult = registrationPage.getPasswordlInputErrMsg().getText();
		String expectedResult = "This is a required field.";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "error is not Matching");
		softassert.assertAll();

	}

	@Test(description = "Checking_Empty_Confirm_Password_Error_Message ", priority = 1)
	public void Checking_Empty_Confirm_password_Error_Message_KSA_Store() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		HomePage homePage = new HomePage();
		goToPage(homePage);
		waitUntilClickable(homePage.getSwitchLangLink());
	//*	homePage.getSwitchLangLink().click();
		Thread.sleep(1000);
	//*	homePage.getswitchTOksaStore()
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		RegistraionPage registrationPage = new RegistraionPage();
		homePage.getMyAccountIcon().click();

		registrationPage.getRegBtn().click();
		registrationPage.getEmailFieldReg().sendKeys("haneen.test+" + randomInt + "92@gmail.com");
		registrationPage.getPasslFieldReg().sendKeys("Sporter@123");
		registrationPage.getConfirmPasslFieldReg().sendKeys("");
		registrationPage.getRegSubmitBtn().click();
		Assert.assertTrue(registrationPage.getConfirmPasswordlInputErrMsg().isDisplayed());
		// Thread.sleep(5000);
		SoftAssert softassert = new SoftAssert();
		String actualRersult = registrationPage.getConfirmPasswordlInputErrMsg().getText();
		String expectedResult = "This is a required field.";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "error is not Matching");
		softassert.assertAll();

	}

	@Test(description = "Checking_Incorrect_Email_Error_Messag", priority = 1)
	public void Checking_Incorrect_Email_Error_Message_KSA_Store() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		HomePage homePage = new HomePage();
		goToPage(homePage);
	//*	waitUntilClickable(homePage.getSwitchLangLink());
	//*	homePage.getSwitchLangLink().click();
		Thread.sleep(1000);
	//*	homePage.getswitchTOksaStore()

		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		RegistraionPage registrationPage = new RegistraionPage();
		homePage.getMyAccountIcon().click();

		registrationPage.getRegBtn().click();
		registrationPage.getEmailFieldReg().sendKeys("haneen");
		registrationPage.getPasslFieldReg().sendKeys("Sporter@123");
		registrationPage.getConfirmPasslFieldReg().sendKeys("Sporter@123");
		registrationPage.getRegSubmitBtn().click();
		Assert.assertTrue(registrationPage.getEmailInputErrMsg().isDisplayed());
		// Thread.sleep(5000);
		SoftAssert softassert = new SoftAssert();
		String actualRersult = registrationPage.getEmailInputErrMsg().getText();
		String expectedResult = "Please enter a valid email address (Ex: johndoe@domain.com).";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "error is not Matching");
		softassert.assertAll();

	}

	@Test(description = "Checking_length_Password_Less_than_8Digit_Error_Message", priority = 1)
	public void Checking_length_Password_Less_than_8Digit_Error_Message_KSA_Store() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		HomePage homePage = new HomePage();
		goToPage(homePage);
		waitUntilClickable(homePage.getSwitchLangLink());
	//*	homePage.getSwitchLangLink().click();
		Thread.sleep(1000);
	//*	homePage.getKSAswitchStore().click();

		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		RegistraionPage registrationPage = new RegistraionPage();
		homePage.getMyAccountIcon().click();

		registrationPage.getRegBtn().click();
		registrationPage.getEmailFieldReg().sendKeys("haneen.test+" + randomInt + "92@gmail.com");
		registrationPage.getPasslFieldReg().sendKeys("123");
		registrationPage.getConfirmPasslFieldReg().sendKeys("Sporter@123");
		registrationPage.getRegSubmitBtn().click();
		Assert.assertTrue(registrationPage.getPasswordlInputErrMsg().isDisplayed());
		// Thread.sleep(5000);
		SoftAssert softassert = new SoftAssert();
		String actualRersult = registrationPage.getPasswordlInputErrMsg().getText();
		String expectedResult = "Please enter 8 or more characters. Leading and trailing spaces will be ignored.";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "error is not Matching");
		softassert.assertAll();

	}

	@Test(description = "Checking_The_Same_Value_For_Confirm_password_Error_Message ", priority = 1)
	public void Checking_The_Same_Value_For_Confirm_password_Error_Message_KSA_Store() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		HomePage homePage = new HomePage();
		goToPage(homePage);
		waitUntilClickable(homePage.getSwitchLangLink());
	//*	homePage.getSwitchLangLink().click();
		Thread.sleep(1000);
	//*	homePage.getKSAswitchStore().click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		RegistraionPage registrationPage = new RegistraionPage();
		homePage.getMyAccountIcon().click();

		registrationPage.getRegBtn().click();
		registrationPage.getEmailFieldReg().sendKeys("haneen.test+" + randomInt + "92@gmail.com");
		registrationPage.getPasslFieldReg().sendKeys("Sporter@123");
		registrationPage.getConfirmPasslFieldReg().sendKeys("123");
		registrationPage.getRegSubmitBtn().click();
		Assert.assertTrue(registrationPage.getConfirmPasswordlInputErrMsg().isDisplayed());
		// Thread.sleep(5000);
		SoftAssert softassert = new SoftAssert();
		String actualRersult = registrationPage.getConfirmPasswordlInputErrMsg().getText();
		String expectedResult = "Please enter the same value again.";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "error is not Matching");
		softassert.assertAll();

	}

	@Test(description = "Checking_Special_Char_and_Numbers_passsword_Error_Message ", priority = 1)
	public void Checking_Special_Char_and_Numbers_passsword_Error_Message_KSA_Store() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		HomePage homePage = new HomePage();
		goToPage(homePage);
		waitUntilClickable(homePage.getSwitchLangLink());
	//*	homePage.getSwitchLangLink().click();
		Thread.sleep(1000);
	//*	homePage.getKSAswitchStore().click();
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		RegistraionPage registrationPage = new RegistraionPage();
		homePage.getMyAccountIcon().click();

		registrationPage.getRegBtn().click();
		registrationPage.getEmailFieldReg().sendKeys("haneen.test+" + randomInt + "92@gmail.com");
		registrationPage.getPasslFieldReg().sendKeys("123456789");
		registrationPage.getConfirmPasslFieldReg().sendKeys("Sporter@123");
		registrationPage.getRegSubmitBtn().click();
		Assert.assertTrue(registrationPage.getPasswordlInputErrMsg().isDisplayed());
		// Thread.sleep(5000);
		SoftAssert softassert = new SoftAssert();
		String actualRersult = registrationPage.getPasswordlInputErrMsg().getText();
		String expectedResult = "Minimum of different classes of characters in password is 3. Classes of characters: Lower Case, Upper Case, Digits, Special Characters.";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "error is not Matching");
		softassert.assertAll();

	}

}