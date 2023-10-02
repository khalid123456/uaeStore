package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cases.BaseTest;

//import com.sporter.testing.cases.BaseTest;

public class AdminPge extends BasePage {
	
	public final static String URL = "https:admin.sporter.com/admin/sales/order/index/key/0727b96777b807734c8a638150c4a241963e04f3e5c863ef0317cc2f54373de4/";
	
	
	
    public AdminPge() {
		
    	super(URL);
    	PageFactory.initElements(BaseTest.driver, this);
    }
    
    @FindBy(id = "username")
  	private WebElement username;
    
    @FindBy(id = "login")
  	private WebElement password;
    

	@FindBy(xpath = "//th[contains(text(),'Order Date')]")
	private WebElement OrderDate;
	
	@FindBy(xpath = "//th[normalize-space()='Order Status']")
	private WebElement OrderStatus;
	
	@FindBy(xpath = "//th[normalize-space()='Quote ID']")
	private WebElement QuoteID;
	@FindBy(xpath = "//th[normalize-space()='Is Mobile Order']")
	private WebElement IsMobileOrder;
	
	@FindBy(xpath = "//th[normalize-space()='Order Verified']")
	private WebElement OrderVerified;
	
	@FindBy(xpath  = "//th[normalize-space()='SAP Order Status']")
	private WebElement SAPOrderStatus;
	
	@FindBy(xpath = "//th[normalize-space()='Purchased From']")
	private WebElement PurchasedFrom;
	
	@FindBy(xpath = "//th[normalize-space()='Placed from IP']")
	private WebElement PlacedFromIP;
	
	@FindBy(xpath = "//*[@id=\"sales_order_view_tabs_order_info_content\"]/section[2]/div[1]/span")
	private WebElement addressInformation;
	
	@FindBy(xpath = "//span[@class='title'][normalize-space()='Billing Address']")
	private WebElement BillingAddress;
	
	@FindBy(xpath = "//span[@class='title'][normalize-space()='Shipping Address']")
	private WebElement shippingAddress;
	
	@FindBy(xpath = "//span[normalize-space()='Payment & Shipping Method']")
	private WebElement PaymentShippingMethod;
	
	@FindBy(xpath = "//span[normalize-space()='Payment Information']")
	private WebElement PaymentInformation;
	
	@FindBy(xpath = "//span[normalize-space()='Shipping & Handling Information']")
	private WebElement ShippingHandlingInformation;
	
	
	@FindBy(xpath = "//h3[normalize-space()='Forwarder']")
	private WebElement Forwarder;
	
	
	@FindBy(xpath = "//span[normalize-space()='Items Ordered']")
	private WebElement ItemsOrdered;
	
	@FindBy(xpath = "//span[@class='title'][normalize-space()='Order Total']")
	private WebElement OrderTotal;

	
	
	@FindBy(xpath = "//td[normalize-space()='Subtotal']")
	private WebElement Subtotal;
	
	@FindBy(xpath = "//td[normalize-space()='COD Fees and Shipping with handling']")
	private WebElement CODFeesandShippingwithhandling;
	
	@FindBy(xpath = "//td[normalize-space()='Cash on Delivery fee (Excl.Tax)']")
	private WebElement CashonDeliveryfee;
	
	@FindBy(xpath = "//strong[normalize-space()='Grand Total (Excl.Tax)']")
	private WebElement GrandTotalWithoutTax;
	
	@FindBy(xpath = "//div[@class='summary-collapse']")
	private WebElement tax;
	
	@FindBy(xpath = "//strong[normalize-space()='Grand Total (Incl.Tax)']")
	private WebElement GrandTotalincludeTax;
	
	@FindBy(xpath = "//strong[normalize-space()='Total Paid']")
	private WebElement TotalPaid;

	@FindBy(xpath = "//strong[normalize-space()='Total Refunded']")
	private WebElement TotalRefunded;
	
	@FindBy(xpath = "//strong[normalize-space()='Total Due']")
	private WebElement Total_Due;
	
	@FindBy(xpath = "//span[normalize-space()='Notes for this Order']")
	private WebElement noteOrder;
	
	@FindBy(xpath = "//label[@for='history_status']")
	private WebElement status;
	
	@FindBy(xpath = "//label[@for='history_comment']")
	private WebElement comment;
	
	@FindBy(xpath = "//label[@for='history_notify']")
	private WebElement historyNotify;
	
	@FindBy(xpath = "//span[normalize-space()='Submit Comment']")
	private WebElement SubmitComment;

	//======================================================================================================
	
	public WebElement getSubmitComment() {
		return SubmitComment;
	}
	
	public WebElement getNoteOrder() {
		return noteOrder;
	}

	public WebElement getStatus() {
		return status;
	}

	public WebElement getComment() {
		return comment;
	}

	public WebElement getHistoryNotify() {
		return historyNotify;
	}
	
	
	public WebElement getOrderDate() {
		return OrderDate;
	}

	public WebElement getOrderStatus() {
		return OrderStatus;
	}

	public WebElement getQuoteID() {
		return QuoteID;
	}

	public WebElement getIsMobileOrder() {
		return IsMobileOrder;
	}

	public WebElement getOrderVerified() {
		return OrderVerified;
	}

	public WebElement getSAPOrderStatus() {
		return SAPOrderStatus;
	}

	public WebElement getPurchasedFrom() {
		return PurchasedFrom;
	}

	public WebElement getPlacedFromIP() {
		return PlacedFromIP;
	}

	public WebElement getAddressInformation() {
		return addressInformation;
	}

	public WebElement getBillingAddress() {
		return BillingAddress;
	}
	
    public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}
	
	public WebElement getShippingAddress() {
		return shippingAddress;
	}

	public WebElement getPaymentShippingMethod() {
		return PaymentShippingMethod;
	}

	public WebElement getPaymentInformation() {
		return PaymentInformation;
	}

	public WebElement getShippingHandlingInformation() {
		return ShippingHandlingInformation;
	}
	
	public WebElement getForwarder() {
		return Forwarder;
	}

	public WebElement getItemsOrdered() {
		return ItemsOrdered;
	}

	public WebElement getOrderTotal() {
		return OrderTotal;
	}

	public WebElement getSubtotal() {
		return Subtotal;
	}

	public WebElement getCODFeesandShippingwithhandling() {
		return CODFeesandShippingwithhandling;
	}

	public WebElement getCashonDeliveryfee() {
		return CashonDeliveryfee;
	}

	public WebElement getGrandTotalWithoutTax() {
		return GrandTotalWithoutTax;
	}

	public WebElement getTax() {
		return tax;
	}

	public WebElement getTotalPaid() {
		return TotalPaid;
	}
	public WebElement getGrandTotalincludeTax() {
		return GrandTotalincludeTax;
	}

	public WebElement getTotalRefunded() {
		return TotalRefunded;
	}

	public WebElement getTotal_Due() {
		return Total_Due;
	}


}