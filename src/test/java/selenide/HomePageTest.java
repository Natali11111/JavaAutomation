package selenide;

import org.testng.annotations.Test;
import pages.selenide.HomePage;
import test_data.data_provider.DataProviderClass;

import static com.codeborne.selenide.Selenide.open;
import static constants.HostConstants.AVIC_URL;

public class HomePageTest extends BaseTest {

    @Test(dataProvider = "dataForHomePage", dataProviderClass = DataProviderClass.class)
    public void verifySearchFunctionality(String searchWord) {
        HomePage homePage = new HomePage();
        open(AVIC_URL);
        homePage.inputField(searchWord);
        homePage.assertSearchListTitle(searchWord);
    }
}
