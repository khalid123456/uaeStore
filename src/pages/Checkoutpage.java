package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cases.BaseTest;

//import com.sporter.testing.cases.BaseTest;

public class Checkoutpage extends BasePage {

	public final static String URL = "https://www.sporter.com/en-ae/checkout";

	public Checkoutpage() {

		super(URL);
		PageFactory.initElements(BaseTest.driver, this);
	}


@FindBy(id = "shipping")
private WebElement ShippingInfoLink;

public WebElement getPlaceOrderButton() {
	return placeOrderButton;
}


public void setPlaceOrderButton(WebElement placeOrderButton) {
	this.placeOrderButton = placeOrderButton;
}


@FindBy(id = "submitShippingAddressBtn")
private WebElement continuButtonShippingINFO;

@FindBy(id = "flatrate")
private WebElement shippingMethodEgy;



@FindBy(id = "submitShippingMethodBtn")
private WebElement continuShippingMethod;

@FindBy(id = "flatrate")
private WebElement shippingMethodqatar;

@FindBy(id = "ksadoortodoor")
private WebElement shippingMethodUae;

@FindBy(id = "ksadoortodoor")
private WebElement shippingMethodKSA;





@FindBy(id = "bestway")
private WebElement shippingMethodJordan;



public WebElement getShippingMethodqatar() {
	return shippingMethodqatar;
}


public void setShippingMethodKuwait(WebElement shippingMethodJordan) {
	this.shippingMethodJordan = shippingMethodJordan;
}


@FindBy(id = "phoenix_cashondelivery")
private WebElement cod;

@FindBy(id = "submitPaymentMethodBtn")
private WebElement continuepaymentMethod;

@FindBy(id = "placeOrderBtn")
private WebElement placeOrderButton;

@FindBy(id = "ksadoortodoor")
private WebElement ksaD2DShippingmethod;


@FindBy(id = "submitShippingMethodBtn")
private WebElement ContinueshippingmethodKsa;

@FindBy(id = "checkoutcom_card_payment")
private WebElement creditcardOption;

@FindBy(xpath = "//*[@id=\"singleIframe\"]")
private WebElement creditframe;


@FindBy(id = "circle")
private WebElement uaeshippingmethod;

@FindBy(id = "bestway")
private WebElement jorShippingMethod;

//
//  

//=======================================================================


public WebElement getShippingMethodKSA() {
	return shippingMethodKSA;
}
public WebElement getShippingMethodUae() {
	return shippingMethodUae;
}
public WebElement getJorShippingMethod() {
	return jorShippingMethod;
}


public WebElement getShippingMethodEgy() {
	return shippingMethodEgy;
}

public WebElement getShippingMethodJordan() {
	return shippingMethodJordan;
}

public WebElement getUaeshippingmethod() {
	return uaeshippingmethod;
}


public WebElement getCreditframe() {
	return creditframe;
}


public void setCreditframe(WebElement creditframe) {
	this.creditframe = creditframe;
}


public WebElement getContinueshippingmethodKsa() {
	return ContinueshippingmethodKsa;
}
public void setContinueshippingmethodKsa(WebElement continueshippingmethodKsa) {
	ContinueshippingmethodKsa = continueshippingmethodKsa;
}


public WebElement getKsaD2DShippingmethod() {
	return ksaD2DShippingmethod;
}


public void setKsaD2DShippingmethod(WebElement ksaD2DShippingmethod) {
	this.ksaD2DShippingmethod = ksaD2DShippingmethod;
}


public WebElement getCod() {
	return cod;
}


public void setCod(WebElement cod) {
	this.cod = cod;
}


public WebElement getContinuepaymentMethod() {
	return continuepaymentMethod;
}


public void setContinuepaymentMethod(WebElement continuepaymentMethod) {
	this.continuepaymentMethod = continuepaymentMethod;
}


public WebElement getContinuShippingMethod() {
	return continuShippingMethod;
}


public void setContinuShippingMethod(WebElement continuShippingMethod) {
	this.continuShippingMethod = continuShippingMethod;
}


public void setShippingInfoLink(WebElement shippingInfoLink) {
	ShippingInfoLink = shippingInfoLink;
}


public void setContinuButtonShippingINFO(WebElement continuButtonShippingINFO) {
	this.continuButtonShippingINFO = continuButtonShippingINFO;
}



public WebElement getShippingInfoLink() {
	return ShippingInfoLink;
}


public WebElement getContinuButtonShippingINFO() {
	return continuButtonShippingINFO;
}


public WebElement getCreditcardOption() {
	return creditcardOption;
}


public void setCreditcardOption(WebElement creditcardOption) {
	this.creditcardOption = creditcardOption;
}



}

	
