package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cases.BaseTest;

//import com.sporter.testing.cases.BaseTest;

public class UAEStoreFooter extends BasePage {

	public final static String URL = "http://www.sporter.com";
	
    public UAEStoreFooter() {
		
    	super(URL);
    	PageFactory.initElements(BaseTest.driver, this);
    }
	
    @FindBy(xpath = "(//li[@class='footer-links-item'])[1]/a")
    private WebElement trackYourOrderOption;

  

	@FindBy(xpath = "(//div[@class='footer-column 1'])[1]/ul/li[2]/a")
    private WebElement wheyProteinIsolateOption;
	
    @FindBy(xpath = "(//li[@class='footer-links-item'])[2]/a")
    private WebElement shippingAndDeliveryOption;
    
    @FindBy(xpath = "(//li[@class='footer-links-item'])[3]/a")
    private WebElement refundAndReturns;
    
    @FindBy(xpath = "(//li[@class='footer-links-item'])[4]/a")
    private WebElement wowCustomerServiceOption;
   
    @FindBy(xpath = "(//li[@class='footer-links-item'])[5]/a")
    private WebElement fAQsOption;
    
    @FindBy(xpath = "(//li[@class='footer-links-item'])[11]/a")
    private WebElement aboutSporterPage;
    
    @FindBy(xpath = "(//li[@class='footer-links-item'])[12]/a")
    private WebElement productQualityPage;
    @FindBy(xpath = "(//li[@class='footer-links-item'])[13]/a")
    private WebElement productAuthenticityPage;
    
    @FindBy(xpath = "(//li[@class='footer-links-item'])[15]/a")
    private WebElement careerspage;
    
    @FindBy(xpath = "(//li[@class='footer-links-item'])[17]/a")
    private WebElement contactInfoOption;
    
  //---------------
    
    public WebElement getContactInfoOption() {
		return contactInfoOption;
	}



	public void setContactInfoOption(WebElement contactInfoOption) {
		this.contactInfoOption = contactInfoOption;
	}



	public WebElement getWowCustomerServiceOption() {
		return wowCustomerServiceOption;
	}



	public WebElement getfAQsOption() {
		return fAQsOption;
	}





    
    public WebElement getAboutSporterPage() {
		return aboutSporterPage;
	}



	public void setAboutSporterPage(WebElement aboutSporterPage) {
		this.aboutSporterPage = aboutSporterPage;
	}



	public WebElement getProductQualityPage() {
		return productQualityPage;
	}



	public void setProductQualityPage(WebElement productQualityPage) {
		this.productQualityPage = productQualityPage;
	}



	public WebElement getProductAuthenticityPage() {
		return productAuthenticityPage;
	}



	public void setProductAuthenticityPage(WebElement productAuthenticityPage) {
		this.productAuthenticityPage = productAuthenticityPage;
	}



	public WebElement getCareerspage() {
		return careerspage;
	}



	public void setCareerspage(WebElement careerspage) {
		this.careerspage = careerspage;
	}



	public WebElement getRefundAndReturns() {
		return refundAndReturns;
	}



	public void setRefundAndReturns(WebElement refundAndReturns) {
		this.refundAndReturns = refundAndReturns;
	}



	public WebElement getShippingAndDeliveryOption() {
		return shippingAndDeliveryOption;
	}



	public void setShippingAndDeliveryOption(WebElement shippingAndDeliveryOption) {
		this.shippingAndDeliveryOption = shippingAndDeliveryOption;
	}



	public WebElement getWheyProteinIsolateOption() {
		return wheyProteinIsolateOption;
	}



	 public WebElement getTrackYourOrderOption() {
			return trackYourOrderOption;
		}

}