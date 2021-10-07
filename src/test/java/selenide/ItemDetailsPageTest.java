package selenide;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.selenide.HomePage;
import pages.selenide.ItemDetailsPage;
import test_data.data_provider.DataProviderClass;

import static com.codeborne.selenide.Selenide.open;
import static constants.HostConstants.AVIC_URL;
import static test_data.constants.TestData.*;

public class ItemDetailsPageTest extends BaseTest {

    HomePage homePage;
    ItemDetailsPage itemDetailsPage;

    @BeforeTest
    public void openUrl(){
        homePage = new HomePage();
        itemDetailsPage = new ItemDetailsPage();
        open(AVIC_URL);
    }

    @Test(dataProvider = "dataForItemDetailsPage", dataProviderClass = DataProviderClass.class)
    public void verifyItemDetailsPage(String searchWord,String searchItem) {
        homePage.inputField(searchWord);
        homePage.assertSearchListTitle(searchWord);
        itemDetailsPage.clickOnSearchItemList(searchItem);
        itemDetailsPage.assertLikeButtonVisible();
        itemDetailsPage.assertBuyButtonVisible();
        itemDetailsPage.assertBuyOneClickButtonVisible();
        itemDetailsPage.assertBuyInInstallmentButtonVisible();
        itemDetailsPage.assertPicturesFormVisible();
        itemDetailsPage.assertTabItemsListVisible();
        itemDetailsPage.assertAdditionalInfoListTitles(EXPECTED_ADDITIONAL_INFO_LIST);
        itemDetailsPage.assertBuyInInstallmentButtonTitle( EXPECTED_BUY_IN_INSTALLMENT_BUTTON);
        itemDetailsPage.assertBuyButtonTitle(EXPECTED_BUY_BUTTON);
        itemDetailsPage.assertBuyOneClickButtonTitle(EXPECTED_BUY_ONE_CLICK_BUTTON);
        itemDetailsPage.clickOnDeliveryAndPaymentMethods();
        itemDetailsPage.assertTabItemListTitles(CHARACTERISTIC);
        itemDetailsPage.assertTabItemListTitles(PRODUCT_OVERVIEW);
        itemDetailsPage.assertTabItemListTitles(DELIVERY);
        itemDetailsPage.assertTabItemListTitles(GUARANTEE);
    }
}
