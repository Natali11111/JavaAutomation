package selenide;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.selenide.ItemDetailsPage;
import pages.selenide.ItemFilteringForm;
import pages.selenide.MenuTab;

import static com.codeborne.selenide.Selenide.open;
import static constants.HostConstants.AVIC_URL;
import static test_data.constants.TestData.*;

public class MenuTabTest extends BaseTest{

    MenuTab menuTab;

    @BeforeTest
    public void openUrl() {
        menuTab = new MenuTab();
        open(AVIC_URL);
    }

    @Test
    public void verifyMenuTab() {
        menuTab.assertMenuTabListVisible();
        menuTab.assertScheduleTitle(EXPECTED_SCHEDULE);
        menuTab.assertMenuTabListTitles(EXPECTED_MENU_TAB_LIST);
        menuTab.clickOnMenuTab(RU);
        menuTab.assertMenuLangDropDownTitle(EXPECTED_MENU_LANG_DROP_DOWN);
        menuTab.assertMenuTabIconsListVisible();
        menuTab.assertPrimaryPhoneTitle( EXPECTED_PRIMARY_PHONE);
        menuTab.clickOnMenuTab(STILL);
        menuTab.assertMenuDropDownTabListCheckboxes(EXPECTED_MENU_DROP_DOWN_TAB_LIST);
    }
}
