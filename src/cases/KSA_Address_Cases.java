package cases;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.github.dockerjava.api.model.Driver;
import pages.AddressPage;
import pages.CategoryPage;
import pages.HomePage;
import pages.RegistraionPage;

//import pages.HomePage;
//import pages.MegaMenuPage;
//import pages.RegistraionPage;
import com.sun.mail.handlers.text_html;

import org.testng.annotations.BeforeMethod;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.Random;

import javax.xml.xpath.XPath;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
public class KSA_Address_Cases extends BaseTest {


	@Test(description = "checking_the_firstName_Error_Message", priority = 3)
	public void checking_the_firstName_Error_Message() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		AddressPage address = new AddressPage();
	
		
	     goToPage(address);
		address.getAddNewAddressLink().click();
		Thread.sleep(2000);
		address.getFirstnameField().sendKeys(Keys.CONTROL,"a");
		address.getFirstnameField().sendKeys(Keys.DELETE);
		//address.getFirstnameField().clear();
		address.getSaveAddressButton().click();
		SoftAssert softassert = new SoftAssert();
		String actualRersult = address.getEmptyFirstNameerrMsg().getText();
		String expectedResult = "This is a required field.";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "error is not Matching");
		softassert.assertAll();

	}

	@Test(description = "checking_the_LastName_Error_Message", priority = 3)
	public void checking_the_LastName_Error_Message() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		AddressPage address = new AddressPage();
	    goToPage(address);
		address.getAddNewAddressLink().click();
		address.getLastnameField().sendKeys(Keys.CONTROL,"a");
		address.getLastnameField().sendKeys(Keys.DELETE);
		address.getSaveAddressButton().click();
		SoftAssert softassert = new SoftAssert();
		String actualRersult = address.getEmptylastnamEerror().getText();
		String expectedResult = "This is a required field.";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "error is not Matching");
		softassert.assertAll();

	}

	@Test(description = "checking_the_telephone_Error_Message", priority =3)
	public void checking_the_telephone_Error_Message() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		AddressPage address = new AddressPage();
	    goToPage(address);
		address.getAddNewAddressLink().click();
		address.getPhoneNumberField().sendKeys("778480989");
		address.getPhoneNumberField().sendKeys(Keys.CONTROL,"a");
		address.getPhoneNumberField().sendKeys(Keys.DELETE);
		address.getSaveAddressButton().click();
		SoftAssert softassert = new SoftAssert();
		String actualRersult = address.getEmptytelephoneerror().getText();
		String expectedResult = "Text length does not satisfy specified text range";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "error is not Matching");
		softassert.assertAll();

	}
	
	@Test(description = "checking_the_AddresName_Error_Message", priority = 4)
	public void checking_the_AddresName_Error_Message() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		AddressPage address = new AddressPage();
	    goToPage(address);
		address.getAddNewAddressLink().click();
		address.getAddressNameField().sendKeys("778480989");
		address.getAddressNameField().sendKeys(Keys.CONTROL,"a");
		address.getAddressNameField().sendKeys(Keys.DELETE);
		address.getSaveAddressButton().click();
		SoftAssert softassert = new SoftAssert();
		String actualRersult = address.getEmptyaAddressNameError().getText();
		String expectedResult = "This is a required field.";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "error is not Matching");
		softassert.assertAll();

	}
	
	@Test(description = "checking_the_StreetAddress_Error_Message", priority =5)
	public void checking_the_StreetAddress_Error_Message() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		AddressPage address = new AddressPage();
	    goToPage(address);
		address.getAddNewAddressLink().click();
		address.getStreet1Field().sendKeys("778480989");
		address.getStreet1Field().sendKeys(Keys.CONTROL,"a");
		address.getStreet1Field().sendKeys(Keys.DELETE);
		address.getSaveAddressButton().click();
		SoftAssert softassert = new SoftAssert();
		String actualRersult = address.getEmptyStreet1Error().getText();
		String expectedResult = "This is a required field.";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "error is not Matching");
		softassert.assertAll();

	}
	
//	@Test(description = "checking_theEmpty__JORID_National_Number_Error_Message", priority =6)
//	public void checking_theEmpty__JORID_National_Number_Error_Message() throws Exception {
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		AddressPage address = new AddressPage();
//	    goToPage(address);
//		address.getAddNewAddressLink().click();
//		address.getSaveAddressButton().click();
//		SoftAssert softassert = new SoftAssert();
//		String actualRersult = address.getNationalIdFielderrMsg().getText();
//		String expectedResult = "Please enter the Qatar national number";
//		System.out.println(actualRersult);
//		softassert.assertEquals(actualRersult, expectedResult, "error is not Matching");
//		softassert.assertAll();
//
//	}
	
//	@Test(description = "checking_the_NO_OF_Digit_JORID_National_Number_Error_Message", priority =6)
//	public void checking_the_NO_OF_Digit_JORID_National_Number_Error_Message() throws Exception {
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		AddressPage address = new AddressPage();
//	    goToPage(address);
//		address.getAddNewAddressLink().click();
//		address.getNationalIdField().sendKeys("012");
//		address.getSaveAddressButton().click();
//		SoftAssert softassert = new SoftAssert();
//		String actualRersult = address.getNationalIdFielderrMsg().getText();
//		String expectedResult = "Please enter 10 digits.";
//		System.out.println(actualRersult);
//		softassert.assertEquals(actualRersult, expectedResult, "error is not Matching");
//		softassert.assertAll();
//
//	}
	
	
	@Test(description = "checking_creating_A_New_Address_successfully(", priority =1)
	public void checking_creating_A_New_Address_successfully() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        AddressPage address = new AddressPage();
        creatingNewAccount();
        //Thread.sleep(3000);
	    goToPage(address);
		address.getAddNewAddressLink().click();
		address.getFirstnameField().sendKeys(Keys.CONTROL,"a");
		address.getFirstnameField().sendKeys(Keys.DELETE);
		address.getFirstnameField().sendKeys("haneen");
		address.getLastnameField().sendKeys(Keys.CONTROL,"a");
		address.getLastnameField().sendKeys(Keys.DELETE);
		address.getLastnameField().sendKeys("shaheen");
		address.getPhoneNumberField().sendKeys("778480989");
	//	address.getNationalIdField().sendKeys("0123456789");
		
		////
		address.getAddressNameField().sendKeys("amman");
		address.getStreet1Field().sendKeys("amman");
		Thread.sleep(2000);
		address.getSaveAddressButton().click();
		 goToPage(address);
		 Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(By.cssSelector(".addressItem_address__X8AA8:nth-child(1)")).isDisplayed());
	}
	@Test(description = "to_Check_Editing_The_First_Name(", priority =1)
	public void to_Check_Editing_The_First_Name() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		AddressPage address = new AddressPage();
	    goToPage(address);
		driver.findElement(By.linkText("Edit")).click();
		address.getFirstnameField().sendKeys(Keys.CONTROL,"a");
		address.getFirstnameField().sendKeys(Keys.DELETE);
		address.getFirstnameField().sendKeys("HANEENSporter");
		address.getAddressNameField().sendKeys("amman");
		//
		//
		//
		Thread.sleep(2000);
		address.getSaveAddressButton().click();
		Thread.sleep(2000);
		goToPage(address);
		driver.findElement(By.linkText("Edit")).click();
		WebElement val = address.getFirstnameField();
		SoftAssert softassert = new SoftAssert();
		String actualRersult = val.getAttribute("value");
		String expectedResult = "HANEENSporter";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "error is not Matching");
		softassert.assertAll();
		

		
		
	}
	
	@Test(description = "to_Check_Editing_The_last_Nam(", priority =1)
	public void to_Check_Editing_The_last_Name() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		AddressPage address = new AddressPage();
	    goToPage(address);
		driver.findElement(By.linkText("Edit")).click();
		address.getLastnameField().sendKeys(Keys.CONTROL,"a");
		address.getLastnameField().sendKeys(Keys.DELETE);
		address.getLastnameField().sendKeys("SHAHEENsporter");
		address.getAddressNameField().sendKeys("amman");
		//
		//
		//
		Thread.sleep(2000);
		address.getSaveAddressButton().click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Edit")).click();
		WebElement val = address.getLastnameField();
		SoftAssert softassert = new SoftAssert();
		String actualRersult = val.getAttribute("value");
		String expectedResult = "SHAHEENsporter";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "error is not Matching");
		softassert.assertAll();
		

		
		
	}
	@Test(description = " to_Check_Editing_The_Address_Name(", priority =1)
	public void to_Check_Editing_The_Address_Name() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		AddressPage address = new AddressPage();
	    goToPage(address);
		driver.findElement(By.linkText("Edit")).click();
		address.getAddressNameField().sendKeys(Keys.CONTROL,"a");
		//address.getAddressNameField().sendKeys(Keys.DELETE);
		address.getAddressNameField().sendKeys("WORK");
		//
		Thread.sleep(2000);
		address.getSaveAddressButton().click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Edit")).click();
		WebElement val = address.getAddressNameField();
		SoftAssert softassert = new SoftAssert();
		String actualRersult = val.getAttribute("value");
		String expectedResult = "WORK";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "error is not Matching");
		softassert.assertAll();
		

		
		
	}
	
	@Test(description = " to_Check_Editing_The_Street_Field(", priority =1)
	public void to_Check_Editing_The_Street_Field() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		AddressPage address = new AddressPage();
	    goToPage(address);
		driver.findElement(By.linkText("Edit")).click();
		address.getStreet1Field().sendKeys(Keys.CONTROL,"a");
		address.getStreet1Field().sendKeys(Keys.DELETE);
		address.getStreet1Field().sendKeys("WADI SAQRA");
		address.getAddressNameField().sendKeys("WORK");
		//
		//
		//
		Thread.sleep(2000);
		address.getSaveAddressButton().click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Edit")).click();
		WebElement val = address.getStreet1Field();
		SoftAssert softassert = new SoftAssert();
		String actualRersult = val.getAttribute("value");
		String expectedResult = "WADI SAQRA";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "error is not Matching");
		softassert.assertAll();
		

		
		
	}
//	@Test(description = " to_Check_Editing_The_National_ID_Number(", priority =1)
//	public void to_Check_Editing_The_National_ID_Number() throws Exception {
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		AddressPage address = new AddressPage();
//	    goToPage(address);
//		driver.findElement(By.linkText("Edit")).click();
//		//
//		//
//		address.getAddressNameField().sendKeys("WORK");
//		address.getNationalIdField().sendKeys("5555555555");
//		Thread.sleep(2000);
//		address.getSaveAddressButton().click();
//		Thread.sleep(2000);
//		driver.findElement(By.linkText("Edit")).click();
//		WebElement val = address.getNationalIdField();
//		SoftAssert softassert = new SoftAssert();
//		String actualRersult = val.getAttribute("value");
//		String expectedResult = "5555555555";
//		System.out.println(actualRersult);
//		softassert.assertEquals(actualRersult, expectedResult, "error is not Matching");
//		softassert.assertAll();
//			
//		
//	}
	
//	@Test(description = " to_Check_Editing_The_city_in_Address(", priority =1)
//	public void to_Check_Editing_The_city_in_Address() throws Exception {
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		AddressPage address = new AddressPage();
//	    goToPage(address);
//		driver.findElement(By.linkText("Edit")).click();
//		////
//		////
//		address.getCitiesSelector().click();
//		driver.findElement(By.xpath("//div[normalize-space()='Ghour Al Safi']")).click();
//		address.getAddressNameField().sendKeys("WORK");
//		//
//		address.getSaveAddressButton().click();
//		
//		SoftAssert softassert = new SoftAssert();
//		String actualRersult = driver.findElement(By.xpath("//div[normalize-space()='Ghour Al Safi']")).getText();
//		String expectedResult = "Azraq";
//		System.out.println(actualRersult);
//		softassert.assertEquals(actualRersult, expectedResult, "error is not Matching");
//		softassert.assertAll();
//		
//
//		
//		
//	}
	
	
	@Test(description = "to_Check_The_Default_Address(", priority =6)
	public void to_Check_The_Default_Address() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		AddressPage address = new AddressPage();
	    goToPage(address);
		address.getAddNewAddressLink().click();
		address.getFirstnameField().sendKeys(Keys.CONTROL,"a");
		address.getFirstnameField().sendKeys(Keys.DELETE);
		address.getFirstnameField().sendKeys("haneen");
		address.getLastnameField().sendKeys(Keys.CONTROL,"a");
		address.getLastnameField().sendKeys(Keys.DELETE);
		address.getLastnameField().sendKeys("shaheen default address");
		address.getPhoneNumberField().sendKeys("778480989");
		//address.getNationalIdField().sendKeys("0123456789");
		
		address.getAddressNameField().sendKeys("amman");
		address.getStreet1Field().sendKeys("amman");
		address.getDefaultAddresslabel().click();
		Thread.sleep(2000);
		address.getSaveAddressButton().click();
		Assert.assertTrue(driver.findElement(By.cssSelector(".addressItem_address__X8AA8:nth-child(2)")).isDisplayed());
	}
	public void creatingNewAccount() throws InterruptedException {
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
		registrationPage.getConfirmPasslFieldReg().sendKeys("Sporter@123");
		registrationPage.getRegSubmitBtn().click();
		registrationPage.getFirstNameReg().sendKeys("haneen");
		registrationPage.getLasttNameReg().sendKeys("shaheen");
		registrationPage.getSubSecondReg().click();
		Thread.sleep(3000);
		homePage.getMyAccountIcon().click();
		Assert.assertTrue(registrationPage.getMyaccountLink().isDisplayed());
	}
  
	 
  
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  HomePage homePage = new HomePage();
	  goToPage(homePage);
	  CategoryPage cat = new CategoryPage();
	 // Thread.sleep(2000);
	 // homePage.getRedirection().click();
	//*  homePage.getSwitchLangLink().click();
	//*  homePage.getUaeStoreLink().click();
	  
	 
  }

  @AfterMethod
  public void afterMethod() {
  }

}
