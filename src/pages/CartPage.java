package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cases.BaseTest;

//import com.sporter.testing.cases.BaseTest;

public class CartPage extends BasePage {

	public final static String URL = "https://www.sporter.com/en-sa/cart/";

	public CartPage() {

		super(URL);
		PageFactory.initElements(BaseTest.driver, this);
	}

	@FindBy(id = "removeItemBtn")
	
	private WebElement itemRemoveLink;

	@FindBy(id = "viewCartBtn") // view cart popup
	private WebElement viewCartPopupButton;

	@FindBy(id = "keepShoppingBtn") // view cart popup- keep shopping button
	private WebElement keepShoppingbutton;
	
	@FindBy(id = "increaseQtyBtn")
	private WebElement increaseQtybutton;
	
	@FindBy(id = "AddToCartErrContainer")
	private WebElement errorPopup;
	
	

	@FindBy(id = "toCheckObtn")
	private WebElement proceedTOCheckout;

	 @FindBy(xpath = "//a[@class='action viewcart']/span")
	    private WebElement viewCart;
	 
	 @FindBy(xpath = "//div[text()='The requested qty is not available']")
	    private WebElement qtyUnavailableMsgInCartPage;
	 
	 @FindBy(id = "cartItemQty")
	    private WebElement qtyBox;
	 
	 @FindBy(id = "decreaseQtyBtn")
	    private WebElement decreaseQty;
	 
	 
	 
	 @FindBy(id = "cartItemPrice")
	    private WebElement PriceField;
	 
	 @FindBy(xpath = "//*[@id=\"cartItemscontainerControllers\"]/div[2]")
	    private WebElement QTYField;
	 
	 @FindBy(xpath = "//*[@id=\"cartItemscontainerControllers\"]/div[3]")
	    private WebElement TotalField;
	 
	 @FindBy(xpath  = "//div[@id='cartTotal']//span[@class='cartTotal_label__RxIvh'][normalize-space()='Subtotal']")
	    private WebElement SubTotalField;
	 @FindBy(id = "subTotalValue")
	    private WebElement SubTotalValue;
	 
	
	 @FindBy(xpath = "//*[@id=\"shopping-cart-table\"]/tbody[1]/tr/td[1]/div/a/span[2]")
	    private WebElement removeItemNotLogged;
	 
	 @FindBy(xpath = "//*[@id=\"cartPageContainer\"]/div[1]")
	    private WebElement NoItemINCartTxt;
	 
	 @FindBy(xpath = "//h2[normalize-space()='Thumbs Up']")
	    private WebElement ThumbsUpText;
	 
	
	
	public WebElement getThumbsUpText() {
		return ThumbsUpText;
	}
	public WebElement getNoItemINCartTxt() {
		return NoItemINCartTxt;
	}
	public WebElement getRemoveItemNotLogged() {
		return removeItemNotLogged;
	}

	@FindBy(xpath = "//*[@id=\"radioButton_container__il26_ cartInfo_option__krxQO sporter_cashondelivery\"]/span")
	    private WebElement CODFieldInCartPage;
	 
	 @FindBy(xpath = "//*[@id=\"radioButton_container__il26_ cartInfo_option__krxQO checkoutcom_card_payment\"]/span")
	    private WebElement CCFieldInCartPage;
	 
	 @FindBy(css = ".cartInfo_orderTotalLabel__WF4eR")
	    private WebElement OrderTotalField;
	 
	 @FindBy(xpath = "//*[@id=\"toCheckoutContainer\"]/div/div[2]/span[1]")
	    private WebElement ExpectedDeliveryFieldInCart;
	 
	 @FindBy(xpath = "//*[@id=\"discountCode\"]/div[1]")
	    private WebElement DoYouHaveCoupon;
	 
	 @FindBy(xpath = "//span[normalize-space()='100% Genuine Products']")
	    private WebElement GenuienProductsTexInCart;
	
	 @FindBy(id = "couponField")
	    private WebElement CuponCodeBox;
	 
	 @FindBy(id = "applyCodeBtn")
	    private WebElement CuponCodeApplyBtn;
	 
	 @FindBy(id = "AddToCartErrMsg")
	    private WebElement CuponCodeErrorMsg;
	 
	 @FindBy(id = "couponecideErr")
	    private WebElement EmptyCuponCodeErrorMsg;
	 
	 @FindBy(css = "//dd[normalize-space()='Flavor: Icy Blue Razz']")
	    private WebElement ProductSizeTexInCart;
	 
	 @FindBy(xpath = ".cart:nth-child(3) dd:nth-child(4)")
	    private WebElement ProductFlavorTexInCart;
	 @FindBy(xpath = ".cart:nth-child(3) dd:nth-child(5)")
	    private WebElement ProductExpirydateTexInCart;
	
	 @FindBy(xpath = "//span[normalize-space()='100% Genuine Products']")
	    private WebElement Delivery2daysTexInCart;
	 
	 @FindBy(id = "orderTotalAmount")
	    private WebElement orderTotalAmount;
	 
	 @FindBy(id = "logo_link")
	    private WebElement SporterLogoBtn;
	 
	 @FindBy(xpath = "//a[normalize-space()='Shop By']")
	    private WebElement ShopByMenu;
	 
	 @FindBy(id = "cartItemsHeaderLabel")
	    private WebElement myShoppingCartText;
	 
	
	// =======================================================================

	 public WebElement getmyShoppingCartText() {
			return myShoppingCartText;
		}
	
	public WebElement getSubTotalvalue() {
			return SubTotalValue;
			
		}
	public WebElement getShopByMenu() {
		return ShopByMenu;
	}

	public WebElement getSporterLogoBtn() {
		return SporterLogoBtn;
	}
	public WebElement getErrorPopup() {
		return errorPopup;
	}
	public WebElement getorderTotalAmount() {
		return orderTotalAmount;
	}

	public WebElement getDelivery2daysTexInCart() {
		return Delivery2daysTexInCart;
	}

	public WebElement getProductSizeTexInCart() {
		return ProductSizeTexInCart;
	}

	public WebElement getProductFlavorTexInCart() {
		return ProductFlavorTexInCart;
	}

	public WebElement getProductExpirydateTexInCart() {
		return ProductExpirydateTexInCart;
	}

	public WebElement getEmptyCuponCodeErrorMsg() {
		return EmptyCuponCodeErrorMsg;
	}

	public WebElement getCuponCodeErrorMsg() {
		return CuponCodeErrorMsg;
	}

	public WebElement getCuponCodeApplyBtn() {
		return CuponCodeApplyBtn;
	}

	public WebElement getCuponCodeBox() {
		return CuponCodeBox;
	}

	public WebElement getGenuienProductsTexInCart() {
		return GenuienProductsTexInCart;
	}

	public WebElement getDoYouHaveCoupon() {
		return DoYouHaveCoupon;
	}

	public WebElement getExpectedDeliveryFieldInCart() {
		return ExpectedDeliveryFieldInCart;
	}

	public WebElement getOrderTotalField() {
		return OrderTotalField;
	}

	public WebElement getCCFieldInCartPage() {
		return CCFieldInCartPage;
	}

	public WebElement getCODFieldInCartPage() {
		return CODFieldInCartPage;
	}

	public WebElement getSubTotalField() {
		return SubTotalField;
	}

	public WebElement getTotalField() {
		return TotalField;
	}

	public WebElement getPriceField() {
		return PriceField;
	}

	public WebElement getQTYField() {
		return QTYField;
	}

	

	

	public WebElement getDecreaseQty() {
		return decreaseQty;
	}

	public void setProceedTOCheckout(WebElement proceedTOCheckout) {
		this.proceedTOCheckout = proceedTOCheckout;
	}

	public WebElement getQtyBox() {
		return qtyBox;
	}

	public void setQtyBox(WebElement qtyBox) {
		this.qtyBox = qtyBox;
	}

	public void setItemRemoveLink(WebElement itemRemoveLink) {
		this.itemRemoveLink = itemRemoveLink;
	}

	public void setViewCartPopupButton(WebElement viewCartPopupButton) {
		this.viewCartPopupButton = viewCartPopupButton;
	}

	public void setKeepShoppingbutton(WebElement keepShoppingbutton) {
		this.keepShoppingbutton = keepShoppingbutton;
	}

	public void setIncreaseQtybutton(WebElement increaseQtybutton) {
		this.increaseQtybutton = increaseQtybutton;
	}

	public WebElement getIncreaseQtybutton() {
		return increaseQtybutton;
	}

	public WebElement getViewCartPopupButton() {
		return viewCartPopupButton;
	}

	public WebElement getItemRemoveLink() {
		return itemRemoveLink;
	}

	public WebElement getKeepShoppingbutton() {
		return keepShoppingbutton;
	}
	public WebElement getProceedTOCheckout() {
		return proceedTOCheckout;
	}
	
	public WebElement getviewCart() {
		return viewCart;
	}

	public WebElement getqtyUnavailableMsgInCartPage() {
		return qtyUnavailableMsgInCartPage;
	}


	}

