package cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.Reporter;

public class HeaderFotterMobileNO {
	public class Address extends BaseTest {
		

		@Test(description = "checking_the_UAE_MObile_Number_IN_The_Header",groups= "khalid")
		public void checking_the_UAE_MObile_Number_IN_The_Header() throws Exception {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.get("https://www.sporter.com/en-kw/");
//		String UAENO =	driver.findElement(By.xpath("//*[@id=\"CstServiceInfo\"]/ul/li/div/a  ")).getText();
//		System.out.println(UAENO);
		SoftAssert softassert = new SoftAssert();
		String actualRersult = driver.findElement(By.xpath("//*[@id=\"CstServiceInfo\"]/ul/li/div/a")).getText();
		String expectedResult = "+971 4 88 30 300";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "UAE mobile Number is not Matching");
		softassert.assertAll();
		
		Reporter.log("Log message");
		}
		
		@Test(description = "checking_the_UAE_MObile_Number_IN_The_Header", groups= "khalid")
		public void checking_the_UAE_MObile_Number_IN_The_Footer() throws Exception {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.get("https://stores.sporter.com/en-kw/");
		SoftAssert softassert = new SoftAssert();
		String actualRersult = driver.findElement(By.xpath("//*[@id=\"CstServiceInfo\"]/ul/li/div/a")).getText();
		String expectedResult = "+971 4 88 30 300";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "UAE mobile Number is not Matching");
		softassert.assertAll();
		
		Reporter.log("Log message");
		}
		
		@Test(description = "checking_the_UAE_MObile_Number_IN_The_Header", priority = 1)
		public void checking_the_KSA_MObile_Number_IN_The_Header() throws Exception {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.get("https://stores.sporter.com/en-sa/");
//		String UAENO =	driver.findElement(By.xpath("//*[@id=\"CstServiceInfo\"]/ul/li/div/a  ")).getText();
//		System.out.println(UAENO);
		SoftAssert softassert = new SoftAssert();
		String actualRersult = driver.findElement(By.xpath("//*[@id=\"CstServiceInfo\"]/ul/li/div/a")).getText();
		String expectedResult = "+966 115102770";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "UAE mobile Number is not Matching");
		softassert.assertAll();
		Reporter.log("Log message");
		
		}
		@Test(description = "checking_the_UAE_MObile_Number_IN_The_Header", priority = 1)
		public void checking_the_KSA_MObile_Number_IN_The_Footer() throws Exception {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.get("https://stores.sporter.com/en-sa/");
		SoftAssert softassert = new SoftAssert();
		String actualRersult = driver.findElement(By.xpath("//*[@id=\"CstServiceInfo\"]/ul/li/div/a")).getText();
		String expectedResult = "+966 115102770";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "UAE mobile Number is not Matching");
		softassert.assertAll();
		
		
		}
		
		@Test(description = "checking_the_Bahrain_MObile_Number_IN_The_Header", priority = 1)
		public void checking_the_Bahrain_MObile_Number_IN_The_Header() throws Exception {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.get("https://stores.sporter.com/en-bh/");
//		String UAENO =	driver.findElement(By.xpath("//*[@id=\"CstServiceInfo\"]/ul/li/div/a  ")).getText();
//		System.out.println(UAENO);
		SoftAssert softassert = new SoftAssert();
		String actualRersult = driver.findElement(By.xpath("//*[@id=\"CstServiceInfo\"]/ul/li/div/a")).getText();
		String expectedResult = "+ 971 4 88 30 300";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "UAE mobile Number is not Matching");
		softassert.assertAll();
		
		
		}
		
		@Test(description = "checking_the_Bahrain_MObile_Number_IN_The_Footer", priority = 1)
		public void checking_the_Bahrain_MObile_Number_IN_The_Footer() throws Exception {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.get("https://stores.sporter.com/en-bh/");
		SoftAssert softassert = new SoftAssert();
		String actualRersult = driver.findElement(By.xpath("//*[@id=\"CstServiceInfo\"]/ul/li/div/a")).getText();
		String expectedResult = "+ 971 4 88 30 300";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "UAE mobile Number is not Matching");
		softassert.assertAll();
		
		
		}
		
		@Test(description = "checking_the_Jordan_MObile_Number_IN_The_Header", priority = 1)
		public void checking_the_Jordan_MObile_Number_IN_The_Header() throws Exception {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.get("https://stores.sporter.com/en-jo/");
//		String UAENO =	driver.findElement(By.xpath("//*[@id=\"CstServiceInfo\"]/ul/li/div/a  ")).getText();
//		System.out.println(UAENO);
		SoftAssert softassert = new SoftAssert();
		String actualRersult = driver.findElement(By.xpath("//*[@id=\"CstServiceInfo\"]/ul/li/div/a")).getText();
		String expectedResult = "+962 6 200 5775";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "UAE mobile Number is not Matching");
		softassert.assertAll();
		
		
		}
		
		@Test(description = "checking_the_Jordan_MObile_Number_IN_The_Footer", priority = 1)
		public void checking_the_JOrdan_MObile_Number_IN_The_Footer() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://stores.sporter.com/en-jo/");
		SoftAssert softassert = new SoftAssert();
		String actualRersult = driver.findElement(By.xpath("//*[@id=\"CstServiceInfo\"]/ul/li/div/a")).getText();
		String expectedResult = "+962 6 200 5775";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "UAE mobile Number is not Matching");
		softassert.assertAll();
		
		
		}
		
		@Test(description = "checking_the_Egypt_MObile_Number_IN_The_Header", priority = 1)
		public void checking_the_Egypt_MObile_Number_IN_The_Header() throws Exception {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.get("https://stores.sporter.com/en-eg/");
		SoftAssert softassert = new SoftAssert();
		String actualRersult = driver.findElement(By.xpath("//*[@id=\"CstServiceInfo\"]/ul/li/div/a")).getText();
		String expectedResult = "+20 2212 934 44";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "UAE mobile Number is not Matching");
		softassert.assertAll();
		
		
		}
		
		@Test(description = "checking_the_Egypt_MObile_Number_IN_The_Header", priority = 1)
		public void checking_the_Egypt_MObile_Number_IN_The_Footer() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://stores.sporter.com/en-eg/");
		SoftAssert softassert = new SoftAssert();
		String actualRersult = driver.findElement(By.xpath("//*[@id=\"CstServiceInfo\"]/ul/li/div/a")).getText();
		String expectedResult = "+20 2212 934 44";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "UAE mobile Number is not Matching");
		softassert.assertAll();
		
		
		}
		
		@Test(description = "checking_the_KUWAIT_MObile_Number_IN_The_Header", priority = 1)
		public void checking_the_KUWAIT_MObile_Number_IN_The_Header() throws Exception {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.get("https://stores.sporter.com/en-kw/");
//		String UAENO =	driver.findElement(By.xpath("//*[@id=\"CstServiceInfo\"]/ul/li/div/a  ")).getText();
//		System.out.println(UAENO);
		SoftAssert softassert = new SoftAssert();
		String actualRersult = driver.findElement(By.xpath("//*[@id=\"CstServiceInfo\"]/ul/li/div/a")).getText();
		String expectedResult = "+971 4 88 30 300";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "UAE mobile Number is not Matching");
		softassert.assertAll();
		
		
		}
		
		@Test(description = "checking_the_KUWAIT_MObile_Number_IN_The_Footer", priority = 1)
		public void checking_the_KUWAIT_MObile_Number_IN_The_Footer() throws Exception {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.get("https://stores.sporter.com/en-kw/");
		SoftAssert softassert = new SoftAssert();
		String actualRersult = driver.findElement(By.xpath("//*[@id=\"CstServiceInfo\"]/ul/li/div/a")).getText();
		String expectedResult = "+971 4 88 30 300";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "UAE mobile Number is not Matching");
		softassert.assertAll();
		
		
		}
		
		@Test(description = "checking_the_OMAN_MObile_Number_IN_The_Header", priority = 1)
		public void checking_the_OMAN_MObile_Number_IN_The_Header() throws Exception {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.get("https://stores.sporter.com/en-om/");
//		String UAENO =	driver.findElement(By.xpath("//*[@id=\"CstServiceInfo\"]/ul/li/div/a  ")).getText();
//		System.out.println(UAENO);
		SoftAssert softassert = new SoftAssert();
		String actualRersult = driver.findElement(By.xpath("//*[@id=\"CstServiceInfo\"]/ul/li/div/a")).getText();
		String expectedResult = "+971 4 88 30 300";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "UAE mobile Number is not Matching");
		softassert.assertAll();
		
		
		}
		
		@Test(description = "checking_the_OMAN_MObile_Number_IN_The_Footer", priority = 1)
		public void checking_the_OMAN_MObile_Number_IN_The_Footer() throws Exception {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.get("https://stores.sporter.com/en-om/");
		SoftAssert softassert = new SoftAssert();
		String actualRersult = driver.findElement(By.xpath("//*[@id=\"CstServiceInfo\"]/ul/li/div/a")).getText();
		String expectedResult = "+971 4 88 30 300";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "UAE mobile Number is not Matching");
		softassert.assertAll();
		
		
		}
		
		@Test(description = "checking_the_QATAR_MObile_Number_IN_The_Header", priority = 1)
		public void checking_the_QATAR_MObile_Number_IN_The_Header() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://stores.sporter.com/en-qa/");
		SoftAssert softassert = new SoftAssert();
		String actualRersult = driver.findElement(By.xpath("//*[@id=\"CstServiceInfo\"]/ul/li/div/a")).getText();
		String expectedResult = "+962 6 200 5775";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "UAE mobile Number is not Matching");
		softassert.assertAll();
		
		
		}
		
		@Test(description = "checking_the_QATAR_MObile_Number_IN_The_Footer", priority = 1)
		public void checking_the_QATAR_MObile_Number_IN_The_Footer() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://stores.sporter.com/en-qa/");
		SoftAssert softassert = new SoftAssert();
		String actualRersult = driver.findElement(By.xpath("//*[@id=\"CstServiceInfo\"]/ul/li/div/a")).getText();
		String expectedResult = "+962 6 200 5775";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "UAE mobile Number is not Matching");
		softassert.assertAll();
		
		
		}
		
		//-------------------------------------
		
		@Test(description = "checking_the_UAE_MObile_Number_IN_The_Header", priority = 2)
		public void checking_the_UAE_MObile_Number_IN_The_Header_AR_INterface() throws Exception {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.get("https://stores.sporter.com/ar-ae/");
//		String UAENO =	driver.findElement(By.xpath("//*[@id=\"CstServiceInfo\"]/ul/li/div/a  ")).getText();
//		System.out.println(UAENO);
		SoftAssert softassert = new SoftAssert();
		String actualRersult = driver.findElement(By.xpath("//*[@id=\"CstServiceInfo\"]/ul/li/div/a")).getText();
		String expectedResult = "+ 971 4 88 30 300";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "UAE mobile Number is not Matching");
		softassert.assertAll();
		
		
		}
		
		@Test(description = "checking_the_UAE_MObile_Number_IN_The_Header", priority = 2)
		public void checking_the_UAE_MObile_Number_IN_The_Footer_AR_INterface() throws Exception {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.get("https://stores.sporter.com/ar-ae/");
		SoftAssert softassert = new SoftAssert();
		String actualRersult = driver.findElement(By.xpath("//*[@id=\"CstServiceInfo\"]/ul/li/div/a")).getText();
		String expectedResult = "+ 971 4 88 30 300";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "UAE mobile Number is not Matching");
		softassert.assertAll();
		
		
		}
		
		@Test(description = "checking_the_UAE_MObile_Number_IN_The_Header", priority = 2)
		public void checking_the_KSA_MObile_Number_IN_The_Header_AR_INterface() throws Exception {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.get("https://stores.sporter.com/ar-sa/");
//		String UAENO =	driver.findElement(By.xpath("//*[@id=\"CstServiceInfo\"]/ul/li/div/a  ")).getText();
//		System.out.println(UAENO);
		SoftAssert softassert = new SoftAssert();
		String actualRersult = driver.findElement(By.xpath("//*[@id=\"CstServiceInfo\"]/ul/li/div/a")).getText();
		String expectedResult = "+966 115102770";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "UAE mobile Number is not Matching");
		softassert.assertAll();
		
		
		}
		@Test(description = "checking_the_UAE_MObile_Number_IN_The_Header", priority = 2)
		public void checking_the_KSA_MObile_Number_IN_The_Footer_AR_INterface() throws Exception {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.get("https://stores.sporter.com/ar-sa/");
		SoftAssert softassert = new SoftAssert();
		String actualRersult = driver.findElement(By.xpath("//*[@id=\"CstServiceInfo\"]/ul/li/div/a")).getText();
		String expectedResult = "+966 115102770";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "UAE mobile Number is not Matching");
		softassert.assertAll();
		
		
		}
		
		@Test(description = "checking_the_Bahrain_MObile_Number_IN_The_Header", priority = 2)
		public void checking_the_Bahrain_MObile_Number_IN_The_Header_AR_INterface() throws Exception {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.get("https://stores.sporter.com/ar-bh/");
//		String UAENO =	driver.findElement(By.xpath("//*[@id=\"CstServiceInfo\"]/ul/li/div/a  ")).getText();
//		System.out.println(UAENO);
		SoftAssert softassert = new SoftAssert();
		String actualRersult = driver.findElement(By.xpath("//*[@id=\"CstServiceInfo\"]/ul/li/div/a")).getText();
		String expectedResult = "+ 971 4 88 30 300";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "UAE mobile Number is not Matching");
		softassert.assertAll();
		
		
		}
		
		@Test(description = "checking_the_Bahrain_MObile_Number_IN_The_Footer", priority = 2)
		public void checking_the_Bahrain_MObile_Number_IN_The_Footer_AR_INterface() throws Exception {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.get("https://stores.sporter.com/ar-bh/");
		SoftAssert softassert = new SoftAssert();
		String actualRersult = driver.findElement(By.xpath("//*[@id=\"CstServiceInfo\"]/ul/li/div/a")).getText();
		String expectedResult = "+ 971 4 88 30 300";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "UAE mobile Number is not Matching");
		softassert.assertAll();
		
		
		}
		
		@Test(description = "checking_the_Jordan_MObile_Number_IN_The_Header", priority = 2)
		public void checking_the_Jordan_MObile_Number_IN_The_Header_AR_INterface() throws Exception {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.get("https://stores.sporter.com/ar-jo/");
//		String UAENO =	driver.findElement(By.xpath("//*[@id=\"CstServiceInfo\"]/ul/li/div/a  ")).getText();
//		System.out.println(UAENO);
		SoftAssert softassert = new SoftAssert();
		String actualRersult = driver.findElement(By.xpath("//*[@id=\"CstServiceInfo\"]/ul/li/div/a")).getText();
		String expectedResult = "+962 6 200 5775";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "UAE mobile Number is not Matching");
		softassert.assertAll();
		
		
		}
		
		@Test(description = "checking_the_Jordan_MObile_Number_IN_The_Footer", priority = 2)
		public void checking_the_JOrdan_MObile_Number_IN_The_Footer_AR_INterface() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://stores.sporter.com/ar-jo/");
		SoftAssert softassert = new SoftAssert();
		String actualRersult = driver.findElement(By.xpath("//*[@id=\"CstServiceInfo\"]/ul/li/div/a")).getText();
		String expectedResult = "+962 6 200 5775";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "UAE mobile Number is not Matching");
		softassert.assertAll();
		
		
		}
		
		@Test(description = "checking_the_Egypt_MObile_Number_IN_The_Header", priority = 2)
		public void checking_the_Egypt_MObile_Number_IN_The_Header_AR_INterface() throws Exception {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.get("https://stores.sporter.com/ar-eg/");
		SoftAssert softassert = new SoftAssert();
		String actualRersult = driver.findElement(By.xpath("//*[@id=\"CstServiceInfo\"]/ul/li/div/a")).getText();
		String expectedResult = "+20 2212 934 44";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "UAE mobile Number is not Matching");
		softassert.assertAll();
		
		
		}
		
		@Test(description = "checking_the_Egypt_MObile_Number_IN_The_Header", priority = 2)
		public void checking_the_Egypt_MObile_Number_IN_The_Footer_AR_INterface() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://stores.sporter.com/ar-eg/");
		SoftAssert softassert = new SoftAssert();
		String actualRersult = driver.findElement(By.xpath("//*[@id=\"CstServiceInfo\"]/ul/li/div/a")).getText();
		String expectedResult = "+20 2212 934 44";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "UAE mobile Number is not Matching");
		softassert.assertAll();
		
		
		}
		
		@Test(description = "checking_the_KUWAIT_MObile_Number_IN_The_Header", priority = 2)
		public void checking_the_KUWAIT_MObile_Number_IN_The_Header_AR_INterface() throws Exception {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.get("https://stores.sporter.com/ar-kw/");
//		String UAENO =	driver.findElement(By.xpath("//*[@id=\"CstServiceInfo\"]/ul/li/div/a  ")).getText();
//		System.out.println(UAENO);
		SoftAssert softassert = new SoftAssert();
		String actualRersult = driver.findElement(By.xpath("//*[@id=\"CstServiceInfo\"]/ul/li/div/a")).getText();
		String expectedResult = "+ 971 4 88 30 300";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "UAE mobile Number is not Matching");
		softassert.assertAll();
		
		
		}
		
		@Test(description = "checking_the_KUWAIT_MObile_Number_IN_The_Footer", priority = 2)
		public void checking_the_KUWAIT_MObile_Number_IN_The_Footer_AR_INterface() throws Exception {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.get("https://stores.sporter.com/ar-kw/");
		SoftAssert softassert = new SoftAssert();
		String actualRersult = driver.findElement(By.xpath("//*[@id=\"CstServiceInfo\"]/ul/li/div/a")).getText();
		String expectedResult = "+ 971 4 88 30 300";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "UAE mobile Number is not Matching");
		softassert.assertAll();
		
		
		}
		
		@Test(description = "checking_the_OMAN_MObile_Number_IN_The_Header", priority = 2)
		public void checking_the_OMAN_MObile_Number_IN_The_Header_AR_INterface() throws Exception {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.get("https://stores.sporter.com/ar-om/");
//		String UAENO =	driver.findElement(By.xpath("//*[@id=\"CstServiceInfo\"]/ul/li/div/a  ")).getText();
//		System.out.println(UAENO);
		SoftAssert softassert = new SoftAssert();
		String actualRersult = driver.findElement(By.xpath("//*[@id=\"CstServiceInfo\"]/ul/li/div/a")).getText();
		String expectedResult = "+ 971 4 88 30 300";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "UAE mobile Number is not Matching");
		softassert.assertAll();
		
		
		}
		
		@Test(description = "checking_the_OMAN_MObile_Number_IN_The_Footer", priority = 2)
		public void checking_the_OMAN_MObile_Number_IN_The_Footer_AR_INterface() throws Exception {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.get("https://stores.sporter.com/ar-om/");
		SoftAssert softassert = new SoftAssert();
		String actualRersult = driver.findElement(By.xpath("//*[@id=\"CstServiceInfo\"]/ul/li/div/a")).getText();
		String expectedResult = "+ 971 4 88 30 300";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "UAE mobile Number is not Matching");
		softassert.assertAll();
		
		
		}
		
		@Test(description = "checking_the_QATAR_MObile_Number_IN_The_Header", priority = 2)
		public void checking_the_QATAR_MObile_Number_IN_The_Header_AR_INterface() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://stores.sporter.com/ar-qa/");
		SoftAssert softassert = new SoftAssert();
		String actualRersult = driver.findElement(By.xpath("//*[@id=\"CstServiceInfo\"]/ul/li/div/a")).getText();
		String expectedResult = "+962 6 200 5775";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "UAE mobile Number is not Matching");
		softassert.assertAll();
		
		
		}
		
		@Test(description = "checking_the_QATAR_MObile_Number_IN_The_Footer", priority = 2)
		public void checking_the_QATAR_MObile_Number_IN_The_Footer_AR_INterface() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://stores.sporter.com/ar-qa/");
		SoftAssert softassert = new SoftAssert();
		String actualRersult = driver.findElement(By.xpath("//*[@id=\"CstServiceInfo\"]/ul/li/div/a")).getText();
		String expectedResult = "+962 6 200 5775";
		System.out.println(actualRersult);
		softassert.assertEquals(actualRersult, expectedResult, "UAE mobile Number is not Matching");
		softassert.assertAll();
		
		
		}
	}
}