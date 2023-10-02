package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cases.BaseTest;

//import com.sporter.testing.cases.BaseTest;

//import com.sporter.testing.cases.BaseTest;



public class AddressPage extends BasePage {
	
	public final static String URL = "https://www.sporter.com/en-sa/dashboard/my_addresses/";
	
	
	
    public AddressPage() {
		
    	super(URL);
    	PageFactory.initElements(BaseTest.driver, this);
    }
    
    @FindBy(id = "firstnameField")
	private WebElement  firstnameField;
    
    @FindBy(id = "lastnameField")
	private WebElement  lastnameField;

	@FindBy(xpath = "//*[@id=\"main\"]/div/div[3]/div/div[2]/a")
	private WebElement addNewAddressLink;

    @FindBy(id = "firstnameField_errMsg")
   	private WebElement emptyFirstNameerrMsg;
  
    @FindBy(id = "lastnameField_errMsg")
   	private WebElement emptylastnamEerror;
    
    @FindBy(id = "telephoneInputErrMsg")
   	private WebElement Emptytelephoneerror;
    
    @FindBy(id = "phoneNumber")
   	private WebElement phoneNumberField;
    
    @FindBy(id = "addressNameField")
   	private WebElement addressNameField;
    
	@FindBy(id = "addressNameField_errMsg")
   	private WebElement EmptyaAddressNameError;
    
    @FindBy(id = "street1Field_errMsg")
   	private WebElement EmptyStreet1Error;
    
    @FindBy(id = "street1Field")
   	private WebElement street1Field;
    
   

	@FindBy(xpath = "//*[@id=\"main\"]/div/div[3]/div/button")
   	private WebElement saveAddressButton;

    @FindBy(id = "nationalIdField")
   	private WebElement nationalIdField;
    
    @FindBy(id = "nationalIdField_errMsg")
   	private WebElement nationalIdFielderrMsg;
    
    @FindBy(id = "box")
   	private WebElement defaultAddresslabel;
    
    @FindBy(id = "citiesSelector")
   	private WebElement citiesSelector;
    
    

  //=======================================================================
    
    public WebElement getCitiesSelector() {
		return citiesSelector;
	}

	public WebElement getDefaultAddresslabel() {
		return defaultAddresslabel;
	}

	public WebElement getNationalIdField() {
		return nationalIdField;
	}

    public WebElement getAddressNameField() {
		return addressNameField;
	}

	public WebElement getStreet1Field() {
		return street1Field;
	}
	public WebElement getNationalIdFielderrMsg() {
		return nationalIdFielderrMsg;
	}

	public WebElement getFirstnameField() {
		return firstnameField;
	}

	public WebElement getLastnameField() {
		return lastnameField;
	}
    
	public WebElement getAddNewAddressLink() {
		return addNewAddressLink;
	}

	public WebElement getEmptyFirstNameerrMsg() {
		return emptyFirstNameerrMsg;
	}

	public WebElement getEmptylastnamEerror() {
		return emptylastnamEerror;
	}

	public WebElement getEmptytelephoneerror() {
		return Emptytelephoneerror;
	}

	public WebElement getEmptyaAddressNameError() {
		return EmptyaAddressNameError;
	}

	public WebElement getEmptyStreet1Error() {
		return EmptyStreet1Error;
	}

	public WebElement getSaveAddressButton() {
		return saveAddressButton;
	}

	  public WebElement getPhoneNumberField() {
			return phoneNumberField;
		}
  
}