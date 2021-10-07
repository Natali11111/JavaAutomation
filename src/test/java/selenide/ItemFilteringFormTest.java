package selenide;

import builder.CheckboxesForAudioTechnology;
import builder.CheckboxesForGadgets;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.selenide.ItemDetailsPage;
import pages.selenide.ItemFilteringForm;
import test_data.data_provider.DataProviderClass;

import static com.codeborne.selenide.Selenide.open;
import static constants.HostConstants.AVIC_URL;

public class ItemFilteringFormTest extends BaseTest {

    ItemFilteringForm filteringForm;
    ItemDetailsPage itemDetailsPage;

    @BeforeTest
    public void openUrl() {
        filteringForm = new ItemFilteringForm();
        itemDetailsPage = new ItemDetailsPage();
        open(AVIC_URL);
    }

    @Test(dataProvider = "dataForGadgetsWithBuilder", dataProviderClass = DataProviderClass.class)
    public void verifyItemFilteringForm(CheckboxesForGadgets checkboxesForGadgets) {
        filteringForm.assertCategoryItemsListVisible();
        filteringForm.clickOnCategoryItemsList(checkboxesForGadgets.getCategoryItem());
        filteringForm.assertSubCategoryItemsListVisible();
        filteringForm.clickOnSubCategoryItemsList(checkboxesForGadgets.getSubcategoryItem());
        filteringForm.assertFilterFormVisible();
        filteringForm.clickOnFilterCheckboxList(checkboxesForGadgets.getGoodsInStock());
        filteringForm.clickOnFilterCheckboxList(checkboxesForGadgets.getProducerCheckboxOne());
        filteringForm.clickOnFilterCheckboxList(checkboxesForGadgets.getProductLineCheckboxOne());
        filteringForm.clickOnFilterCheckboxList(checkboxesForGadgets.getTypeCheckboxOne());
        filteringForm.clickOnFilterSectionList(checkboxesForGadgets.getDisplaySection());
        filteringForm.clickOnFilterCheckboxList(checkboxesForGadgets.getDisplayCheckboxOne());
        filteringForm.clickOnFilterSectionList(checkboxesForGadgets.getTypeDisplaySection());
        filteringForm.clickOnFilterCheckboxList(checkboxesForGadgets.getTypeDisplayCheckboxOne());
        filteringForm.clickOnFilterSectionList(checkboxesForGadgets.getCompatibilitySection());
        filteringForm.clickOnFilterCheckboxList(checkboxesForGadgets.getCompatibilityCheckboxOne());
        filteringForm.clickOnFilterSectionList(checkboxesForGadgets.getCommunicationsSection());
        filteringForm.clickOnFilterCheckboxList(checkboxesForGadgets.getCommunicationsCheckboxOne());
        filteringForm.clickOnFilterSectionList(checkboxesForGadgets.getColorSection());
        filteringForm.clickOnFilterCheckboxList(checkboxesForGadgets.getColorCheckboxOne());
        filteringForm.inputMinPriceField(checkboxesForGadgets.getMinPrice());
        filteringForm.inputMaxPriceField(checkboxesForGadgets.getMaxPrice());
        filteringForm.clickOnShowButton();
        itemDetailsPage.clickOnSearchItemList(checkboxesForGadgets.getGoodsName());
        int actualPrice = itemDetailsPage.getItemPriceLabelNumbers();
        itemDetailsPage.assertPrice(actualPrice, 2000, 15000);
        itemDetailsPage.assertColor(checkboxesForGadgets.getSelectedColorForGoods());
    }

    @Test(dataProvider = "dataForAudioTechnologyWithBuilder", dataProviderClass = DataProviderClass.class)
    public void verifyFilteringForHeadphones(CheckboxesForAudioTechnology checkboxesForAudioTechnology) {
        filteringForm.assertCategoryItemsListVisible();
        filteringForm.clickOnCategoryItemsList(checkboxesForAudioTechnology.getCategoryItem());
        filteringForm.assertSubCategoryItemsListVisible();
        filteringForm.clickOnSubCategoryItemsList(checkboxesForAudioTechnology.getSubcategoryItem());
        filteringForm.assertFilterFormVisible();
        filteringForm.clickOnFilterCheckboxList(checkboxesForAudioTechnology.getGoodsInStock());
        filteringForm.inputMinPriceField(checkboxesForAudioTechnology.getMinPrice());
        filteringForm.inputMaxPriceField(checkboxesForAudioTechnology.getMaxPrice());
        filteringForm.clickOnShowButton();
        filteringForm.clickOnFilterSectionList(checkboxesForAudioTechnology.getConnectionSection());
        filteringForm.clickOnShowAllList(checkboxesForAudioTechnology.getConnectionSection());
        filteringForm.clickOnFilterCheckboxList(checkboxesForAudioTechnology.getConnectionCheckbox());
        filteringForm.clickOnFilterCheckboxList(checkboxesForAudioTechnology.getProducerCheckboxOne());
        filteringForm.clickOnShowAllList(checkboxesForAudioTechnology.getProducerSection());
        filteringForm.clickOnFilterCheckboxList(checkboxesForAudioTechnology.getProducerCheckboxTwo());
        filteringForm.clickOnShowAllList(checkboxesForAudioTechnology.getProducerSection());
        filteringForm.clickOnFilterCheckboxList(checkboxesForAudioTechnology.getProducerCheckboxThree());
        filteringForm.clickOnFilterCheckboxList(checkboxesForAudioTechnology.getTypeHeadphoneCheckbox());
        filteringForm.clickOnFilterCheckboxList(checkboxesForAudioTechnology.getWayConnectionCheckbox());
        filteringForm.clickOnFilterCheckboxList(checkboxesForAudioTechnology.getTypeConstructionCheckbox());
        filteringForm.clickOnFilterSectionList(checkboxesForAudioTechnology.getMicrophoneSection());
        filteringForm.clickOnFilterCheckboxList(checkboxesForAudioTechnology.getMicrophoneCheckbox());
        filteringForm.clickOnFilterSectionList(checkboxesForAudioTechnology.getColorSection());
        filteringForm.clickOnFilterCheckboxList(checkboxesForAudioTechnology.getColorCheckboxOne());
        filteringForm.clickOnFilterCheckboxList(checkboxesForAudioTechnology.getColorCheckboxTwo());
        itemDetailsPage.clickOnSearchItemList(checkboxesForAudioTechnology.getNameGoods());
        int actualPrice = itemDetailsPage.getItemPriceLabelNumbers();
        itemDetailsPage.assertPrice(actualPrice, 1500, 10000);
    }

}
