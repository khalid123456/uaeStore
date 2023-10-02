package cases;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.github.dockerjava.api.model.Driver;

import pages.AdminPge;

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
public class admincase extends BaseTest {


	@Test(description = "checking_Order_Date_Field_in_the_order_page", priority = 1)
	public void checking_Order_Date_Field_in_the_order_page() throws Exception {
		  openSalespage();
		AdminPge sales = new AdminPge();

  Assert.assertTrue(sales.getOrderDate().isDisplayed());
	}
	
	@Test(description = "checking_Order_status_Field_in_the_order_page", priority = 3)
	public void checking_Order_status_Field_in_the_order_page() throws Exception {
		AdminPge sales = new AdminPge();

  Assert.assertTrue(sales.getOrderStatus().isDisplayed());
	}
	
	@Test(description = "checking_QuoteID_Field_in_the_order_page", priority = 3)
	public void checking_QuoteID_Field_in_the_order_page() throws Exception {
		AdminPge sales = new AdminPge();

  Assert.assertTrue(sales.getQuoteID().isDisplayed());
	}
	
	@Test(description = "checking_Is_Mobile_Order_Field_in_the_order_page", priority = 3)
	public void checking_Is_Mobile_Order_Field_in_the_order_page() throws Exception {
		AdminPge sales = new AdminPge();

  Assert.assertTrue(sales.getIsMobileOrder().isDisplayed());
	}
	
	@Test(description = "checking_Order_Verified_Field_in_the_order_page", priority = 3)
	public void checking_Order_Verified_Field_in_the_order_page() throws Exception {
		AdminPge sales = new AdminPge();

  Assert.assertTrue(sales.getOrderVerified().isDisplayed());
	}
	
	@Test(description = "checking_SAP_Order_Status_Field_in_the_order_page", priority = 3)
	public void checking_SAP_Order_Status_Field_in_the_order_page() throws Exception {
		AdminPge sales = new AdminPge();

  Assert.assertTrue(sales.getSAPOrderStatus().isDisplayed());
	}
	
	
	@Test(description = "checking_Placed_From_IP_Field_in_the_order_page", priority = 3)
	public void checking_Placed_From_IP_Field_in_the_order_page() throws Exception {
		AdminPge sales = new AdminPge();

  Assert.assertTrue(sales.getPlacedFromIP().isDisplayed());
	}
	
	@Test(description = "checking_Purchased_From_Field_in_the_order_page", priority = 3)
	public void checking_Purchased_From_Field_in_the_order_page() throws Exception {
		AdminPge sales = new AdminPge();

  Assert.assertTrue(sales.getPurchasedFrom().isDisplayed());
	}
	
	@Test(description = "checking_Address_Information_Field_in_the_order_page", priority = 3)
	public void checking_Address_Information_Field_in_the_order_page() throws Exception {
		AdminPge sales = new AdminPge();

  Assert.assertTrue(sales.getAddressInformation().isDisplayed());
	}
	
	@Test(description = "checking_Billing_Address_Field_in_the_order_page", priority = 3)
	public void checking_Billing_Address_Field_in_the_order_page() throws Exception {
		AdminPge sales = new AdminPge();

  Assert.assertTrue(sales.getBillingAddress().isDisplayed());
	}
	
	@Test(description = "checking_Shipping_Address_Field_in_the_order_page", priority = 3)
	public void checking_Shipping_Address_Field_in_the_order_page() throws Exception {
		AdminPge sales = new AdminPge();

  Assert.assertTrue(sales.getShippingAddress().isDisplayed());
	}
	
	@Test(description = "checking_Payment_Shipping_Method_Field_in_the_order_page", priority = 3)
	public void checking_Payment_Shipping_Method_Field_in_the_order_page() throws Exception {
		AdminPge sales = new AdminPge();

  Assert.assertTrue(sales.getPaymentShippingMethod().isDisplayed());
	}
	
	@Test(description = "checking_Payment_Shipping_Method_Field_in_the_order_page", priority = 3)
	public void checking_Payment_Information_Field_in_the_order_page() throws Exception {
		AdminPge sales = new AdminPge();

  Assert.assertTrue(sales.getPaymentInformation().isDisplayed());
	}
	
	@Test(description = "checking_order-total_Field_in_the_order_page", priority = 3)
	public void checking_or_Field_in_the_order_page() throws Exception {
		AdminPge sales = new AdminPge();

  Assert.assertTrue(sales.getOrderTotal().isDisplayed());
	}
	
	@Test(description = "checking_Shipping_AND_Handling_Information_Field_in_the_order_page", priority = 3)
	public void checking_Shipping_AND_Handling_Information_Field_in_the_order_page() throws Exception {
		AdminPge sales = new AdminPge();

  Assert.assertTrue(sales.getShippingHandlingInformation().isDisplayed());
	}
	
	@Test(description = "checking_Subtotal_Field_in_the_order_page", priority = 3)
	public void checking_Subtotal_Field_in_the_order_page() throws Exception {
		AdminPge sales = new AdminPge();

  Assert.assertTrue(sales.getSubtotal().isDisplayed());
	}
	
	@Test(description = "checking_COD_Fees_and_Shipping_with+handling_Field_in_the_order_page", priority = 3)
	public void checking_COD_Fees_and_Shipping_with_handling_Field_in_the_order_pagee() throws Exception {
		AdminPge sales = new AdminPge();

  Assert.assertTrue(sales.getCODFeesandShippingwithhandling().isDisplayed());
	}
	
	@Test(description = "checking_Cash_on_Delivery_fee_Field_in_the_order_page", priority = 3)
	public void checking_Cash_on_Delivery_fee_Field_in_the_order_page() throws Exception {
		AdminPge sales = new AdminPge();

  Assert.assertTrue(sales.getCashonDeliveryfee().isDisplayed());
	}
	
	@Test(description = "checking_Grand_Total_Without_Tax_Field_in_the_order_page", priority = 3)
	public void checking_Grand_Total_Without_Tax_Field_in_the_order_page() throws Exception {
		AdminPge sales = new AdminPge();

  Assert.assertTrue(sales.getGrandTotalWithoutTax().isDisplayed());
	}
	
	@Test(description = "checking_The_Tax_Field_in_the_order_page", priority = 3)
	public void checking_The_Tax_Field_in_the_order_page() throws Exception {
		AdminPge sales = new AdminPge();

  Assert.assertTrue(sales.getTax().isDisplayed());
	}
	
	@Test(description = "checking_Grand_Total_includeTax_Field_in_the_order_page", priority = 3)
	public void checking_Grand_Total_includeTax_Field_in_the_order_pag() throws Exception {
		AdminPge sales = new AdminPge();

  Assert.assertTrue(sales.getGrandTotalincludeTax().isDisplayed());
	}
	
	@Test(description = "checking_Total_Paid_Field_in_the_order_page", priority = 3)
	public void checking_checking_Total_Paid_Field_in_the_order_page() throws Exception {
		AdminPge sales = new AdminPge();

  Assert.assertTrue(sales.getTotalPaid().isDisplayed());
	}
	
	@Test(description = "checking_Total_Refund_Field_in_the_order_page", priority = 3)
	public void checking_checking_Total_Refund_Field_in_the_order_page() throws Exception {
		AdminPge sales = new AdminPge();

  Assert.assertTrue(sales.getTotalRefunded().isDisplayed());
	}
	
	@Test(description = "checking_Total_Due_Field_in_the_order_page", priority = 3)
	public void checking_checking_Total_Due_Field_in_the_order_page() throws Exception {
		AdminPge sales = new AdminPge();

  Assert.assertTrue(sales.getTotal_Due().isDisplayed());
	}
	
	@Test(description = "checking_Note_Order_Field_in_the_order_page", priority = 3)
	public void checking_Note_Order_Field_in_the_order_page() throws Exception {
		AdminPge sales = new AdminPge();

		 Assert.assertTrue(sales.getNoteOrder().isDisplayed());
	}
	
	@Test(description = "checking_Status_Field_in_the_order_page", priority = 3)
	public void checking_Status_Field_in_the_order_page() throws Exception {
		AdminPge sales = new AdminPge();

		 Assert.assertTrue(sales.getStatus().isDisplayed());
	}
	
	@Test(description = "checking_comment_Field_in_the_order_page", priority = 3)
	public void checking_Comment_Field_in_the_order_page() throws Exception {
		AdminPge sales = new AdminPge();

		 Assert.assertTrue(sales.getComment().isDisplayed());
	}
	
	@Test(description = "checking_Submit_Comment_Field_in_the_order_page", priority = 3)
	public void checking_Submit_Comment_Field_in_the_order_page() throws Exception {
		AdminPge sales = new AdminPge();

		 Assert.assertTrue(sales.getSubmitComment().isDisplayed());
		 //System.out.println(driver.findElement(By.xpath("//*[@id=\"sales_order_view_tabs_order_info_content\"]/section[5]/div[2]/div[2]/table/tbody/tr[5]/td[2]")).getText());
		 String str = driver.findElement(By.xpath("//*[@id=\"sales_order_view_tabs_order_info_content\"]/section[5]/div[2]/div[2]/table/tbody/tr[5]/td[2]")).getText();
//		 char ch [] = str.toCharArray(); 
//	        String str3="";
//	        for(int i=0; i<ch.length; i++)
//	        {
//	            if(ch[i]=='A')
//	            {
//	            	ch[i].sendKeys(Keys.BACK_SPACE);
//	                System.out.println(str3);
//	            }
//	             
//	          
//	        }
		 str = str.replace("AED", "");
		  
	        
		    char ch [] = str.toCharArray(); 
	        String str3="";
	        for(int i=0; i<ch.length; i++)
	        {
	            if(ch[i]!=' ')
	            {
	                str3 = str3 + str.charAt(i);
	            }
	             
	        }
	        //int i = Integer. parseInt(str3);
	        System.out.println(str3);
	        //int m=Integer.parseInt(str3);
	        Integer m = Integer.valueOf(str);
	        System.out.println(m);
	   int x= 500;
	   int t=x + m;
	   System.out.println(t);
	        System.out.println(m);
	    }
	
	
	     
	
	

	  @BeforeMethod
	  public void beforeMethod() throws InterruptedException {
		
		
		  
	  }

	public void openSalespage() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  AdminPge salespage = new AdminPge();
		  goToPage(salespage);
		 salespage.getUsername().sendKeys("k.shareef");
		 salespage.getPassword().sendKeys("Taliakaram78");
		  driver.findElement(By.xpath("//*[@id=\"login-form\"]/fieldset/div[3]/div[1]/button")).click();
		  goToPage(salespage);
		  Thread.sleep(15000);
		  driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[4]/table/tbody/tr[1]/td[12]")).click();
	}


  @AfterMethod
  public void afterMethod() {
  }

}
