package selenium;

import driver.DriverManager;
import helper.WindowHandler;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page_steps.ItemDetailsPageSteps;
import page_steps.ItemFilteringFormSteps;
import test_data.data_provider.DataProviderClass;

import static java.lang.String.format;

public class ItemFilteringFormTest extends BaseTest {

    ItemFilteringFormSteps filteringFormSteps;
    ItemDetailsPageSteps itemDetailsPageSteps;

    @BeforeTest
    public void setup() {
        filteringFormSteps = new ItemFilteringFormSteps();
        itemDetailsPageSteps = new ItemDetailsPageSteps();
    }

    @Test(dataProvider = "checkBoxForGadgets", dataProviderClass = DataProviderClass.class)
    public void verifyFilteringForm(String category, String subCategory, String goodsInStock, String producerItem,
                                    String ruleItem, String typeItem, String display, String displayItem, String displayType,
                                    String displayTypeItem, String compatibility, String compatibilityItem,
                                    String wirelessCommunicat, String wirelessCommunicatItem, String color, String colorItem,
                                    String minPrice, String maxPrice, String filteringItem, String silver, String black) {
        Assert.assertTrue(filteringFormSteps.isCategoryItemsListVisible());
        filteringFormSteps.clickOnCategoryItemsList(category);
        Assert.assertTrue(filteringFormSteps.isSubCategoryItemsListVisible());
        filteringFormSteps.clickOnSubCategoryItemsList(subCategory);
        Assert.assertTrue(filteringFormSteps.isFilterFormVisible());
        filteringFormSteps.clickOnFilterCheckBoxList(goodsInStock);
        filteringFormSteps.clickOnFilterCheckBoxList(producerItem);
        filteringFormSteps.clickOnFilterCheckBoxList(ruleItem);
        filteringFormSteps.clickOnFilterCheckBoxList(typeItem);
        filteringFormSteps.clickOnFilterSectionList(display);
        filteringFormSteps.clickOnFilterCheckBoxList(displayItem);
        filteringFormSteps.clickOnFilterSectionList(displayType);
        filteringFormSteps.clickOnFilterCheckBoxList(displayTypeItem);
        filteringFormSteps.clickOnFilterSectionList(compatibility);
        filteringFormSteps.clickOnFilterCheckBoxList(compatibilityItem);
        filteringFormSteps.clickOnFilterSectionList(wirelessCommunicat);
        filteringFormSteps.clickOnFilterCheckBoxList(wirelessCommunicatItem);
        filteringFormSteps.clickOnFilterSectionList(color);
        filteringFormSteps.clickOnFilterCheckBoxList(colorItem);
        filteringFormSteps.inputMinPriceField(minPrice);
        filteringFormSteps.inputMaxPriceField(maxPrice);
        filteringFormSteps.clickOnShowButton();
        itemDetailsPageSteps.clickOnItemList(filteringItem);
        int actualPrice = itemDetailsPageSteps.getItemPriceLabelNumbers();
        Assert.assertTrue(itemDetailsPageSteps.isCorrectPrice(actualPrice, 15000, 2000));
        Assert.assertTrue(itemDetailsPageSteps.getActualItemColor().contains(silver),
                format("Actual color - '%s' is not matched to expected '%s", itemDetailsPageSteps.getActualItemColor(), black));
    }

    @Test(dataProvider = "dataForHouseholdAppliances", dataProviderClass = DataProviderClass.class)
    public void verifyFilteringFormForHouseholdAppliances(String category, String subCategoryOne, String subCategoryTwo,
                                                          String goodsInStock, String producerTitle, String producerItemOne,
                                                          String producerItemTwo, String typeOvenItem, String volumeItemOne,
                                                          String volumeItemTwo, String amountOfProgramsTitle, String amountOfProgramsItem,
                                                          String backlightTitle, String backlightItem, String typeGrillTitle,
                                                          String typeGrillItem, String deepTitle, String deepItem,
                                                          String typeGuidesTitle, String typeGuidesItem, String cleaningSystemTitle,
                                                          String cleaningSystemItem, String colorTitle, String colorItem,
                                                          String minPrice, String maxPrice, String filteringItem) {
        Assert.assertTrue(filteringFormSteps.isCategoryItemsListVisible());
        filteringFormSteps.clickOnCategoryItemsList(category);
        Assert.assertTrue(filteringFormSteps.isSubCategoryItemsListVisible());
        filteringFormSteps.clickOnSubCategoryItemsList(subCategoryOne);
        filteringFormSteps.clickOnSubCategoryItemsList(subCategoryTwo);
        filteringFormSteps.clickOnFilterCheckBoxList(goodsInStock);
        filteringFormSteps.clickOnShowAllList(producerTitle);
        filteringFormSteps.clickOnFilterCheckBoxList(producerItemOne);
        filteringFormSteps.clickOnShowAllList(producerTitle);
        filteringFormSteps.clickOnFilterCheckBoxList(producerItemTwo);
        filteringFormSteps.clickOnFilterCheckBoxList(typeOvenItem);
        filteringFormSteps.clickOnFilterCheckBoxList(volumeItemOne);
        filteringFormSteps.clickOnFilterCheckBoxList(volumeItemTwo);
        filteringFormSteps.clickOnFilterSectionList(amountOfProgramsTitle);
        filteringFormSteps.clickOnFilterCheckBoxList(amountOfProgramsItem);
        filteringFormSteps.clickOnFilterSectionList(backlightTitle);
        filteringFormSteps.clickOnFilterCheckBoxList(backlightItem);
        filteringFormSteps.clickOnFilterSectionList(typeGrillTitle);
        filteringFormSteps.clickOnFilterCheckBoxList(typeGrillItem);
        filteringFormSteps.clickOnFilterSectionList(deepTitle);
        filteringFormSteps.clickOnFilterCheckBoxList(deepItem);
        filteringFormSteps.clickOnFilterSectionList(typeGuidesTitle);
        filteringFormSteps.clickOnFilterCheckBoxList(typeGuidesItem);
        filteringFormSteps.clickOnFilterSectionList(cleaningSystemTitle);
        filteringFormSteps.clickOnFilterCheckBoxList(cleaningSystemItem);
        filteringFormSteps.clickOnFilterSectionList(colorTitle);
        filteringFormSteps.clickOnFilterCheckBoxList(colorItem);
        filteringFormSteps.inputMinPriceField(minPrice);
        filteringFormSteps.inputMaxPriceField(maxPrice);
        filteringFormSteps.clickOnShowButton();
        itemDetailsPageSteps.clickOnItemList(filteringItem);
        int actualPrice = itemDetailsPageSteps.getItemPriceLabelNumbers();
        Assert.assertTrue(itemDetailsPageSteps.isCorrectPrice(actualPrice, 20000, 10000));
    }

    @Test(dataProvider = "dataForHeadphones", dataProviderClass = DataProviderClass.class)
    public void verifyFilteringForHeadphones(String category, String subCategory, String goodsInStock,
                                             String connectionTitle, String connectionItem, String producerTitle,
                                             String producerItemOne, String producerItemTwo, String producerItemThree,
                                             String typeHeadphonesItem, String connectionMethodItem,
                                             String typeConstructionItem, String microphoneTitle, String microphoneItem,
                                             String colorTitle, String colorItemOne, String minPrice,
                                             String maxPrice, String filteringItem) {
        Assert.assertTrue(filteringFormSteps.isCategoryItemsListVisible());
        filteringFormSteps.clickOnCategoryItemsList(category);
        Assert.assertTrue(filteringFormSteps.isSubCategoryItemsListVisible());
        filteringFormSteps.clickOnSubCategoryItemsList(subCategory);
        filteringFormSteps.clickOnFilterCheckBoxList(goodsInStock);
        filteringFormSteps.clickOnFilterSectionList(connectionTitle);
        filteringFormSteps.clickOnShowAllList(connectionTitle);
        filteringFormSteps.clickOnFilterCheckBoxList(connectionItem);
        filteringFormSteps.clickOnFilterCheckBoxList(producerItemOne);
        filteringFormSteps.clickOnShowAllList(producerTitle);
        filteringFormSteps.clickOnFilterCheckBoxList(producerItemTwo);
        filteringFormSteps.clickOnShowAllList(producerTitle);
        filteringFormSteps.clickOnFilterCheckBoxList(producerItemThree);
        filteringFormSteps.clickOnFilterCheckBoxList(typeHeadphonesItem);
        filteringFormSteps.clickOnFilterCheckBoxList(connectionMethodItem);
        filteringFormSteps.clickOnFilterCheckBoxList(typeConstructionItem);
        filteringFormSteps.clickOnFilterSectionList(microphoneTitle);
        filteringFormSteps.clickOnFilterCheckBoxList(microphoneItem);
        filteringFormSteps.clickOnFilterSectionList(colorTitle);
        filteringFormSteps.clickOnFilterCheckBoxList(colorItemOne);
        filteringFormSteps.clickOnFilterSectionList(colorTitle);
        filteringFormSteps.inputMinPriceField(minPrice);
        filteringFormSteps.inputMaxPriceField(maxPrice);
        filteringFormSteps.clickOnShowButton();
       itemDetailsPageSteps.clickOnItemList(filteringItem);
        int actualPrice = itemDetailsPageSteps.getItemPriceLabelNumbers();
        Assert.assertTrue(itemDetailsPageSteps.isCorrectPrice(actualPrice, 7300, 1500));
    }

    @Test(dataProvider = "dataForSmartHouse", dataProviderClass = DataProviderClass.class)
    public void verifyFilteringForSmartHouse(String category, String subCategory, String goodsInStock,
                                             String minPrice, String maxPrice, String filteringItem){
        Assert.assertTrue(filteringFormSteps.isCategoryItemsListVisible());
        WindowHandler.scrollToListWebElement(filteringFormSteps.getFilteringForm().getCategoryItemsList(), 1, 1, DriverManager.getInstance().getDriver());
        filteringFormSteps.clickOnCategoryItemsList(category);
        filteringFormSteps.clickOnSubCategoryItemsList(subCategory);
        filteringFormSteps.clickOnFilterCheckBoxList(goodsInStock);
        filteringFormSteps.inputMinPriceField(minPrice);
        filteringFormSteps.inputMaxPriceField(maxPrice);
        filteringFormSteps.clickOnShowButton();
        itemDetailsPageSteps.clickOnItemList(filteringItem);
        int actualPrice = itemDetailsPageSteps.getItemPriceLabelNumbers();
        Assert.assertTrue(itemDetailsPageSteps.isCorrectPrice(actualPrice, 5000, 100));
    }

}
