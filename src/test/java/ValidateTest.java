import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page_steps.HomePageSteps;
import page_steps.ItemDetailsPageSteps;
import page_steps.ItemFilteringFormSteps;
import test_data.data_provider.DataProviderClass;

public class ValidateTest extends BaseTest{
    HomePageSteps homePageSteps;

    @BeforeTest
    public void setup() {
        homePageSteps = new HomePageSteps();
    }

    @Test(dataProvider = "invalidDataForSearch", dataProviderClass = DataProviderClass.class)
    public void  verifySearchFieldWithInvalidData(String invalidData){
        homePageSteps.inputSearchField(invalidData);
        homePageSteps.clickOnSearchButton();
        Assert.assertTrue(homePageSteps.getHomePageSteps().getSearchResultLabel().getText()
                .contains("Ничего не найдено"));
    }
}
