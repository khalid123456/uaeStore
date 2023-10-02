package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cases.BaseTest;

//import com.sporter.testing.cases.BaseTest;

public class ProductPage extends BasePage {
	
	//public final static String URL = "https://www.sporter.com/en-jo/sport-supplements//bpi-iso-hd-12020/";
	public final static String URL = "https://www.sporter.com/en-sa/dymatize-iso-100-7165/";
	
	
    public ProductPage() {
		
    	super(URL);
    	PageFactory.initElements(BaseTest.driver, this);
    }
	
    @FindBy(id = "addToCartBtn")
	private WebElement addToCartButton;

    @FindBy(id = "//*[@id=\"error-block\"]/div[2]/button")
   	private WebElement errorPopupCloseButton;
    
    @FindBy(id = "bundleOptionSelect_510")
   	private WebElement BundleOption;
  
    @FindBy(xpath = "//p[normalize-space()='The requested qty is not available']")
   	private WebElement QtyNotAvailableMsg;
    
    @FindBy(id = "increaseQty")
    private WebElement PlusQTYButton;
    
    @FindBy(id = "qty")
    private WebElement QTYBox;
    
    @FindBy(id = "productQty")
    private WebElement QTYBoxProductPage;
    
    
 
	@FindBy(id = "decreaseQty")
    private WebElement MinusQTYButton;
  
    @FindBy(xpath = "//div[@id='bestBefore']/span")
    private WebElement bestBeforeTxt;
    
    @FindBy(xpath = "//span[contains(.,\'Expected delivery date :\')]")
    private WebElement eXpectedDeliverydate;
    
    @FindBy(id = "ProductDescription")
    private WebElement aboutThisitem;
    
    @FindBy(id = "ProductSupplementFacts")
    private WebElement supplementFacts;
    
    @FindBy(id = "ProductBrandName")
    private WebElement aboutThisBrand;
    
    @FindBy(id = "ProductBrandImg")
    private WebElement brandIcon;
    
    @FindBy(xpath = "//h3[normalize-space()='Ratings & Reviews']")
    private WebElement ratingReviewTitle;
    
    @FindBy(xpath = "//h3[normalize-space()='Top review']//h3[normalize-space()='Top review']")
    private WebElement topReview;
    
    @FindBy(id = "productUserReviewsPagination")
    private WebElement tollBarNOOFReview;
    
    @FindBy(xpath = "//*[@id=\"productUserReviewsPagination\"]/ul/li[9]/svg")
    private WebElement nextpageButtonpagination;
    
    @FindBy(id = "oldPrice")
    private WebElement OGSWPrice;
    
    @FindBy(xpath = "//span[@id='option-label-size-165']")
    private WebElement avialableINSize;

    @FindBy(xpath = "//*[@id=\"NavContainer\"]/div[3]/div/div/form/input")
                  
    private WebElement searchBox;
    
    @FindBy(xpath = "SearchButton")
    private WebElement searchButton;
    
    
    @FindBy(xpath = "//h3[@class='page-title search-query']")
    private WebElement searchResultsTitle;
    

    
    public WebElement getSearchResultsTitle() {
		return searchResultsTitle;
	}
	public WebElement getSearchButton() {
		return searchButton;
	}
	public WebElement getSearchBox() {
		return searchBox;
	}
	public WebElement getAvialableINSize() {
		return avialableINSize;
	}
	public WebElement getOGSWPrice() {
		return OGSWPrice;
	}
	public WebElement getNextpageButtonpagination() {
		return nextpageButtonpagination;
	}
	public WebElement getTollBarNOOFReview() {
		return tollBarNOOFReview;
	}
	public WebElement getTopReview() {
		return topReview;
	}
	public WebElement getRatingReviewTitle() {
		return ratingReviewTitle;
	}
	public WebElement getBrandIcon() {
		return brandIcon;
	}
	public WebElement getAboutThisBrand() {
		return aboutThisBrand;
	}
	public WebElement getSupplementFacts() {
		return supplementFacts;
	}
	public WebElement getAboutThisitem() {
		return aboutThisitem;
	}
	public WebElement geteXpectedDeliverydate() {
		return eXpectedDeliverydate;
	}
	//---------------------------------------
	public WebElement getBestBeforeTxt() {
		return bestBeforeTxt;
	}
	public WebElement getMinusQTYButton() {
		return MinusQTYButton;
	}
	public WebElement getQTYBox() {
		return QTYBox;
	}
	public WebElement getPlusQTYButton() {
		return PlusQTYButton;
	}
	public WebElement getBundleOption() {
		return BundleOption;
	}
	public WebElement getQtyNotAvailableMsg() {
		return QtyNotAvailableMsg;
	}
	
	   public WebElement getQTYBoxProductPage() {
			return QTYBoxProductPage;
		}

	//=======================================================================
    public WebElement getAddToCartButton() {
		return addToCartButton;
	}
    public WebElement getErrorPopupCloseButton() {
		return errorPopupCloseButton;
	}
}