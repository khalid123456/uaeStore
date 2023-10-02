package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cases.BaseTest;

//import com.sporter.testing.cases.BaseTest;

public class VitaminsPage extends BasePage {
	
	public final static String URL = "https://www.sporter.com/en-ae/health-vitamins/";
	
	
	
    public VitaminsPage() {
		
    	super(URL);
    	PageFactory.initElements(BaseTest.driver, this);
    }
    
    @FindBy(css = ".flex-control-nav > li:nth-child(2) > a")
  	private WebElement FirstBannerVitaminsSlider;
    
    @FindBy(css = "a:nth-child(1) .product-image")
  	private WebElement firstSideBannerVitaminsPage;
    
    @FindBy(css = "a:nth-child(2) .product-image")
  	private WebElement secondSideBannerVitaminsPage;
    
    @FindBy(xpath = "//h2[normalize-space()='Shop By Category']")
  	private WebElement ShopByCategorTitle;
    
    @FindBy(xpath = "//a[normalize-space()='Fish Oil & Omegas']")
  	private WebElement FishOilOmegas;
  
    @FindBy(xpath = "//a[@title='Multivitamins'][normalize-space()='Multivitamins']")
  	private WebElement Multivitamins;
  
    @FindBy(xpath = "//a[normalize-space()='Vitamins A-Z']")
  	private WebElement VitaminsA_Z;
    
    @FindBy(xpath = " //a[normalize-space()='Minerals']")
   	private WebElement Minerals;
    
    @FindBy(xpath = " //a[normalize-space()='Antioxidants']")
   	private WebElement Antioxidants;
  
    @FindBy(xpath = " //a[normalize-space()='Superfoods']")
   	private WebElement Superfoods;
    
  
    @FindBy(xpath = "//a[@title='Collagen'][normalize-space()='Collagen']")
   	private WebElement Collagen;
    
    @FindBy(xpath = "//a[normalize-space()='Melatonin']")
   	private WebElement Melatonin;
    
    @FindBy(xpath = "//h2[normalize-space()='Herbal Reference Guide']")
   	private WebElement herbaltitle;
  
    @FindBy(xpath = "//a[normalize-space()='Dandelion']")
   	private WebElement Dandelion;
    @FindBy(xpath = "//a[normalize-space()='Tumeric']")
   	private WebElement Tumeric;
    @FindBy(xpath = "//a[normalize-space()='Ginseng']")
   	private WebElement Ginseng;
    @FindBy(xpath = "//a[normalize-space()='Milk Thistle']")
   	private WebElement Milk_Thistle;
    @FindBy(xpath = "//a[normalize-space()='Alfalfa']")
   	private WebElement Alfalfa;
  
    @FindBy(xpath = "//h2[normalize-space()='Shop By Health Need']")
   	private WebElement ShopByHealth;
    
    @FindBy(xpath = "//a[normalize-space()='Heart Health']")
   	private WebElement HeartHealth;
    
    @FindBy(xpath = "//a[normalize-space()='Immunity Support']")
   	private WebElement ImmunitySupport;
    
    @FindBy(xpath = "//a[@href='/vitamins/multivitamins/multivitamins-for-kids/']")
   	private WebElement multivitaminsforkids;
    
    @FindBy(xpath = "//a[contains(text(),'Bone & Joint')]")
   	private WebElement Bonejoint;
    
    @FindBy(xpath = "//a[contains(text(),'Beauty')]")
   	private WebElement Beauty;
    
    @FindBy(xpath = "//div[@class='swiper-slide']//a[normalize-space()='Sexual Health']")
   	private WebElement SexualHealth;
  
    @FindBy(xpath = "//div[@class='swiper-slide']//div[@class='product-img']//a[@href='/vitamins/healthy-lifestyle/men-s-health/']")
   	private WebElement menhealth;
    
    @FindBy(xpath = "//div[@class='swiper-slide']//a[normalize-space()='Brain Support']")
   	private WebElement BrainSupport;
  
    @FindBy(xpath = "//a[normalize-space()='Hair, Skin & Nails']")
   	private WebElement Skin;
    
    @FindBy(xpath = " //a[normalize-space()='Energy Formulas']")
   	private WebElement Energy;
  
    @FindBy(xpath = " //a[contains(text(),'Digestive Support')]")
   	private WebElement Digestive;
    
    @FindBy(xpath = "//div[@class='swiper-slide']//a[normalize-space()='Detox & Liver Support']")
   	private WebElement LiverSupport;
    
    public WebElement getMultivitaminsBlock() {
		return multivitaminsBlock;
	}

	public WebElement getFishOilOmegasBlock() {
		return FishOilOmegasBlock;
	}

	public WebElement getVitaminsA_ZBlock() {
		return VitaminsA_ZBlock;
	}

	public WebElement getAntioxidantsBlock() {
		return AntioxidantsBlock;
	}

	public WebElement getSuperfoodsBlock() {
		return SuperfoodsBlock;
	}

	public WebElement getMelatoninBlock() {
		return MelatoninBlock;
	}

	public WebElement getCollagenBlock() {
		return CollagenBlock;
	}

	@FindBy(xpath = "//h2[normalize-space()='Multivitamins']")
   	private WebElement multivitaminsBlock;
  

    @FindBy(xpath = "//h2[normalize-space()='Fish Oil & Omegas']")
   	private WebElement FishOilOmegasBlock;
    
    @FindBy(xpath = "//h2[normalize-space()='Vitamins A-Z']")
   	private WebElement VitaminsA_ZBlock;
    
    public WebElement getMineralsBlock() {
		return MineralsBlock;
	}

	@FindBy(xpath = "//h2[normalize-space()='Minerals']")
   	private WebElement MineralsBlock;
  
    @FindBy(xpath = "//h2[normalize-space()='Antioxidants']")
   	private WebElement AntioxidantsBlock;
    
    @FindBy(xpath = "//h2[normalize-space()='Superfoods']")
   	private WebElement SuperfoodsBlock;
    
    @FindBy(xpath = "//h2[normalize-space()='Melatonin']")
   	private WebElement MelatoninBlock;
    
    @FindBy(xpath = "//h2[normalize-space()='Collagen']")
   	private WebElement CollagenBlock;
    
  
//------------------------------------------

	public WebElement getFirstBannerVitaminsSlider() {
		return FirstBannerVitaminsSlider;
	}

	public WebElement getFirstSideBannerVitaminsPage() {
		return firstSideBannerVitaminsPage;
	}

	public WebElement getSecondSideBannerVitaminsPage() {
		return secondSideBannerVitaminsPage;
	}

	public WebElement getShopByCategorTitle() {
		return ShopByCategorTitle;
	}

	public WebElement getFishOilOmegas() {
		return FishOilOmegas;
	}

	public WebElement getMultivitamins() {
		return Multivitamins;
	}

	public WebElement getVitaminsA_Z() {
		return VitaminsA_Z;
	}

	public WebElement getMinerals() {
		return Minerals;
	}

	public WebElement getAntioxidants() {
		return Antioxidants;
	}

	public WebElement getSuperfoods() {
		return Superfoods;
	}

	public WebElement getCollagen() {
		return Collagen;
	}

	public WebElement getMelatonin() {
		return Melatonin;
	}

	public WebElement getHerbaltitle() {
		return herbaltitle;
	}

	public WebElement getDandelion() {
		return Dandelion;
	}

	public WebElement getTumeric() {
		return Tumeric;
	}

	public WebElement getGinseng() {
		return Ginseng;
	}

	public WebElement getMilk_Thistle() {
		return Milk_Thistle;
	}

	public WebElement getAlfalfa() {
		return Alfalfa;
	}

	public WebElement getShopByHealth() {
		return ShopByHealth;
	}

	public WebElement getHeartHealth() {
		return HeartHealth;
	}

	public WebElement getImmunitySupport() {
		return ImmunitySupport;
	}

	public WebElement getMultivitaminsforkids() {
		return multivitaminsforkids;
	}

	public WebElement getBonejoint() {
		return Bonejoint;
	}

	public WebElement getBeauty() {
		return Beauty;
	}

	public WebElement getSexualHealth() {
		return SexualHealth;
	}

	public WebElement getMenhealth() {
		return menhealth;
	}

	public WebElement getBrainSupport() {
		return BrainSupport;
	}

	public WebElement getSkin() {
		return Skin;
	}

	public WebElement getEnergy() {
		return Energy;
	}

	public WebElement getDigestive() {
		return Digestive;
	}

	public WebElement getLiverSupport() {
		return LiverSupport;
	}
    

  
  
  
  
    
  
  
 
 
  
  
 
  
   }