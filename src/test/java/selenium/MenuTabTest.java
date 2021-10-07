package selenium;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page_steps.MenuTabSteps;

import static test_data.constants.TestData.*;

public class MenuTabTest extends BaseTest{

    MenuTabSteps menuTabSteps;

    @BeforeTest
    public void setup() {
        menuTabSteps = new MenuTabSteps();
    }

    @Test
    public void verifyMenuTab() {
        Assert.assertTrue(menuTabSteps.isMenuTabListVisible(), "Menu tab list is not visible");
        Assert.assertEquals(menuTabSteps.getMenuTabListText(), EXPECTED_MENU_TAB_LIST ,
                "Expected and actual headers are different.");
        menuTabSteps.clickOnMenuTab(STILL);
        Assert.assertEquals(menuTabSteps.getMenuDropDownTabListText(), EXPECTED_MENU_DROP_DOWN_TAB_LIST,
                "Expected and actual dropdown headers are different.");
        menuTabSteps.clickOnMenuTab(RU);
        Assert.assertEquals(menuTabSteps.getMenuLangDropDownListText(), EXPECTED_MENU_LANG_DROP_DOWN,
                "Expected and actual dropdown headers are different.");
        Assert.assertTrue(menuTabSteps.isMenuTabIconsListVisible(), "Menu tab icons are not visible");
        Assert.assertEquals(menuTabSteps.getScheduleText(), EXPECTED_SCHEDULE);
        Assert.assertEquals(menuTabSteps.getPrimaryPhoneText(), EXPECTED_PRIMARY_PHONE);
    }
}
