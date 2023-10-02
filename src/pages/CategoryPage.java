package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cases.BaseTest;

//import com.sporter.testing.cases.BaseTest;

public class CategoryPage extends BasePage {
	
	public final static String URL = "https://www.sporter.com/en-ae/healthy-food/";
	
    public CategoryPage() {
		
    	super(URL);
    	PageFactory.initElements(BaseTest.driver, this);
    }
    
	@FindBy(xpath = "/html/body/div[2]/main/div[5]/div[1]/div[2]/div[2]/ol/li[1]/div/a")
	private WebElement firstItem;
	
	@FindBy(xpath = "//*[@id=\"nav\"]/ul/li[1]/a/span")
	private WebElement mainCategory;
	
	
	
	//------------------------------------------------------------------------
	public WebElement getFirstItem() {
		return firstItem;
	}
	public WebElement getMainCategory() {
		return mainCategory;
	}
	
	}
