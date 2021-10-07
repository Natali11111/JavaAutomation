package selenium;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page_steps.HomePageSteps;
import test_data.data_provider.DataProviderClass;


public class HomePageTest extends BaseTest {

    HomePageSteps homePageSteps;

    @BeforeTest
    public void setup() {
        homePageSteps = new HomePageSteps();
    }

    @Test(dataProvider = "dataForHomePage",  dataProviderClass = DataProviderClass.class)
    public void verifySearchFunctionality(String searchWord) {
        homePageSteps.inputSearchField(searchWord);
        homePageSteps.clickOnSearchButton();
        Assert.assertTrue(homePageSteps.isContainExpectedWord(searchWord));
    }
}
