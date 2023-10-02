package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cases.BaseTest;

//import com.sporter.testing.cases.BaseTest;

public class RegistraionPage extends BasePage {
	
    public RegistraionPage() {
		
    	super();
    	PageFactory.initElements(BaseTest.driver, this);
    }

	@FindBy(id = "emailInput")
	private WebElement emailField;
	
	@FindBy(id = "passwordInput")
	private WebElement passwordField;
	
	@FindBy(id = "submitdBtn")
	private WebElement signInButton;
	@FindBy(id = "signupBtn")
	private WebElement regBtn;
	
	@FindBy(id = "email_input")
	private WebElement emailFieldReg;
	
	@FindBy(id = "password_input")
	private WebElement passlFieldReg;
	@FindBy(id = "confirm_password_input")
	private WebElement confirmPasslFieldReg;
	@FindBy(id = "submitBtn")
	private WebElement regSubmitBtn;
	@FindBy(id = "firstNameInput")
	private WebElement firstNameReg;
	@FindBy(id = "lastNameInput")
	private WebElement lasttNameReg;
	@FindBy(id = "submitSecondForm")
	private WebElement subSecondReg;
	@FindBy(xpath  = "//button[@id='myAccountBtn']//span[contains(text(),'My Account')]")
	private WebElement myaccountLink;
	
	@FindBy(id  = "email_input_errMsg")
	private WebElement emailInputErrMsg;
	
	@FindBy(id  = "password_input_errMsg")
	private WebElement passwordlInputErrMsg;
	
	@FindBy(id  = "confirm_password_input_errMsg")
	private WebElement confirmPasswordlInputErrMsg;
	//=======================================================================

	public WebElement getPasswordlInputErrMsg() {
		return passwordlInputErrMsg;
	}

	public WebElement getConfirmPasswordlInputErrMsg() {
		return confirmPasswordlInputErrMsg;
	}

	public WebElement getEmailInputErrMsg() {
		return emailInputErrMsg;
	}

	public WebElement getMyaccountLink() {
		return myaccountLink;
	}

	public WebElement getSubSecondReg() {
		return subSecondReg;
	}

	public WebElement getFirstNameReg() {
		return firstNameReg;
	}

	public WebElement getLasttNameReg() {
		return lasttNameReg;
	}

	public WebElement getRegSubmitBtn() {
		return regSubmitBtn;
	}

	public WebElement getEmailFieldReg() {
		return emailFieldReg;
	}

	public WebElement getPasslFieldReg() {
		return passlFieldReg;
	}

	public WebElement getConfirmPasslFieldReg() {
		return confirmPasslFieldReg;
	}

	public WebElement getRegBtn() {
		return regBtn;
	}

	public WebElement getEmailField() {
		return emailField;
	}
	
	public WebElement getPasswordField() {
		return passwordField;
	}

	public WebElement getSignInButton() {
		return signInButton;
	}
	
}