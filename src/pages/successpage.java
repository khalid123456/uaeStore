package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cases.BaseTest;

//import com.sporter.testing.cases.BaseTest;

public class successpage extends BasePage {
	
	public final static String URL = "https:admin.sporter.com/admin/sales/order/index/key/0727b96777b807734c8a638150c4a241963e04f3e5c863ef0317cc2f54373de4/";
	
	
	
    public successpage() {
		
    	super(URL);
    	PageFactory.initElements(BaseTest.driver, this);
    }
    
    @FindBy(id = "orderID")
  	private WebElement quoteID;
    
    @FindBy(xpath   = "//*[@id=\"phoneNumber\"]/p")
  	private WebElement optionalText;
    
    @FindBy(id  = "phoneNumber")
  	private WebElement phoneNumberText;
    
   

	@FindBy(xpath  = "change-number")
  	private WebElement changeNumberLink;
    @FindBy(xpath = "//span[@class='smsCodeGuides_edit__pRTy_']")
  	private WebElement EditLink;
    
    @FindBy(id = "smsCodeBox")
  	private WebElement smsCodeBox;
    
    @FindBy(css  = ".rc-anchor-logo-img")
  	private WebElement reCaptchaBlock;
    
    @FindBy(xpath = "//span[@class='resendSms_resendBtn__zjDXy']")
  	private WebElement resendLink;
    
    @FindBy(id = "submitSmsCodeBox")
  	private WebElement confirmNymberBtn;
    
    @FindBy(xpath = "/main[@id='main']/div/div/a/span/img")
  	private WebElement sporterCheckoutLogo;



	public WebElement getQuoteID() {
		return quoteID;
	}

	public WebElement getOptionalText() {
		return optionalText;
	}

	public WebElement getPhoneNumberText() {
		return phoneNumberText;
	}

	public WebElement getEditLink() {
		return EditLink;
	}

	public WebElement getSmsCodeBox() {
		return smsCodeBox;
	}

	public WebElement getReCaptchaBlock() {
		return reCaptchaBlock;
	}

	public WebElement getResendLink() {
		return resendLink;
	}

	public WebElement getConfirmNymberBtn() {
		return confirmNymberBtn;
	}

	public WebElement getSporterCheckoutLogo() {
		return sporterCheckoutLogo;
	}
    
  
	 public WebElement getChangeNumberLink() {
			return changeNumberLink;
		}
}