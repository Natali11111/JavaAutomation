package selenium;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page_steps.HomePageSteps;
import page_steps.ItemDetailsPageSteps;
import test_data.data_provider.DataProviderClass;

import static test_data.constants.TestData.*;


public class ItemDetailsPageTest extends BaseTest {
    HomePageSteps homePageSteps;
    ItemDetailsPageSteps itemDetailsPageSteps;

    @BeforeTest
    public void setup() {
        homePageSteps = new HomePageSteps();
        itemDetailsPageSteps = new ItemDetailsPageSteps();
    }

    @Test(dataProvider = "dataForItemDetailsPage", dataProviderClass = DataProviderClass.class)
    public void verifyItemDetails(String searchWord, String searchItem) {
        homePageSteps.inputSearchField(searchWord);
        homePageSteps.clickOnSearchButton();
        itemDetailsPageSteps.clickOnItemList(searchItem);
        Assert.assertTrue(itemDetailsPageSteps.isLikeButtonVisible());
        Assert.assertTrue(itemDetailsPageSteps.isPicturesFormVisible());
        Assert.assertTrue(itemDetailsPageSteps.isBuyButtonVisible());
        Assert.assertTrue(itemDetailsPageSteps.isBuyOneClickButtonVisible());
        Assert.assertTrue(itemDetailsPageSteps.isBuyInInstallmentButtonVisible());
        Assert.assertTrue(itemDetailsPageSteps.isTabItemsListVisible());
        Assert.assertEquals(itemDetailsPageSteps.getBuyButtonText(), EXPECTED_BUY_BUTTON);
        Assert.assertEquals(itemDetailsPageSteps.getBuyOneClickButtonText(), EXPECTED_BUY_ONE_CLICK_BUTTON);
        Assert.assertEquals(itemDetailsPageSteps.getBuyInInstallmentButtonText(), EXPECTED_BUY_IN_INSTALLMENT_BUTTON );
        Assert.assertEquals(itemDetailsPageSteps.getAdditionalInfoListText(), EXPECTED_ADDITIONAL_INFO_LIST);
        itemDetailsPageSteps.clickOnDeliveryAndPaymentMethods();
        boolean result = itemDetailsPageSteps.isItemContainExpectedText(DELIVERY) &&
                itemDetailsPageSteps.isItemContainExpectedText(CHARACTERISTIC) &&
                itemDetailsPageSteps.isItemContainExpectedText(GUARANTEE);
        Assert.assertTrue(result);
    }
}
