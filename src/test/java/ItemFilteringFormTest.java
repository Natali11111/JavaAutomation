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
                                    String wirelessCommunicat, String wirelessCommunicatItem, String color, String colorItem) {
        Assert.assertTrue(filteringFormSteps.isCategoryItemsListVisible());
        filteringFormSteps.clickOnCategoryItemsList(category);
        Assert.assertTrue(filteringFormSteps.isSubCategoryItemsListVisible());
        filteringFormSteps.clickOnSubCategoryItemsList(subCategory);
        Assert.assertTrue(filteringFormSteps.isFilterFormVisible());
        filteringFormSteps.checkFilterCheckBoxList(goodsInStock);
        filteringFormSteps.scrollToFilter(1, 1);
        filteringFormSteps.checkFilterCheckBoxList(producerItem);
        filteringFormSteps.scrollToFilter(500, 500);
        filteringFormSteps.checkFilterCheckBoxList(ruleItem);
        filteringFormSteps.scrollToFilter(650, 650);
        filteringFormSteps.checkFilterCheckBoxList(typeItem);
        filteringFormSteps.scrollToFilter(900, 900);
        filteringFormSteps.clickOnFilterSectionList(display);
        filteringFormSteps.checkFilterCheckBoxList(displayItem);
        filteringFormSteps.scrollToFilter(1200, 1200);
        filteringFormSteps.clickOnFilterSectionList(displayType);
        filteringFormSteps.checkFilterCheckBoxList(displayTypeItem);
        filteringFormSteps.scrollToFilter(1200, 1200);
        filteringFormSteps.clickOnFilterSectionList(compatibility);
        filteringFormSteps.checkFilterCheckBoxList(compatibilityItem);
        filteringFormSteps.scrollToFilter(1200, 1200);
        filteringFormSteps.clickOnFilterSectionList(wirelessCommunicat);
        filteringFormSteps.scrollToFilter(1800, 1800);
        filteringFormSteps.checkFilterCheckBoxList(wirelessCommunicatItem);
        filteringFormSteps.clickOnFilterSectionList(color);
        filteringFormSteps.scrollToFilter(2100, 2100);
        filteringFormSteps.checkFilterCheckBoxList(colorItem);
        filteringFormSteps.inputMinPriceField("2000");
        filteringFormSteps.inputMaxPriceField("15000");
        filteringFormSteps.clickOnShowButton();
        itemDetailsPageSteps.clickOnItem(0);
        int actualPrice = itemDetailsPageSteps.getItemPriceLabelNumbers();
        Assert.assertTrue(itemDetailsPageSteps.isCorrectPrice(actualPrice, 15000, 2000));
        Assert.assertTrue(itemDetailsPageSteps.getActualItemColor().contains("Silver"),
                format("Actual color - '%s' is not matched to expected '%s", itemDetailsPageSteps.getActualItemColor(), "Black"));
    }

}
