package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cases.BaseTest;

//import com.sporter.testing.cases.BaseTest;

public class HomePage extends BasePage {

	public final static String URL = "http://www.sporter.com/en-sa";
	
    public WebElement getRedirection() {
		return redirection;
	}

	public HomePage() {
		
    	super(URL);
    	PageFactory.initElements(BaseTest.driver, this);
    }
	
	@FindBy(id = "userIcon_icon__br74m")
	private WebElement myAccountIcon;

	@FindBy(xpath = "//span[contains(.,'Sign In')]")
	private WebElement signInButton;
	
	@FindBy(id = "downArrow")
	private WebElement switchLangLink;
	
	//@FindBy(linkText = "United Arab Emirates")	
	@FindBy(xpath = "//li[1]/a/span[2]")
	private WebElement uaeStoreLink;
	
	@FindBy(xpath = "//li[3]/a/span[2]")	
	private WebElement switchTOksaStore;
	
	@FindBy(xpath = "//li[8]/a/span[2]")	
	private WebElement switchTOQatarStore;
	
	
	@FindBy(xpath = "//li[6]/a/span[2]")	
	private WebElement switchTOKuwaitStore;
	
	@FindBy(xpath = "//li[4]/a/span[2]")	
	private WebElement switchTOBahrainStore;
	
	@FindBy(xpath = "//li[5]/a/span[2]")	
	private WebElement switchTOJordanStore;
	
	@FindBy(xpath = "//li[7]/a/span[2]")	
	private WebElement switchTOOmanStore;
	

	@FindBy(xpath = "//li[2]/a/span[2]")	
	private WebElement switchTOEgyptStore;
	


	@FindBy(xpath = "//*[@id=\"switcher-store-trigger\"]/a/strong/span[1]")	
	private WebElement uaeswitchStore;
	
	@FindBy(xpath = "/html/body/div[2]/footer/div[2]/div[7]/ul/li[6]/a")
	private WebElement uaeFooter;
	
	@FindBy(xpath = "//*[@id=\"amasty-shopby-product-list\"]/div")
	private WebElement emptycategorymsg;
	
	@FindBy(id = "LangSelector")
	private WebElement switchTheLanguage;
	@FindBy(id = "crouselContainer")
	private WebElement mainSlider;
	@FindBy(id = "crousel_link1")
	private WebElement sideBanner1;
	
	@FindBy(id = "crousel_link2")
	private WebElement sideBanner2;
	
	
	@FindBy(id = "swiperSlideLink_0")
	private WebElement firstImageinMainBanner;
	
	@FindBy(id = "swiperSlideLink_1")
	private WebElement secondImageinMainBanner;
	@FindBy(id = "AdvertiseContainerfirst")
	private WebElement topBannerHomepage;
	@FindBy(id = "ShopByCategoryContainer")
	private WebElement shopByCategoryBlock;
	@FindBy(id = "ShopByCategoryTitle")
	private WebElement shopByCategoryTitle;
	@FindBy(id = "ShopByCategoryItemBtn0")
	private WebElement ShopByCategoryFirsItemtBtn;
	@FindBy(id = "ShopByCategoryItemBtn1")
	private WebElement ShopByCategorysecondItemBtn;
	@FindBy(id = "ShopByCategoryItemBtn2")
	private WebElement ShopByCategory3dItemBtn;
	@FindBy(id = "ShopByCategoryItemBtn3")
	private WebElement ShopByCategory4thItemBtn;
	@FindBy(id = "ShopByCategoryItemImgContainer0")
	private WebElement ShopByCategoryItemfirstImg;
	
	@FindBy(id = "ShopByCategoryItemImgContainer1")
	private WebElement ShopByCategorysecondItemImg;
	@FindBy(id = "ShopByCategoryItemImgContainer2")
	private WebElement ShopByCategory3dItemImg;
	@FindBy(id = "ShopByCategoryItemImgContainer3")
	private WebElement ShopByCategory4thItemImg;
	
	@FindBy(id = "SloderNavigationNext")
	private WebElement nxtBtnMainslider;
	
	@FindBy(id = "AdvertiseLink0second")
	private WebElement firstImageBanner3Images;
	
	@FindBy(id = "AdvertiseLink1second")
	private WebElement secondImageBanner3Images;
	
	@FindBy(id = "AdvertiseLink2second")
	private WebElement lastImageBanner3Images;
	
	@FindBy(id = "CategoryProductsTitle_mostSelling")
	private WebElement CategoryProductsTitle_TopSellingStack;
	
	@FindBy(id = "CategoryProducts_mostSelling")
	private WebElement CategoryProducts_TopSellingStackBlock;
	
	
	@FindBy(id = "OptionsContainerOptions_allmostSelling")
	private WebElement allLinkInTopSellingstack;
	
	@FindBy(id = "CategoryProductsTitle_topSeller")
	private WebElement Title_topSellerHomepage;
	
	@FindBy(id = "OptionsContainerOptions_alltopSeller")
	private WebElement All_TopSellerHomepage;
	
	@FindBy(id = "OptionsContainerOptions_0topSeller")
	private WebElement supplement_TopSellerHomepage;

	@FindBy(id = "OptionsContainerOptions_1topSeller")
	private WebElement healthyfood_TopSellerHomepage;
	
	@FindBy(id = "OptionsContainerOptions_1topSeller")
	private WebElement sportwear_TopSellerHomepage;
	
	@FindBy(xpath = "//*[@id=\"crouselContainer\"]/div/div[2]/span[1]")
	private WebElement firstofferClickMainBanner;
	
	@FindBy(xpath  = "//*[@id=\"crouselContainer\"]/div/div[2]/span[2]")
	private WebElement secondofferClickMainBanner;
	
	@FindBy(id  = "CategoryProducts_topSeller")
	private WebElement topSellerBlock;
	
	
	@FindBy(id  = "Trendscontainer_title")
	private WebElement trendingSporterTitle;
	
	@FindBy(id  = "TrendItemImg_0")
	private WebElement trending1;
	
	@FindBy(id  = "TrendItemImg_1")
	private WebElement trending2;
	
	@FindBy(id  = "TrendItemImg_2")
	private WebElement trending3;
	
	@FindBy(id  = "TrendItemImg_3")
	private WebElement trending4;
	
	@FindBy(id  = "TrendItemImg_4")
	private WebElement trending5;
	
	@FindBy(id  = "TrendItemImg_5")
	private WebElement trending6;
	


	@FindBy(id  = "TrendItemImg_6")
	private WebElement trending7;
	
	@FindBy(id  = "TrendItemImg_7")
	private WebElement trending8;
	
	@FindBy(id  = "TrendItemImg_8")
	private WebElement trending9;
	
	@FindBy(id  = "TrendItemImg_9")
	private WebElement trending10;
	
	
	@FindBy(id  = "CategoryProductsTitle_newArrival")
	private WebElement newArrivalTitle;
	
	@FindBy(id  = "CategoryProducts_newArrival")
	private WebElement newArrivalBlock;
	
	@FindBy(id  = "OptionsContainerOptions_allnewArrival")
	private WebElement allnewArrival;
	
	@FindBy(id  = "OptionsContainerOptions_0newArrival")
	private WebElement supplementnewArrival;
	
	@FindBy(id  = "OptionsContainerOptions_1newArrival")
	private WebElement healthynewArrival;
	
	@FindBy(id  = "OptionsContainerOptions_2newArrival")
	private WebElement sportwearnewArrival;
	
	
	@FindBy(id  = "ContactFormContainer")
	private WebElement contactFormHP;
	
	@FindBy(xpath = "//*[@id=\"ContactFormContainer\"]/div/div/ul/li[1]")
	private WebElement phoneButtonGotAQuastion;
	
	@FindBy(xpath = "//*[@id=\"ContactFormContainer\"]/div/div/ul/li[2]")
	private WebElement EmailButtonGotAQuastion;
	
	@FindBy(xpath = "//*[@id=\"badget_Container\"]/div/div")
	private WebElement badgetContainer;
	
	@FindBy(xpath = "//*[@id=\"badget_Container\"]/div/div/div/div[1]/div/div[1]")
	private WebElement onehandredSecurePayments;
	
	@FindBy(xpath = "//*[@id=\"badget_Container\"]/div/div/div/div[2]/div/div[1]")
	private WebElement AuthenticProducts;
	
	@FindBy(xpath = "//*[@id=\"badget_Container\"]/div/div/div/div[3]/div/div[1]")
	private WebElement FastDeliveryService;
	@FindBy(id  = "NewsLetter_container")
	private WebElement NewsLetterBlock;
	@FindBy(id  = "newsLetterLabel")
	private WebElement NewsLettertext;
	
	@FindBy(id  = "email_input__9VPng")
	private WebElement NewsLetterEmail;
	
	@FindBy(id  = "subscribeBtn")
	private WebElement NewsLetterJOINBtn;
	
	@FindBy(xpath = "//*[@id=\"email_inputContainer__CjQht\"]/div")
	private WebElement NewsLetterValidationmessage;
	
	@FindBy(id  = "closeAddToCartErrBtn")
	private WebElement AlreaySubscSubmitBtn;
	@FindBy(xpath  = "(//span[@id='TrendItemSpanundefined'])[6]")
	private WebElement trendingONsporterGaming_Focus;
	
	@FindBy(xpath  = "(//span[@id='TrendItemSpanundefined'])[7]")
	private WebElement trendingONsporter_The_Back;
	
	@FindBy(id  = "trends_imgContainer__QB93B Natures Way")
	private WebElement trendingONsporter_Natures_Way;
	
	@FindBy(id  = "trends_imgContainer__QB93BOwala")
	private WebElement trendingONsporter_Owala;
	
	@FindBy(id  = "trends_imgContainer__QB93BSexual Health")
	private WebElement trendingONsporter_Sexual_Health;
	
	@FindBy(id  = "LogoContainer")
	private WebElement logoSporter;
	
	@FindBy(xpath =  "//*[@id=\"__next\"]/div[1]/div/div[1]/button")
	private WebElement redirection;
	
	
	//=======================================================================
	
	public WebElement getLogoSporter() {
		return logoSporter;
	}

	public WebElement getTrendingONsporterGaming_Focus() {
		return trendingONsporterGaming_Focus;
	}

	public WebElement getTrendingONsporter_The_Back() {
		return trendingONsporter_The_Back;
	}

	public WebElement getTrendingONsporter_Natures_Way() {
		return trendingONsporter_Natures_Way;
	}

	public WebElement getTrendingONsporter_Owala() {
		return trendingONsporter_Owala;
	}

	public WebElement getTrendingONsporter_Sexual_Health() {
		return trendingONsporter_Sexual_Health;
	}

	public WebElement getAlreaySubscSubmitBtn() {
		return AlreaySubscSubmitBtn;
	}

	public WebElement getNewsLetterValidationmessage() {
		return NewsLetterValidationmessage;
	}

	public WebElement getNewsLetterJOINBtn() {
		return NewsLetterJOINBtn;
	}

	public WebElement getNewsLetterEmail() {
		return NewsLetterEmail;
	}

	public WebElement getNewsLetterBlock() {
		return NewsLetterBlock;
	}

	public WebElement getNewsLettertext() {
		return NewsLettertext;
	}

	public WebElement getAuthenticProducts() {
		return AuthenticProducts;
	}

	public WebElement getFastDeliveryService() {
		return FastDeliveryService;
	}

	public WebElement getBadgetContainer() {
		return badgetContainer;
	}

	public WebElement getOnehandredSecurePayments() {
		return onehandredSecurePayments;
	}

	public WebElement getPhoneButtonGotAQuastion() {
		return phoneButtonGotAQuastion;
	}

	public WebElement getEmailButtonGotAQuastion() {
		return EmailButtonGotAQuastion;
	}

	public WebElement getContactFormHP() {
		return contactFormHP;
	}

	public WebElement getNewArrivalTitle() {
		return newArrivalTitle;
	}

	public WebElement getNewArrivalBlock() {
		return newArrivalBlock;
	}

	public WebElement getAllnewArrival() {
		return allnewArrival;
	}

	public WebElement getSupplementnewArrival() {
		return supplementnewArrival;
	}

	public WebElement getHealthynewArrival() {
		return healthynewArrival;
	}

	public WebElement getSportwearnewArrival() {
		return sportwearnewArrival;
	}

	
	
	
	public WebElement getTrending9() {
		return trending9;
	}

	public WebElement getTrending10() {
		return trending10;
	}
	
	
	public WebElement getTrending1() {
		return trending1;
	}

	public WebElement getTrending2() {
		return trending2;
	}

	public WebElement getTrending3() {
		return trending3;
	}

	public WebElement getTrending4() {
		return trending4;
	}

	public WebElement getTrending5() {
		return trending5;
	}

	public WebElement getTrending6() {
		return trending6;
	}

	public WebElement getTrending7() {
		return trending7;
	}

	public WebElement getTrending8() {
		return trending8;
	}
	public WebElement getTrendingSporterTitle() {
		return trendingSporterTitle;
	}

	public WebElement getTopSellerBlock() {
		return topSellerBlock;
	}

	public WebElement getFirstofferClickMainBanner() {
		return firstofferClickMainBanner;
	}

	public WebElement getSecondofferClickMainBanner() {
		return secondofferClickMainBanner;
	}

	public WebElement getTitle_topSellerHomepage() {
		return Title_topSellerHomepage;
	}

	public WebElement getAll_TopSellerHomepage() {
		return All_TopSellerHomepage;
	}

	public WebElement getSupplement_TopSellerHomepage() {
		return supplement_TopSellerHomepage;
	}

	public WebElement getHealthyfood_TopSellerHomepage() {
		return healthyfood_TopSellerHomepage;
	}

	public WebElement getSportwear_TopSellerHomepage() {
		return sportwear_TopSellerHomepage;
	}
	public WebElement getCategoryProductsTitle_TopSellingStack() {
		return CategoryProductsTitle_TopSellingStack;
	}

	public WebElement getCategoryProducts_TopSellingStackBlock() {
		return CategoryProducts_TopSellingStackBlock;
	}

	public WebElement getAllLinkInTopSellingstack() {
		return allLinkInTopSellingstack;
	}

	public WebElement getFirstImageBanner3Images() {
		return firstImageBanner3Images;
	}

	public WebElement getSecondImageBanner3Images() {
		return secondImageBanner3Images;
	}

	public WebElement getLastImageBanner3Images() {
		return lastImageBanner3Images;
	}

	public WebElement getNxtBtnMainslider() {
		return nxtBtnMainslider;
	}

	public WebElement getShopByCategoryFirsItemtBtn() {
		return ShopByCategoryFirsItemtBtn;
	}

	public WebElement getShopByCategorysecondItemBtn() {
		return ShopByCategorysecondItemBtn;
	}

	public WebElement getShopByCategory3dItemBtn() {
		return ShopByCategory3dItemBtn;
	}

	public WebElement getShopByCategory4thItemBtn() {
		return ShopByCategory4thItemBtn;
	}

	public WebElement getShopByCategoryItemfirstImg() {
		return ShopByCategoryItemfirstImg;
	}

	public WebElement getShopByCategorysecondItemImg() {
		return ShopByCategorysecondItemImg;
	}

	public WebElement getShopByCategory3dItemImg() {
		return ShopByCategory3dItemImg;
	}

	public WebElement getShopByCategory4thItemImg() {
		return ShopByCategory4thItemImg;
	}

	public WebElement getTopBannerHomepage() {
		return topBannerHomepage;
	}

	public WebElement getShopByCategoryBlock() {
		return shopByCategoryBlock;
	}

	public WebElement getShopByCategoryTitle() {
		return shopByCategoryTitle;
	}

	public WebElement getFirstImageinMainBanner() {
		return firstImageinMainBanner;
	}

	public WebElement getSecondImageinMainBanner() {
		return secondImageinMainBanner;
	}

	public WebElement getMainSlider() {
		return mainSlider;
	}

	public WebElement getSideBanner1() {
		return sideBanner1;
	}

	public WebElement getSideBanner2() {
		return sideBanner2;
	}

	public WebElement getSwitchTheLanguage() {
		return switchTheLanguage;
	}

	public WebElement getEmptycategorymsg() {
		return emptycategorymsg;
	}
	
	public WebElement getSwitchTOEgyptStore() {
		return switchTOEgyptStore;
	}

   
	public WebElement getSwitchTOJordanStore() {
		return switchTOJordanStore;
	}
	
	public WebElement getSwitchTOBahrainStore() {
		return switchTOBahrainStore;
	}
	public WebElement getSwitchTOOmanStore() {
		return switchTOOmanStore;
	}
	
	public String getUrl() {
		return URL;
	}

	public WebElement getUaeStoreLink() {
		return uaeStoreLink;
	}
	
	public WebElement getswitchTOQatarStore() {
		return switchTOQatarStore;
	}

	public WebElement getswitchTOKuwaitStore() {
		return switchTOKuwaitStore;
	}
	public WebElement getswitchTOksaStore() {
		return switchTOksaStore;
	}
	public WebElement getUaeswitchStore() {
		return uaeswitchStore;
	}
	
	

	public final WebElement getMyAccountIcon() {
		return myAccountIcon;
	}

	public final WebElement getSignInButton() {
		return signInButton;
	}

	public WebElement getSwitchLangLink() {
		return switchLangLink;
	}
	
	public WebElement getKsaStoreLink() {
		return uaeStoreLink;
	}
	
	public WebElement getuaeFooter() {
		return uaeFooter;
	}

}