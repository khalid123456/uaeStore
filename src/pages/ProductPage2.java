package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cases.BaseTest;

//import com.sporter.testing.cases.BaseTest;

public class ProductPage2 extends BasePage {
	
	public final static String URL = "https://www.sporter.com/en-sa/cellucor-c4-26162/";
	
	
	
    public ProductPage2() {
		
    	super(URL);
    	PageFactory.initElements(BaseTest.driver, this);
    }
	
    @FindBy(id = "addToCartBtn")
	private WebElement addToCartButton;

    @FindBy(id = "//*[@id=\"error-block\"]/div[2]/button")
   	private WebElement errorPopupCloseButton;
  
	

	//=======================================================================
    public WebElement getAddToCartButton() {
		return addToCartButton;
	}
    public WebElement getErrorPopupCloseButton() {
		return errorPopupCloseButton;
	}
}