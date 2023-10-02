package cases;
import org.testng.annotations.Test;
import pages.CategoryPage;
import pages.HomePage;
import pages.MegaMenuPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import static org.testng.Assert.assertFalse;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import javax.xml.xpath.XPath;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
public class KSA_Megamenu_And_subcategories_cases extends BaseTest {
	
	


 @Test(description = "checking_all supp categories-KSA store ", priority =1)
  public void supplements_KSA_store () throws InterruptedException, IOException {
	  
	  for(int i=1;i<=42;i++)
	  {
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		  MegaMenuPage MegamenuPage = new MegaMenuPage();
		  Actions action = new Actions(driver);
			Thread.sleep(1000);
			action.moveToElement(MegamenuPage.getSportSupplementsMainMenu()).perform();
			Thread.sleep(2000);
			// List<WebElement> supp = driver.findElement(By.tagName("a"));
		  //driver.findElement(By.xpath("SubCategoriesList_"+ i +"")).click();
			driver.findElement(By.xpath("/html/body/div/div/div[2]/div/ul/li[2]/div/div[1]/div/a["+ i +"]")).click();
			

			boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found KSA store");
			//System.out.println(verifyTitle);
			//assertFalse(verifyTitle, "Page Not Found Is Displayed");
		if(verifyTitle == false)
		
		{
			System.out.println(driver.getCurrentUrl()+" 404 Error Not  found - KSA store "); 
			
		}
		else 
			
		{
			System.out.println(driver.getCurrentUrl()+"***********************************Error 404 found******************************** "); 
			Thread.sleep(2000);
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("c:\\suppKSAStore\\404error["+ i +"].png"));
		}
		
			boolean EmptyPage = driver.getPageSource().contains("find products matching the selection");
		//ssertFalse(EmptyPage, "The page is empty");
			if(EmptyPage == false)
				
			{
				System.out.println(driver.getCurrentUrl()+"Is Working properly and the items are availabe-KSA store"); 
			}
			else 
				
			{
				System.out.println(driver.getCurrentUrl()+"***********************************Empty Page*********************** ");
				Thread.sleep(2000);
				File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(scrFile, new File("c:\\suppKSAStore\\empty["+ i +"].png"));
				
			}}
			
				
				
	  }
	  
	  @Test(description = "checking_all vitamins categories ", priority =2)
	  public void vitamins_KSA_store  () throws InterruptedException, IOException {
	  for(int j=1;j<=63;j++)
	  {
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 // waitUntilClickable(cat.getMainCategory());
		  MegaMenuPage MegamenuPage = new MegaMenuPage();
		  Actions action = new Actions(driver);
			Thread.sleep(1000);
			action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
			Thread.sleep(2000);
			 // driver.findElement(By.id("SubCategoriesList_"+ j +"")).click();
			driver.findElement(By.xpath("/html/body/div/div/div[2]/div/ul/li[3]/div/div[1]/div/a["+ j +"]")).click();
			  

				boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
				//System.out.println(verifyTitle);
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
				FileUtils.copyFile(scrFile, new File("c:\\vitamins\\404error["+ j +"].png"));
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
					FileUtils.copyFile(scrFile, new File("c:\\vitamins\\empty["+ j +"].png"));
				}
	  }
					
					
		  }
	  
	  @Test(description = "checking_all vitamins categories ", priority =3)
	  public void Healthy_Food_KSA_store  () throws InterruptedException, IOException {
	  for(int j=1;j<=40;j++)
	  {
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 // waitUntilClickable(cat.getMainCategory());
		  MegaMenuPage MegamenuPage = new MegaMenuPage();
		  Actions action = new Actions(driver);
			Thread.sleep(1000);
			action.moveToElement(MegamenuPage.getHealthyFoodMainMenu()).perform();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div/div/div[2]/div/ul/li[4]/div/div[1]/div/a["+ j +"]")).click();
			
			boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
			//System.out.println(verifyTitle);
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
			FileUtils.copyFile(scrFile, new File("c:\\HealthyFood\\404error["+ j +"].png"));
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
				FileUtils.copyFile(scrFile, new File("c:\\HealthyFood\\empty["+ j +"].png"));
			}
			
				
				
	  }}
		  
	
	
	  @Test(description = "checking_all sports categories ", priority =4)
	  public void Sports_KSA_store () throws InterruptedException, IOException {
	  for(int j=1;j<=60;j++)
	  {
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 // waitUntilClickable(cat.getMainCategory());
		  MegaMenuPage MegamenuPage = new MegaMenuPage();
		  Thread.sleep(1000);
		  Actions action = new Actions(driver);
			action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div/div/div[2]/div/ul/li[5]/div/div[1]/div/a["+ j +"]")).click();
			                         
			boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
			//System.out.println(verifyTitle);
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
			FileUtils.copyFile(scrFile, new File("c:\\sports\\404error["+ j +"].png"));
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
				FileUtils.copyFile(scrFile, new File("c:\\sports\\empty["+ j +"].png"));
			}
			
				
				
	  }
	
	  }
	  

  

  
  @BeforeMethod
  public void beforeMethod() {
	  HomePage homePage = new HomePage();
	  goToPage(homePage);
	  CategoryPage cat = new CategoryPage();
	 //* homePage.getSwitchLangLink().click();
	  //*homePage.getswitchTOksaStore().click();
	 
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

}
