package cases;

import static org.testng.AssertJUnit.assertEquals;

import java.sql.Driver;

import static org.testng.Assert.assertFalse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.MegaMenuPage;




public class MegaMenuCasesksa extends BaseTest {

	MegaMenuPage MegamenuPage = new MegaMenuPage();
//Main categories//
	String sportSupplementsUrl = "https://www.sporter.com/en-sa/sport-supplements";
	String healthVitaminsUrl = "https://www.sporter.com/en-sa/health-vitamins/";
	String healthyFoodsUrl = "https://www.sporter.com/en-sa/healthy-food/";
	String sportsUrl = "https://www.sporter.com/en-sa/sports/";
	String womenOnlyUrl = "https://www.sporter.com/en-sa/female/";
	String salesAndOffersUrl = "https://www.sporter.com/en-sa/salesoffers/";
	String byGoalUrl = "https://www.sporter.com/en-sa/goal/";
	String sportStacksUrl = "https://www.sporter.com/en-sa/sporter-stacks/";
	String byBrandUrl = "https://www.sporter.com/en-sa/brands";
	//------------------------ supplement sub-------------------//
	String proteinSportSupplementsURL = "https://www.sporter.com/en-sa/sport-supplements/protein/";
	String creatineSportSupplementsURL = "https://www.sporter.com/en-sa/sport-supplements/creatine/";
	String aminoAcidsSportSupplementsURL = "https://www.sporter.com/en-sa/sport-supplements/amino-acids/";
	String muscleBoostersSportSupplementsURL = "https://www.sporter.com/en-sa/sport-supplements/muscles-boosters/";
	String weightManagementSportSupplementsURL = "https://www.sporter.com/en-sa/sport-supplements/weight-management/";
	String recoverySportSupplementsURL = "https://www.sporter.com/en-sa/sport-supplements/recovery/";
	String carbohydratesSportSupplementsURL = "https://www.sporter.com/en-sa/sport-supplements/carbohydrates/";
	String energyAndEnduranceSportSupplementsURL = "https://www.sporter.com/en-sa/sport-supplements/energy-endurance/";
	String gamingAndFocusSportSupplementsURL = "https://www.sporter.com/en-sa/sport-supplements//gaming-focus";
	String wheyProteinSportSupplementsURL = "https://www.sporter.com/en-sa/sport-supplements/protein/whey-protein/";
	String WheyProteinIsolateSportSupplementsURL = "https://www.sporter.com/en-sa/sport-supplements/protein/whey-protein-isolate/";
	String proteinBlendsSportSupplementsURL = "https://www.sporter.com/en-sa/sport-supplements/protein/protein-blends/";
	String nonDairyProteinSportSupplementsURL = "https://www.sporter.com/en-sa/sport-supplements/protein/non-dairy-protein/";
	String caseinProteinSportSupplementsURL = "https://www.sporter.com/en-sa/sport-supplements/protein/casein-protein/";
	String dietProteinSportSupplementsURL = "https://www.sporter.com/en-sa/sport-supplements/protein/diet-protein/";
	String massGainersSportSupplementsURL = "https://www.sporter.com/en-sa/sport-supplements/protein/mass-gainer/";
	String creatineMonohydrateSportSupplementsURL = "https://www.sporter.com/en-sa/sport-supplements/creatine/creatine-monohydrate/";
	String creatineBlendsSportSupplementsURL = "https://www.sporter.com/en-sa/sport-supplements/creatine/creatine-blends/";
	String bCAASportSupplementsURL = "https://www.sporter.com/en-sa/sport-supplements/amino-acids/bcaa/";
	String eAASportSupplementsURL = "https://www.sporter.com/en-sa/sport-supplements/amino-acids//eaa";
	String arginineSportSupplementsURL = "https://www.sporter.com/en-sa/sport-supplements/amino-acids/arginine/";
	String betaAlanineSportSupplementsURL = "https://www.sporter.com/en-sa/sport-supplements/amino-acids/beta-alanine/";
	String hMBSportSupplementsURL = "https://www.sporter.com/en-sa/sport-supplements/amino-acids/hmb/";
	String aminoAcidPowdersSportSupplementsURL = "https://www.sporter.com/en-sa/sport-supplements/amino-acids/powders/";
	String aminoAcidPillsSportSupplementsURL = "https://www.sporter.com/en-sa/sport-supplements/amino-acids/capsules/";
	String citrullineSportSupplementsURL = "https://www.sporter.com/en-sa/sport-supplements/amino-acids/citrulline/";
	String aminoAcidLiquidsSportSupplementsURL = "https://www.sporter.com/en-sa/sport-supplements/amino-acids/liquids/";
	String testosteroneBoostersSportSupplementsURL = "https://www.sporter.com/en-sa/sport-supplements/muscles-boosters/testosterone-booster/";
	String ghBoostersSportSupplementsURL = "https://www.sporter.com/en-sa/sport-supplements/muscles-boosters/gh-booster/";
	String stimulantWeightLossSportSupplementsURL = "https://www.sporter.com/en-sa/sport-supplements/weight-management/stimulant-weight-loss/";
	String nonStimulantWeightLossSportSupplementsURL = "https://www.sporter.com/en-sa/sport-supplements/weight-management/non-stimulant-weight-loss/";
	String mealReplacementsSportSupplementsURL = "https://www.sporter.com/en-sa/sport-supplements/weight-management/meal-replacement/";
	String metabolismSupportSportSupplementsURL = "https://www.sporter.com/en-sa/sport-supplements/weight-management/metabolism-support/";
	String toningCreamsSportSupplementsURL = "https://www.sporter.com/en-sa/sport-supplements/weight-management/toning-cream/";
	String mctSportSupplementsURL = "https://www.sporter.com/en-sa/sport-supplements/weight-management/mct/";
	String glutamineSportSupplementsURL = "https://www.sporter.com/en-sa/sport-supplements/recovery/glutamine/";
	String recoveryBlendSportSupplementsURL = "https://www.sporter.com/en-sa/sport-supplements/recovery/recovery-blend/";
	String electrolytesAndHydrationSportSupplementsURL = "https://www.sporter.com/en-sa/sport-supplements/recovery//electrolytes";
	String carbohydratePowdersSportSupplementsURL = "https://www.sporter.com/en-sa/sport-supplements/carbohydrates/carbohydrates-powders/";
	String stimulantEnergySportSupplementsURL = "https://www.sporter.com/en-sa/sport-supplements/energy-endurance/stimulant-energy/";
	String nonStimulantEnergySportSupplementsURL = "https://www.sporter.com/en-sa/sport-supplements/energy-endurance/non-stimulant-energy/";
	String gamingEssentialsSportSupplementsURL = "https://www.sporter.com/en-sa/sport-supplements//gaming-focus/gaming-supplements";
	//---------------VitaminsVitaminsAndHeal sub------------------------------------
	String featuredVitaminsAndHealthURL = "https://www.sporter.com/en-sa/vitamins/featured/";
	String aliveVitaminsVitaminsAndHealthURL = "https://www.sporter.com/en-sa/vitamins/featured//alive-vitamins";
	String sexualHealthVitaminsAndHealthURL = "https://www.sporter.com/en-sa/vitamins/featured//sexual-health-new";
	String essentialVitaminsVitaminsAndHealthURL = "https://www.sporter.com/en-sa/vitamins/essential-vitamins/";
	String folicAcidVitaminsAndHealthURL = "https://www.sporter.com/en-sa/vitamins/essential-vitamins/folic-acid/";
	String vitaminAVitaminsAndHealthURL = "https://www.sporter.com/en-sa/vitamins/essential-vitamins/vitamin-a/";
	String vitaminBVitaminsAndHealthURL = "https://www.sporter.com/en-sa/vitamins/essential-vitamins/vitamin-b/";
	String vitaminCVitaminsAndHealthURL = "https://www.sporter.com/en-sa/vitamins/essential-vitamins/vitamin-c/";
	String vitaminDVitaminsAndHealthURL = "https://www.sporter.com/en-sa/vitamins/essential-vitamins/vitamin-d/";
	String vitaminEVitaminsAndHealthURL = "https://www.sporter.com/en-sa/vitamins/essential-vitamins/vitamin-e/";
	String vitaminKVitaminsAndHealthURL = "https://www.sporter.com/en-sa/vitamins/essential-vitamins/vitamin-k/";
	String multiVitaminsVitaminsAndHealthURL = "https://www.sporter.com/en-sa/vitamins/multivitamins/";
	String vitaminsForKidsVitaminsAndHealthURL = "https://www.sporter.com/en-sa/vitamins/multivitamins/multivitamins-for-kids/";
	String vitaminsForMenVitaminsAndHealthURL = "https://www.sporter.com/en-sa/vitamins/multivitamins/multivitamins-for-men/";
	String vitaminsForWomenVitaminsAndHealthURL = "https://www.sporter.com/en-sa/vitamins/multivitamins/multivitamins-for-women/";
	String boneJointVitaminsAndHealthURL = "https://www.sporter.com/en-sa/vitamins/bone-joint/";
	String boneHealthVitaminsAndHealthURL = "https://www.sporter.com/en-sa/vitamins/bone-joint/bone-health/";
	String jointHealthVitaminsAndHealthURL = "https://www.sporter.com/en-sa/vitamins/bone-joint/joint-health/";
	String beautyVitaminsAndHealthURL = "https://www.sporter.com/en-sa/vitamins/beauty/";
	String collagenVitaminsAndHealthURL = "https://www.sporter.com/en-sa/vitamins/beauty/collagen/";
	String hairSkinAndNailsVitaminsAndHealthURL = "https://www.sporter.com/en-sa/vitamins/beauty/hair-skin-nails/";
	String fishOilAndOmegasVitaminsAndHealthURL = "https://www.sporter.com/en-sa/vitamins/fish-oil-omegas/";
	String fishOilVitaminsAndHealthURL = "https://www.sporter.com/en-sa/vitamins/fish-oil-omegas/fish-oil/";
	String omegaMixVitaminsAndHealthURL = "https://www.sporter.com/en-sa/vitamins/fish-oil-omegas/omega-mix/";
	String healthyLifestyleVitaminsAndHealthURL = "https://www.sporter.com/en-sa/vitamins/healthy-lifestyle/";
	String antioxidantVitaminsAndHealthURL = "https://www.sporter.com/en-sa/vitamins/healthy-lifestyle/antioxidant/";
	String bloodSugarSupportVitaminsAndHealthURL = "https://www.sporter.com/en-sa/vitamins/healthy-lifestyle/blood-sugar-support/";
	String brainSupportVitaminsAndHealthURL = "https://www.sporter.com/en-sa/vitamins/healthy-lifestyle/brain-support/";
	String heartHealthVitaminsAndHealthURL = "https://www.sporter.com/en-sa/vitamins/healthy-lifestyle/heart-health/";
	String detoxCleanseVitaminsAndHealthURL = "https://www.sporter.com/en-sa/vitamins/healthy-lifestyle/detox-cleanse/";
	String energyFormulasVitaminsAndHealthURL = "https://www.sporter.com/en-sa/vitamins/healthy-lifestyle/energy-formulas/";
	String eyeHealthVitaminsAndHealthURL = "https://www.sporter.com/en-sa/vitamins/healthy-lifestyle/eye-health/";
	String herbsVitaminsAndHealthURL = "https://www.sporter.com/en-sa/vitamins/healthy-lifestyle/herbs/";
	String hormonesBalanceVitaminsAndHealthURL = "https://www.sporter.com/en-sa/vitamins/healthy-lifestyle/hormones-balance/";
	String immuneSupportVitaminsAndHealthURL = "https://www.sporter.com/en-sa/vitamins/healthy-lifestyle/immune-support/";
	String mensHealthVitaminsAndHealthURL = "https://www.sporter.com/en-sa/vitamins/healthy-lifestyle/men-s-health/";
	String stressReliefVitaminsAndHealthURL = "https://www.sporter.com/en-sa/vitamins/healthy-lifestyle/stress-relief/";
	String sleepSupportVitaminsAndHealthURL = "https://www.sporter.com/en-sa/vitamins/healthy-lifestyle/sleep-support/";
	String superFoodsVitaminsAndHealthURL = "https://www.sporter.com/en-sa/vitamins/healthy-lifestyle/superfoods/";
	String urinaryTractSupportVitaminsAndHealthURL = "https://www.sporter.com/en-sa/vitamins/healthy-lifestyle/urinary-tract-support/";
	String weightManagementVitaminsAndHealthURL = "https://www.sporter.com/en-sa/vitamins/healthy-lifestyle/weight-management/";
	String womensHealthVitaminsAndHealthURL = "https://www.sporter.com/en-sa/vitamins/healthy-lifestyle/women-s-health/";
	String digestionVitaminsAndHealthURL = "https://www.sporter.com/en-sa/vitamins/digestion/";
	String digestionSupportVitaminsAndHealthURL = "https://www.sporter.com/en-sa/vitamins/digestion/digestive-support/";
	String probioticsVitaminsAndHealthURL = "https://www.sporter.com/en-sa/vitamins/digestion/probiotics/";
	String sportVitaminsVitaminsAndHealthURL = "https://www.sporter.com/en-sa/vitamins/sport-vitamins/";
	String aminoAcidVitaminsAndHealthURL = "https://www.sporter.com/en-sa/vitamins/sport-vitamins/amino-acids/";
	String mineralsVitaminsAndHealthURL = "https://www.sporter.com/en-sa/vitamins/minerals/";
	String calciumVitaminsAndHealthURL = "https://www.sporter.com/en-sa/vitamins/minerals/calcium/";
	String ironVitaminsAndHealthURL = "https://www.sporter.com/en-sa/vitamins/minerals/iron/";
	String magnesiumVitaminsAndHealthURL = "https://www.sporter.com/en-sa/vitamins/minerals/magnesium/";
	String multimineralFormulasVitaminsAndHealthURL = "https://www.sporter.com/en-sa/vitamins/minerals/multimineral-formulas/";
	String zincVitaminsAndHealthURL = "https://www.sporter.com/en-sa/vitamins/minerals/zinc/";
	String potassiumVitaminsAndHealthURL = "https://www.sporter.com/en-sa/vitamins/minerals/potassium/";
	String healthyDrinksVitaminsAndHealthURL = "https://www.sporter.com/en-sa/vitamins/healthy-drinks/";
	String drinkableVitaminsVitaminsAndHealthURL = "https://www.sporter.com/en-sa/vitamins/healthy-drinks/drinkable-vitamins/";
	String petsVitaminsAndHealthURL = "https://www.sporter.com/en-sa/vitamins//animal-health";
	String supplementsMoreVitaminsAndHealthURL = "https://www.sporter.com/en-sa/vitamins//animal-health/supplements-more";
	//--------------------healthy food -------------------------
	String groceryHealthyFoodURL = "https://www.sporter.com/en-sa/healthy-food/grocery/";
	String bakingAndCookingHealthyFoodURL = "https://www.sporter.com/en-sa/healthy-food/grocery/baking/";
	String cannedHealthyFoodURL = "https://www.sporter.com/en-sa/healthy-food/grocery/canned/";
	String coffeeHealthyFoodURL = "https://www.sporter.com/en-sa/healthy-food/grocery/coffee/";
	String condimentsHealthyFoodURL = "https://www.sporter.com/en-sa/healthy-food/grocery/condiments/";
	String milkAndCreamHealthyFoodURL = "https://www.sporter.com/en-sa/healthy-food/grocery/milk/";
	String nutsAndOatsHealthyFoodURL = "https://www.sporter.com/en-sa/healthy-food/grocery/oats/";
	String oilsHealthyFoodURL = "https://www.sporter.com/en-sa/healthy-food/grocery/oils/";
	String pastaHealthyFoodURL = "https://www.sporter.com/en-sa/healthy-food/grocery/pasta/";
	String riceAndGrainsHealthyFoodURL = "https://www.sporter.com/en-sa/healthy-food/grocery/rice-grains/";
	String seasoningsAndSpicessHealthyFoodURL = "https://www.sporter.com/en-sa/healthy-food/grocery/seasonings-spices/";
	String sugarAndSweetenersHealthyFoodURL = "https://www.sporter.com/en-sa/healthy-food/grocery/sweeteners/";
	String syrupsHealthyFoodURL = "https://www.sporter.com/en-sa/healthy-food/grocery/syrups/";
	String teaAndHerbsInHealthyFoodUrl = "https://www.sporter.com/en-sa/healthy-food/grocery/tea/";
	String superFoodsInHealthyFoodUrl = "https://www.sporter.com/en-sa/healthy-food/grocery/super-foods/";
	String readyMixInHealthyFoodUrl = "https://www.sporter.com/en-sa/healthy-food/grocery/ready-mix/";
	String breakfastAndCerealInHealthyFoodUrl = "https://www.sporter.com/en-sa/healthy-food/grocery/cereal/";
	String readyToDrinkInHealthyFoodUrl = "https://www.sporter.com/en-sa/healthy-food/ready-to-drink/";
	String aminoBcaasInHealthyFoodUrl = "https://www.sporter.com/en-sa/healthy-food/ready-to-drink/amino-bcaas/";
	String energyDrinksInHealthyFoodUrl = "https://www.sporter.com/en-sa/healthy-food/ready-to-drink/energy-drinks/";
	String proteinShakesInHealthyFoodUrl = "https://www.sporter.com/en-sa/healthy-food/ready-to-drink/protein-shakes/";
	String electrolytesAndHydrationInHealthyFoodUrl = "https://www.sporter.com/en-sa/healthy-food/ready-to-drink/electrolytes-hydration/";
	String healthySnacksInHealthyFoodUrl = "https://www.sporter.com/en-sa/healthy-food/snacks-drinks/";
	String proteinBarsInHealthyFoodUrl = "https://www.sporter.com/en-sa/healthy-food/snacks-drinks/protein-bars/";
	String cookiesInHealthyFoodUrl = "https://www.sporter.com/en-sa/healthy-food/snacks-drinks/cookies/";
	String chipsInHealthyFoodUrl = "https://www.sporter.com/en-sa/healthy-food/snacks-drinks/chips/";
	String browniesAndPancakesInHealthyFoodUrl = "https://www.sporter.com/en-sa/healthy-food/snacks-drinks/brownies/";
	String snackBarsInHealthyFoodUrl = "https://www.sporter.com/en-sa/healthy-food/snacks-drinks/snack-bars/";
	String spreadsInHealthyFoodUrl = "https://www.sporter.com/en-sa/healthy-food/snacks-drinks/spreads/";
	String otherHealthySnacksInHealthyFoodUrl = "https://www.sporter.com/en-sa/healthy-food/snacks-drinks/other-healthy-snacks/";
	String readyToEatInHealthyFoodUrl = "https://www.sporter.com/en-sa/healthy-food/ready-to-eat/";
	String healthyMealsInHealthyFoodUrl = "https://www.sporter.com/en-sa/healthy-food/ready-to-eat/healthy-meals/";
	String featuredInHealthyFoodUrl = "https://www.sporter.com/en-sa/healthy-food//featured";
	String healthyMealReplacementInHealthyFoodUrl = "https://www.sporter.com/en-sa/healthy-food//featured/healthy-meal-replacement";
	String proteinCoffeeInHealthyFoodUrl = "https://www.sporter.com/en-sa/healthy-food//featured/protein-coffee";
	String candiesInHealthyFoodUrl = "https://www.sporter.com/en-sa/healthy-food//featured/candies";
	String flavoringAgentsInHealthyFoodUrl = "https://www.sporter.com/en-sa/healthy-food//featured/flavoring-agents";
	String ketoDietInHealthyFoodUrl = "https://www.sporter.com/en-sa/healthy-food//featured/keto-diet";
	String ketoSnacksInHealthyFoodUrl = "https://www.sporter.com/en-sa/healthy-food//featured/keto-diet";
	String manukaHoneyInHealthyFoodUrl = "https://www.sporter.com/en-sa/healthy-food//featured/manuka-honey";
	String meatSnacksInHealthyFoodUrl = "https://www.sporter.com/en-sa/healthy-food//featured/meat-snacks";
	//-------------------------sports----------------------
	String menSportsMenuURL = "https://www.sporter.com/en-sa/sportswear-accessories/men/";
	String clothingSportsMenuURL = "https://www.sporter.com/en-sa/sportswear-accessories/men/clothing/";
	String topsSportsMenuURL = "https://www.sporter.com/en-sa/sportswear-accessories/men/clothing/tops/";
	String pantsSportsMenuURL = "https://www.sporter.com/en-sa/sportswear-accessories/men/clothing/pants/";
	String shortsSportsMenuURL = "https://www.sporter.com/en-sa/sportswear-accessories/men/clothing/shorts/";
	String jacketsAndCoatsSportsMenuURL = "https://www.sporter.com/en-sa/sportswear-accessories/men/clothing/jackets-and-coats/";
	String safetyMasksSportsMenuURL = "https://www.sporter.com/en-sa/sportswear-accessories/men/safety-masks/";
	String footwearSportsMenuURL = "https://www.sporter.com/en-sa/sportswear-accessories/men/footwear/";
	String sneakersSportsMenuURL = "https://www.sporter.com/en-sa/sportswear-accessories/men/footwear/sneakers/";
	String trainingShoesSportsMenuURL = "https://www.sporter.com/en-sa/sportswear-accessories/men/footwear/training-shoes/";
	String runningShoesSportsMenuURL = "https://www.sporter.com/en-sa/sportswear-accessories/men/footwear/running-shoes/";
	String hikingShoesSportsMenuURL = "https://www.sporter.com/en-sa/sportswear-accessories/men/footwear/hiking-shoes/";
	String accessoriesSportsMenuURL = "https://www.sporter.com/en-sa/sportswear-accessories/men/accessories/";
	String glovesSportsMenuURL = "https://www.sporter.com/en-sa/sportswear-accessories/men/accessories/gloves/";
	String beltsSportsMenuURL = "https://www.sporter.com/en-sa/sportswear-accessories/men/accessories/belts/";
	String capsAndHatsSportsMenuURL = "https://www.sporter.com/en-sa/sportswear-accessories/men/accessories/caps-hats/";
	String capSportsMenuURL = "https://www.sporter.com/en-sa/sportswear-accessories/men/accessories/caps-hats/cap/";
	String shakersSportsMenuURL = "https://www.sporter.com/en-sa/sportswear-accessories/men/accessories/shakers/";
	String waterBottlesSportsMenuURL = "https://www.sporter.com/en-sa/sportswear-accessories/men/accessories/shakers/water-bottles/";
	String socksSportsMenuURL = "https://www.sporter.com/en-sa/sportswear-accessories/men/accessories/socks/";
	String towelsSportsMenuURL = "https://www.sporter.com/en-sa/sportswear-accessories/men/accessories/towels/";
	String sunglassesSportsMenuURL = "https://www.sporter.com/en-sa/sportswear-accessories/men/accessories/sunglasses/";
	String mixerSportsMenuURL = "https://www.sporter.com/en-sa/sportswear-accessories/men/accessories/mixer/";
	String bagsSportsMenuURL = "https://www.sporter.com/en-sa/sportswear-accessories/men/accessories/bags/";
	String backPacksSportsMenuURL = "https://www.sporter.com/en-sa/sportswear-accessories/men/accessories/bags/backpacks/";
	String shoulderBagsSportsMenuURL = "https://www.sporter.com/en-sa/sportswear-accessories/men/accessories/bags/shoulder-bags/";
	String wearableTechSportsMenuURL = "https://www.sporter.com/en-sa/sportswear-accessories/men/accessories/wearable-tech/";
	String watchesSportsMenuURL = "https://www.sporter.com/en-sa/sportswear-accessories/men/accessories/wearable-tech/watches/";
	String gamingAccessoriesSportsMenuURL = "https://www.sporter.com/en-sa/sportswear-accessories/men/accessories//gaming-accessories";
	String equipmentSportsMenuURL = "https://www.sporter.com/en-sa/sportswear-accessories/men/equipment/";
	String gripsSportsMenuURL = "https://www.sporter.com/en-sa/sportswear-accessories/men/equipment/grips/";
	String ballsSportsMenuURL = "https://www.sporter.com/en-sa/sportswear-accessories/men/equipment/balls/";
	String rollersSportsMenuURL = "https://www.sporter.com/en-sa/sportswear-accessories/men/equipment/rollers/";
	String weightsSportsMenuURL = "https://www.sporter.com/en-sa/sportswear-accessories/men/equipment/weights/";
	String womenSportsMenuURL = "https://www.sporter.com/en-sa/sportswear-accessories/women/";
	String womenClothingSportsMenuURL = "https://www.sporter.com/en-sa/sportswear-accessories/women/clothing/";
	String womenTopsSportsMenuURL = "https://www.sporter.com/en-sa/sportswear-accessories/women/clothing/tops/";
	String womenShortsSportsMenuURL = "https://www.sporter.com/en-sa/sportswear-accessories/women/clothing/shorts/";
	String womenSafetyMasksSportsMenuURL = "https://www.sporter.com/en-sa/sportswear-accessories/women/safety-masks/";
	String womenAccessoriesSportsMenuURL = "https://www.sporter.com/en-sa/sportswear-accessories/women/accessories/";
	String womenGlovesSportsMenuURL = "https://www.sporter.com/en-sa/sportswear-accessories/women/accessories/gloves/";
	String womenCapsAndHatsSportsMenuURL = "https://www.sporter.com/en-sa/sportswear-accessories/women/accessories/caps-hats/";
	String womenCapsSportsMenuURL = "https://www.sporter.com/en-sa/sportswear-accessories/women/accessories/caps-hats/cap/";
	String womenShakersSportsMenuURL = "https://www.sporter.com/en-sa/sportswear-accessories/women/accessories/shakers/";
	String womenWaterBottlesSportsMenuURL = "https://www.sporter.com/en-sa/sportswear-accessories/women/accessories/shakers/water-bottles/";
	String womenSocksSportsMenuURL = "https://www.sporter.com/en-sa/sportswear-accessories/women/accessories/socks/";
	String womenTowelsSportsMenuURL = "https://www.sporter.com/en-sa/sportswear-accessories/women/accessories/towels/";
	String womenSunglassesSportsMenuURL = "https://www.sporter.com/en-sa/sportswear-accessories/women/accessories/sunglasses/";
	String womenMixerSportsMenuURL = "https://www.sporter.com/en-sa/sportswear-accessories/women/accessories/mixer/";
	String womenBagsSportsMenuURL = "https://www.sporter.com/en-sa/sportswear-accessories/women/accessories/bags/";
	String womenBackPacksSportsMenuURL = "https://www.sporter.com/en-sa/sportswear-accessories/women/accessories/bags/backpacks/";
	String womenSholdersBagsSportsMenuURL = "https://www.sporter.com/en-sa/sportswear-accessories/women/accessories/bags/shoulder-bags/";
	String womenBeltsSportsMenuURL = "https://www.sporter.com/en-sa/sportswear-accessories/women/accessories/belts/";
	
	//-------------------Brands--------------------------------------
	String supplementsInByBrandURL = "https://www.sporter.com/en-sa/brands/supplements/";
	String optimumNutritionInByBrandURL = "https://www.sporter.com/en-sa/brands/supplements/optimum-nutrition/";
	String muscletechInByBrandURL = "https://www.sporter.com/en-sa/brands/supplements/muscle-tech/";
	String cellucorInByBrandURL = "https://www.sporter.com/en-sa/brands/supplements/cellucor/";
	String dymatizeInByBrandURL = "https://www.sporter.com/en-sa/brands/supplements/dymatize/";
	String xtendInByBrandURL = "https://www.sporter.com/en-sa/brands/supplements/xtend/";
	String animalNutritionInByBrandURL = "https://www.sporter.com/en-sa/brands/supplements/universal-animal-nutrition/";
	String musclePharmInByBrandURL = "https://www.sporter.com/en-sa/brands/supplements/muscle-pharm/";
	String universalNutritionInByBrandURL = "https://www.sporter.com/en-sa/brands/supplements/universal-nutrition/";
	String bsnInByBrandURL = "https://www.sporter.com/en-sa/brands/supplements/bsn/";
	String ehplabsInByBrandURL = "https://www.sporter.com/en-sa/brands/supplements/ehplabs/";
	String jymSupplementScienceInByBrandURL = "https://www.sporter.com/en-sa/brands/supplements/jym-supplement-science/";
	String bpiSportsInByBrandURL = "https://www.sporter.com/en-sa/brands/supplements/bpi/";
	String russianBearInByBrandURL = "https://www.sporter.com/en-sa/brands/supplements/russian-bear/";
	String isopureInByBrandURL = "https://www.sporter.com/en-sa/brands/supplements/natures-best/";
	String oneUpNutritionInByBrandURL = "https://www.sporter.com/en-sa/brands/supplements/1-up-nutrition/";
	String musclemedInByBrandURL = "https://www.sporter.com/en-sa/brands/supplements/muscle-med/";
	String mhpInByBrandURL = "https://www.sporter.com/en-sa/brands/supplements/mhp/";
	String evlNutritionInByBrandURL = "https://www.sporter.com/en-sa/brands/supplements/evl-nutrition/";
	String nlaForHerInByBrandURL = "https://www.sporter.com/en-sa/brands/supplements/nla-for-her/";
	String muscleNutritionInByBrandURL = "https://www.sporter.com/en-sa/brands/supplements/muscle-nutrition/";
	String gatNutritionInByBrandURL = "https://www.sporter.com/en-sa/brands/supplements/gat-nutrition/";
	String labradaInByBrandURL = "https://www.sporter.com/en-sa/brands/supplements/labrada/";
	String orgainInByBrandURL = "https://www.sporter.com/en-sa/brands/supplements/orgain/";
	String nutrexResearchInByBrandURL = "https://www.sporter.com/en-sa/brands/supplements/nutrex-research/";
	String scitecNutritionInByBrandURL = "https://www.sporter.com/en-sa/brands/supplements/scitec-nutrition/";
	String prolabInByBrandURL = "https://www.sporter.com/en-sa/brands/supplements/prolab/";
	String sotruInByBrandURL = "https://www.sporter.com/en-sa/brands/supplements/sotru/";
	String divineHealthInByBrandURL = "https://www.sporter.com/en-sa/brands/supplements/divine-health/";
	String ghostInByBrandURL = "https://www.sporter.com/en-sa/brands/supplements/ghost/";
	String womensBestInByBrandURL = "https://www.sporter.com/en-sa/brands/supplements/women-s-best/";
	String efxSportsInByBrandURL = "https://www.sporter.com/en-sa/brands/supplements/efx-sports/";
	String basixInByBrandURL = "https://www.sporter.com/en-sa/brands/supplements/basix/";
	String ak47InByBrandURL = "https://www.sporter.com/en-sa/brands/supplements/ak-47/";
	String nfSportsInByBrandURL = "https://www.sporter.com/en-sa/brands/supplements/nf-sports/";
	String fullyDosedInByBrandURL = "https://www.sporter.com/en-sa/brands/supplements/fully-dosed/";
	String fivePercentNutritionInByBrandURL = "https://www.sporter.com/en-sa/brands/supplements/5-nutrition/";
	String olimpSportNutritionInByBrandURL = "https://www.sporter.com/en-sa/brands/supplements/olimp/";
	String jnxSportsInByBrandURL = "https://www.sporter.com/en-sa/brands/supplements/jnx-sports/";
	String fitAndLeanInByBrandURL = "https://www.sporter.com/en-sa/brands/supplements/fit-lean/";
	String gymqueenInByBrandURL = "https://www.sporter.com/en-sa/brands/supplements/gymqueen/";
	String thePackInByBrandURL = "https://www.sporter.com/en-sa/brands/supplements/the-pack/";
	String betancourtNutritionInByBrandURL = "https://www.sporter.com/en-sa/brands/supplements/betancourt-nutrition/";
	String yallaProteinInByBrandURL = "https://www.sporter.com/en-sa/brands/supplements/yalla-protein/";
	String proteinWorldInByBrandURL = "https://www.sporter.com/en-sa/brands/supplements/protein-world/";
	String obviInByBrandURL = "https://www.sporter.com/en-sa/brands/supplements/obvi/";
	String naughtyBoyInByBrandURL = "https://www.sporter.com/en-sa/brands/supplements/naughty-boy/";
	String steelFitInByBrandURL = "https://www.sporter.com/en-sa/brands/supplements/steel-fit/";
	String usnInByBrandURL = "https://www.sporter.com/en-sa/brands/supplements/usn/";
	String xGamerInByBrandURL = "https://www.sporter.com/en-sa/brands/supplements/x-gamer/";
	String innosuppsInByBrandURL = "https://www.sporter.com/en-sa/brands/supplements/innosupps/";
	String outbreakNutritionInByBrandURL = "https://www.sporter.com/en-sa/brands/supplements/outbreak-nutrition/";
	String insaneLabzInByBrandURL = "https://www.sporter.com/en-sa/brands/supplements//insane-labz";
	String allMaxInByBrandURL = "https://www.sporter.com/en-sa/brands/supplements//all-max";
	String glaxonInByBrandURL = "https://www.sporter.com/en-sa/brands/supplements//glaxon";
	String redcon1InByBrandURL = "https://www.sporter.com/en-sa/brands/supplements//redcon1";
	String pandaSupplementsInByBrandURL = "https://www.sporter.com/en-sa/brands/supplements//panda-supplements";
	String nutrendInByBrandURL = "https://www.sporter.com/en-sa/brands/supplements//nutrend";
	String ostrovitInByBrandURL = "https://www.sporter.com/en-sa/brands/supplements//ostrovit";
	String betteryInByBrandURL = "https://www.sporter.com/en-sa/brands/supplements//bettery";
	String healthyFoodSnacksAndMealReplacementInByBrandURL = "https://www.sporter.com/en-sa/brands/snacks-more/";
	String wowHydrateInByBrandURL = "https://www.sporter.com/en-sa/brands/snacks-more/wow-hydrate/";
	String questNutritionInByBrandURL = "https://www.sporter.com/en-sa/brands/snacks-more/quest-nutrition/";
	String grenadeInByBrandURL = "https://www.sporter.com/en-sa/brands/snacks-more/grenade/";
	String reignEnergyInByBrandURL = "https://www.sporter.com/en-sa/brands/snacks-more/reign/";
	String monsterEnergyInByBrandURL = "https://www.sporter.com/en-sa/brands/snacks-more/monster-energy/";
	String thirdEnergyInByBrandURL = "https://www.sporter.com/en-sa/brands/snacks-more/3d-energy/";
	String menInSportsMainMenuUrl = "https://www.sporter.com/en-sa/sports/men/";
	String sportInSportsMainMenuUrl = "https://www.sporter.com/en-sa/sports/men/sport/";
	String footballInSportsMainMenuUrl = "https://www.sporter.com/en-sa/sports/men/sport/football/";
	String basketballInSportsMainMenuUrl = "https://www.sporter.com/en-sa/sports/men/sport/basketball/";
	String baseballInSportsMainMenuUrl = "https://www.sporter.com/en-sa/sports/men/sport/baseball/";
	String runningInSportsMainMenuUrl = "https://www.sporter.com/en-sa/sports/men/sport/running/";
	String swimmingInSportsMainMenuUrl = "https://www.sporter.com/en-sa/sports/men/sport/swimming/";
	String yogaInSportsMainMenuUrl = "https://www.sporter.com/en-sa/sports/men/sport/yoga/";
	String fitnessAndTrainingInSportsMainMenuUrl = "sporter.com/en-sa/sports/men/sport/fitness-and-training/";
	String mmaInSportsMainMenuUrl = "https://www.sporter.com/en-sa/sports/men/sport/mma/";
	String jiuJitsuInSportsMainMenuUrl = "https://www.sporter.com/en-sa/sports/men/sport/jiu-jitsu/";
	String boardGamesInSportsMainMenuUrl = "https://www.sporter.com/en-sa/sports/men/sport/board-games/";
	String sportsTechInSportsMainMenuUrl = "https://www.sporter.com/en-sa/sports/men/sports-tech/";
	String wearableTechInSportsMainMenuUrl = "https://www.sporter.com/en-sa/sports/men/sports-tech/wearable-tech/";
	String camerasInSportsMainMenuUrl = "https://www.sporter.com/en-sa/sports/men/sports-tech/cameras/";
	String phoneAccessoriesInSportsMainMenuUrl = "https://www.sporter.com/en-sa/sports/men/sports-tech/phone-accessories/";
	String personalCareInSportsMainMenuUrl = "https://www.sporter.com/en-sa/sports/men/personal-care/";
	String showeringInSportsMainMenuUrl = "https://www.sporter.com/en-sa/sports/men/personal-care/showering/";
	String shavingInSportsMainMenuUrl = "https://www.sporter.com/en-sa/sports/men/personal-care/shaving/";
	String skinCareInSportsMainMenuUrl = "https://www.sporter.com/en-sa/sports/men/personal-care/skin-care/";
	String bodyCareInSportsMainMenuUrl = "https://www.sporter.com/en-sa/sports/men/personal-care/body-care/";
	String oralCareInSportsMainMenuUrl = "https://www.sporter.com/en-sa/sports/men/personal-care/oral-care/";
	String therapyInSportsMainMenuUrl = "https://www.sporter.com/en-sa/sports/men/personal-care/therapy/";
	String masksInSportsMainMenuUrl = "https://www.sporter.com/en-sa/sports/men/personal-care/masks/";
	String fitnessAndTrainingCategoryInSportsMainMenuUrl = "https://www.sporter.com/en-sa/sports/men/fitness-and-training/";
	String fitnessEquipmentInSportsMainMenuUrl = "https://www.sporter.com/en-sa/sports/men/fitness-and-training/fitness-equipment/";
	String skippingRopesInSportsMainMenuUrl = "https://www.sporter.com/en-sa/sports/men/fitness-and-training/fitness-equipment/skipping-ropes/";
	String weightBeltsInSportsMainMenuUrl = "https://www.sporter.com/en-sa/sports/men/fitness-and-training/fitness-equipment/weight-belts/";
	String scootersInSportsMainMenuUrl = "https://www.sporter.com/en-sa/sports/men/fitness-and-training/fitness-equipment/scooters/";
	String trainingAccessoriesInSportsMainMenuUrl = "https://www.sporter.com/en-sa/sports/men/fitness-and-training/training-accessories/";
	String shakersBottlesInSportsMainMenuUrl = "https://www.sporter.com/en-sa/sports/men/fitness-and-training/training-accessories/shakers-bottles/";
	String bagsInSportsMainMenuUrl = "https://www.sporter.com/en-sa/sports/men/fitness-and-training/training-accessories/bags/";
	String glovesInSportsMainMenuUrl = "https://www.sporter.com/en-sa/sports/men/fitness-and-training/training-accessories/gloves/";
	String bracesSleevesInSportsMainMenuUrl = "https://www.sporter.com/en-sa/sports/men/fitness-and-training/training-accessories/braces-sleeves/";
	String mouthguardInSportsMainMenuUrl = "https://www.sporter.com/en-sa/sports/men/fitness-and-training/training-accessories/mouthguard/";
	String apparelInSportsMainMenuUrl = "https://www.sporter.com/en-sa/sports/men/apparel/";
	String sportsWearInSportsMainMenuUrl = "https://www.sporter.com/en-sa/sports/men/apparel/sportswear/";
	String pantsInSportsMainMenuUrl = "https://www.sporter.com/en-sa/sports/men/apparel/sportswear/pants/";
	String shortsInSportsMainMenuUrl = "https://www.sporter.com/en-sa/sports/men/apparel/sportswear/shorts/";
	String hoodiesInSportsMainMenuUrl = "https://www.sporter.com/en-sa/sports/men/apparel/sportswear/hoodies/";
	String tShirtsInSportsMainMenuUrl = "https://www.sporter.com/en-sa/sports/men/apparel/sportswear/t-shirts/";
	String tanksInSportsMainMenuUrl = "https://www.sporter.com/en-sa/sports/men/apparel/sportswear/tanks/";
	String footwearInSportsMainMenuUrl = "https://www.sporter.com/en-sa/sports/men/apparel/footwear/";
	String sneakersInSportsMainMenuUrl = "https://www.sporter.com/en-sa/sports/men/apparel/footwear/sneakers/";
	String trainingShoesInSportsMainMenuUrl = "https://www.sporter.com/en-sa/sports/men/apparel/footwear/training-shoes/";
	String runningShoesInSportsMainMenuUrl = "https://www.sporter.com/en-sa/sports/men/apparel/footwear/running-shoes/";
	String womenInSportsMainMenuUrl = "https://www.sporter.com/en-sa/sports/women/";
	String womenSportsTechInSportsMainMenuUrl = "https://www.sporter.com/en-sa/sports/women/sports-tech/";
	String womenWearableTechInSportsMainMenuUrl = "https://www.sporter.com/en-sa/sports/women/sports-tech/wearable-tech/";
	String womenCamerasInSportsMainMenuUrl = "https://www.sporter.com/en-sa/sports/women/sports-tech/cameras/";
	String womenPhoneAccessoriesInSportsMainMenuUrl = "https://www.sporter.com/en-sa/sports/women/sports-tech/phone-accessories/";
	String womenPersonalCareInSportsMainMenuUrl = "https://www.sporter.com/en-sa/sports/women/personal-care/";
	String womenShoweringInSportsMainMenuUrl = "https://www.sporter.com/en-sa/sports/women/personal-care/showering/";
	String womenSkinCareInSportsMainMenuURL = "https://www.sporter.com/en-sa/sports/women/personal-care/skin-care/";
	String womenBodyCareInSportsMainMenuURL = "https://www.sporter.com/en-sa/sports/women/personal-care/body-care/";
	String womenOralCareInSportsMainMenuURL = "https://www.sporter.com/en-sa/sports/women/personal-care/oral-care/";
	String womenTherapyInSportsMainMenuURL = "https://www.sporter.com/en-sa/sports/women/personal-care/therapy/";
	String womenMasksInSportsMainMenuURL = "https://www.sporter.com/en-sa/sports/women/personal-care/masks/";
	String womenFitnessAndTrainingInSportsMainMenuURL = "https://www.sporter.com/en-sa/sports/women/fitness-and-training/";
	String womenTrainingAccessoriesInSportsMainMenuURL = "https://www.sporter.com/en-sa/sports/women/fitness-and-training/training-accessories/";

	@Test(description = "Checking_all_Main_categories_Of_MegaMenu", priority = 1)
	public void Checking_all_Main_categories_Of_MegaMenu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Assert.assertTrue(MegamenuPage.getMegaMenuSection().isDisplayed());
		Assert.assertEquals(
				MegamenuPage.getMegaMenuList().get(0).getText(), "Shop By\n" + "Sport Supplements\n"
						+ "Vitamins & Health\n" + "Healthy Food\n" + "SPORTS\n" + "Women's Only",
				"The MegaMenu is not correct");
	}

	@Test(description = "Checking_all_the_main_categories_IN_ShopBY ", priority = 2)
	public void Checking_all_the_main_categories_IN_ShopBY() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		// MegamenuPage.switchTo Country();
		Assert.assertEquals(MegamenuPage.getShopeByMenu().getText(), "Shop By");
		Assert.assertEquals(MegamenuPage.getSportsSupplementsOption().getAttribute("textContent"),
				" Sports Supplements\n\n");
		Assert.assertEquals(MegamenuPage.getVitaminsAndHealthOption().getAttribute("textContent"),
				" Vitamins & Health\n\n");
		Assert.assertEquals(MegamenuPage.getHealthFoodOption().getAttribute("textContent"), " Healthy Food\n\n");
		Assert.assertEquals(MegamenuPage.getSportsOption().getAttribute("textContent"), " SPORTS\n\n");
		Assert.assertEquals(MegamenuPage.getWomensOnlyOption().getAttribute("textContent"), " Women's Only\n\n");
		Assert.assertEquals(MegamenuPage.getByBrandOption().getAttribute("textContent"), " By Brand\n\n");
		Assert.assertEquals(MegamenuPage.getByGoalOption().getAttribute("textContent"), " By Goal\n\n");
		Assert.assertEquals(MegamenuPage.getSalesAndOffersOption().getAttribute("textContent"), " Sales & Offers\n\n");
		Assert.assertEquals(MegamenuPage.getSporterStacksOption().getAttribute("textContent"), " Sporter Stacks\n\n");
	}

	private Object getShopeByMenu() {
		// TODO Auto-generated method stub
		return null;
	}



	@Test(description = "Checking_Hover_Of_SHOPBY", priority = 6)
	public void Checking_Hover_Of_SHOPBY() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();

		Actions action = new Actions(driver);
		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsSupplementsOption()).perform();
		waitUntilDisplayed(MegamenuPage.getSubMenuSection());

		Assert.assertTrue(MegamenuPage.getSubMenuSection().isDisplayed(), "The Sports Supplements sub menu is missing");
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		waitUntilDisplayed(MegamenuPage.getSubMenuSection());
		Assert.assertTrue(MegamenuPage.getSubMenuSection().isDisplayed(),
				"The Vitamins And Health sub menu is missing");
		action.moveToElement(MegamenuPage.getHealthFoodOption()).perform();
		waitUntilClickable(MegamenuPage.getSubMenuSection());
		Assert.assertTrue(MegamenuPage.getSubMenuSection().isDisplayed(), "The Health Food sub menu is missing");
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		waitUntilClickable(MegamenuPage.getSubMenuSection());
		Assert.assertTrue(MegamenuPage.getSubMenuSection().isDisplayed(), "The Sports sub menu is missing");
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		waitUntilClickable(MegamenuPage.getSubMenuSection());
		Assert.assertTrue(MegamenuPage.getSubMenuSection().isDisplayed(), "The By Brand sub menu is missing");
	}

	@Test(description = "checking_correct_URL_Suppement_AND_EmptypageIssue", priority = 1)
	public void checking_correct_URL_Suppement_AND_EmptypageIssue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsSupplementsOption()).perform();
		MegamenuPage.getSportsSupplementsOption().click();
		Assert.assertTrue(driver.getCurrentUrl().contains(sportSupplementsUrl));
		// boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page
		// Not Found");
		// assertFalse(verifyTitle, "Page Not Found Is Displayed");
		// boolean EmptyPage = driver.getPageSource().contains("We can't find products
		// matching the selection.");
		// assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "checking_correct_URL_Suppement_AND_EmptypageIssue", priority = 8)
	public void checking_correct_URL_VitaminsANDHealth_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		MegamenuPage.getVitaminsAndHealthOption().click();
		Assert.assertTrue(driver.getCurrentUrl().contains(healthVitaminsUrl));
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "checking_correct_URL_HealthyFood_AND_Empty_Page_Issue", priority = 9)
	public void checking_correct_URL_HealthyFood_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getHealthFoodOption()).perform();
		MegamenuPage.getHealthFoodOption().click();
		Assert.assertTrue(driver.getCurrentUrl().contains(healthyFoodsUrl));
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "checking_correct_URL_Sports_AND_Empty_Page_Issue", priority = 10)
	public void checking_correct_URL_Sports_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		MegamenuPage.getSportsOption().click();
		Assert.assertTrue(driver.getCurrentUrl().contains(sportsUrl));
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "chcking_The_Arrow_icon_for_ShopBY ", priority = 10)
	public void chcking_The_Arrow_icon_for_ShopBY_Menu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();

		Actions action = new Actions(driver);
		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		Assert.assertTrue(MegamenuPage.getSportsSupplementsArrowIcon().isDisplayed());
		Assert.assertTrue(MegamenuPage.getHealthFoodArrowIcon().isDisplayed());
		Assert.assertTrue(MegamenuPage.getVitaminsAndHealthArrowIcon().isDisplayed());
		Assert.assertTrue(MegamenuPage.getByBrandArrowIcon().isDisplayed());
		Assert.assertTrue(MegamenuPage.getSportsArrowIcon().isDisplayed());
	}

	@Test(description = "checking_correct_URL_WomensOnly_AND_Empty_Page_Issue", priority = 11)
	public void checking_correct_URL_WomensOnly_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getWomensOnlyOption()).perform();
		MegamenuPage.getWomensOnlyOption().click();
		Assert.assertTrue(driver.getCurrentUrl().contains(womenOnlyUrl));
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	// There's a bug here, clicking on the By Brand Menu wil redirect the user to
	// the homePage

	@Test(description = "checking_correct_URL_BYGoal_AND_Empty_Page_Issue", priority = 1)
	public void checking_correct_URL_ByGoalOptionInsideShopByMenuRedirectUserToCorrectURL() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByGoalOption()).perform();
		MegamenuPage.getByGoalOption().click();
		Assert.assertTrue(driver.getCurrentUrl().contains(byGoalUrl));
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "checking_correct_URL_SalesAndOffers_AND_Empty_Page_Issue", priority = 1)
	public void checking_correct_URL_SalesAndOffers_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSalesAndOffersOption()).perform();
		MegamenuPage.getSalesAndOffersOption().click();
		Assert.assertTrue(driver.getCurrentUrl().contains(salesAndOffersUrl));
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "checking_correct_URL_SporterStack_AND_Empty_Page_Issue", priority = 15)
	public void checking_correct_URL_SporterStack_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSporterStacksOption()).perform();
		MegamenuPage.getSporterStacksOption().click();
		Assert.assertTrue(driver.getCurrentUrl().contains(sportStacksUrl));
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking_All_ThebCategories_for_Sports_Supplements", priority = 17)
	public void Checking_All_ThebCategories_for_Sports_Supplements () {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsSupplementsOption()).perform();
		// DataHelperAndWait.implicitWait(5);
		Assert.assertEquals(MegamenuPage.getSubMenuList().get(0).getText(),
				"PROTEIN\n" + "Whey Protein\n" + "Whey Protein Isolate\n" + "Protein Blends\n" + "Non-dairy Protein\n"
						+ "Casein Protein\n" + "Diet Protein\n" + "Mass Gainers\n" + "CREATINE\n"
						+ "Creatine Monohydrate\n" + "Creatine Blends\n" + "AMINO ACIDS\n" + "BCAA\n" + "EAA\n"
						+ "Arginine\n" + "Beta Alanine\n" + "HMB\n" + "Amino Acid Powders\n" + "Amino Acid Pills\n"
						+ "Citrulline\n" + "Amino Acid Liquids\n" + "MUSCLE BOOSTERS\n" + "Testosterone Boosters\n"
						+ "Gh Boosters\n" + "WEIGHT MANAGEMENT\n" + "Stimulant Weight Loss\n"
						+ "Non-stimulant Weight Loss\n" + "Meal Replacements\n" + "Metabolism Support\n"
						+ "Toning Creams\n" + "MCT\n" + "RECOVERY\n" + "Glutamine\n" + "Recovery Blends\n"
						+ "Electrolytes & Hydration\n" + "CARBOHYDRATES\n" + "Carbohydrate Powders\n"
						+ "ENERGY & ENDURANCE\n" + "Stimulant Energy\n" + "Non-stimulant Energy\n" + "GAMING & FOCUS\n"
						+ "Gaming Essentials");
	}

	@Test(description = "checking_The_Bold_font_SubCategories_OF_Sports_Supplements_Gategory", priority = 18)
	public void checking_The_Bold_font_SubCategories_OF_Sports_Supplements_Gategory() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsSupplementsOption()).perform();
		Assert.assertTrue(
				MegamenuPage.getProteinOptionInSportSupplementsMenu().getCssValue("font-weight").contains("700"));
		Assert.assertTrue(
				MegamenuPage.getCreatineOptionInSportSupplementsMenu().getCssValue("font-weight").contains("700"));
		Assert.assertTrue(
				MegamenuPage.getAminoAcidsOptionInSportSupplementsMenu().getCssValue("font-weight").contains("700"));
		Assert.assertTrue(
				MegamenuPage.getCarbohydratesOptionInSportSupplementsMenu().getCssValue("font-weight").contains("700"));
		Assert.assertTrue(MegamenuPage.getEnergyAndEnduranceOptionInSportSupplementsMenu().getCssValue("font-weight")
				.contains("700"));
		Assert.assertTrue(MegamenuPage.getGamingAndFocusOptionInSportSupplementsMenu().getCssValue("font-weight")
				.contains("700"));
		Assert.assertTrue(MegamenuPage.getMuscleBoostersOptionInSportSupplementsMenu().getCssValue("font-weight")
				.contains("700"));
		Assert.assertTrue(MegamenuPage.getWeightManagementOptionInSportSupplementsMenu().getCssValue("font-weight")
				.contains("700"));
		Assert.assertTrue(
				MegamenuPage.getRecoveryOptionInSportSupplementsMenu().getCssValue("font-weight").contains("700"));
		
	}

	@Test(description = "checking_the_uppercase_for__Sports_Supplements ", priority = 7)
	public void checking_the_uppercase_for__Sports_Supplements() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsSupplementsOption()).perform();
		Assert.assertEquals(MegamenuPage.getProteinOptionInSportSupplementsMenu().getCssValue("text-transform"),
				"uppercase");
		Assert.assertEquals(MegamenuPage.getCreatineOptionInSportSupplementsMenu().getCssValue("text-transform"),
				"uppercase");
		Assert.assertEquals(MegamenuPage.getAminoAcidsOptionInSportSupplementsMenu().getCssValue("text-transform"),
				"uppercase");
		Assert.assertEquals(MegamenuPage.getMuscleBoostersOptionInSportSupplementsMenu().getCssValue("text-transform"),
				"uppercase");
		Assert.assertEquals(
				MegamenuPage.getWeightManagementOptionInSportSupplementsMenu().getCssValue("text-transform"),
				"uppercase");
		Assert.assertEquals(MegamenuPage.getRecoveryOptionInSportSupplementsMenu().getCssValue("text-transform"),
				"uppercase");
		Assert.assertEquals(MegamenuPage.getCarbohydratesOptionInSportSupplementsMenu().getCssValue("text-transform"),
				"uppercase");
		Assert.assertEquals(
				MegamenuPage.getEnergyAndEnduranceOptionInSportSupplementsMenu().getCssValue("text-transform"),
				"uppercase");
		Assert.assertEquals(MegamenuPage.getGamingAndFocusOptionInSportSupplementsMenu().getCssValue("text-transform"),
				"uppercase");
	}

	@Test(description = "checking_correct_URL_Protein_Subcategory_AND_Empty_Page_Issue ", priority = 20)
	public void checking_correct_URL_Protein_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsSupplementsOption()).perform();
		MegamenuPage.getProteinOptionInSportSupplementsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), proteinSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "checking_correct_URL_Creatine_Subcategory_AND_Empty_Page_Issue", priority = 21)
	public void checking_correct_URL_Creatine_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getCreatineOptionInSportSupplementsMenu()).perform();
		MegamenuPage.getCreatineOptionInSportSupplementsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), creatineSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "checking_correct_URL_Amino_Acids_Subcategory_AND_Empty_Page_Issue", priority = 22)
	public void checking_correct_URL_Amino_Acids_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getAminoAcidsOptionInSportSupplementsMenu()).perform();
		MegamenuPage.getAminoAcidsOptionInSportSupplementsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), aminoAcidsSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "checking_correct_URL_Muscle_Boosters_Subcategory_AND_Empty_Page_Issue", priority = 23)
	public void checking_correct_URL_Muscle_Boosters_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getMuscleBoostersOptionInSportSupplementsMenu()).perform();
		MegamenuPage.getMuscleBoostersOptionInSportSupplementsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), muscleBoostersSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "checking_correct_URL_Weight_Management_Subcategory_AND_Empty_Page_Issue", priority = 24)
	public void checking_correct_URL_Weight_Management_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getWeightManagementOptionInSportSupplementsMenu()).perform();
		MegamenuPage.getWeightManagementOptionInSportSupplementsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), weightManagementSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "checking_correct_URL_Recovery_option_Subcategory_AND_Empty_Page_Issue", priority = 25)
	public void checking_correct_URL_Recovery_option_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getRecoveryOptionInSportSupplementsMenu()).perform();
		MegamenuPage.getRecoveryOptionInSportSupplementsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), recoverySportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "checking_correct_URL_Carbohydrates_option_Subcategory_AND_Empty_Page_Issue", priority = 26)
	public void checking_correct_URL_Carbohydrates_option_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getCarbohydratesOptionInSportSupplementsMenu()).perform();
		MegamenuPage.getCarbohydratesOptionInSportSupplementsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), carbohydratesSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "checking_correct_URL_EnergyAndEndurance_Subcategory_AND_Empty_Page_Issue", priority = 27)
	public void checking_correct_URL_EnergyAndEndurance_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);
		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getEnergyAndEnduranceOptionInSportSupplementsMenu()).perform();
		MegamenuPage.getEnergyAndEnduranceOptionInSportSupplementsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), energyAndEnduranceSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "checking_correct_URL_GamingAndFocus_Subcategory_AND_Empty_Page_Issue", priority = 28)
	public void checking_correct_URL_GamingAndFocus_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);
		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getGamingAndFocusOptionInSportSupplementsMenu()).perform();
		MegamenuPage.getGamingAndFocusOptionInSportSupplementsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), gamingAndFocusSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "checking_correct_URL_WheyProtein_Subcategory_AND_Empty_Page_Issue", priority = 29)
	public void checking_correct_URL_WheyProtein_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getWheyProteinOptionInSportSupplementsMenu()).perform();
		MegamenuPage.getWheyProteinOptionInSportSupplementsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), wheyProteinSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "checking_correct_URL_WheyProteinIsolate_Subcategory_AND_Empty_Page_Issue", priority = 30)
	public void checking_correct_URL_WheyProteinIsolate_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getWheyProteinIsolateOptionInSportSupplementsMenu()).perform();
		MegamenuPage.getWheyProteinIsolateOptionInSportSupplementsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), WheyProteinIsolateSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "checking_correct_URL_ProteinBlends_Subcategory_AND_Empty_Page_Issue", priority = 31)
	public void checking_correct_URL_ProteinBlends_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getProteinBlendsOptionInSportSupplementsMenu()).perform();
		MegamenuPage.getProteinBlendsOptionInSportSupplementsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), proteinBlendsSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "checking_correct_URL_NonDairyProtein_Subcategory_AND_Empty_Page_Issue", priority = 32)
	public void checking_correct_URL_NonDairyProtein_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getNonDairyProteinOptionInSportSupplementsMenu()).perform();
		MegamenuPage.getNonDairyProteinOptionInSportSupplementsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), nonDairyProteinSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "checking_correct_URL_CaseinProtein_Subcategory_AND_Empty_Page_Issue", priority = 33)
	public void checking_correct_URL_CaseinProtein_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getCaseinProteinOptionInSportSupplementsMenu()).perform();
		MegamenuPage.getCaseinProteinOptionInSportSupplementsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), caseinProteinSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "checking_correct_URL_DietProtein_Subcategory_AND_Empty_Page_Issue", priority = 34)
	public void checking_correct_URL_DietProtein_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getDietProteinOptionInSportSupplementsMenu()).perform();
		MegamenuPage.getDietProteinOptionInSportSupplementsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), dietProteinSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "checking_correct_URL_MassGainers_Subcategory_AND_Empty_Page_Issue", priority = 35)
	public void checking_correct_URL_MassGainers_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getMassGainersOptionInSportSupplementsMenu()).perform();
		MegamenuPage.getMassGainersOptionInSportSupplementsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), massGainersSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "checking_correct_URL_CreatineMonohydrate_Subcategory_AND_Empty_Page_Issue", priority = 36)
	public void checking_correct_URL_CreatineMonohydrate_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getCreatineMonohydrateOptionInSportSupplementsMenu()).perform();
		MegamenuPage.getCreatineMonohydrateOptionInSportSupplementsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), creatineMonohydrateSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "checking_correct_URL_CreatineBlends_Subcategory_AND_Empty_Page_Issue", priority = 37)
	public void checking_correct_URL_CreatineBlends_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getCreatineBlendsOptionInSportSupplementsMenu()).perform();
		MegamenuPage.getCreatineBlendsOptionInSportSupplementsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), creatineBlendsSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "checking_correct_URL_BCAA_Subcategory_AND_Empty_Page_Issue", priority = 38)
	public void checking_correct_URL_BCAA_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getbCAAOptionInSportSupplementsMenu()).perform();
		MegamenuPage.getbCAAOptionInSportSupplementsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), bCAASportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "checking_correct_URL_EAA_Subcategory_AND_Empty_Page_Issue", priority = 39)
	public void checking_correct_URL_EAA_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getEAAOptionInSportSupplementsMenu()).perform();
		MegamenuPage.getEAAOptionInSportSupplementsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), eAASportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "checking_correct_URL_Arginine_Subcategory_AND_Empty_Page_Issue", priority = 40)
	public void checking_correct_URL_Arginine_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getArginineOptionInSportSupplementsMenu()).perform();
		MegamenuPage.getArginineOptionInSportSupplementsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), arginineSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "checking_correct_URL_BetaAlanine_Subcategory_AND_Empty_Page_Issue", priority = 41)
	public void checking_correct_URL_BetaAlanine_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getBetaAlanineOptionInSportSupplementsMenu()).perform();
		MegamenuPage.getBetaAlanineOptionInSportSupplementsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), betaAlanineSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "checking_correct_URL_HMb_Subcategory_AND_Empty_Page_Issue", priority = 42)
	public void checking_correct_URL_HMb_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getHMBOptionInSportSupplementsMenu()).perform();
		MegamenuPage.getHMBOptionInSportSupplementsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), hMBSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "checking_correct_URL_AminoAcidPowders_Subcategory_AND_Empty_Page_Issue", priority = 43)
	public void checking_correct_URL_AminoAcidPowders_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getAminoAcidPowdersOptionInSportSupplementsMenu()).perform();
		MegamenuPage.getAminoAcidPowdersOptionInSportSupplementsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), aminoAcidPowdersSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Amino Acid Pills Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 44)
	public void checking_correct_URL_AminoAcidPills_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getAminoAcidPillsOptionInSportSupplementsMenu()).perform();
		MegamenuPage.getAminoAcidPillsOptionInSportSupplementsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), aminoAcidPillsSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Citrulline Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 45)
	public void checking_correct_URL_Citrulline_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getCitrullineOptionInSportSupplementsMenu()).perform();
		MegamenuPage.getCitrullineOptionInSportSupplementsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), citrullineSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Amino Acid Liquids Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 46)
	public void checking_correct_URL_AminoAcidLiquids_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getAminoAcidLiquidsOptionInSportSupplementsMenu()).perform();
		MegamenuPage.getAminoAcidLiquidsOptionInSportSupplementsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), aminoAcidLiquidsSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Testosterone Boosters Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 47)
	public void checking_correct_URL_TestosteroneBoosters_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getTestosteroneBoostersOptionInSportSupplementsMenu()).perform();
		MegamenuPage.getTestosteroneBoostersOptionInSportSupplementsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), testosteroneBoostersSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Gh Boosters Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 48)
	public void checking_correct_URL_GhBoosters_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getGhBoostersOptionInSportSupplementsMenu()).perform();
		MegamenuPage.getGhBoostersOptionInSportSupplementsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), ghBoostersSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Stimulant Weight Loss Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 49)
	public void checking_correct_URL_StimulantWeightLoss_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getStimulantWeightLossOptionInSportSupplementsMenu()).perform();
		MegamenuPage.getStimulantWeightLossOptionInSportSupplementsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), stimulantWeightLossSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Non Stimulant Weight Loss Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 50)
	public void checking_correct_URL_NonStimulantWeightLoss_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getNonStimulantWeightLossOptionInSportSupplementsMenu()).perform();
		MegamenuPage.getNonStimulantWeightLossOptionInSportSupplementsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), nonStimulantWeightLossSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Meal Replacements Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 51)
	public void checking_correct_URL_MealReplacements_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getMealReplacementsOptionInSportSupplementsMenu()).perform();
		MegamenuPage.getMealReplacementsOptionInSportSupplementsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), mealReplacementsSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Metabolism Support Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 52)
	public void checking_correct_URL_MetabolismSupport_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getMetabolismSupportOptionInSportSupplementsMenu()).perform();
		MegamenuPage.getMetabolismSupportOptionInSportSupplementsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), metabolismSupportSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Toning Creams Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 53)
	public void checking_correct_URL_ToningCreams_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getToningCreamsOptionInSportSupplementsMenu()).perform();
		MegamenuPage.getToningCreamsOptionInSportSupplementsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), toningCreamsSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the MCT Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 54)
	public void checking_correct_URL_Mct_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getMctOptionInSportSupplementsMenu()).perform();
		MegamenuPage.getMctOptionInSportSupplementsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), mctSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Glutamine Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 55)
	public void checking_correct_URL_Glutamine_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getGlutamineOptionInSportSupplementsMenu()).perform();
		MegamenuPage.getGlutamineOptionInSportSupplementsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), glutamineSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Recovery Blend Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 56)
	public void checking_correct_URL_RecoveryBlend_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getRecoveryBlendOptionInSportSupplementsMenu()).perform();
		MegamenuPage.getRecoveryBlendOptionInSportSupplementsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), recoveryBlendSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Electrolytes And Hydration Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 57)
	public void checking_correct_URL_ElectrolytesAndHydration_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getElectrolytesAndHydrationOptionInSportSupplementsMenu()).perform();
		MegamenuPage.getElectrolytesAndHydrationOptionInSportSupplementsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), electrolytesAndHydrationSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Carbohydrate Powders Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 58)
	public void checking_correct_URL_CarbohydratePowders_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getCarbohydratePowdersOptionInSportSupplementsMenu()).perform();
		MegamenuPage.getCarbohydratePowdersOptionInSportSupplementsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), carbohydratePowdersSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Stimulant Energy Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 59)
	public void checking_correct_URL_StimulantEnergy_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getStimulantEnergyOptionInSportSupplementsMenu()).perform();
		MegamenuPage.getStimulantEnergyOptionInSportSupplementsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), stimulantEnergySportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Non Stimulant Energy Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 60)
	public void checking_correct_URL_NonStimulantEnergy_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getNonStimulantEnergyOptionInSportSupplementsMenu()).perform();
		MegamenuPage.getNonStimulantEnergyOptionInSportSupplementsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), nonStimulantEnergySportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Gaming Essentials Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 61)
	public void checking_correct_URL_GamingEssentials_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getGamingEssentialsOptionInSportSupplementsMenu()).perform();
		MegamenuPage.getGamingEssentialsOptionInSportSupplementsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), gamingEssentialsSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "checking_The_CategoriesAndSubCategoriesVitaminsAndHealth_Menu", priority = 62)
	public void checking_The_CategoriesAndSubCategoriesVitaminsAndHealth_Menu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		// DataHelperAndWait.implicitWait(5);
		Assert.assertEquals(MegamenuPage.getOptionList().get(0).getText(),
				"FEATURED\n" + "Alive! Vitamins\n" + "Sexual Health\n" + "ESSENTIAL VITAMINS\n" + "Folic Acid\n"
						+ "Vitamin A\n" + "Vitamin B\n" + "Vitamin C\n" + "Vitamin D\n" + "Vitamin E\n" + "Vitamin K\n"
						+ "MULTIVITAMINS\n" + "Vitamins For Kids\n" + "Multivitamins For Men\n"
						+ "Multivitamins For Women\n" + "BONE & JOINT\n" + "Bone Health\n" + "Joint Health\n"
						+ "BEAUTY\n" + "Collagen\n" + "Hair, Skin & Nails\n" + "FISH OIL & OMEGAS\n" + "Fish Oil\n"
						+ "Omega 3 6 9\n" + "HEALTHY LIFESTYLE\n" + "Antioxidants\n" + "Blood Sugar Support\n"
						+ "Brain Support\n" + "Heart Health\n" + "Detox & Cleanse\n" + "Energy Formulas\n"
						+ "Eye Health\n" + "Herbs\n" + "Hormones Balance\n" + "Immune Support\n" + "Mens Health\n"
						+ "Stress Relief\n" + "Sleep Support\n" + "Superfoods\n" + "Urinary Tract Support\n"
						+ "Weight Management\n" + "Womens Health\n" + "DIGESTION\n" + "Digestive Support\n"
						+ "Probiotics\n" + "SPORT VITAMINS\n" + "Amino Acids\n" + "MINERALS\n" + "Calcium\n" + "Iron\n"
						+ "Magnesium\n" + "Multimineral Formulas\n" + "Zinc\n" + "Potassium\n" + "HEALTHY DRINKS\n"
						+ "Drinkable Vitamins\n" + "PETS\n" + "Supplements & More");
	}

	@Test(description = "Checking_The_Bold_Font_For_MainCategoriesInTheVitaminsAndHealth", priority = 63)
	public void Checking_The_Bold_Font_For_MainCategoriesInTheVitaminsAndHealth() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		Assert.assertTrue(
				MegamenuPage.getFeaturedOptionInVitaminsAndHealthMenu().getCssValue("font-weight").contains("700"));
		Assert.assertTrue(MegamenuPage.getEssentialVitaminsOptionInVitaminsAndHealthMenu().getCssValue("font-weight")
				.contains("700"));
		Assert.assertTrue(MegamenuPage.getMultiVitaminsOptionInVitaminsAndHealthMenu().getCssValue("font-weight")
				.contains("700"));
		Assert.assertTrue(
				MegamenuPage.getBoneAndJointOptionInVitaminsAndHealthMenu().getCssValue("font-weight").contains("700"));
		Assert.assertTrue(
				MegamenuPage.getBeautyOptionInVitaminsAndHealthMenu().getCssValue("font-weight").contains("700"));
		Assert.assertTrue(MegamenuPage.getFishOilOmegasOptionInVitaminsAndHealthMenu().getCssValue("font-weight")
				.contains("700"));
		Assert.assertTrue(MegamenuPage.getHealthLifestyleOptionInVitaminsAndHealthMenu().getCssValue("font-weight")
				.contains("700"));
		Assert.assertTrue(
				MegamenuPage.getDigestionOptionInVitaminsAndHealthMenu().getCssValue("font-weight").contains("700"));
		Assert.assertTrue(MegamenuPage.getSportVitaminsOptionInVitaminsAndHealthMenu().getCssValue("font-weight")
				.contains("700"));
		Assert.assertTrue(
				MegamenuPage.getMineralsOptionInVitaminsAndHealthMenu().getCssValue("font-weight").contains("700"));
		Assert.assertTrue(MegamenuPage.getHealthyDrinksOptionInVitaminsAndHealthMenu().getCssValue("font-weight")
				.contains("700"));
		Assert.assertTrue(
				MegamenuPage.getPetsOptionInVitaminsAndHealthMenu().getCssValue("font-weight").contains("700"));
	}

	@Test(description = "checking_The_uppercase_In_MainCategories_OF_TheVitaminsAndHealth ", priority = 64)
	public void checking_The_uppercase_In_MainCategories_OF_TheVitaminsAndHealth() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		Assert.assertEquals(MegamenuPage.getFeaturedOptionInVitaminsAndHealthMenu().getCssValue("text-transform"),
				"uppercase");
		Assert.assertEquals(
				MegamenuPage.getEssentialVitaminsOptionInVitaminsAndHealthMenu().getCssValue("text-transform"),
				"uppercase");
		Assert.assertEquals(MegamenuPage.getMultiVitaminsOptionInVitaminsAndHealthMenu().getCssValue("text-transform"),
				"uppercase");
		Assert.assertEquals(MegamenuPage.getBoneAndJointOptionInVitaminsAndHealthMenu().getCssValue("text-transform"),
				"uppercase");
		Assert.assertEquals(MegamenuPage.getBeautyOptionInVitaminsAndHealthMenu().getCssValue("text-transform"),
				"uppercase");
		Assert.assertEquals(MegamenuPage.getFishOilOmegasOptionInVitaminsAndHealthMenu().getCssValue("text-transform"),
				"uppercase");
		Assert.assertEquals(
				MegamenuPage.getHealthLifestyleOptionInVitaminsAndHealthMenu().getCssValue("text-transform"),
				"uppercase");
		Assert.assertEquals(MegamenuPage.getDigestionOptionInVitaminsAndHealthMenu().getCssValue("text-transform"),
				"uppercase");
		Assert.assertEquals(MegamenuPage.getSportVitaminsOptionInVitaminsAndHealthMenu().getCssValue("text-transform"),
				"uppercase");
		Assert.assertEquals(MegamenuPage.getMineralsOptionInVitaminsAndHealthMenu().getCssValue("text-transform"),
				"uppercase");
		Assert.assertEquals(MegamenuPage.getHealthyDrinksOptionInVitaminsAndHealthMenu().getCssValue("text-transform"),
				"uppercase");
		Assert.assertEquals(MegamenuPage.getPetsOptionInVitaminsAndHealthMenu().getCssValue("text-transform"),
				"uppercase");
	}

	@Test(description = "Checking clicking on the Featured Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 65)
	public void checking_correct_URL_Featured_vitamins_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		action.moveToElement(MegamenuPage.getFeaturedOptionInVitaminsAndHealthMenu()).perform();
		MegamenuPage.getFeaturedOptionInVitaminsAndHealthMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), featuredVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Alive Vitamins Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 66)
	public void checking_correct_URL_AliveVitamins_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		action.moveToElement(MegamenuPage.getAliveVitaminsOptionInVitaminsAndHealthMenu()).perform();
		MegamenuPage.getAliveVitaminsOptionInVitaminsAndHealthMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), aliveVitaminsVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Sexual Health Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 67)
	public void checking_correct_URL_SexualHealth_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		action.moveToElement(MegamenuPage.getSexualHealthOptionInVitaminsAndHealthMenu()).perform();
		MegamenuPage.getSexualHealthOptionInVitaminsAndHealthMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), sexualHealthVitaminsAndHealthURL);
		System.out.println(driver.getCurrentUrl());
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Essential Vitamins Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
	public void checking_correct_URL_EssentialVitamins_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		action.moveToElement(MegamenuPage.getEssentialVitaminsOptionInVitaminsAndHealthMenu()).perform();
		MegamenuPage.getEssentialVitaminsOptionInVitaminsAndHealthMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), essentialVitaminsVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Folic Acid Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 69)
	public void checking_correct_URL_FolicAcid_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		action.moveToElement(MegamenuPage.getFolicAcidOptionInVitaminsAndHealthMenu()).perform();
		MegamenuPage.getFolicAcidOptionInVitaminsAndHealthMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), folicAcidVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Vitamin A Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 70)
	public void checking_correct_URL_VitaminA_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		action.moveToElement(MegamenuPage.getVitaminAOptionInVitaminsAndHealthMenu()).perform();
		MegamenuPage.getVitaminAOptionInVitaminsAndHealthMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), vitaminAVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Vitamin B Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 71)
	public void checking_correct_URL_VitaminB_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		action.moveToElement(MegamenuPage.getVitaminBOptionInVitaminsAndHealthMenu()).perform();
		MegamenuPage.getVitaminBOptionInVitaminsAndHealthMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), vitaminBVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Vitamin C Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 72)
	public void checking_correct_URL_VitaminC_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		action.moveToElement(MegamenuPage.getVitaminCOptionInVitaminsAndHealthMenu()).perform();
		MegamenuPage.getVitaminCOptionInVitaminsAndHealthMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), vitaminCVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Vitamin D Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 73)
	public void checking_correct_URL_VitaminD_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		action.moveToElement(MegamenuPage.getVitaminDOptionInVitaminsAndHealthMenu()).perform();
		MegamenuPage.getVitaminDOptionInVitaminsAndHealthMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), vitaminDVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Vitamin E Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 74)
	public void checking_correct_URL_VitaminE_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		action.moveToElement(MegamenuPage.getVitaminEOptionInVitaminsAndHealthMenu()).perform();
		MegamenuPage.getVitaminEOptionInVitaminsAndHealthMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), vitaminEVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Vitamin K Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 75)
	public void checking_correct_URL_VitaminK_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		action.moveToElement(MegamenuPage.getVitaminKOptionInVitaminsAndHealthMenu()).perform();
		MegamenuPage.getVitaminKOptionInVitaminsAndHealthMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), vitaminKVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Multi Vitamins Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 76)
	public void checking_correct_URL_MultiVitamins_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		action.moveToElement(MegamenuPage.getMultiVitaminsOptionInVitaminsAndHealthMenu()).perform();
		MegamenuPage.getMultiVitaminsOptionInVitaminsAndHealthMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), multiVitaminsVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Vitamins For Kids Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 77)
	public void checking_correct_URL_VitaminsForKids_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		action.moveToElement(MegamenuPage.getVitaminsForKidsOptionInVitaminsAndHealthMenu()).perform();
		MegamenuPage.getVitaminsForKidsOptionInVitaminsAndHealthMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), vitaminsForKidsVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Vitamins For Men Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 78)
	public void checking_correct_URL_VitaminsForMen_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		action.moveToElement(MegamenuPage.getVitaminsForMenOptionInVitaminsAndHealthMenu()).perform();
		MegamenuPage.getVitaminsForMenOptionInVitaminsAndHealthMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), vitaminsForMenVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Vitamins For Women Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 79)
	public void checking_correct_URL_VitaminsForWomen_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		action.moveToElement(MegamenuPage.getVitaminsForWomenOptionInVitaminsAndHealthMenu()).perform();
		MegamenuPage.getVitaminsForWomenOptionInVitaminsAndHealthMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), vitaminsForWomenVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Bone And Joint Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 80)
	public void checking_correct_URL_BoneAndJoint_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		action.moveToElement(MegamenuPage.getBoneAndJointOptionInVitaminsAndHealthMenu()).perform();
		MegamenuPage.getBoneAndJointOptionInVitaminsAndHealthMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), boneJointVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Bone Health Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 81)
	public void checking_correct_URL_BoneHealth_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		action.moveToElement(MegamenuPage.getBoneHealthOptionInVitaminsAndHealthMenu()).perform();
		MegamenuPage.getBoneHealthOptionInVitaminsAndHealthMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), boneHealthVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Joint Health Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 82)
	public void checking_correct_URL_JointHealth_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		action.moveToElement(MegamenuPage.getJointHealthOptionInVitaminsAndHealthMenu()).perform();
		MegamenuPage.getJointHealthOptionInVitaminsAndHealthMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), jointHealthVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Beauty Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 83)
	public void checking_correct_URL_Beauty_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		action.moveToElement(MegamenuPage.getBeautyOptionInVitaminsAndHealthMenu()).perform();
		MegamenuPage.getBeautyOptionInVitaminsAndHealthMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), beautyVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Collagen Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 84)
	public void checking_correct_URL_Collagen_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		action.moveToElement(MegamenuPage.getCollagenOptionInVitaminsAndHealthMenu()).perform();
		MegamenuPage.getCollagenOptionInVitaminsAndHealthMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), collagenVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Hair, Skin AndNails Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 85)
	public void checking_correct_URL_HairSkinAndNails_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		action.moveToElement(MegamenuPage.getHairSkinAndNailsOptionInVitaminsAndHealthMenu()).perform();
		MegamenuPage.getHairSkinAndNailsOptionInVitaminsAndHealthMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), hairSkinAndNailsVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Fish Oil Omegas Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 86)
	public void checking_correct_URL_FishOilOmegas_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		action.moveToElement(MegamenuPage.getFishOilOmegasOptionInVitaminsAndHealthMenu()).perform();
		MegamenuPage.getFishOilOmegasOptionInVitaminsAndHealthMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), fishOilAndOmegasVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Fish Oil Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 87)
	public void checking_correct_URL_FishOil_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		action.moveToElement(MegamenuPage.getFishOilOptionInVitaminsAndHealthMenu()).perform();
		MegamenuPage.getFishOilOptionInVitaminsAndHealthMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), fishOilVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Omega369 Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 88)
	public void checking_correct_URL_Omega369_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		action.moveToElement(MegamenuPage.getOmega369OptionInVitaminsAndHealthMenu()).perform();
		MegamenuPage.getOmega369OptionInVitaminsAndHealthMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), omegaMixVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Health Lifestyle Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 89)
	public void checking_correct_URL_HealthLifestyle_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		action.moveToElement(MegamenuPage.getHealthLifestyleOptionInVitaminsAndHealthMenu()).perform();
		MegamenuPage.getHealthLifestyleOptionInVitaminsAndHealthMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), healthyLifestyleVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Antioxidants Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 90)
	public void checking_correct_URL_Antioxidants_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		action.moveToElement(MegamenuPage.getAntioxidantsOptionInVitaminsAndHealthMenu()).perform();
		MegamenuPage.getAntioxidantsOptionInVitaminsAndHealthMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), antioxidantVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Blood Sugar Support Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 91)
	public void checking_correct_URL_BloodSugarSupport_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		action.moveToElement(MegamenuPage.getBloodSugarSupportOptionInVitaminsAndHealthMenu()).perform();
		MegamenuPage.getBloodSugarSupportOptionInVitaminsAndHealthMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), bloodSugarSupportVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Brain Support Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 92)
	public void checking_correct_URL_BrainSupport_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		action.moveToElement(MegamenuPage.getBrainSupportOptionInVitaminsAndHealthMenu()).perform();
		MegamenuPage.getBrainSupportOptionInVitaminsAndHealthMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), brainSupportVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Detox And Cleanse Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 93)
	public void checking_correct_URL_DetoxAndCleanse_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		action.moveToElement(MegamenuPage.getDetoxAndCleanseOptionInVitaminsAndHealthMenu()).perform();
		MegamenuPage.getDetoxAndCleanseOptionInVitaminsAndHealthMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), detoxCleanseVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Energy Formulas Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 94)
	public void checking_correct_URL_EnergyFormulas_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		action.moveToElement(MegamenuPage.getEnergyFormulasOptionInVitaminsAndHealthMenu()).perform();
		MegamenuPage.getEnergyFormulasOptionInVitaminsAndHealthMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), energyFormulasVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Eye Health Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 95)
	public void checking_correct_URL_EyeHealth_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		action.moveToElement(MegamenuPage.getEyeHealthOptionInVitaminsAndHealthMenu()).perform();
		MegamenuPage.getEyeHealthOptionInVitaminsAndHealthMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), eyeHealthVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Herbs Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 96)
	public void checking_correct_URL_Herbs_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		action.moveToElement(MegamenuPage.getHerbsOptionInVitaminsAndHealthMenu()).perform();
		MegamenuPage.getHerbsOptionInVitaminsAndHealthMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), herbsVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Hormones Balance Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 97)
	public void checking_correct_URL_HormonesBalance_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		action.moveToElement(MegamenuPage.getHormonesBalanceOptionInVitaminsAndHealthMenu()).perform();
		MegamenuPage.getHormonesBalanceOptionInVitaminsAndHealthMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), hormonesBalanceVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Immune Support Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 98)
	public void checking_correct_URL_ImmuneSupport_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		action.moveToElement(MegamenuPage.getImmuneSupportOptionInVitaminsAndHealthMenu()).perform();
		MegamenuPage.getImmuneSupportOptionInVitaminsAndHealthMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), immuneSupportVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Mens Health Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 99)
	public void checking_correct_URL_MensHealth_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		action.moveToElement(MegamenuPage.getMensHealthOptionInVitaminsAndHealthMenu()).perform();
		MegamenuPage.getMensHealthOptionInVitaminsAndHealthMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), mensHealthVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Stress Relief Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 100)
	public void checking_correct_URL_StressRelief_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		action.moveToElement(MegamenuPage.getStressReliefOptionInVitaminsAndHealthMenu()).perform();
		MegamenuPage.getStressReliefOptionInVitaminsAndHealthMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), stressReliefVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Sleep Support Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 101)
	public void checking_correct_URL_SleepSupport_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		action.moveToElement(MegamenuPage.getSleepSupportOptionInVitaminsAndHealthMenu()).perform();
		MegamenuPage.getSleepSupportOptionInVitaminsAndHealthMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), sleepSupportVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Super Foods Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 102)
	public void checking_correct_URL_SuperFoods_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		action.moveToElement(MegamenuPage.getSuperFoodsOptionInVitaminsAndHealthMenu()).perform();
		MegamenuPage.getSuperFoodsOptionInVitaminsAndHealthMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), superFoodsVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Urinary Tract Support Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 103)
	public void checking_correct_URL_UrinaryTractSupport_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		action.moveToElement(MegamenuPage.getUrinaryTractSupportOptionInVitaminsAndHealthMenu()).perform();
		MegamenuPage.getUrinaryTractSupportOptionInVitaminsAndHealthMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), urinaryTractSupportVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Weight Management Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 104)
	public void checking_correct_URL_WeightManagement_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		action.moveToElement(MegamenuPage.getWeightManagementOptionInVitaminsAndHealthMenu()).perform();
		MegamenuPage.getWeightManagementOptionInVitaminsAndHealthMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), weightManagementVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Womens Health Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 105)
	public void checking_correct_URL_WomensHealth_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		action.moveToElement(MegamenuPage.getWomensHealthOptionInVitaminsAndHealthMenu()).perform();
		MegamenuPage.getWomensHealthOptionInVitaminsAndHealthMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), womensHealthVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Digestion Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 106)
	public void checking_correct_URL_Digestion_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		action.moveToElement(MegamenuPage.getDigestionOptionInVitaminsAndHealthMenu()).perform();
		MegamenuPage.getDigestionOptionInVitaminsAndHealthMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), digestionVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Digestion Support Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 107)
	public void checking_correct_URL_DigestionSupport_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		action.moveToElement(MegamenuPage.getDigestiveSupportOptionInVitaminsAndHealthMenu()).perform();
		MegamenuPage.getDigestiveSupportOptionInVitaminsAndHealthMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), digestionSupportVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Probiotics Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 108)
	public void checking_correct_URL_Probiotics_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		action.moveToElement(MegamenuPage.getProbioticsOptionInVitaminsAndHealthMenu()).perform();
		MegamenuPage.getProbioticsOptionInVitaminsAndHealthMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), probioticsVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Sport Vitamins Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 109)
	public void checking_correct_URL_SportVitamins_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		action.moveToElement(MegamenuPage.getSportVitaminsOptionInVitaminsAndHealthMenu()).perform();
		MegamenuPage.getSportVitaminsOptionInVitaminsAndHealthMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), sportVitaminsVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Amino Acid Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 110)
	public void checking_correct_URL_AminoAcid_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		action.moveToElement(MegamenuPage.getAminoAcidOptionInVitaminsAndHealthMenu()).perform();
		MegamenuPage.getAminoAcidOptionInVitaminsAndHealthMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), aminoAcidVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Minerals Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 111)
	public void checking_correct_URL_Minerals_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		action.moveToElement(MegamenuPage.getMineralsOptionInVitaminsAndHealthMenu()).perform();
		MegamenuPage.getMineralsOptionInVitaminsAndHealthMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), mineralsVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Calcium Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 112)
	public void checking_correct_URL_Calcium_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		action.moveToElement(MegamenuPage.getCalciumOptionInVitaminsAndHealthMenu()).perform();
		MegamenuPage.getCalciumOptionInVitaminsAndHealthMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), calciumVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Iron Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 113)
	public void checking_correct_URL_Iron_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		action.moveToElement(MegamenuPage.getIronOptionInVitaminsAndHealthMenu()).perform();
		MegamenuPage.getIronOptionInVitaminsAndHealthMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), ironVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Magnesium Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 114)
	public void checking_correct_URL_Magnesium_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		action.moveToElement(MegamenuPage.getMagnesiumOptionInVitaminsAndHealthMenu()).perform();
		MegamenuPage.getMagnesiumOptionInVitaminsAndHealthMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), magnesiumVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Multi mineral Formulas Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 115)
	public void checking_correct_URL_MultimineralFormulas_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		action.moveToElement(MegamenuPage.getMultimineralFormulasOptionInVitaminsAndHealthMenu()).perform();
		MegamenuPage.getMultimineralFormulasOptionInVitaminsAndHealthMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), multimineralFormulasVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Zinc Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 116)
	public void checking_correct_URL_Zinc_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		action.moveToElement(MegamenuPage.getZincOptionInVitaminsAndHealthMenu()).perform();
		MegamenuPage.getZincOptionInVitaminsAndHealthMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), zincVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Potassium Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 117)
	public void checking_correct_URL_Potassium_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		action.moveToElement(MegamenuPage.getPotassiumOptionInVitaminsAndHealthMenu()).perform();
		MegamenuPage.getPotassiumOptionInVitaminsAndHealthMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), potassiumVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Healthy Drinks Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 118)
	public void checking_correct_URL_HealthyDrinks_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		action.moveToElement(MegamenuPage.getHealthyDrinksOptionInVitaminsAndHealthMenu()).perform();
		MegamenuPage.getHealthyDrinksOptionInVitaminsAndHealthMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), healthyDrinksVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Drinkable Vitamins Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 119)
	public void checking_correct_URL_DrinkableVitamins_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		action.moveToElement(MegamenuPage.getDrinkableVitaminsOptionInVitaminsAndHealthMenu()).perform();
		MegamenuPage.getDrinkableVitaminsOptionInVitaminsAndHealthMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), drinkableVitaminsVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Pets Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 120)
	public void checking_correct_URL_Pets_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		action.moveToElement(MegamenuPage.getPetsOptionInVitaminsAndHealthMenu()).perform();
		MegamenuPage.getPetsOptionInVitaminsAndHealthMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), petsVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Supplements More Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 121)
	public void checking_correct_URL_SupplementsMore_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsAndHealthOption()).perform();
		action.moveToElement(MegamenuPage.getSupplementsMoreOptionInVitaminsAndHealthMenu()).perform();
		MegamenuPage.getSupplementsMoreOptionInVitaminsAndHealthMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), supplementsMoreVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "checking_CategoriesAndSubCategories_Healthy", priority = 122)
	public void checking_CategoriesAndSubCategories_Healthy() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getHealthyFoodOption()).perform();
		// DataHelperAndWait.implicitWait(5);
		Assert.assertEquals(MegamenuPage.getOptionList().get(0).getText(),
				"GROCERY\n" + "Baking & Cooking\n" + "Canned\n" + "Coffee\n" + "Condiments\n" + "Milk & Cream\n"
						+ "Nuts & Oats\n" + "Oils\n" + "Pasta\n" + "Rice & Grains\n" + "Seasonings & Spices\n"
						+ "Sugar & Sweeteners\n" + "Syrups\n" + "Tea & Herbs\n" + "Superfoods\n" + "Ready Mixes\n"
						+ "Breakfast & Cereal\n" + "READY TO DRINK\n" + "Amino & Bcaas\n" + "Energy Drinks\n"
						+ "Protein Shakes\n" + "Electrolytes & Hydration\n" + "HEALTHY SNACKS\n" + "Protein Bars\n"
						+ "Cookies\n" + "Chips\n" + "Brownies & Pancakes\n" + "Snack Bars\n" + "Spreads\n"
						+ "Other Healthy Snacks\n" + "READY TO EAT\n" + "Healthy Meals\n" + "FEATURED\n"
						+ "Healthy Meal Replacement\n" + "Protein Coffee\n" + "Candies\n" + "Flavoring Agents\n"
						+ "Keto Snacks\n" + "Manuka Honey\n" + "Meat Snacks");
	}

	@Test(description = "Checking clicking on the Grocery Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 123)
	public void checking_correct_URL_Grocery_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getHealthyFoodOption()).perform();
		action.moveToElement(MegamenuPage.getGroceryOptionInHealthyFoodMenu()).perform();
		MegamenuPage.getGroceryOptionInHealthyFoodMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), groceryHealthyFoodURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Baking And Cooking Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 124)
	public void checking_correct_URL_BakingAndCooking_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getHealthyFoodOption()).perform();
		action.moveToElement(MegamenuPage.getBakingAndCookingOptionInHealthyFoodMenu()).perform();
		MegamenuPage.getBakingAndCookingOptionInHealthyFoodMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), bakingAndCookingHealthyFoodURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Canned Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 125)
	public void checking_correct_URL_Canned_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getHealthyFoodOption()).perform();
		action.moveToElement(MegamenuPage.getCannedOptionInHealthyFoodMenu()).perform();
		MegamenuPage.getCannedOptionInHealthyFoodMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), cannedHealthyFoodURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Coffee Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 126)
	public void checking_correct_URL_Coffee_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getHealthyFoodOption()).perform();
		action.moveToElement(MegamenuPage.getCoffeeOptionInHealthyFoodMenu()).perform();
		MegamenuPage.getCoffeeOptionInHealthyFoodMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), coffeeHealthyFoodURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Condiments Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 127)
	public void checking_correct_URL_Condiments_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getHealthyFoodOption()).perform();
		action.moveToElement(MegamenuPage.getCondimentsOptionInHealthyFoodMenu()).perform();
		MegamenuPage.getCondimentsOptionInHealthyFoodMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), condimentsHealthyFoodURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Milk And Cream Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 128)
	public void checking_correct_URL_MilkAndCream_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getHealthyFoodOption()).perform();
		action.moveToElement(MegamenuPage.getMilkAndCreamOptionInHealthyFoodMenu()).perform();
		MegamenuPage.getMilkAndCreamOptionInHealthyFoodMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), milkAndCreamHealthyFoodURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Nuts And Oats Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 129)
	public void checking_correct_URL_NutsAndOats_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getHealthyFoodOption()).perform();
		action.moveToElement(MegamenuPage.getNutsAndOatsOptionInHealthyFoodMenu()).perform();
		MegamenuPage.getNutsAndOatsOptionInHealthyFoodMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), nutsAndOatsHealthyFoodURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Oils Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 130)
	public void checking_correct_URL_Oils_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getHealthyFoodOption()).perform();
		action.moveToElement(MegamenuPage.getOilsOptionInHealthyFoodMenu()).perform();
		MegamenuPage.getOilsOptionInHealthyFoodMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), oilsHealthyFoodURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Pasta Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 131)
	public void checking_correct_URL_Pasta_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getHealthyFoodOption()).perform();
		action.moveToElement(MegamenuPage.getPastaOptionInHealthyFoodMenu()).perform();
		MegamenuPage.getPastaOptionInHealthyFoodMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), pastaHealthyFoodURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Rice And Grains Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 132)
	public void checking_correct_URL_RiceAndGrains_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getHealthyFoodOption()).perform();
		action.moveToElement(MegamenuPage.getRiceAndGrainsOptionInHealthyFoodMenu()).perform();
		MegamenuPage.getRiceAndGrainsOptionInHealthyFoodMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), riceAndGrainsHealthyFoodURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Seasonings And Spices Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 133)
	public void checking_correct_URL_SeasoningsAndSpices_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getHealthyFoodOption()).perform();
		action.moveToElement(MegamenuPage.getSeasoningsAndSpicesOptionInHealthyFoodMenu()).perform();
		MegamenuPage.getSeasoningsAndSpicesOptionInHealthyFoodMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), seasoningsAndSpicessHealthyFoodURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Sugar And Sweeteners Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 134)
	public void checking_correct_URL_SugarSweeteners_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getHealthyFoodOption()).perform();
		action.moveToElement(MegamenuPage.getSugarSweetenersOptionInHealthyFoodMenu()).perform();
		MegamenuPage.getSugarSweetenersOptionInHealthyFoodMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), sugarAndSweetenersHealthyFoodURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Syrups Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 135)
	public void checking_correct_URL_Syrups_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getHealthyFoodOption()).perform();
		action.moveToElement(MegamenuPage.getSyrupsOptionInHealthyFoodMenu()).perform();
		MegamenuPage.getSyrupsOptionInHealthyFoodMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), syrupsHealthyFoodURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Tea And Herbs Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 136)
	public void checking_correct_URL_TeaAndHerbs_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getHealthyFoodOption()).perform();
		action.moveToElement(MegamenuPage.getTeaAndHerbsOptionInHealthyFoodMenu()).perform();
		MegamenuPage.getTeaAndHerbsOptionInHealthyFoodMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), teaAndHerbsInHealthyFoodUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Superfoods Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 137)
	public void checking_correct_URL_Superfoods_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getHealthyFoodOption()).perform();
		action.moveToElement(MegamenuPage.getSuperfoodsOptionInHealthyFoodMenu()).perform();
		MegamenuPage.getSuperfoodsOptionInHealthyFoodMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), superFoodsInHealthyFoodUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Ready Mixes Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 138)
	public void checking_correct_URL_ReadyMixes_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getHealthyFoodOption()).perform();
		action.moveToElement(MegamenuPage.getReadyMixesOptionInHealthyFoodMenu()).perform();
		MegamenuPage.getReadyMixesOptionInHealthyFoodMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), readyMixInHealthyFoodUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Breakfast And Cereal Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 139)
	public void checking_correct_URL_BreakfastAndCereal_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getHealthyFoodOption()).perform();
		action.moveToElement(MegamenuPage.getBreakfastAndCerealOptionInHealthyFoodMenu()).perform();
		MegamenuPage.getBreakfastAndCerealOptionInHealthyFoodMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), breakfastAndCerealInHealthyFoodUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Ready To Drink Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 140)
	public void checking_correct_URL_ReadyToDrink_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getHealthyFoodOption()).perform();
		action.moveToElement(MegamenuPage.getReadyToDrinkOptionInHealthyFoodMenu()).perform();
		MegamenuPage.getReadyToDrinkOptionInHealthyFoodMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), readyToDrinkInHealthyFoodUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Amino And Bcaas Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 141)
	public void checking_correct_URL_AminoAndBcaas_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getHealthyFoodOption()).perform();
		action.moveToElement(MegamenuPage.getAminoAndBcaasOptionInHealthyFoodMenu()).perform();
		MegamenuPage.getAminoAndBcaasOptionInHealthyFoodMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), aminoBcaasInHealthyFoodUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Energy Drinks Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 142)
	public void checking_correct_URL_EnergyDrinks_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getHealthyFoodOption()).perform();
		action.moveToElement(MegamenuPage.getEnergyDrinksOptionInHealthyFoodMenu()).perform();
		MegamenuPage.getEnergyDrinksOptionInHealthyFoodMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), energyDrinksInHealthyFoodUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Protein Shakes Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 143)
	public void checking_correct_URL_ProteinShakes_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getHealthyFoodOption()).perform();
		action.moveToElement(MegamenuPage.getProteinShakesOptionInHealthyFoodMenu()).perform();
		MegamenuPage.getProteinShakesOptionInHealthyFoodMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), proteinShakesInHealthyFoodUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Healthy Snacks Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 145)
	public void checking_correct_URL_HealthySnacks_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getHealthyFoodOption()).perform();
		action.moveToElement(MegamenuPage.getHealthySnacksOptionInHealthyFoodMenu()).perform();
		MegamenuPage.getHealthySnacksOptionInHealthyFoodMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), healthySnacksInHealthyFoodUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Protein Bars Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 146)
	public void checking_correct_URL_ProteinBars_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getHealthyFoodOption()).perform();
		action.moveToElement(MegamenuPage.getProteinBarsOptionInHealthyFoodMenu()).perform();
		MegamenuPage.getProteinBarsOptionInHealthyFoodMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), proteinBarsInHealthyFoodUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Cookies Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 147)
	public void checking_correct_URL_Cookies_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getHealthyFoodOption()).perform();
		action.moveToElement(MegamenuPage.getCookiesOptionInHealthyFoodMenu()).perform();
		MegamenuPage.getCookiesOptionInHealthyFoodMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), cookiesInHealthyFoodUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Chips Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 148)
	public void checking_correct_URL_Chips_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getHealthyFoodOption()).perform();
		action.moveToElement(MegamenuPage.getChipsOptionInHealthyFoodMenu()).perform();
		MegamenuPage.getChipsOptionInHealthyFoodMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), chipsInHealthyFoodUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Brownies And Pancakes Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 149)
	public void checking_correct_URL_BrowniesAndPancakes_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getHealthyFoodOption()).perform();
		action.moveToElement(MegamenuPage.getBrowniesAndPancakesOptionInHealthyFoodMenu()).perform();
		MegamenuPage.getBrowniesAndPancakesOptionInHealthyFoodMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), browniesAndPancakesInHealthyFoodUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Snack Bars Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 150)
	public void checking_correct_URL_SnackBars_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getHealthyFoodOption()).perform();
		action.moveToElement(MegamenuPage.getSnackBarsOptionInHealthyFoodMenu()).perform();
		MegamenuPage.getSnackBarsOptionInHealthyFoodMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), snackBarsInHealthyFoodUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Spreads Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 151)
	public void checking_correct_URL_Spreads_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getHealthyFoodOption()).perform();
		action.moveToElement(MegamenuPage.getSpreadsOptionInHealthyFoodMenu()).perform();
		MegamenuPage.getSpreadsOptionInHealthyFoodMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), spreadsInHealthyFoodUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Other Healthy Snacks Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 152)
	public void checking_correct_URL_OtherHealthySnacks_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getHealthyFoodOption()).perform();
		action.moveToElement(MegamenuPage.getOtherHealthySnacksOptionInHealthyFoodMenu()).perform();
		MegamenuPage.getOtherHealthySnacksOptionInHealthyFoodMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), otherHealthySnacksInHealthyFoodUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Ready To Eat Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 153)
	public void checking_correct_URL_ReadyToEat_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getHealthyFoodOption()).perform();
		action.moveToElement(MegamenuPage.getReadyToEatOptionInHealthyFoodMenu()).perform();
		MegamenuPage.getReadyToEatOptionInHealthyFoodMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), readyToEatInHealthyFoodUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Healthy Meals Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 154)
	public void checking_correct_URL_HealthyMeals_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getHealthyFoodOption()).perform();
		action.moveToElement(MegamenuPage.getHealthyMealsOptionInHealthyFoodMenu()).perform();
		MegamenuPage.getHealthyMealsOptionInHealthyFoodMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), healthyMealsInHealthyFoodUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Featured Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 155)
	public void checking_correct_URL_Featured_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getHealthyFoodOption()).perform();
		action.moveToElement(MegamenuPage.getFeaturedOptionInHealthyFoodMenu()).perform();
		MegamenuPage.getFeaturedOptionInHealthyFoodMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), featuredInHealthyFoodUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Healthy Meal Replacement Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 156)
	public void checking_correct_URL_HealthyMealReplacement_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getHealthyFoodOption()).perform();
		action.moveToElement(MegamenuPage.getHealthyMealReplacementOptionInHealthyFoodMenu()).perform();
		MegamenuPage.getHealthyMealReplacementOptionInHealthyFoodMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), healthyMealReplacementInHealthyFoodUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Protein Coffee Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 157)
	public void checking_correct_URL_ProteinCoffee_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getHealthyFoodOption()).perform();
		action.moveToElement(MegamenuPage.getProteinCoffeeOptionInHealthyFoodMenu()).perform();
		MegamenuPage.getProteinCoffeeOptionInHealthyFoodMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), proteinCoffeeInHealthyFoodUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Candies Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 158)
	public void checking_correct_URL_Candies_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getHealthyFoodOption()).perform();
		action.moveToElement(MegamenuPage.getCandiesOptionInHealthyFoodMenu()).perform();
		MegamenuPage.getCandiesOptionInHealthyFoodMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), candiesInHealthyFoodUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Flavoring Agents Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 159)
	public void checking_correct_URL_FlavoringAgentsOption_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getHealthyFoodOption()).perform();
		action.moveToElement(MegamenuPage.getFlavoringAgentsOptionInHealthyFoodMenu()).perform();
		MegamenuPage.getFlavoringAgentsOptionInHealthyFoodMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), flavoringAgentsInHealthyFoodUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Keto Snacks Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 160)
	public void checking_correct_URL_KetoSnacks_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getHealthyFoodOption()).perform();
		action.moveToElement(MegamenuPage.getKetoSnacksOptionInHealthyFoodMenu()).perform();
		MegamenuPage.getKetoSnacksOptionInHealthyFoodMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), ketoSnacksInHealthyFoodUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Manuka Honey Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 161)
	public void checking_correct_URL_ManukaHoney_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getHealthyFoodOption()).perform();
		action.moveToElement(MegamenuPage.getManukaHoneyOptionInHealthyFoodMenu()).perform();
		MegamenuPage.getManukaHoneyOptionInHealthyFoodMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), manukaHoneyInHealthyFoodUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Meat Snacks Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 162)
	public void checking_correct_URL_MeatSnacks_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getHealthyFoodOption()).perform();
		action.moveToElement(MegamenuPage.getMeatSnacksOptionInHealthyFoodMenu()).perform();
		MegamenuPage.getMeatSnacksOptionInHealthyFoodMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), meatSnacksInHealthyFoodUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "checking_CategoriesAndSubCategories_Sports_Main_category", priority = 163)
	public void checking_CategoriesAndSubCategories_Sports_Main_category() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		// DataHelperAndWait.implicitWait(5);
		Assert.assertEquals(MegamenuPage.getOptionList().get(0).getText(),
				"MEN\n" + "CLOTHING\n" + "Tops\n" + "Pants\n" + "Shorts\n" + "Jackets And Coats\n" + "Safety Masks\n"
						+ "FOOTWEAR\n" + "Sneakers\n" + "Training Shoes\n" + "Running Shoes\n" + "Hiking Shoes\n"
						+ "ACCESSORIES\n" + "Gloves\n" + "Belts\n" + "CAPS & HATS\n" + "Cap\n" + "SHAKERS\n"
						+ "Water Bottles\n" + "Water Bottles\n" + "Socks\n" + "Towels\n" + "Sunglasses\n" + "Mixer\n"
						+ "BAGS\n" + "Backpacks\n" + "Shoulder Bags\n" + "WEARABLE TECH\n" + "Watches\n"
						+ "Gaming Accessories\n" + "EQUIPMENT\n" + "Grips\n" + "Balls\n" + "Rollers\n" + "Weights\n"
						+ "WOMEN\n" + "CLOTHING\n" + "Tops\n" + "Shorts\n" + "Safety Masks\n" + "ACCESSORIES\n"
						+ "GLOVES\n" + "Gloves\n" + "Belts\n" + "CAPS & HATS\n" + "Cap\n" + "SHAKERS\n"
						+ "Water Bottles\n" + "Socks\n" + "Towels\n" + "Sunglasses\n" + "Mixer\n" + "BAGS\n"
						+ "Backpacks\n" + "Shoulder Bags");
	}

	@Test(description = "checkingThe_Bold_Font_for_MainCategoriesInTheSports_Main_Category", priority = 164)
	public void checkingThe_Bold_Font_for_MainCategoriesInTheSports_Main_Category() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		Assert.assertTrue(MegamenuPage.getMenOptionInSportsMenu().getCssValue("font-weight").contains("700"));
		Assert.assertTrue(MegamenuPage.getClothingInSportsMenu().getCssValue("font-weight").contains("700"));
		Assert.assertTrue(MegamenuPage.getFootwearInSportsMenu().getCssValue("font-weight").contains("700"));
		Assert.assertTrue(MegamenuPage.getAccessoriesInSportsMenu().getCssValue("font-weight").contains("700"));
		Assert.assertTrue(MegamenuPage.getCapsAndHatsInSportsMenu().getCssValue("font-weight").contains("700"));
		Assert.assertTrue(MegamenuPage.getShakersInSportsMenu().getCssValue("font-weight").contains("700"));
		Assert.assertTrue(MegamenuPage.getBagsInSportsMenu().getCssValue("font-weight").contains("700"));
		Assert.assertTrue(MegamenuPage.getWearableTechInSportsMenu().getCssValue("font-weight").contains("700"));
		Assert.assertTrue(MegamenuPage.geEquipmentInSportsMenu().getCssValue("font-weight").contains("700"));
		Assert.assertTrue(MegamenuPage.getWomenInSportsMenu().getCssValue("font-weight").contains("700"));
		Assert.assertTrue(MegamenuPage.getWomenClothingInSportsMenu().getCssValue("font-weight").contains("700"));
		Assert.assertTrue(MegamenuPage.getWomenAccessoriesInSportsMenu().getCssValue("font-weight").contains("700"));
		Assert.assertTrue(MegamenuPage.getWomenGlovesInSportsMenu().getCssValue("font-weight").contains("700"));
		Assert.assertTrue(MegamenuPage.getWomenCapsAndHatsInSportsMenu().getCssValue("font-weight").contains("700"));
		Assert.assertTrue(MegamenuPage.getWomenShakersInSportsMenu().getCssValue("font-weight").contains("700"));
		Assert.assertTrue(MegamenuPage.getWomenBagsInSportsMenu().getCssValue("font-weight").contains("700"));

	}

	@Test(description = "checking_The_Uppercase_For_Sports_main_Category", priority = 165)
	public void checking_The_Uppercase_For_Sports_main_Category() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		Assert.assertEquals(MegamenuPage.getMenOptionInSportsMenu().getCssValue("text-transform"), "uppercase");
		Assert.assertEquals(MegamenuPage.getClothingInSportsMenu().getCssValue("text-transform"), "uppercase");
		Assert.assertEquals(MegamenuPage.getFootwearInSportsMenu().getCssValue("text-transform"), "uppercase");
		Assert.assertEquals(MegamenuPage.getAccessoriesInSportsMenu().getCssValue("text-transform"), "uppercase");
		Assert.assertEquals(MegamenuPage.getCapsAndHatsInSportsMenu().getCssValue("text-transform"), "uppercase");
		Assert.assertEquals(MegamenuPage.getShakersInSportsMenu().getCssValue("text-transform"), "uppercase");
		Assert.assertEquals(MegamenuPage.getBagsInSportsMenu().getCssValue("text-transform"), "uppercase");
		Assert.assertEquals(MegamenuPage.getWearableTechInSportsMenu().getCssValue("text-transform"), "uppercase");
		Assert.assertEquals(MegamenuPage.geEquipmentInSportsMenu().getCssValue("text-transform"), "uppercase");
		Assert.assertEquals(MegamenuPage.getWomenInSportsMenu().getCssValue("text-transform"), "uppercase");
		Assert.assertEquals(MegamenuPage.getWomenClothingInSportsMenu().getCssValue("text-transform"), "uppercase");
		Assert.assertEquals(MegamenuPage.getWomenAccessoriesInSportsMenu().getCssValue("text-transform"), "uppercase");
		Assert.assertEquals(MegamenuPage.getWomenGlovesInSportsMenu().getCssValue("text-transform"), "uppercase");
		Assert.assertEquals(MegamenuPage.getWomenCapsAndHatsInSportsMenu().getCssValue("text-transform"), "uppercase");
		Assert.assertEquals(MegamenuPage.getWomenShakersInSportsMenu().getCssValue("text-transform"), "uppercase");
		Assert.assertEquals(MegamenuPage.getWomenBagsInSportsMenu().getCssValue("text-transform"), "uppercase");
	}

	@Test(description = "checking_correct_URL_MilkAndCream_Subcategory_AND_Empty_Page_Issue", priority = 166)
	public void checking_correct_URL_Men_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		action.moveToElement(MegamenuPage.getMenOptionInSportsMenu()).perform();
		MegamenuPage.getMenOptionInSportsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), menSportsMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Clothing Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 167)
	public void checking_correct_URL_Clothing_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		action.moveToElement(MegamenuPage.getClothingInSportsMenu()).perform();
		MegamenuPage.getClothingInSportsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), clothingSportsMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Tops Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 168)
	public void checking_correct_URL_Tops_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		action.moveToElement(MegamenuPage.getTopsInSportsMenu()).perform();
		MegamenuPage.getTopsInSportsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), topsSportsMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Pants Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 169)
	public void checking_correct_URL_Pants_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		action.moveToElement(MegamenuPage.getPantsInSportsMenu()).perform();
		MegamenuPage.getPantsInSportsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), pantsSportsMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Shorts Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 170)
	public void checking_correct_URL_Shorts_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		action.moveToElement(MegamenuPage.getShortsInSportsMenu()).perform();
		MegamenuPage.getShortsInSportsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), shortsSportsMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Jackets And Coats Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 171)
	public void checking_correct_URL_JacketsAndCoats_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		action.moveToElement(MegamenuPage.getJacketsAndCoatsInSportsMenu()).perform();
		MegamenuPage.getJacketsAndCoatsInSportsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), jacketsAndCoatsSportsMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Safety Masks Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 172)
	public void checking_correct_URL_SafetyMasks_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		action.moveToElement(MegamenuPage.getSafetyMasksInSportsMenu()).perform();
		MegamenuPage.getSafetyMasksInSportsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), safetyMasksSportsMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Footwear Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 173)
	public void checking_correct_URL_Footwear_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		action.moveToElement(MegamenuPage.getFootwearInSportsMenu()).perform();
		MegamenuPage.getFootwearInSportsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), footwearSportsMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Sneakers Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 174)
	public void checking_correct_URL_Sneakers_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		action.moveToElement(MegamenuPage.getSneakersInSportsMenu()).perform();
		MegamenuPage.getSneakersInSportsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), sneakersSportsMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Training Shoes Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 175)
	public void checking_correct_URL_TrainingShoes_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		action.moveToElement(MegamenuPage.getTrainingShoesInSportsMenu()).perform();
		MegamenuPage.getTrainingShoesInSportsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), trainingShoesSportsMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Running Shoes Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 176)
	public void checking_correct_URL_RunningShoes_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		action.moveToElement(MegamenuPage.getRunningShoesInSportsMenu()).perform();
		MegamenuPage.getRunningShoesInSportsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), runningShoesSportsMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Hiking Shoes Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 177)
	public void checking_correct_URL_HikingShoes_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		action.moveToElement(MegamenuPage.getHikingShoesInSportsMenu()).perform();
		MegamenuPage.getHikingShoesInSportsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), hikingShoesSportsMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Accessories Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 178)
	public void checking_correct_URL_Accessories_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		action.moveToElement(MegamenuPage.getAccessoriesInSportsMenu()).perform();
		MegamenuPage.getAccessoriesInSportsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), accessoriesSportsMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Gloves Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 179)
	public void checking_correct_URL_Gloves_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		action.moveToElement(MegamenuPage.getGlovesInSportsMenu()).perform();
		MegamenuPage.getGlovesInSportsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), glovesSportsMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Belts Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 180)
	public void checking_correct_URL_Belts_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		action.moveToElement(MegamenuPage.getBeltsInSportsMenu()).perform();
		MegamenuPage.getBeltsInSportsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), beltsSportsMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Caps And Hats Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 181)
	public void checking_correct_URL_CapsAndHats_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		action.moveToElement(MegamenuPage.getCapsAndHatsInSportsMenu()).perform();
		MegamenuPage.getCapsAndHatsInSportsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), capsAndHatsSportsMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Caps Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 182)
	public void checking_correct_URL_Caps_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		action.moveToElement(MegamenuPage.getCapInSportsMenu()).perform();
		MegamenuPage.getCapInSportsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), capSportsMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Shakers Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 183)
	public void checking_correct_URL_Shakers_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		action.moveToElement(MegamenuPage.getShakersInSportsMenu()).perform();
		MegamenuPage.getShakersInSportsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), shakersSportsMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Water Bottles Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 184)
	public void checking_correct_URL_WaterBottles_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		action.moveToElement(MegamenuPage.getWaterBottlesInSportsMenu()).perform();
		MegamenuPage.getWaterBottlesInSportsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), waterBottlesSportsMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	// Theres A Bug Here Due To Water Bottles Option Appearing Duplicated ut I added
	// this test case to save the qoption position
	@Test(description = "Theres A Bug Here Due To Water Bottles Option Appearing Duplicated", priority = 185)
	public void theresABugHereDueToWaterBottlesOptionAppearingDuplicated() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		action.moveToElement(MegamenuPage.getBugHereInSportsMenu()).perform();
		MegamenuPage.getBugHereInSportsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(),
				"Theres A Bug Here Due To Water Bottles Option Appearing Duplicated");
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
		System.out.println("Theres A Bug Here Due To Water Bottles Option Appearing Duplicated");
	}

	@Test(description = "Checking clicking on the Socks Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 186)
	public void checking_correct_URL_Socks_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		action.moveToElement(MegamenuPage.getSocksInSportsMenu()).perform();
		MegamenuPage.getSocksInSportsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), socksSportsMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Towels Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 187)
	public void checking_correct_URL_Towels_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		action.moveToElement(MegamenuPage.getTowelsInSportsMenu()).perform();
		MegamenuPage.getTowelsInSportsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), towelsSportsMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Sunglasses Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 188)
	public void checking_correct_URL_Sunglasses_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		action.moveToElement(MegamenuPage.getSunglassesInSportsMenu()).perform();
		MegamenuPage.getSunglassesInSportsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), sunglassesSportsMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Mixer Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 189)
	public void checking_correct_URL_Mixter_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		action.moveToElement(MegamenuPage.getMixerInSportsMenu()).perform();
		MegamenuPage.getMixerInSportsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), mixerSportsMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Bags Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 190)
	public void checking_correct_URL_Bags_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		action.moveToElement(MegamenuPage.getBagsInSportsMenu()).perform();
		MegamenuPage.getBagsInSportsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), bagsSportsMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Back Packs Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 191)
	public void checking_correct_URL_BackPacks_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		action.moveToElement(MegamenuPage.getBackPacksInSportsMenu()).perform();
		MegamenuPage.getBackPacksInSportsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), backPacksSportsMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Shoulder Bags Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 192)
	public void checking_correct_URL_ShoulderBags_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		action.moveToElement(MegamenuPage.getShoulderBagsInSportsMenu()).perform();
		MegamenuPage.getShoulderBagsInSportsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), shoulderBagsSportsMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Wearable Tech Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 193)
	public void checking_correct_URL_WearableTech_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		action.moveToElement(MegamenuPage.getWearableTechInSportsMenu()).perform();
		MegamenuPage.getWearableTechInSportsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), wearableTechSportsMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Watches Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 194)
	public void checking_correct_URL_Watches_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		action.moveToElement(MegamenuPage.getWatchesInSportsMenu()).perform();
		MegamenuPage.getWatchesInSportsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), watchesSportsMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Gaming Accessories Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 195)
	public void checking_correct_URL_GamingAccessories_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		action.moveToElement(MegamenuPage.getGamingAccessoriesInSportsMenu()).perform();
		MegamenuPage.getGamingAccessoriesInSportsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), gamingAccessoriesSportsMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Equipment Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 196)
	public void checking_correct_URL_Equipment_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		action.moveToElement(MegamenuPage.geEquipmentInSportsMenu()).perform();
		MegamenuPage.geEquipmentInSportsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), equipmentSportsMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Grips Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 197)
	public void checking_correct_URL_Gripst_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		action.moveToElement(MegamenuPage.getGripsInSportsMenu()).perform();
		MegamenuPage.getGripsInSportsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), gripsSportsMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Balls Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 198)
	public void checking_correct_URL_Ballst_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		action.moveToElement(MegamenuPage.getBallsInSportsMenu()).perform();
		MegamenuPage.getBallsInSportsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), ballsSportsMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Rollers Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 199)
	public void checking_correct_URL_Rollerst_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		action.moveToElement(MegamenuPage.getRollersInSportsMenu()).perform();
		MegamenuPage.getRollersInSportsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), rollersSportsMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Weights Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 200)
	public void checking_correct_URL_Weights_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		action.moveToElement(MegamenuPage.getWeightsInSportsMenu()).perform();
		MegamenuPage.getWeightsInSportsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), weightsSportsMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Women Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 201)
	public void checking_correct_URL_Women_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		action.moveToElement(MegamenuPage.getWomenInSportsMenu()).perform();
		MegamenuPage.getWomenInSportsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), womenSportsMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Women Clothing Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 202)
	public void checking_correct_URL_WomenClothing_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		action.moveToElement(MegamenuPage.getWomenClothingInSportsMenu()).perform();
		MegamenuPage.getWomenClothingInSportsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), womenClothingSportsMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Women Tops Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 203)
	public void checking_correct_URL_WomenTops_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		action.moveToElement(MegamenuPage.getWomenTopsInSportsMenu()).perform();
		MegamenuPage.getWomenTopsInSportsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), womenTopsSportsMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Women Shorts Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 204)
	public void checking_correct_URL_WomenShorts_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		action.moveToElement(MegamenuPage.getWomenShortsInSportsMenu()).perform();
		MegamenuPage.getWomenShortsInSportsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), womenShortsSportsMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Women Safety Masks Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 205)
	public void checking_correct_URL_WomenSafetyMasks_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		action.moveToElement(MegamenuPage.getWomenSafetyMasksInSportsMenu()).perform();
		MegamenuPage.getWomenSafetyMasksInSportsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), womenSafetyMasksSportsMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Women Accessories Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 206)
	public void checking_correct_URL_WomenAccessories_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		action.moveToElement(MegamenuPage.getWomenAccessoriesInSportsMenu()).perform();
		MegamenuPage.getWomenAccessoriesInSportsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), womenAccessoriesSportsMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Theres A Bug Here Due To Gloves Option Appearing Duplicated", priority = 207)
	public void theresABugHereDueToGlovesOptionAppearingDuplicated() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		action.moveToElement(MegamenuPage.getBugGlovesInSportsMenu()).perform();
		MegamenuPage.getBugGlovesInSportsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), "Theres A Bug Here Due To Gloves Option Appearing Duplicated");
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
		System.out.println("Theres A Bug Here Due To Gloves Option Appearing Duplicated");
	}

	@Test(description = "Checking clicking on the Women Gloves Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 208)
	public void checking_correct_URL_WomenGloves_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		action.moveToElement(MegamenuPage.getWomenGlovesInSportsMenu()).perform();
		MegamenuPage.getWomenGlovesInSportsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), womenGlovesSportsMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Women Belts Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 209)
	public void checking_correct_URL_WomenBelts_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		action.moveToElement(MegamenuPage.getWomenBeltsInSportsMenu()).perform();
		MegamenuPage.getWomenBeltsInSportsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), womenBeltsSportsMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Women Caps And Hats Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 210)
	public void checking_correct_URL_WomenCapsAndHats_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		action.moveToElement(MegamenuPage.getWomenCapsAndHatsInSportsMenu()).perform();
		MegamenuPage.getWomenCapsAndHatsInSportsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), womenCapsAndHatsSportsMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Women Caps Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 211)
	public void checking_correct_URL_WomenCaps_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		action.moveToElement(MegamenuPage.getWomenCapsInSportsMenu()).perform();
		MegamenuPage.getWomenCapsInSportsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), womenCapsSportsMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Women Shakers Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 212)
	public void checking_correct_URL_WomenShakers_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		action.moveToElement(MegamenuPage.getWomenShakersInSportsMenu()).perform();
		MegamenuPage.getWomenShakersInSportsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), womenShakersSportsMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Women Water Bottles Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 213)
	public void checking_correct_URL_WomenWaterBottles_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		action.moveToElement(MegamenuPage.getWomenWaterBottlesInSportsMenu()).perform();
		MegamenuPage.getWomenWaterBottlesInSportsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), womenWaterBottlesSportsMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Women Socks Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 214)
	public void checking_correct_URL_WomenSocks_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		action.moveToElement(MegamenuPage.getWomenSocksInSportsMenu()).perform();
		MegamenuPage.getWomenSocksInSportsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), womenSocksSportsMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Women Towels Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 215)
	public void checking_correct_URL_WomenTowels_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		action.moveToElement(MegamenuPage.getWomenTowelsInSportsMenu()).perform();
		MegamenuPage.getWomenTowelsInSportsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), womenTowelsSportsMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Women Sunglasses Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 216)
	public void checking_correct_URL_WomenSunglasses_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		action.moveToElement(MegamenuPage.getWomenSunglassesInSportsMenu()).perform();
		MegamenuPage.getWomenSunglassesInSportsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), womenSunglassesSportsMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Women Mixer Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 217)
	public void checking_correct_URL_WomenMixer_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		action.moveToElement(MegamenuPage.getWomenMixerInSportsMenu()).perform();
		MegamenuPage.getWomenMixerInSportsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), womenMixerSportsMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");

	}

	@Test(description = "Checking clicking on the Women Bags Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 218)
	public void checking_correct_URL_WomenBags_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		action.moveToElement(MegamenuPage.getWomenBagsInSportsMenu()).perform();
		MegamenuPage.getWomenBagsInSportsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), womenBagsSportsMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Women Back Packs Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 219)
	public void checking_correct_URL_WomenBackPacks_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		action.moveToElement(MegamenuPage.getWomenBackPacksInSportsMenu()).perform();
		MegamenuPage.getWomenBackPacksInSportsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), womenBackPacksSportsMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Women Sholders Bags Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 220)
	public void checking_correct_URL_WomenSholdersBags_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsOption()).perform();
		action.moveToElement(MegamenuPage.getWomenSholdersBagsInSportsMenu()).perform();
		MegamenuPage.getWomenSholdersBagsInSportsMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), womenSholdersBagsSportsMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	///// By Brand
	@Test(description = "Checking clicking on the Supplements Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 221)
	public void checking_correct_URL_Supplements_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getSupplementsOptionInByBrandMenu()).perform();
		MegamenuPage.getSupplementsOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), supplementsInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Optimum Nutrition Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 222)
	public void checking_correct_URL_OptimumNutrition_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getOptimumNutritionOptionInByBrandMenu()).perform();
		MegamenuPage.getOptimumNutritionOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), optimumNutritionInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Muscletech Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 223)
	public void checking_correct_URL_Muscletech_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getMuscletechOptionInByBrandMenu()).perform();
		MegamenuPage.getMuscletechOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), muscletechInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Cellucor Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 224)
	public void checking_correct_URL_Cellucor_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getCellucorOptionInByBrandMenu()).perform();
		MegamenuPage.getCellucorOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), cellucorInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Dymatize Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 225)
	public void checking_correct_URL_Dymatize_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getDymatizeOptionInByBrandMenu()).perform();
		MegamenuPage.getDymatizeOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), dymatizeInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Xtend Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 226)
	public void checking_correct_URL_Xtend_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getXtendOptionInByBrandMenu()).perform();
		MegamenuPage.getXtendOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), xtendInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Animal Nutrition Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 227)
	public void checking_correct_URL_AnimalNutrition_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getAnimalNutritionOptionInByBrandMenu()).perform();
		MegamenuPage.getAnimalNutritionOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), animalNutritionInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Muscle Pharm Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 228)
	public void checking_correct_URL_MusclePharm_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getMusclePharmOptionInByBrandMenu()).perform();
		MegamenuPage.getMusclePharmOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), musclePharmInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Universal Nutrition Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 229)
	public void checking_correct_URL_UniversalNutrition_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getUniversalNutritionOptionInByBrandMenu()).perform();
		MegamenuPage.getUniversalNutritionOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), universalNutritionInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the BSN Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 230)
	public void checking_correct_URL_BSN_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getBsnOptionInByBrandMenu()).perform();
		MegamenuPage.getBsnOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), bsnInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the EHPLABS Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 231)
	public void checking_correct_URL_Ehplabs_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getEhplabsOptionInByBrandMenu()).perform();
		MegamenuPage.getEhplabsOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), ehplabsInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Jym Supplement Science Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 232)
	public void checking_correct_URL_JymSupplementScience_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getJymSupplementScienceOptionInByBrandMenu()).perform();
		MegamenuPage.getJymSupplementScienceOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), jymSupplementScienceInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Bpi Sports Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 233)
	public void checking_correct_URL_BpiSports_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getBpiSportsOptionInByBrandMenu()).perform();
		MegamenuPage.getBpiSportsOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), bpiSportsInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Russian Bear Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 234)
	public void checking_correct_URL_RussianBear_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getRussianBearOptionInByBrandMenu()).perform();
		MegamenuPage.getRussianBearOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), russianBearInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Isopure Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 235)
	public void checking_correct_URL_Isopure_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getIsopureOptionInByBrandMenu()).perform();
		MegamenuPage.getIsopureOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), isopureInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the 1 Up Nutrition  Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 236)
	public void checking_correct_URL_OneUpNutrition_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getOneUpNutritionOptionInByBrandMenu()).perform();
		MegamenuPage.getOneUpNutritionOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), oneUpNutritionInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Musclemeds  Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 237)
	public void checking_correct_URL_Musclemeds_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getMusclemedsOptionInByBrandMenu()).perform();
		MegamenuPage.getMusclemedsOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), musclemedInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the MHP  Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 238)
	public void checking_correct_URL_Mhp_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.gethMhpOptionInByBrandMenu()).perform();
		MegamenuPage.gethMhpOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), mhpInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Evl Nutrition Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 239)
	public void checking_correct_URL_EvlNutrition_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getEvlNutritionOptionInByBrandMenu()).perform();
		MegamenuPage.getEvlNutritionOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), evlNutritionInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Nla For Her Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 240)
	public void checking_correct_URL_NlaForHer_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getNlaForHerOptionInByBrandMenu()).perform();
		MegamenuPage.getNlaForHerOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), nlaForHerInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Muscle Nutrition Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 241)
	public void checking_correct_URL_MuscleNutrition_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getMuscleNutritionOptionInByBrandMenu()).perform();
		MegamenuPage.getMuscleNutritionOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), muscleNutritionInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Gat Nutrition Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 242)
	public void checking_correct_URL_GatNutrition_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getGatNutritionOptionInByBrandMenu()).perform();
		MegamenuPage.getGatNutritionOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), gatNutritionInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Labrada Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 243)
	public void checking_correct_URL_Labrada_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getLabradaOptionInByBrandMenu()).perform();
		MegamenuPage.getLabradaOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), labradaInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Orgain Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 244)
	public void checking_correct_URL_Orgain_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getOrgainOptionInByBrandMenu()).perform();
		MegamenuPage.getOrgainOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), orgainInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Nutrex Research Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 245)
	public void checking_correct_URL_NutrexResearch_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getNutrexResearchOptionInByBrandMenu()).perform();
		MegamenuPage.getNutrexResearchOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), nutrexResearchInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Scitec Nutrition Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 246)
	public void checking_correct_URL_ScitecNutrition_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getScitecNutritionOptionInByBrandMenu()).perform();
		MegamenuPage.getScitecNutritionOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), scitecNutritionInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Prolab Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 247)
	public void checking_correct_URL_Prolab_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getProlabOptionInByBrandMenu()).perform();
		MegamenuPage.getProlabOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), prolabInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the SOTRU Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 248)
	public void checking_correct_URL_Sotru_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getSotruOptionInByBrandMenu()).perform();
		MegamenuPage.getSotruOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), sotruInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Divine Health Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 249)
	public void checking_correct_URL_DivineHealth_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getDivineHealthOptionInByBrandMenu()).perform();
		MegamenuPage.getDivineHealthOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), divineHealthInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Ghost Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 250)
	public void checking_correct_URL_Ghost_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getGhostOptionInByBrandMenu()).perform();
		MegamenuPage.getGhostOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), ghostInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Womens Best Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 251)
	public void checking_correct_URL_WomensBest_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getWomensBestOptionInByBrandMenu()).perform();
		MegamenuPage.getWomensBestOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), womensBestInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Efx Sports Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 252)
	public void checking_correct_URL_EfxSports_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getEfxSportsOptionInByBrandMenu()).perform();
		MegamenuPage.getEfxSportsOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), efxSportsInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Basix Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 253)
	public void checking_correct_URL_Basix_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getBasixOptionInByBrandMenu()).perform();
		MegamenuPage.getBasixOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), basixInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the AK-47 Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 254)
	public void checking_correct_URL_AK47_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getAk47OptionInByBrandMenu()).perform();
		MegamenuPage.getAk47OptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), ak47InByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Nf Sports Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 255)
	public void checking_correct_URL_NfSports_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getNfSportsOptionInByBrandMenu()).perform();
		MegamenuPage.getNfSportsOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), nfSportsInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Fully Dosed Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 256)
	public void checking_correct_URL_FullyDosed_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getFullyDosedOptionInByBrandMenu()).perform();
		MegamenuPage.getFullyDosedOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), fullyDosedInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the 5% Nutrition Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 257)
	public void checking_correct_URL_FivePercentNutrition_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getFivePercentNutritionOptionInByBrandMenu()).perform();
		MegamenuPage.getFivePercentNutritionOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), fivePercentNutritionInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Olimp Sport Nutrition Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 258)
	public void checking_correct_URL_OlimpSportNutrition_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getOlimpSportNutritionOptionInByBrandMenu()).perform();
		MegamenuPage.getOlimpSportNutritionOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), olimpSportNutritionInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Jnx Sports Nutrition Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 259)
	public void checking_correct_URL_JnxSports_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getJnxSportsOptionInByBrandMenu()).perform();
		MegamenuPage.getJnxSportsOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), jnxSportsInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Fit & Lean Nutrition Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 260)
	public void checking_correct_URL_FitAndLean_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getFitAndLeanOptionInByBrandMenu()).perform();
		MegamenuPage.getFitAndLeanOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), fitAndLeanInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Gymqueen Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 261)
	public void checking_correct_URL_Gymqueen_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getGymqueenOptionInByBrandMenu()).perform();
		MegamenuPage.getGymqueenOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), gymqueenInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the The Pack Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 262)
	public void checking_correct_URL_ThePack_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getThePackOptionInByBrandMenu()).perform();
		MegamenuPage.getThePackOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), thePackInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Betancourt Nutrition Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 263)
	public void checking_correct_URL_BetancourtNutrition_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getBetancourtNutritionOptionInByBrandMenu()).perform();
		MegamenuPage.getBetancourtNutritionOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), betancourtNutritionInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Yalla Protein Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 264)
	public void checking_correct_URL_YallaProtein_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getYallaProteinOptionInByBrandMenu()).perform();
		MegamenuPage.getYallaProteinOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), yallaProteinInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Protein World Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 265)
	public void checking_correct_URL_ProteinWorld_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getProteinWorldOptionInByBrandMenu()).perform();
		MegamenuPage.getProteinWorldOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), proteinWorldInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Obvi Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 266)
	public void checking_correct_URL_Obvi_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getObviOptionInByBrandMenu()).perform();
		MegamenuPage.getObviOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), obviInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Naughty Boy Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 267)
	public void checking_correct_URL_NaughtyBoy_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getNaughtyBoyOptionInByBrandMenu()).perform();
		MegamenuPage.getNaughtyBoyOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), naughtyBoyInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Steel Fit Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 268)
	public void checking_correct_URL_SteelFit_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getSteelFitOptionInByBrandMenu()).perform();
		MegamenuPage.getSteelFitOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), steelFitInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the USN Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 269)
	public void checking_correct_URL_Usn_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getUsnOptionInByBrandMenu()).perform();
		MegamenuPage.getUsnOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), usnInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the X-Gamer Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 270)
	public void checking_correct_URL_XGamer_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getXGamerOptionInByBrandMenu()).perform();
		MegamenuPage.getXGamerOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), xGamerInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Innosupps Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 271)
	public void checking_correct_URL_Innosupps_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getInnosuppsOptionInByBrandMenu()).perform();
		MegamenuPage.getInnosuppsOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), innosuppsInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Outbreak Nutrition Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 272)
	public void checking_correct_URL_OutbreakNutrition_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getOutbreakNutritionOptionInByBrandMenu()).perform();
		MegamenuPage.getOutbreakNutritionOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), outbreakNutritionInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Insane Labz Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 273)
	public void checking_correct_URL_InsaneLabz_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getInsaneLabzOptionInByBrandMenu()).perform();
		MegamenuPage.getInsaneLabzOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), insaneLabzInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the All Max Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 274)
	public void checking_correct_URL_AllMax_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getAllMaxOptionInByBrandMenu()).perform();
		MegamenuPage.getAllMaxOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), allMaxInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Glaxon Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 275)
	public void checking_correct_URL_Glaxon_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getGlaxonOptionInByBrandMenu()).perform();
		MegamenuPage.getGlaxonOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), glaxonInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Redcon1 Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 276)
	public void checking_correct_URL_RedconOne_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getRedcon1OptionInByBrandMenu()).perform();
		MegamenuPage.getRedcon1OptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), redcon1InByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Panda Supplements Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 277)
	public void checking_correct_URL_PandaSupplements_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getPandaSupplementsOptionInByBrandMenu()).perform();
		MegamenuPage.getPandaSupplementsOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), pandaSupplementsInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Nutrend Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 278)
	public void checking_correct_URL_Nutrend_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getNutrendOptionInByBrandMenu()).perform();
		MegamenuPage.getNutrendOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), nutrendInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Ostrovit Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 279)
	public void checking_correct_URL_Ostrovit_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getOstrovitOptionInByBrandMenu()).perform();
		MegamenuPage.getOstrovitOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), ostrovitInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Bettery Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 280)
	public void checking_correct_URL_Bettery_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getBetteryOptionInByBrandMenu()).perform();
		MegamenuPage.getBetteryOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), betteryInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Healthy Food, Snacks & Meal Replacement Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 281)
	public void checking_correct_URL_HealthyFoodSnacksAndMealReplacement_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getHealthyFoodSnacksAndMealReplacementOptionInByBrandMenu()).perform();
		MegamenuPage.getHealthyFoodSnacksAndMealReplacementOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), healthyFoodSnacksAndMealReplacementInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Wow Hydrate Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 282)
	public void checking_correct_URL_WowHydrate_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getWowHydrateOptionInByBrandMenu()).perform();
		MegamenuPage.getWowHydrateOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), wowHydrateInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Quest Nutrition Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 283)
	public void checking_correct_URL_QuestNutrition_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getQuestNutritionOptionInByBrandMenu()).perform();
		MegamenuPage.getQuestNutritionOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), questNutritionInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Grenade Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 284)
	public void checking_correct_URL_Grenade_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getGrenadeOptionInByBrandMenu()).perform();
		MegamenuPage.getGrenadeOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), grenadeInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Reign Energy Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 285)
	public void checking_correct_URL_ReignEnergy_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getReignEnergyOptionInByBrandMenu()).perform();
		MegamenuPage.getReignEnergyOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), reignEnergyInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Monster Energy Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 286)
	public void checking_correct_URL_MonsterEnergy_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getMonsterEnergyOptionInByBrandMenu()).perform();
		MegamenuPage.getMonsterEnergyOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), monsterEnergyInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the 3d Energy  Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 287)
	public void checking_correct_URL_ThirdEnergy_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getShopeByMenu()).perform();
		action.moveToElement(MegamenuPage.getByBrandOption()).perform();
		action.moveToElement(MegamenuPage.getThirdEnergyOptionInByBrandMenu()).perform();
		MegamenuPage.getThirdEnergyOptionInByBrandMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), thirdEnergyInByBrandURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	

	@Test(description = "Checking-the_sub_Menu_hover_on_the_Sport_Supplements", priority = 289)
	public void Checking_the_sub_Menu_hover_on_the_Sport_Supplement() {
		supplementHover();
	}

	public void supplementHover() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();

		Actions action = new Actions(driver);
		action.moveToElement(MegamenuPage.getSportSupplementsMainMenu()).perform();
		Assert.assertTrue(MegamenuPage.getMegaMenuSection().isDisplayed());
	}

	@Test(description = "Checking_the_categories_and_subcategories_Sports_Supplements  ", priority = 290)
	public void Checking_the_categories_and_subcategories_Sports_Supplements() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportSupplementsMainMenu()).perform();
		// DataHelperAndWait.implicitWait(5);
		Assert.assertEquals(MegamenuPage.getSportsSupplementMainMenuList().get(0).getText(),
				"PROTEIN\n" + "Whey Protein\n" + "Whey Protein Isolate\n" + "Protein Blends\n" + "Non-dairy Protein\n"
						+ "Casein Protein\n" + "Diet Protein\n" + "Mass Gainers\n" + "CREATINE\n"
						+ "Creatine Monohydrate\n" + "Creatine Blends\n" + "AMINO ACIDS\n" + "BCAA\n" + "EAA\n"
						+ "Arginine\n" + "Beta Alanine\n" + "HMB\n" + "Amino Acid Powders\n" + "Amino Acid Pills\n"
						+ "Citrulline\n" + "Amino Acid Liquids\n" + "MUSCLE BOOSTERS\n" + "Testosterone Boosters\n"
						+ "Gh Boosters\n" + "WEIGHT MANAGEMENT\n" + "Stimulant Weight Loss\n"
						+ "Non-stimulant Weight Loss\n" + "Meal Replacements\n" + "Metabolism Support\n"
						+ "Toning Creams\n" + "MCT\n" + "RECOVERY\n" + "Glutamine\n" + "Recovery Blends\n"
						+ "Electrolytes & Hydration\n" + "CARBOHYDRATES\n" + "Carbohydrate Powders\n"
						+ "ENERGY & ENDURANCE\n" + "Stimulant Energy\n" + "Non-stimulant Energy\n" + "GAMING & FOCUS\n"
						+ "Gaming Essentials");
	}

	@Test(description = "checking_correct_URL_OptimumNutrition_Subcategory_AND_Empty_Page_Issue", priority = 291)
	public void checking_correct_URL_SportsSupplements_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();

		Actions action = new Actions(driver);
		action.moveToElement(MegamenuPage.getSportSupplementsMainMenu()).perform();
		MegamenuPage.getSportSupplementsMainMenu().click();
		Assert.assertTrue(driver.getCurrentUrl().contains(sportSupplementsUrl));
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking the main categories in the Sports Supplements main menu appearing in Bold Font", priority = 293)
	public void verifyTheMainCategoriesInTheSportsSupplementsMainMenuAppearingInBoldFont() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportSupplementsMainMenu()).perform();
		Assert.assertTrue(
				MegamenuPage.getProteinOptionInSportSupplementsMenu().getCssValue("font-weight").contains("700"));
		Assert.assertTrue(
				MegamenuPage.getCreatineOptionInSportSupplementsMenu().getCssValue("font-weight").contains("700"));
		Assert.assertTrue(
				MegamenuPage.getAminoAcidsOptionInSportSupplementsMenu().getCssValue("font-weight").contains("700"));
		Assert.assertEquals(
				MegamenuPage.getMuscleBoostersOptionInSportSupplementsMainMenu().getCssValue("text-transform"),
				"uppercase");
		Assert.assertTrue(MegamenuPage.getWeightManagementOptionInSportSupplementsMenu().getCssValue("font-weight")
				.contains("700"));
		Assert.assertTrue(
				MegamenuPage.getRecoveryOptionInSportSupplementsMenu().getCssValue("font-weight").contains("700"));
		Assert.assertTrue(
				MegamenuPage.getCarbohydratesOptionInSportSupplementsMenu().getCssValue("font-weight").contains("700"));
		Assert.assertTrue(MegamenuPage.getEnergyAndEnduranceOptionInSportSupplementsMenu().getCssValue("font-weight")
				.contains("700"));
		Assert.assertTrue(MegamenuPage.getGamingAndFocusOptionInSportSupplementsMenu().getCssValue("font-weight")
				.contains("700"));
	}

	@Test(description = "Checking the main categories in the Sports Supplements main menu appearing in uppercase", priority = 294)
	public void verifyTheMainCategoriesInTheSportsSupplementsMainMenuAppearingInUppercase() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportSupplementsMainMenu()).perform();
		Assert.assertEquals(MegamenuPage.getProteinOptionInSportSupplementsMainMenu().getCssValue("text-transform"),
				"uppercase");
		Assert.assertEquals(MegamenuPage.getCreatineOptionInSportSupplementsMainMenu().getCssValue("text-transform"),
				"uppercase");
		Assert.assertEquals(MegamenuPage.getAminoAcidsOptionInSportSupplementsMainMenu().getCssValue("text-transform"),
				"uppercase");
		Assert.assertEquals(
				MegamenuPage.getMuscleBoostersOptionInSportSupplementsMainMenu().getCssValue("text-transform"),
				"uppercase");
		Assert.assertEquals(
				MegamenuPage.getWeightManagementOptionInSportSupplementsMainMenu().getCssValue("text-transform"),
				"uppercase");
		Assert.assertEquals(MegamenuPage.getRecoveryOptionInSportSupplementsMainMenu().getCssValue("text-transform"),
				"uppercase");
		Assert.assertEquals(
				MegamenuPage.getCarbohydratesOptionInSportSupplementsMainMenu().getCssValue("text-transform"),
				"uppercase");
		Assert.assertEquals(
				MegamenuPage.getEnergyAndEnduranceOptionInSportSupplementsMainMenu().getCssValue("text-transform"),
				"uppercase");
		Assert.assertEquals(
				MegamenuPage.getGamingAndFocusOptionInSportSupplementsMainMenu().getCssValue("text-transform"),
				"uppercase");
	}

	@Test(description = "Checking clicking on the Protein option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 295)
	public void checking_correct_URL_ProteinOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportSupplementsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getProteinOptionInSportSupplementsMainMenu()).perform();
		MegamenuPage.getProteinOptionInSportSupplementsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), proteinSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Whey Protein Option appearing in the Sports Supplements main menu  will redirect the User to the correct URL", priority = 296)
	public void checking_correct_URL_WheyProteinOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportSupplementsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getWheyProteinOptionInSportSupplementsMainMenu()).perform();
		MegamenuPage.getWheyProteinOptionInSportSupplementsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), wheyProteinSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Whey Protein Isolate Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 297)
	public void checking_correct_URL_WheyProteinIsolateOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportSupplementsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getWheyProteinIsolateOptionInSportSupplementsMainMenu()).perform();
		MegamenuPage.getWheyProteinIsolateOptionInSportSupplementsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), WheyProteinIsolateSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the protein Blends Option  appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 298)
	public void checking_correct_URL_ProteinBlendsOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportSupplementsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getProteinBlendsOptionInSportSupplementsMainMenu()).perform();
		MegamenuPage.getProteinBlendsOptionInSportSupplementsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), proteinBlendsSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Non Dairy Protein Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 299)
	public void checking_correct_URL_NonDairyProteinOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportSupplementsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getNonDairyProteinOptionInSportSupplementsMainMenu()).perform();
		MegamenuPage.getNonDairyProteinOptionInSportSupplementsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), nonDairyProteinSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the casein Protein Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 300)
	public void checking_correct_URL_CaseinProteinOptionInSportsSupplementsMenuRedirectUserToCorrectURL() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportSupplementsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getCaseinProteinOptionInSportSupplementsMainMenu()).perform();
		MegamenuPage.getCaseinProteinOptionInSportSupplementsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), caseinProteinSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the diet Protein Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 301)
	public void checking_correct_URL_DietProteinOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportSupplementsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getDietProteinOptionInSportSupplementsMainMenu()).perform();
		MegamenuPage.getDietProteinOptionInSportSupplementsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), dietProteinSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Mass Gainers Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 302)
	public void checking_correct_URL_MassGainersOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportSupplementsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getMassGainersOptionInSportSupplementsMainMenu()).perform();
		MegamenuPage.getMassGainersOptionInSportSupplementsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), massGainersSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Creatine Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 303)
	public void checking_correct_URL_CreatineOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportSupplementsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getCreatineOptionInSportSupplementsMainMenu()).perform();
		MegamenuPage.getCreatineOptionInSportSupplementsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), creatineSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Creatine Monohydrate Option appearing in the Sports Supplements Main menu will redirect the User to the correct URL", priority = 304)
	public void checking_correct_URL_CreatineMonohydrateOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportSupplementsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getCreatineMonohydrateOptionInSportSupplementsMainMenu()).perform();
		MegamenuPage.getCreatineMonohydrateOptionInSportSupplementsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), creatineMonohydrateSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Creatine Blends Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 305)
	public void checking_correct_URL_CreatineBlendsOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportSupplementsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getCreatineBlendsOptionInSportSupplementsMainMenu()).perform();
		MegamenuPage.getCreatineBlendsOptionInSportSupplementsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), creatineBlendsSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Amino Acids Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 306)
	public void checking_correct_URL_AminoAcidsOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportSupplementsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getAminoAcidsOptionInSportSupplementsMainMenu()).perform();
		MegamenuPage.getAminoAcidsOptionInSportSupplementsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), aminoAcidsSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the BCAA Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 307)
	public void checking_correct_URL_BCAAOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportSupplementsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getbCAAOptionInSportSupplementsMainMenu()).perform();
		MegamenuPage.getbCAAOptionInSportSupplementsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), bCAASportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the EAA Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 308)
	public void checking_correct_URL_EAAOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportSupplementsMainMenu()).perform();
		action.moveToElement(MegamenuPage.geteAAOptionInSportSupplementsMainMenu()).perform();
		MegamenuPage.geteAAOptionInSportSupplementsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), eAASportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Arginine Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 309)
	public void checking_correct_URL_ArginineOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportSupplementsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getArginineOptionInSportSupplementsMainMenu()).perform();
		MegamenuPage.getArginineOptionInSportSupplementsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), arginineSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Beta Alanine Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 310)
	public void checking_correct_URL_BetaAlanineOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportSupplementsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getBetaAlanineOptionInSportSupplementsMainMenu()).perform();
		MegamenuPage.getBetaAlanineOptionInSportSupplementsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), betaAlanineSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the HMB Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 311)
	public void checking_correct_URL_HMbOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportSupplementsMainMenu()).perform();
		action.moveToElement(MegamenuPage.gethMBOptionInSportSupplementsMainMenu()).perform();
		MegamenuPage.gethMBOptionInSportSupplementsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), hMBSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Amino Acid Powders Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 312)
	public void checking_correct_URL_AminoAcidPowdersOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportSupplementsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getAminoAcidPowdersOptionInSportSupplementsMainMenu()).perform();
		MegamenuPage.getAminoAcidPowdersOptionInSportSupplementsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), aminoAcidPowdersSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Amino Acid Pills Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 313)
	public void checking_correct_URL_AminoAcidPillsOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportSupplementsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getAminoAcidPillsOptionInSportSupplementsMainMenu()).perform();
		MegamenuPage.getAminoAcidPillsOptionInSportSupplementsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), aminoAcidPillsSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Citrulline Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 314)
	public void checking_correct_URL_CitrullineOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportSupplementsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getCitrullineOptionInSportSupplementsMainMenu()).perform();
		MegamenuPage.getCitrullineOptionInSportSupplementsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), citrullineSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Amino Acid Liquids Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 315)
	public void checking_correct_URL_AminoAcidLiquidsOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportSupplementsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getAminoAcidLiquidsOptionInSportSupplementsMainMenu()).perform();
		MegamenuPage.getAminoAcidLiquidsOptionInSportSupplementsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), aminoAcidLiquidsSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Musclev Boosters Liquids Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 316)
	public void checking_correct_URL_MuscleBoostersOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportSupplementsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getMuscleBoostersOptionInSportSupplementsMainMenu()).perform();
		MegamenuPage.getMuscleBoostersOptionInSportSupplementsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), muscleBoostersSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Testosterone Boosters Option appearing in the Sports Supplements main menu  will redirect the User to the correct URL", priority = 317)
	public void checking_correct_URL_TestosteroneBoostersOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportSupplementsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getTestosteroneBoostersOptionInSportSupplementsMainMenu()).perform();
		MegamenuPage.getTestosteroneBoostersOptionInSportSupplementsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), testosteroneBoostersSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Gh Boosters Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 318)
	public void checking_correct_URL_GhBoostersOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportSupplementsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getGhBoostersOptionInSportSupplementsMainMenu()).perform();
		MegamenuPage.getGhBoostersOptionInSportSupplementsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), ghBoostersSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Weight Management Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 319)
	public void checking_correct_URL_WeightManagementOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportSupplementsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getWeightManagementOptionInSportSupplementsMainMenu()).perform();
		MegamenuPage.getWeightManagementOptionInSportSupplementsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), weightManagementSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Stimulant Weight Loss Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 320)
	public void checking_correct_URL_StimulantWeightLossOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportSupplementsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getStimulantWeightLossOptionInSportSupplementsMainMenu()).perform();
		MegamenuPage.getStimulantWeightLossOptionInSportSupplementsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), stimulantWeightLossSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Non Stimulant Weight Loss Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 321)
	public void checking_correct_URL_NonStimulantWeightLossOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportSupplementsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getNonStimulantWeightLossOptionInSportSupplementsMainMenu()).perform();
		MegamenuPage.getNonStimulantWeightLossOptionInSportSupplementsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), nonStimulantWeightLossSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Meal Replacements Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 322)
	public void checking_correct_URL_MealReplacementsOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportSupplementsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getMealReplacementsOptionInSportSupplementsMainMenu()).perform();
		MegamenuPage.getMealReplacementsOptionInSportSupplementsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), mealReplacementsSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Metabolism Support Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 323)
	public void checking_correct_URL_MetabolismSupportOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportSupplementsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getMetabolismSupportOptionInSportSupplementsMainMenu()).perform();
		MegamenuPage.getMetabolismSupportOptionInSportSupplementsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), metabolismSupportSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Toning Creams Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 324)
	public void checking_correct_URL_ToningCreamsOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportSupplementsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getToningCreamsOptionInSportSupplementsMainMenu()).perform();
		MegamenuPage.getToningCreamsOptionInSportSupplementsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), toningCreamsSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the MCT Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 325)
	public void checking_correct_URL_MctOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportSupplementsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getMctOptionInSportSupplementsMainMenu()).perform();
		MegamenuPage.getMctOptionInSportSupplementsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), mctSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Recovery Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 326)
	public void checking_correct_URL_RecoveryOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportSupplementsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getRecoveryOptionInSportSupplementsMainMenu()).perform();
		MegamenuPage.getRecoveryOptionInSportSupplementsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), recoverySportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Glutamine Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 327)
	public void checking_correct_URL_GlutamineOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportSupplementsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getGlutamineOptionInSportSupplementsMainMenu()).perform();
		MegamenuPage.getGlutamineOptionInSportSupplementsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), glutamineSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Recovery Blend Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 328)
	public void checking_correct_URL_RecoveryBlendOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportSupplementsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getRecoveryBlendOptionInSportSupplementsMainMenu()).perform();
		MegamenuPage.getRecoveryBlendOptionInSportSupplementsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), recoveryBlendSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Electrolytes And Hydration Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 329)
	public void checking_correct_URL_ElectrolytesAndHydrationOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportSupplementsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getElectrolytesAndHydrationOptionInSportSupplementsMainMenu()).perform();
		MegamenuPage.getElectrolytesAndHydrationOptionInSportSupplementsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), electrolytesAndHydrationSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Carbohydrates Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 330)
	public void checking_correct_URL_CarbohydratesOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportSupplementsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getCarbohydratesOptionInSportSupplementsMainMenu()).perform();
		MegamenuPage.getCarbohydratesOptionInSportSupplementsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), carbohydratesSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Carbohydrate Powders Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 331)
	public void checking_correct_URL_CarbohydratePowdersOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportSupplementsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getCarbohydratePowdersOptionInSportSupplementsMainMenu()).perform();
		MegamenuPage.getCarbohydratePowdersOptionInSportSupplementsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), carbohydratePowdersSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Energy And Endurance Powders Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 332)
	public void checking_correct_URL_EnergyAndEnduranceOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportSupplementsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getEnergyAndEnduranceOptionInSportSupplementsMainMenu()).perform();
		MegamenuPage.getEnergyAndEnduranceOptionInSportSupplementsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), energyAndEnduranceSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Stimulant Energy Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 333)
	public void checking_correct_URL_StimulantEnergyOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportSupplementsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getStimulantEnergyOptionInSportSupplementsMainMenu()).perform();
		MegamenuPage.getStimulantEnergyOptionInSportSupplementsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), stimulantEnergySportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Non Stimulant Energy Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 334)
	public void checking_correct_URL_NonStimulantEnergyOptionInSportsSupplementsbMainMenuRedirectUserToCorrectURL() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportSupplementsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getNonStimulantEnergyOptionInSportSupplementsMainMenu()).perform();
		MegamenuPage.getNonStimulantEnergyOptionInSportSupplementsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), nonStimulantEnergySportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Gaming And Focus Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 335)
	public void checking_correct_URL_GamingAndFocusOptionInSportsSupplementsbMainMenuRedirectUserToCorrectURL() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportSupplementsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getGamingAndFocusOptionInSportSupplementsMainMenu()).perform();
		MegamenuPage.getGamingAndFocusOptionInSportSupplementsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), gamingAndFocusSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Gaming Essentials Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 336)
	public void checking_correct_URL_GamingEssentialsOptionInSportsSupplementsbMainMenuRedirectUserToCorrectURL() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportSupplementsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getGamingEssentialsOptionInSportSupplementsMainMenu()).perform();
		MegamenuPage.getGamingEssentialsOptionInSportSupplementsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), gamingEssentialsSportSupplementsURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	
	@Test(description = "Checking the Down-arrow Icon display correctly next to the Vitamins & Health main menu", priority = 337)
	public void verifyTheDownArrowIconAppearsCorrectlyNextToTheVitaminsAndHealthMainMenu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();

		Actions action = new Actions(driver);
		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		Assert.assertTrue(MegamenuPage.getDownArrowKeyInVitaminsAndHealthMenu().isDisplayed());
	}

	@Test(description = "Checking the system will display the sub Menu once hovering on the Vitamins & Health main menu", priority = 338)
	public void verifyTheSubMenuWillAppearsCorrectlyOnceHoveringOnVitaminsAndHealthMainMenu() {
		vitaminsCategoryHover();
	}

	public void vitaminsCategoryHover() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();

		Actions action = new Actions(driver);
		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		Assert.assertTrue(MegamenuPage.getMegaMenuSection().isDisplayed());
	}

	@Test(description = "Checking the Vitamins & Health main menu display the correct categories and sub-categories", priority = 339)
	public void verifyVitaminsAndHealthMainMenuDisplayTheCorrectCategoriesAndSubCategories() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		// DataHelperAndWait.implicitWait(5);
		Assert.assertEquals(MegamenuPage.getVitaminsAndHealthMainMenuList().get(0).getText(),
				"FEATURED\n" + "Alive! Vitamins\n" + "Sexual Health\n" + "ESSENTIAL VITAMINS\n" + "Folic Acid\n"
						+ "Vitamin A\n" + "Vitamin B\n" + "Vitamin C\n" + "Vitamin D\n" + "Vitamin E\n" + "Vitamin K\n"
						+ "MULTIVITAMINS\n" + "Vitamins For Kids\n" + "Multivitamins For Men\n"
						+ "Multivitamins For Women\n" + "BONE & JOINT\n" + "Bone Health\n" + "Joint Health\n"
						+ "BEAUTY\n" + "Collagen\n" + "Hair, Skin & Nails\n" + "FISH OIL & OMEGAS\n" + "Fish Oil\n"
						+ "Omega 3 6 9\n" + "HEALTHY LIFESTYLE\n" + "Antioxidants\n" + "Blood Sugar Support\n"
						+ "Brain Support\n" + "Heart Health\n" + "Detox & Cleanse\n" + "Energy Formulas\n"
						+ "Eye Health\n" + "Herbs\n" + "Hormones Balance\n" + "Immune Support\n" + "Mens Health\n"
						+ "Stress Relief\n" + "Sleep Support\n" + "Superfoods\n" + "Urinary Tract Support\n"
						+ "Weight Management\n" + "Womens Health\n" + "DIGESTION\n" + "Digestive Support\n"
						+ "Probiotics\n" + "SPORT VITAMINS\n" + "Amino Acids\n" + "MINERALS\n" + "Calcium\n" + "Iron\n"
						+ "Magnesium\n" + "Multimineral Formulas\n" + "Zinc\n" + "Potassium\n" + "HEALTHY DRINKS\n"
						+ "Drinkable Vitamins\n" + "PETS\n" + "Supplements & More");
	}

	@Test(description = "Checking clicking on the Vitamins & Health main menu will redirect the User to the correct URL", priority = 340)
	public void checking_correct_URL_VitaminsAndHealth_Subcategory_AND_Empty_Page_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();

		Actions action = new Actions(driver);
		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		MegamenuPage.getVitaminsAndHealthMainMenu().click();
		Assert.assertTrue(driver.getCurrentUrl().contains(healthVitaminsUrl));
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the FEATURED Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 341)
	public void checking_correct_URL_FeaturedOptionInVitaminsAndHealth_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		action.moveToElement(MegamenuPage.getFeaturedOptionInVitaminsAndHealthMainMenu()).perform();
		MegamenuPage.getFeaturedOptionInVitaminsAndHealthMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), featuredVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Alive Vitamins Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 342)
	public void checking_correct_URL_AliveVitamins_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		action.moveToElement(MegamenuPage.getAliveVitaminsOptionInVitaminsAndHealthMainMenu()).perform();
		MegamenuPage.getAliveVitaminsOptionInVitaminsAndHealthMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), aliveVitaminsVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Sexual Health Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 343)
	public void checking_correct_URL_SexualHealth_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		action.moveToElement(MegamenuPage.getSexualHealthOptionInVitaminsAndHealthMainMenu()).perform();
		MegamenuPage.getSexualHealthOptionInVitaminsAndHealthMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), sexualHealthVitaminsAndHealthURL);
		System.out.println(driver.getCurrentUrl());
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Essential Vitamins Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 344)
	public void checking_correct_URL_EssentialVitamins_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		action.moveToElement(MegamenuPage.getEssentialVitaminsOptionInVitaminsAndHealthMainMenu()).perform();
		MegamenuPage.getEssentialVitaminsOptionInVitaminsAndHealthMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), essentialVitaminsVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Folic Acid Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 354)
	public void checking_correct_URL_FolicAcid_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		action.moveToElement(MegamenuPage.getFolicAcidOptionInVitaminsAndHealthMainMenu()).perform();
		MegamenuPage.getFolicAcidOptionInVitaminsAndHealthMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), folicAcidVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Vitamin A Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 355)
	public void checking_correct_URL_VitaminA_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminAOptionInVitaminsAndHealthMainMenu()).perform();
		MegamenuPage.getVitaminAOptionInVitaminsAndHealthMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), vitaminAVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Vitamin B Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 356)
	public void checking_correct_URL_VitaminB_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminBOptionInVitaminsAndHealthMainMenu()).perform();
		MegamenuPage.getVitaminBOptionInVitaminsAndHealthMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), vitaminBVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Vitamin C Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 357)
	public void checking_correct_URL_VitaminC_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminCOptionInVitaminsAndHealthMainMenu()).perform();
		MegamenuPage.getVitaminCOptionInVitaminsAndHealthMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), vitaminCVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Vitamin D Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 358)
	public void checking_correct_URL_VitaminD_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminDOptionInVitaminsAndHealthMainMenu()).perform();
		MegamenuPage.getVitaminDOptionInVitaminsAndHealthMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), vitaminDVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Vitamin E Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 359)
	public void checking_correct_URL_VitaminE_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminEOptionInVitaminsAndHealthMainMenu()).perform();
		MegamenuPage.getVitaminEOptionInVitaminsAndHealthMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), vitaminEVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Vitamin K Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 360)
	public void checking_correct_URL_VitaminK_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminKOptionInVitaminsAndHealthMainMenu()).perform();
		MegamenuPage.getVitaminKOptionInVitaminsAndHealthMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), vitaminKVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Multi Vitamins Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 361)
	public void checking_correct_URL_MultiVitamins_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		action.moveToElement(MegamenuPage.getMultiVitaminsOptionInVitaminsAndHealthMainMenu()).perform();
		MegamenuPage.getMultiVitaminsOptionInVitaminsAndHealthMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), multiVitaminsVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Vitamins For Kids Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 362)
	public void checking_correct_URL_VitaminsForKids_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsForKidsOptionInVitaminsAndHealthMainMenu()).perform();
		MegamenuPage.getVitaminsForKidsOptionInVitaminsAndHealthMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), vitaminsForKidsVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Vitamins For Men Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 363)
	public void checking_correct_URL_VitaminsForMen_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsForMenOptionInVitaminsAndHealthMainMenu()).perform();
		MegamenuPage.getVitaminsForMenOptionInVitaminsAndHealthMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), vitaminsForMenVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Vitamins For Women Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 364)
	public void checking_correct_URL_VitaminsForWomen_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		action.moveToElement(MegamenuPage.getVitaminsForWomenOptionInVitaminsAndHealthMainMenu()).perform();
		MegamenuPage.getVitaminsForWomenOptionInVitaminsAndHealthMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), vitaminsForWomenVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Bone And Joint Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 365)
	public void checking_correct_URL_BoneAndJoint_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		action.moveToElement(MegamenuPage.getBoneAndJointOptionInVitaminsAndHealthMainMenu()).perform();
		MegamenuPage.getBoneAndJointOptionInVitaminsAndHealthMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), boneJointVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Bone Health Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 366)
	public void checking_correct_URL_BoneHealth_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		action.moveToElement(MegamenuPage.getBoneHealthOptionInVitaminsAndHealthMainMenu()).perform();
		MegamenuPage.getBoneHealthOptionInVitaminsAndHealthMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), boneHealthVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Joint Health Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 367)
	public void checking_correct_URL_JointHealth_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		action.moveToElement(MegamenuPage.getJointHealthOptionInVitaminsAndHealthMainMenu()).perform();
		MegamenuPage.getJointHealthOptionInVitaminsAndHealthMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), jointHealthVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Beauty Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 368)
	public void checking_correct_URL_Beauty_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		action.moveToElement(MegamenuPage.getBeautyOptionInVitaminsAndHealthMainMenu()).perform();
		MegamenuPage.getBeautyOptionInVitaminsAndHealthMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), beautyVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Collagen Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 369)
	public void checking_correct_URL_Collagen_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		action.moveToElement(MegamenuPage.getCollagenOptionInVitaminsAndHealthMainMenu()).perform();
		MegamenuPage.getCollagenOptionInVitaminsAndHealthMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), collagenVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Hair, Skin AndNails Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 370)
	public void checking_correct_URL_HairSkinAndNails_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		action.moveToElement(MegamenuPage.getHairSkinAndNailsOptionInVitaminsAndHealthMainMenu()).perform();
		MegamenuPage.getHairSkinAndNailsOptionInVitaminsAndHealthMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), hairSkinAndNailsVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Fish Oil Omegas Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 371)
	public void checking_correct_URL_FishOilOmegas_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		action.moveToElement(MegamenuPage.getFishOilOmegasOptionInVitaminsAndHealthMainMenu()).perform();
		MegamenuPage.getFishOilOmegasOptionInVitaminsAndHealthMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), fishOilAndOmegasVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Fish Oil Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 372)
	public void checking_correct_URL_FishOil_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		action.moveToElement(MegamenuPage.getFishOilOptionInVitaminsAndHealthMainMenu()).perform();
		MegamenuPage.getFishOilOptionInVitaminsAndHealthMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), fishOilVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Omega369 Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 373)
	public void checking_correct_URL_Omega369_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		action.moveToElement(MegamenuPage.getOmega369OptionInVitaminsAndHealthMainMenu()).perform();
		MegamenuPage.getOmega369OptionInVitaminsAndHealthMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), omegaMixVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Health Lifestyle Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 374)
	public void checking_correct_URL_HealthLifestyle_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		action.moveToElement(MegamenuPage.getHealthLifestyleOptionInVitaminsAndHealthMainMenu()).perform();
		MegamenuPage.getHealthLifestyleOptionInVitaminsAndHealthMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), healthyLifestyleVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Antioxidants Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 375)
	public void checking_correct_URL_Antioxidants_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		action.moveToElement(MegamenuPage.getAntioxidantsOptionInVitaminsAndHealthMainMenu()).perform();
		MegamenuPage.getAntioxidantsOptionInVitaminsAndHealthMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), antioxidantVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Blood Sugar Support Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 376)
	public void checking_correct_URL_BloodSugarSupport_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		action.moveToElement(MegamenuPage.getBloodSugarSupportOptionInVitaminsAndHealthMainMenu()).perform();
		MegamenuPage.getBloodSugarSupportOptionInVitaminsAndHealthMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), bloodSugarSupportVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Brain Support Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 377)
	public void checking_correct_URL_BrainSupport_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		action.moveToElement(MegamenuPage.getBrainSupportOptionInVitaminsAndHealthMainMenu()).perform();
		MegamenuPage.getBrainSupportOptionInVitaminsAndHealthMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), brainSupportVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Detox And Cleanse Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 378)
	public void checking_correct_URL_DetoxAndCleanse_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		action.moveToElement(MegamenuPage.getDetoxAndCleanseOptionInVitaminsAndHealthMainMenu()).perform();
		MegamenuPage.getDetoxAndCleanseOptionInVitaminsAndHealthMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), detoxCleanseVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Energy Formulas Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 379)
	public void checking_correct_URL_EnergyFormulas_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		action.moveToElement(MegamenuPage.getEnergyFormulasOptionInVitaminsAndHealthMainMenu()).perform();
		MegamenuPage.getEnergyFormulasOptionInVitaminsAndHealthMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), energyFormulasVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Eye Health Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 380)
	public void checking_correct_URL_EyeHealth_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		action.moveToElement(MegamenuPage.getEyeHealthOptionInVitaminsAndHealthMainMenu()).perform();
		MegamenuPage.getEyeHealthOptionInVitaminsAndHealthMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), eyeHealthVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Herbs Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 381)
	public void checking_correct_URL_Herbs_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		action.moveToElement(MegamenuPage.getHerbsOptionInVitaminsAndHealthMainMenu()).perform();
		MegamenuPage.getHerbsOptionInVitaminsAndHealthMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), herbsVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Hormones Balance Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 382)
	public void checking_correct_URL_HormonesBalance_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		action.moveToElement(MegamenuPage.getHormonesBalanceOptionInVitaminsAndHealthMainMenu()).perform();
		MegamenuPage.getHormonesBalanceOptionInVitaminsAndHealthMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), hormonesBalanceVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Immune Support Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 382)
	public void checking_correct_URL_ImmuneSupport_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		action.moveToElement(MegamenuPage.getImmuneSupportOptionInVitaminsAndHealthMainMenu()).perform();
		MegamenuPage.getImmuneSupportOptionInVitaminsAndHealthMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), immuneSupportVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Mens Health Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 383)
	public void checking_correct_URL_MensHealth_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		action.moveToElement(MegamenuPage.getMensHealthOptionInVitaminsAndHealthMainMenu()).perform();
		MegamenuPage.getMensHealthOptionInVitaminsAndHealthMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), mensHealthVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Stress Relief Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 384)
	public void checking_correct_URL_StressRelief_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		action.moveToElement(MegamenuPage.getStressReliefOptionInVitaminsAndHealthMainMenu()).perform();
		MegamenuPage.getStressReliefOptionInVitaminsAndHealthMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), stressReliefVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Sleep Support Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 385)
	public void checking_correct_URL_SleepSupport_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		action.moveToElement(MegamenuPage.getSleepSupportOptionInVitaminsAndHealthMainMenu()).perform();
		MegamenuPage.getSleepSupportOptionInVitaminsAndHealthMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), sleepSupportVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Super Foods Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 386)
	public void checking_correct_URL_SuperFoods_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		action.moveToElement(MegamenuPage.getSuperFoodsOptionInVitaminsAndHealthMainMenu()).perform();
		MegamenuPage.getSuperFoodsOptionInVitaminsAndHealthMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), superFoodsVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Urinary Tract Support Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 387)
	public void checking_correct_URL_UrinaryTractSupport_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		action.moveToElement(MegamenuPage.getUrinaryTractSupportOptionInVitaminsAndHealthMainMenu()).perform();
		MegamenuPage.getUrinaryTractSupportOptionInVitaminsAndHealthMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), urinaryTractSupportVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Weight Management Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 388)
	public void checking_correct_URL_WeightManagement_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		action.moveToElement(MegamenuPage.getWeightManagementOptionInVitaminsAndHealthMainMenu()).perform();
		MegamenuPage.getWeightManagementOptionInVitaminsAndHealthMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), weightManagementVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Womens Health Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 389)
	public void checking_correct_URL_WomensHealth_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		action.moveToElement(MegamenuPage.getWomensHealthOptionInVitaminsAndHealthMainMenu()).perform();
		MegamenuPage.getWomensHealthOptionInVitaminsAndHealthMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), womensHealthVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Digestion Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 390)
	public void checking_correct_URL_Digestion_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		action.moveToElement(MegamenuPage.getDigestionOptionInVitaminsAndHealthMainMenu()).perform();
		MegamenuPage.getDigestionOptionInVitaminsAndHealthMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), digestionVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Digestion Support Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 391)
	public void checking_correct_URL_DigestionSupport_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		action.moveToElement(MegamenuPage.getDigestiveSupportOptionInVitaminsAndHealthMainMenu()).perform();
		MegamenuPage.getDigestiveSupportOptionInVitaminsAndHealthMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), digestionSupportVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Probiotics Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 392)
	public void checking_correct_URL_Probiotics_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		action.moveToElement(MegamenuPage.getProbioticsOptionInVitaminsAndHealthMainMenu()).perform();
		MegamenuPage.getProbioticsOptionInVitaminsAndHealthMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), probioticsVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Sport Vitamins Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 393)
	public void checking_correct_URL_SportVitamins_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		action.moveToElement(MegamenuPage.getSportVitaminsOptionInVitaminsAndHealthMainMenu()).perform();
		MegamenuPage.getSportVitaminsOptionInVitaminsAndHealthMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), sportVitaminsVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Amino Acid Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 394)
	public void checking_correct_URL_AminoAcid_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		action.moveToElement(MegamenuPage.getAminoAcidOptionInVitaminsAndHealthMainMenu()).perform();
		MegamenuPage.getAminoAcidOptionInVitaminsAndHealthMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), aminoAcidVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Minerals Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 395)
	public void checking_correct_URL_Minerals_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		action.moveToElement(MegamenuPage.getMineralsOptionInVitaminsAndHealthMainMenu()).perform();
		MegamenuPage.getMineralsOptionInVitaminsAndHealthMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), mineralsVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Calcium Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 396)
	public void checking_correct_URL_Calcium_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		action.moveToElement(MegamenuPage.getCalciumOptionInVitaminsAndHealthMainMenu()).perform();
		MegamenuPage.getCalciumOptionInVitaminsAndHealthMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), calciumVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Iron Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 397)
	public void checking_correct_URL_Iron_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		action.moveToElement(MegamenuPage.getIronOptionInVitaminsAndHealthMainMenu()).perform();
		MegamenuPage.getIronOptionInVitaminsAndHealthMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), ironVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Magnesium Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 398)
	public void checking_correct_URL_Magnesium_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		action.moveToElement(MegamenuPage.getMagnesiumOptionInVitaminsAndHealthMainMenu()).perform();
		MegamenuPage.getMagnesiumOptionInVitaminsAndHealthMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), magnesiumVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Multi mineral Formulas Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 399)
	public void checking_correct_URL_MultimineralFormulas_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		action.moveToElement(MegamenuPage.getMultimineralFormulasOptionInVitaminsAndHealthMainMenu()).perform();
		MegamenuPage.getMultimineralFormulasOptionInVitaminsAndHealthMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), multimineralFormulasVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Zinc Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 400)
	public void checking_correct_URL_Zinc_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		action.moveToElement(MegamenuPage.getZincOptionInVitaminsAndHealthMainMenu()).perform();
		MegamenuPage.getZincOptionInVitaminsAndHealthMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), zincVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Potassium Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 401)
	public void checking_correct_URL_Potassium_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		action.moveToElement(MegamenuPage.getPotassiumOptionInVitaminsAndHealthMainMenu()).perform();
		MegamenuPage.getPotassiumOptionInVitaminsAndHealthMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), potassiumVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Healthy Drinks Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 402)
	public void checking_correct_URL_HealthyDrinks_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		action.moveToElement(MegamenuPage.getHealthyDrinksOptionInVitaminsAndHealthMainMenu()).perform();
		MegamenuPage.getHealthyDrinksOptionInVitaminsAndHealthMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), healthyDrinksVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Drinkable Vitamins Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 403)
	public void checking_correct_URL_DrinkableVitamins_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		action.moveToElement(MegamenuPage.getDrinkableVitaminsOptionInVitaminsAndHealthMainMenu()).perform();
		MegamenuPage.getDrinkableVitaminsOptionInVitaminsAndHealthMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), drinkableVitaminsVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Pets Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 404)
	public void checking_correct_URL_Pets_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		action.moveToElement(MegamenuPage.getPetsOptionInVitaminsAndHealthMainMenu()).perform();
		MegamenuPage.getPetsOptionInVitaminsAndHealthMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), petsVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Supplements More Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 405)
	public void checking_correct_URL_SupplementsMore_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getVitaminsAndHealthMainMenu()).perform();
		action.moveToElement(MegamenuPage.getSupplementsMoreOptionInVitaminsAndHealthMainMenu()).perform();
		MegamenuPage.getSupplementsMoreOptionInVitaminsAndHealthMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), supplementsMoreVitaminsAndHealthURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	//// HealthyFood Test Cases

	@Test(description = "CheckingTHehoverOfHealthyFood_main_menu", priority = 407)
	public void CheckingTHe_hover_Of_HealthyFood_main_menu() {
		healthyFoodCategoryhover();
	}

	public void healthyFoodCategoryhover() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();

		Actions action = new Actions(driver);
		action.moveToElement(MegamenuPage.getHealthyFoodMainMenu()).perform();
		Assert.assertTrue(MegamenuPage.getMegaMenuSection().isDisplayed());
	}

	@Test(description = "CheckingThecategories_And_sub_categories_Healthy_Food ", priority = 408)
	public void CheckingThecategories_And_sub_categories_Healthy_Food() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getHealthyFoodMainMenu()).perform();
		// DataHelperAndWait.implicitWait(5);
		Assert.assertEquals(MegamenuPage.getHealthyFoodMainMenuList().get(0).getText(),
				"GROCERY\n" + "Baking & Cooking\n" + "Canned\n" + "Coffee\n" + "Condiments\n" + "Milk & Cream\n"
						+ "Nuts & Oats\n" + "Oils\n" + "Pasta\n" + "Rice & Grains\n" + "Seasonings & Spices\n"
						+ "Sugar & Sweeteners\n" + "Syrups\n" + "Tea & Herbs\n" + "Superfoods\n" + "Ready Mixes\n"
						+ "Breakfast & Cereal\n" + "READY TO DRINK\n" + "Amino & Bcaas\n" + "Energy Drinks\n"
						+ "Protein Shakes\n" + "Electrolytes & Hydration\n" + "HEALTHY SNACKS\n" + "Protein Bars\n"
						+ "Cookies\n" + "Chips\n" + "Brownies & Pancakes\n" + "Snack Bars\n" + "Spreads\n"
						+ "Other Healthy Snacks\n" + "READY TO EAT\n" + "Healthy Meals\n" + "FEATURED\n"
						+ "Healthy Meal Replacement\n" + "Protein Coffee\n" + "Candies\n" + "Flavoring Agents\n"
						+ "Keto Snacks\n" + "Manuka Honey\n" + "Meat Snacks");
	}

	@Test(description = "checking_correct_URL_HealthyFoodMainMenu", priority = 409)
	public void checking_correct_URL_HealthyFoodMainMenu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();

		Actions action = new Actions(driver);
		action.moveToElement(MegamenuPage.getHealthyFoodMainMenu()).perform();
		MegamenuPage.getHealthyFoodMainMenu().click();
		Assert.assertTrue(driver.getCurrentUrl().contains(healthyFoodsUrl));
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Grocery Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 410)
	public void checking_correct_URL_Grocery() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getHealthyFoodMainMenu()).perform();
		action.moveToElement(MegamenuPage.getGroceryOptionInHealthyFoodMainMenu()).perform();
		MegamenuPage.getGroceryOptionInHealthyFoodMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), groceryHealthyFoodURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Baking And Cooking Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 411)
	public void checking_correct_URL_BakingAndCooking_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getHealthyFoodMainMenu()).perform();
		action.moveToElement(MegamenuPage.getBakingAndCookingOptionInHealthyFoodMainMenu()).perform();
		MegamenuPage.getBakingAndCookingOptionInHealthyFoodMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), bakingAndCookingHealthyFoodURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Canned Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 412)
	public void checking_correct_URL_Canned_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getHealthyFoodMainMenu()).perform();
		action.moveToElement(MegamenuPage.getCannedOptionInHealthyFoodMainMenu()).perform();
		MegamenuPage.getCannedOptionInHealthyFoodMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), cannedHealthyFoodURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Coffee Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 413)
	public void checking_correct_URL_Coffee_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getHealthyFoodMainMenu()).perform();
		action.moveToElement(MegamenuPage.getCoffeeOptionInHealthyFoodMainMenu()).perform();
		MegamenuPage.getCoffeeOptionInHealthyFoodMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), coffeeHealthyFoodURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Condiments Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 414)
	public void checking_correct_URL_Condiments_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getHealthyFoodMainMenu()).perform();
		action.moveToElement(MegamenuPage.getCondimentsOptionInHealthyFoodMainMenu()).perform();
		MegamenuPage.getCondimentsOptionInHealthyFoodMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), condimentsHealthyFoodURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Milk And Cream Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 415)
	public void checking_correct_URL_MilkAndCream_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getHealthyFoodMainMenu()).perform();
		action.moveToElement(MegamenuPage.getMilkAndCreamOptionInHealthyFoodMainMenu()).perform();
		MegamenuPage.getMilkAndCreamOptionInHealthyFoodMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), milkAndCreamHealthyFoodURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Nuts And Oats Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 416)
	public void checking_correct_URL_NutsAndOats_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getHealthyFoodMainMenu()).perform();
		action.moveToElement(MegamenuPage.getNutsAndOatsOptionInHealthyFoodMainMenu()).perform();
		MegamenuPage.getNutsAndOatsOptionInHealthyFoodMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), nutsAndOatsHealthyFoodURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Oils Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 417)
	public void checking_correct_URL_Oils_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getHealthyFoodMainMenu()).perform();
		action.moveToElement(MegamenuPage.getOilsOptionInHealthyFoodMainMenu()).perform();
		MegamenuPage.getOilsOptionInHealthyFoodMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), oilsHealthyFoodURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Pasta Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 418)
	public void checking_correct_URL_Pasta_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getHealthyFoodMainMenu()).perform();
		action.moveToElement(MegamenuPage.getPastaOptionInHealthyFoodMainMenu()).perform();
		MegamenuPage.getPastaOptionInHealthyFoodMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), pastaHealthyFoodURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Rice And Grains Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 419)
	public void checking_correct_URL_RiceAndGrains_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getHealthyFoodMainMenu()).perform();
		action.moveToElement(MegamenuPage.getRiceAndGrainsOptionInHealthyFoodMainMenu()).perform();
		MegamenuPage.getRiceAndGrainsOptionInHealthyFoodMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), riceAndGrainsHealthyFoodURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Seasonings And Spices Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 420)
	public void checking_correct_URL_SeasoningsAndSpices_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getHealthyFoodMainMenu()).perform();
		action.moveToElement(MegamenuPage.getSeasoningsAndSpicesOptionInHealthyFoodMainMenu()).perform();
		MegamenuPage.getSeasoningsAndSpicesOptionInHealthyFoodMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), seasoningsAndSpicessHealthyFoodURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Sugar And Sweeteners Option appearing in the Healthy Food main menu inside ShopBy Menu will redirect the User to the correct URL", priority = 421)
	public void checking_correct_URL_SugarSweeteners_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getHealthyFoodMainMenu()).perform();
		action.moveToElement(MegamenuPage.getSugarSweetenersOptionInHealthyFoodMainMenu()).perform();
		MegamenuPage.getSugarSweetenersOptionInHealthyFoodMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), sugarAndSweetenersHealthyFoodURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Syrups Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 422)
	public void checking_correct_URL_Syrups_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getHealthyFoodMainMenu()).perform();
		action.moveToElement(MegamenuPage.getSyrupsOptionInHealthyFoodMainMenu()).perform();
		MegamenuPage.getSyrupsOptionInHealthyFoodMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), syrupsHealthyFoodURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Tea And Herbs Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 423)
	public void checking_correct_URL_TeaAndHerbs_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getHealthyFoodMainMenu()).perform();
		action.moveToElement(MegamenuPage.getTeaAndHerbsOptionInHealthyFoodMainMenu()).perform();
		MegamenuPage.getTeaAndHerbsOptionInHealthyFoodMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), teaAndHerbsInHealthyFoodUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Superfoods Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 424)
	public void checking_correct_URL_Superfoods_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getHealthyFoodMainMenu()).perform();
		action.moveToElement(MegamenuPage.getSuperfoodsOptionInHealthyFoodMainMenu()).perform();
		MegamenuPage.getSuperfoodsOptionInHealthyFoodMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), superFoodsInHealthyFoodUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Ready Mixes Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 425)
	public void checking_correct_URL_ReadyMixes_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getHealthyFoodMainMenu()).perform();
		action.moveToElement(MegamenuPage.getReadyMixesOptionInHealthyFoodMainMenu()).perform();
		MegamenuPage.getReadyMixesOptionInHealthyFoodMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), readyMixInHealthyFoodUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Breakfast And Cereal Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 426)
	public void checking_correct_URL_BreakfastAndCereal_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getHealthyFoodMainMenu()).perform();
		action.moveToElement(MegamenuPage.getBreakfastAndCerealOptionInHealthyFoodMainMenu()).perform();
		MegamenuPage.getBreakfastAndCerealOptionInHealthyFoodMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), breakfastAndCerealInHealthyFoodUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Ready To Drink Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 427)
	public void checking_correct_URL_ReadyToDrink_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getHealthyFoodMainMenu()).perform();
		action.moveToElement(MegamenuPage.getReadyToDrinkOptionInHealthyFoodMainMenu()).perform();
		MegamenuPage.getReadyToDrinkOptionInHealthyFoodMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), readyToDrinkInHealthyFoodUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Amino And Bcaas Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 428)
	public void checking_correct_URL_AminoAndBcaas_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getHealthyFoodMainMenu()).perform();
		action.moveToElement(MegamenuPage.getAminoAndBcaasOptionInHealthyFoodMainMenu()).perform();
		MegamenuPage.getAminoAndBcaasOptionInHealthyFoodMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), aminoBcaasInHealthyFoodUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Energy Drinks Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 429)
	public void checking_correct_URL_EnergyDrinks_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getHealthyFoodMainMenu()).perform();
		action.moveToElement(MegamenuPage.getEnergyDrinksOptionInHealthyFoodMainMenu()).perform();
		MegamenuPage.getEnergyDrinksOptionInHealthyFoodMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), energyDrinksInHealthyFoodUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Protein Shakes Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 430)
	public void checking_correct_URL_ProteinShakes_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getHealthyFoodMainMenu()).perform();
		action.moveToElement(MegamenuPage.getProteinShakesOptionInHealthyFoodMainMenu()).perform();
		MegamenuPage.getProteinShakesOptionInHealthyFoodMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), proteinShakesInHealthyFoodUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Electrolytes And Hydration Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 431)
	public void checking_correct_URL_ElectrolytesAndHydration_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getHealthyFoodMainMenu()).perform();
		action.moveToElement(MegamenuPage.getElectrolytesAndHydrationOptionInHealthyFoodMainMenu()).perform();
		MegamenuPage.getElectrolytesAndHydrationOptionInHealthyFoodMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), electrolytesAndHydrationInHealthyFoodUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Healthy Snacks Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 432)
	public void checking_correct_URL_HealthySnacks_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getHealthyFoodMainMenu()).perform();
		action.moveToElement(MegamenuPage.getHealthySnacksOptionInHealthyFoodMainMenu()).perform();
		MegamenuPage.getHealthySnacksOptionInHealthyFoodMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), healthySnacksInHealthyFoodUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Protein Bars Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 433)
	public void checking_correct_URL_ProteinBars_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getHealthyFoodMainMenu()).perform();
		action.moveToElement(MegamenuPage.getProteinBarsOptionInHealthyFoodMainMenu()).perform();
		MegamenuPage.getProteinBarsOptionInHealthyFoodMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), proteinBarsInHealthyFoodUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Cookies Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 434)
	public void checking_correct_URL_Cookies_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getHealthyFoodMainMenu()).perform();
		action.moveToElement(MegamenuPage.getCookiesOptionInHealthyFoodMainMenu()).perform();
		MegamenuPage.getCookiesOptionInHealthyFoodMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), cookiesInHealthyFoodUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Chips Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 435)
	public void checking_correct_URL_Chips_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getHealthyFoodMainMenu()).perform();
		action.moveToElement(MegamenuPage.getChipsOptionInHealthyFoodMainMenu()).perform();
		MegamenuPage.getChipsOptionInHealthyFoodMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), chipsInHealthyFoodUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Brownies And Pancakes Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 436)
	public void checking_correct_URL_BrowniesAndPancakes_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getHealthyFoodMainMenu()).perform();
		action.moveToElement(MegamenuPage.getBrowniesAndPancakesOptionInHealthyFoodMainMenu()).perform();
		MegamenuPage.getBrowniesAndPancakesOptionInHealthyFoodMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), browniesAndPancakesInHealthyFoodUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Snack Bars Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 437)
	public void checking_correct_URL_SnackBars_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getHealthyFoodMainMenu()).perform();
		action.moveToElement(MegamenuPage.getSnackBarsOptionInHealthyFoodMainMenu()).perform();
		MegamenuPage.getSnackBarsOptionInHealthyFoodMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), snackBarsInHealthyFoodUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Spreads Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 438)
	public void checking_correct_URL_Spreads_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getHealthyFoodMainMenu()).perform();
		action.moveToElement(MegamenuPage.getSpreadsOptionInHealthyFoodMainMenu()).perform();
		MegamenuPage.getSpreadsOptionInHealthyFoodMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), spreadsInHealthyFoodUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Other Healthy Snacks Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 439)
	public void checking_correct_URL_OtherHealthySnacks_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getHealthyFoodMainMenu()).perform();
		action.moveToElement(MegamenuPage.getOtherHealthySnacksOptionInHealthyFoodMainMenu()).perform();
		MegamenuPage.getOtherHealthySnacksOptionInHealthyFoodMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), otherHealthySnacksInHealthyFoodUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Ready To Eat Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 440)
	public void checking_correct_URL_ReadyToEat_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getHealthyFoodMainMenu()).perform();
		action.moveToElement(MegamenuPage.getReadyToEatOptionInHealthyFoodMainMenu()).perform();
		MegamenuPage.getReadyToEatOptionInHealthyFoodMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), readyToEatInHealthyFoodUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Healthy Meals Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 441)
	public void checking_correct_URL_HealthyMeals_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getHealthyFoodMainMenu()).perform();
		action.moveToElement(MegamenuPage.getHealthyMealsOptionInHealthyFoodMainMenu()).perform();
		MegamenuPage.getHealthyMealsOptionInHealthyFoodMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), healthyMealsInHealthyFoodUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Featured Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 442)
	public void checking_correct_URL_FeaturedOptionInHealthyFood_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getHealthyFoodMainMenu()).perform();
		action.moveToElement(MegamenuPage.getFeaturedOptionInHealthyFoodMainMenu()).perform();
		MegamenuPage.getFeaturedOptionInHealthyFoodMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), featuredInHealthyFoodUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Healthy Meal Replacement Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 443)
	public void checking_correct_URL_HealthyMealReplacement_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getHealthyFoodMainMenu()).perform();
		action.moveToElement(MegamenuPage.getHealthyMealReplacementOptionInHealthyFoodMainMenu()).perform();
		MegamenuPage.getHealthyMealReplacementOptionInHealthyFoodMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), healthyMealReplacementInHealthyFoodUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Protein Coffee Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 444)
	public void checking_correct_URL_ProteinCoffee_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getHealthyFoodMainMenu()).perform();
		action.moveToElement(MegamenuPage.getProteinCoffeeOptionInHealthyFoodMainMenu()).perform();
		MegamenuPage.getProteinCoffeeOptionInHealthyFoodMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), proteinCoffeeInHealthyFoodUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Candies Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 445)
	public void checking_correct_URL_Candies_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getHealthyFoodMainMenu()).perform();
		action.moveToElement(MegamenuPage.getCandiesOptionInHealthyFoodMainMenu()).perform();
		MegamenuPage.getCandiesOptionInHealthyFoodMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), candiesInHealthyFoodUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Flavoring Agents Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 446)
	public void checking_correct_URL_FlavoringAgentsOption_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getHealthyFoodMainMenu()).perform();
		action.moveToElement(MegamenuPage.getFlavoringAgentsOptionInHealthyFoodMainMenu()).perform();
		MegamenuPage.getFlavoringAgentsOptionInHealthyFoodMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), flavoringAgentsInHealthyFoodUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Keto Snacks Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 447)
	public void checking_correct_URL_KetoSnacks_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getHealthyFoodMainMenu()).perform();
		action.moveToElement(MegamenuPage.getKetoSnacksOptionInHealthyFoodMainMenu()).perform();
		MegamenuPage.getKetoSnacksOptionInHealthyFoodMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), ketoSnacksInHealthyFoodUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Manuka Honey Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 448)
	public void checking_correct_URL_ManukaHoney_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getHealthyFoodMainMenu()).perform();
		action.moveToElement(MegamenuPage.getManukaHoneyOptionInHealthyFoodMainMenu()).perform();
		MegamenuPage.getManukaHoneyOptionInHealthyFoodMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), manukaHoneyInHealthyFoodUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Meat Snacks Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 449)
	public void checking_correct_URL_MeatSnacks_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getHealthyFoodMainMenu()).perform();
		action.moveToElement(MegamenuPage.getMeatSnacksOptionInHealthyFoodMainMenu()).perform();
		MegamenuPage.getMeatSnacksOptionInHealthyFoodMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), meatSnacksInHealthyFoodUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking_The_Hover_Sports_Main_Category", priority = 451)
	public void verifyTheSubMenuWillAppearsCorrectlyOnceHoveringOnSportsMainMenu() {
		sportsCategoryHover();
	}

	public void sportsCategoryHover() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();

		Actions action = new Actions(driver);
		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		Assert.assertTrue(MegamenuPage.getMegaMenuSection().isDisplayed());
	}

	@Test(description = "Checking_The_Categories_and_sub_categories_Sports_Main_category", priority = 452)
	public void Checking_The_Categories_and_sub_categories_Sports_Main_category() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		// DataHelperAndWait.implicitWait(5);
		Assert.assertEquals(MegamenuPage.getSportsMainMenuList().get(0).getText(),
				"MEN\n" + "SPORT\n" + "Football\n" + "Basketball\n" + "Baseball\n" + "Running\n" + "Swimming\n"
						+ "Yoga\n" + "Fitness And Training\n" + "MMA\n" + "Jiu Jitsu\n" + "Board Games\n"
						+ "SPORTS TECH\n" + "Wearable Tech\n" + "Cameras\n" + "Phone Accessories\n" + "PERSONAL CARE\n"
						+ "Showering\n" + "Shaving\n" + "Skin Care\n" + "Body Care\n" + "Oral Care\n" + "Therapy\n"
						+ "Masks\n" + "FITNESS AND TRAINING\n" + "FITNESS EQUIPMENT\n" + "Skipping Ropes\n"
						+ "Weight Belts\n" + "Scooters\n" + "TRAINING ACCESSORIES\n" + "Shakers & Bottles\n" + "Bags\n"
						+ "Gloves\n" + "Braces & Sleeves\n" + "Mouthguard\n" + "APPAREL\n" + "SPORTSWEAR\n" + "Pants\n"
						+ "Shorts\n" + "Hoodies\n" + "T-shirts\n" + "Tanks\n" + "FOOTWEAR\n" + "Sneakers\n"
						+ "Training Shoes\n" + "Running Shoes\n" + "WOMEN\n" + "SPORTS TECH\n" + "Wearable Tech\n"
						+ "Cameras\n" + "Phone Accessories\n" + "PERSONAL CARE\n" + "Showering\n" + "Skin Care\n"
						+ "Body Care\n" + "Oral Care\n" + "Therapy\n" + "Masks\n" + "FITNESS AND TRAINING\n"
						+ "TRAINING ACCESSORIES");
	}

	@Test(description = "Checking clicking on the Sports main menu will redirect the User to the correct URL", priority = 453)
	public void checking_correct_URL_SportsMainMenu_And_Empty_Categoy_Issue() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();

		Actions action = new Actions(driver);
		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		MegamenuPage.getSportsMainMenu().click();
		Assert.assertTrue(driver.getCurrentUrl().contains(sportsUrl));
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Men Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 454)
	public void checking_correct_URL_Men_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getMenOptionInSportsMainMenu()).perform();
		MegamenuPage.getMenOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), menInSportsMainMenuUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Sport Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 455)
	public void checking_correct_URL_Sport_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getSportOptionInSportsMainMenu()).perform();
		MegamenuPage.getSportOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), sportInSportsMainMenuUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Football Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 456)
	public void checking_correct_URL_Football_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getFootballOptionInSportsMainMenu()).perform();
		MegamenuPage.getFootballOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), footballInSportsMainMenuUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Basketball Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 457)
	public void checking_correct_URL_Basketball_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getBasketballOptionInSportsMainMenu()).perform();
		MegamenuPage.getBasketballOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), basketballInSportsMainMenuUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Baseball Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 458)
	public void checking_correct_URL_Baseball_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getBaseballOptionInSportsMainMenu()).perform();
		MegamenuPage.getBaseballOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), baseballInSportsMainMenuUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Running Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 459)
	public void checking_correct_URL_Running_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getRunningOptionInSportsMainMenu()).perform();
		MegamenuPage.getRunningOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), runningInSportsMainMenuUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Swimming Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 460)
	public void checking_correct_URL_Swimming_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getSwimmingOptionInSportsMainMenu()).perform();
		MegamenuPage.getSwimmingOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), swimmingInSportsMainMenuUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Yoga Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 461)
	public void checking_correct_URL_Yoga_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getYogaOptionInSportsMainMenu()).perform();
		MegamenuPage.getYogaOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), yogaInSportsMainMenuUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Fitness And Training Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 462)
	public void checking_correct_URL_FitnessAndTraining_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getFitnessAndTrainingOptionInSportsMainMenu()).perform();
		MegamenuPage.getFitnessAndTrainingOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), fitnessAndTrainingInSportsMainMenuUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "checking_correct_URL_Mma_Subcategory_AND_Empty_Page_Issu", priority = 463)
	public void checking_correct_URL_Mma_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getMmaOptionInSportsMainMenu()).perform();
		MegamenuPage.getMmaOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), mmaInSportsMainMenuUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "checking_correct_URL_JiuJitsu_Subcategory_AND_Empty_Page_Issu", priority = 464)
	public void checking_correct_URL_JiuJitsu_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getJiuJitsuOptionInSportsMainMenu()).perform();
		MegamenuPage.getJiuJitsuOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), jiuJitsuInSportsMainMenuUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Board Games Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 465)
	public void checking_correct_URL_BoardGames_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getBoardGamesOptionInSportsMainMenu()).perform();
		MegamenuPage.getBoardGamesOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), boardGamesInSportsMainMenuUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the SPORTS TECH Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 466)
	public void checking_correct_URL_SportsTech_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getSportsTechOptionInSportsMainMenu()).perform();
		MegamenuPage.getSportsTechOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), sportsTechInSportsMainMenuUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Wearable Tech Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 467)
	public void checking_correct_URL_WearableTech_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getWearableTechOptionInSportsMainMenu()).perform();
		MegamenuPage.getWearableTechOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), wearableTechInSportsMainMenuUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Cameras Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 468)
	public void checking_correct_URL_Cameras_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getCamerasOptionInSportsMainMenu()).perform();
		MegamenuPage.getCamerasOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), camerasInSportsMainMenuUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Phone Accessories Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 469)
	public void checking_correct_URL_PhoneAccessories_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getPhoneAccessoriesOptionInSportsMainMenu()).perform();
		MegamenuPage.getPhoneAccessoriesOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), phoneAccessoriesInSportsMainMenuUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the PERSONAL CARE Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 470)
	public void checking_correct_URL_PersonalCare_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getPersonalCareOptionInSportsMainMenu()).perform();
		MegamenuPage.getPersonalCareOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), personalCareInSportsMainMenuUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Showering Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 471)
	public void checking_correct_URL_Showering_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getShoweringOptionInSportsMainMenu()).perform();
		MegamenuPage.getShoweringOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), showeringInSportsMainMenuUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Shaving Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 472)
	public void checking_correct_URL_Shaving_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getShavingOptionInSportsMainMenu()).perform();
		MegamenuPage.getShavingOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), shavingInSportsMainMenuUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Skin Care Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 473)
	public void checking_correct_URL_SkinCare_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getSkinCareOptionInSportsMainMenu()).perform();
		MegamenuPage.getSkinCareOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), skinCareInSportsMainMenuUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Body Care Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 474)
	public void checking_correct_URL_BodyCare_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getBodyCareOptionInSportsMainMenu()).perform();
		MegamenuPage.getBodyCareOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), bodyCareInSportsMainMenuUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Oral Care Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 475)
	public void checking_correct_URL_OralCare_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getOralCareOptionInSportsMainMenu()).perform();
		MegamenuPage.getOralCareOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), oralCareInSportsMainMenuUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Therapy Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 476)
	public void checking_correct_URL_Therapy_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getTherapyOptionInSportsMainMenu()).perform();
		MegamenuPage.getTherapyOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), therapyInSportsMainMenuUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Masks Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 477)
	public void checking_correct_URL_Masks_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getMasksOptionInSportsMainMenu()).perform();
		MegamenuPage.getMasksOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), masksInSportsMainMenuUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the FITNESS AND TRAINING Category Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 480)
	public void checking_correct_URL_FitnessAndTrainingCategory_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getFitnessAndTrainingCategoryOptionInSportsMainMenu()).perform();
		MegamenuPage.getFitnessAndTrainingCategoryOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), fitnessAndTrainingCategoryInSportsMainMenuUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the FITNESS EQUIPMENT Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 481)
	public void checking_correct_URL_FitnessEquipment_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getFitnessEquipmentOptionInSportsMainMenu()).perform();
		MegamenuPage.getFitnessEquipmentOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), fitnessEquipmentInSportsMainMenuUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Skipping Ropes Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 482)
	public void checking_correct_URL_SkippingRopes_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getSkippingRopesOptionInSportsMainMenu()).perform();
		MegamenuPage.getSkippingRopesOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), skippingRopesInSportsMainMenuUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Weight Belts Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 483)
	public void checking_correct_URL_WeightBelts_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getWeightBeltsOptionInSportsMainMenu()).perform();
		MegamenuPage.getWeightBeltsOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), weightBeltsInSportsMainMenuUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Scooters Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 484)
	public void checking_correct_URL_Scooters_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getScootersOptionInSportsMainMenu()).perform();
		MegamenuPage.getScootersOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), scootersInSportsMainMenuUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the TRAINING ACCESSORIES Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 485)
	public void checking_correct_URL_TrainingAccessories_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getTrainingAccessoriesOptionInSportsMainMenu()).perform();
		MegamenuPage.getTrainingAccessoriesOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), trainingAccessoriesInSportsMainMenuUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Shakers & Bottles Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 486)
	public void checking_correct_URL_ShakersAndBottles_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getShakersAndBottlesOptionInSportsMainMenu()).perform();
		MegamenuPage.getShakersAndBottlesOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), shakersBottlesInSportsMainMenuUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Bags Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 487)
	public void checking_correct_URL_Bags_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getBagsOptionInSportsMainMenu()).perform();
		MegamenuPage.getBagsOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), bagsInSportsMainMenuUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Gloves Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 488)
	public void checking_correct_URL_Gloves_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getGlovesOptionInSportsMainMenu()).perform();
		MegamenuPage.getGlovesOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), glovesInSportsMainMenuUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Braces & Sleeves Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 489)
	public void checking_correct_URL_BracesAndSleeves_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getBracesAndSleevesOptionInSportsMainMenu()).perform();
		MegamenuPage.getBracesAndSleevesOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), bracesSleevesInSportsMainMenuUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Mouthguard Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 490)
	public void checking_correct_URL_Mouthguard_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getMouthguardOptionInSportsMainMenu()).perform();
		MegamenuPage.getMouthguardOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), mouthguardInSportsMainMenuUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the APPAREL Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 491)
	public void checking_correct_URL_Apperal_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getApparelOptionInSportsMainMenu()).perform();
		MegamenuPage.getApparelOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), apparelInSportsMainMenuUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the SPORTSWEAR Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 492)
	public void checking_correct_URL_Sportswear_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getSportswearOptionInSportsMainMenu()).perform();
		MegamenuPage.getSportswearOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), sportsWearInSportsMainMenuUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Pants Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 493)
	public void checking_correct_URL_Pants_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getPantsOptionInSportsMainMenu()).perform();
		MegamenuPage.getPantsOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), pantsInSportsMainMenuUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Shorts Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 494)
	public void checking_correct_URL_Shorts_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getShortsOptionInSportsMainMenu()).perform();
		MegamenuPage.getShortsOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), shortsInSportsMainMenuUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Hoodies Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 495)
	public void checking_correct_URL_Hoodies_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getHoodiesOptionInSportsMainMenu()).perform();
		MegamenuPage.getHoodiesOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), hoodiesInSportsMainMenuUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the T-Shirts Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 496)
	public void checking_correct_URL_TShirts_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.gettShirtsOptionInSportsMainMenu()).perform();
		MegamenuPage.gettShirtsOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), tShirtsInSportsMainMenuUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Tanks Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 497)
	public void checking_correct_URL_Tanks_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getTanksOptionInSportsMainMenu()).perform();
		MegamenuPage.getTanksOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), tanksInSportsMainMenuUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the FOOTWEAR Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 498)
	public void checking_correct_URL_Footwear_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getFootwearOptionInSportsMainMenu()).perform();
		MegamenuPage.getFootwearOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), footwearInSportsMainMenuUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Sneakers Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 499)
	public void checking_correct_URL_Sneakers_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getSneakersOptionInSportsMainMenu()).perform();
		MegamenuPage.getSneakersOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), sneakersInSportsMainMenuUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Training Shoes Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 500)
	public void checking_correct_URL_TrainingShoes_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getTrainingShoesOptionInSportsMainMenu()).perform();
		MegamenuPage.getTrainingShoesOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), trainingShoesInSportsMainMenuUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the Running Shoes Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 501)
	public void checking_correct_URL_RunningShoes_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getRunnigShoesOptionInSportsMainMenu()).perform();
		MegamenuPage.getRunnigShoesOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), runningShoesInSportsMainMenuUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the WOMEN Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 502)
	public void checking_correct_URL_Women_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getWomenOptionInSportsMainMenu()).perform();
		MegamenuPage.getWomenOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), womenInSportsMainMenuUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the WOMEN SPORTS TECH Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 503)
	public void checking_correct_URL_WomenSportsTech_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getWomenSportsTechOptionInSportsMainMenu()).perform();
		MegamenuPage.getWomenSportsTechOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), womenSportsTechInSportsMainMenuUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the WOMEN Wearable Tech Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 504)
	public void checking_correct_URL_WomenWearableTech_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getWomenWearableTechOptionInSportsMainMenu()).perform();
		MegamenuPage.getWomenWearableTechOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), womenWearableTechInSportsMainMenuUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the WOMEN Cameras Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 505)
	public void checking_correct_URL_WomenCameras_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getWomenCamerasOptionInSportsMainMenu()).perform();
		MegamenuPage.getWomenCamerasOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), womenCamerasInSportsMainMenuUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the WOMEN Phone Accessories Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 506)
	public void checking_correct_URL_WomenPhoneAccessories_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getWomenPhoneAccessoriesOptionInSportsMainMenu()).perform();
		MegamenuPage.getWomenPhoneAccessoriesOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), womenPhoneAccessoriesInSportsMainMenuUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the WOMEN PERSONAL CARE Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 507)
	public void checking_correct_URL_WomenPersonalCare_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getWomenPersonalCareOptionInSportsMainMenu()).perform();
		MegamenuPage.getWomenPersonalCareOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), womenPersonalCareInSportsMainMenuUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the WOMEN Showering Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 508)
	public void checking_correct_URL_WomenShowering_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getWomenShoweringOptionInSportsMainMenu()).perform();
		MegamenuPage.getWomenShoweringOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), womenShoweringInSportsMainMenuUrl);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the WOMEN Skin Care Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 509)
	public void checking_correct_URL_WomenSkinCare_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getWomenSkinCareOptionInSportsMainMenu()).perform();
		MegamenuPage.getWomenSkinCareOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), womenSkinCareInSportsMainMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the WOMEN Body Care Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 510)
	public void checking_correct_URL_WomenBodyCare_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getWomenBodyCareOptionInSportsMainMenu()).perform();
		MegamenuPage.getWomenBodyCareOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), womenBodyCareInSportsMainMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the WOMEN Oral Care Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 511)
	public void checking_correct_URL_WomenOralCare_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getWomenOralCareOptionInSportsMainMenu()).perform();
		MegamenuPage.getWomenOralCareOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), womenOralCareInSportsMainMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the WOMEN Therapy Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 512)
	public void checking_correct_URL_WomenTherapy_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getWomenTherapyOptionInSportsMainMenu()).perform();
		MegamenuPage.getWomenTherapyOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), womenTherapyInSportsMainMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the WOMEN Masks Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 513)
	public void checking_correct_URL_WomenMasks_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getWomenMasksOptionInSportsMainMenu()).perform();
		MegamenuPage.getWomenMasksOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), womenMasksInSportsMainMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the WOMEN FITNESS AND TRAINING Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 514)
	public void checking_correct_URL_WomenFitnessAndTraining_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getWomenFitnessAndTrainingOptionInSportsMainMenu()).perform();
		MegamenuPage.getWomenFitnessAndTrainingOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), womenFitnessAndTrainingInSportsMainMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@Test(description = "Checking clicking on the WOMEN TRAINING ACCESSORIES Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 515)
	public void checking_correct_URL_Women_Training_Accessories_Subcategory_AND_Empty_Page_Issu() {
		MegaMenuPage MegamenuPage = new MegaMenuPage();
		Actions action = new Actions(driver);

		action.moveToElement(MegamenuPage.getSportsMainMenu()).perform();
		action.moveToElement(MegamenuPage.getWomenTrainingAccessoriesOptionInSportsMainMenu()).perform();
		MegamenuPage.getWomenTrainingAccessoriesOptionInSportsMainMenu().click();
		Assert.assertEquals(driver.getCurrentUrl(), womenTrainingAccessoriesInSportsMainMenuURL);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
		assertFalse(verifyTitle, "Page Not Found Is Displayed");
		boolean EmptyPage = driver.getPageSource().contains("We can't find products matching the selection.");
		assertFalse(EmptyPage, "The page is empty");
	}

	@BeforeClass
	public void beforeClass() throws InterruptedException {
		HomePage homePage = new HomePage();
		goToPage(homePage);
		waitUntilClickable(homePage.getSwitchLangLink());
		homePage.getSwitchLangLink().click();
		homePage.getswitchTOksaStore().click();
	}

}
