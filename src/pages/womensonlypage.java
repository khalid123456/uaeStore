package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cases.BaseTest;

//import com.sporter.testing.cases.BaseTest;

public class womensonlypage extends BasePage {
	
	public final static String URL = "https://www.sporter.com/en-ae/female/";
	
	
	
    public womensonlypage() {
		
    	super(URL);
    	PageFactory.initElements(BaseTest.driver, this);
    }
    
    @FindBy(css = ".flex-control-nav > li:nth-child(2) > a")
  	private WebElement FirstBannerWomenSlider;
    
    @FindBy(css = "a:nth-child(1) .product-image")
  	private WebElement firstSideBannerWomenPage;
    
    @FindBy(css = "a:nth-child(2) .product-image")
  	private WebElement secondSideBannerWomenPage;
    
    @FindBy(xpath = "//h2[normalize-space()='Shop By Category']")
  	private WebElement ShopByCategorTitle;
    
    @FindBy(xpath = "//a[normalize-space()='Supplements For Her']")
  	private WebElement SupplementsForHer;
  
  
    @FindBy(xpath = "//a[@title=\"Women's Daily Vitamins\"][normalize-space()='Start Shopping']")
  	private WebElement WomenDailyVitamins;
  
 
    @FindBy(xpath = "//a[normalize-space()='Lady-Friendly Snacks & Food']")
   	private WebElement snacksFood;
  
    @FindBy(xpath = "//a[normalize-space()='Makeup for Active Lifestyles']")
   	private WebElement ActiveLifestyle;
  
    @FindBy(xpath = " //*[@id=\"widget_256\"]/div/h2")
   	private WebElement shopByGoalTitle;
    
    @FindBy(xpath = " //a[normalize-space()='Hair, Skin & Nails']")
   	private WebElement SkinandNails;
    
    @FindBy(xpath = " //a[normalize-space()='Weight Loss']")
   	private WebElement WeightLoss;
    
    @FindBy(xpath = " //a[normalize-space()='Mood Support']")
   	private WebElement MoodSupport;
 
    @FindBy(xpath = " //a[normalize-space()='Detox & Cleanse']")
   	private WebElement DetoxCleanse;
    
    @FindBy(xpath = " //a[normalize-space()='PMS Relief']")
   	private WebElement PMSRelief;
  
    @FindBy(xpath = " //a[normalize-space()='Energy & Endurance']")
   	private WebElement EnergyEndurance;
    
    @FindBy(xpath = " //a[normalize-space()='Prenatal Care']")
   	private WebElement PrenatalCare;
    
    @FindBy(xpath = " //a[normalize-space()='Muscle & Weight Gain']")
   	private WebElement MuscleWeightGain;
    
    @FindBy(xpath = " //a[normalize-space()='Fashion & Style']")
   	private WebElement FashionStyle;
    
    @FindBy(xpath = " //a[normalize-space()='Personal Care']")
   	private WebElement PersonalCare;
    
    @FindBy(xpath = " //h2[normalize-space()='Supplements For Her']")
   	private WebElement SupplementsForHerTitle;
    
    @FindBy(xpath = " //h2[normalize-space()='Supplements For Her']")
   	private WebElement SupplementsForHgerTitle;
    
    @FindBy(xpath = " //h2[normalize-space()='Workout In Style']")
   	private WebElement WorkoutInStyle;
    
    @FindBy(xpath = " //h2[normalize-space()='Lady-Friendly Snacks & Food']")
   	private WebElement SnacksFood;
    
    @FindBy(xpath = " //h3[normalize-space()='FEMALE GALLERY']")
   	private WebElement FEMALEGALLERY;



	public WebElement getFirstBannerWomenSlider() {
		return FirstBannerWomenSlider;
	}

	public WebElement getFirstSideBannerWomenPage() {
		return firstSideBannerWomenPage;
	}

	public WebElement getSecondSideBannerWomenPage() {
		return secondSideBannerWomenPage;
	}

	public WebElement getShopByCategorTitle() {
		return ShopByCategorTitle;
	}

	public WebElement getSupplementsForHer() {
		return SupplementsForHer;
	}

	public WebElement getWomenDailyVitamins() {
		return WomenDailyVitamins;
	}

//	public WebElement getSnacksFood() {
//		return snacksFood;
//	}

	public WebElement getActiveLifestyle() {
		return ActiveLifestyle;
	}

	public WebElement getShopByGoalTitle() {
		return shopByGoalTitle;
	}

	public WebElement getSkinandNails() {
		return SkinandNails;
	}

	public WebElement getWeightLoss() {
		return WeightLoss;
	}

	public WebElement getMoodSupport() {
		return MoodSupport;
	}

	public WebElement getDetoxCleanse() {
		return DetoxCleanse;
	}

	public WebElement getPMSRelief() {
		return PMSRelief;
	}

	public WebElement getEnergyEndurance() {
		return EnergyEndurance;
	}

	public WebElement getPrenatalCare() {
		return PrenatalCare;
	}

	public WebElement getMuscleWeightGain() {
		return MuscleWeightGain;
	}

	public WebElement getFashionStyle() {
		return FashionStyle;
	}

	public WebElement getPersonalCare() {
		return PersonalCare;
	}

	public WebElement getSupplementsForHerTitle() {
		return SupplementsForHerTitle;
	}

	public WebElement getWorkoutInStyle() {
		return WorkoutInStyle;
	}

	public WebElement getSnacksFood() {
		return SnacksFood;
	}

	public WebElement getFEMALEGALLERY() {
		return FEMALEGALLERY;
	}
    
    ////////////////////////////////////////////////////////////////////////
    
  
    
  
  
  
   }