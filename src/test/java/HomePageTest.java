import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page_steps.FeedbackFormSteps;
import page_steps.HomePageSteps;
import page_steps.ItemDetailsPageSteps;
import page_steps.MenuTabSteps;
import pages.*;

import static test_data.constants.TestData.*;

public class HomePageTest extends BaseTest {

    FeedbackForm feedbackForm;
    FeedbackFormSteps feedbackFormSteps;
    HomePageSteps homePageSteps;
    ItemDetailsPageSteps itemDetailsPageSteps;
    MenuTabSteps menuTabSteps;
    HomePage homePage;

    @BeforeTest
    public void setup() {
        menuTabSteps = new MenuTabSteps();
        homePageSteps = new HomePageSteps();
        itemDetailsPageSteps = new ItemDetailsPageSteps();
        feedbackFormSteps = new FeedbackFormSteps();
        homePage = new HomePage();
    }

    @Test
    public void verifyMenuTab() {
        Assert.assertTrue(menuTabSteps.isMenuTabListVisible(), "Menu tab list is not visible");
        Assert.assertEquals(menuTabSteps.getMenuTabListText(), EXPECTED_MENU_TAB_LIST,
                "Expected and actual headers are different.");
        menuTabSteps.clickOnMenuTab("Ещё");
        Assert.assertEquals(menuTabSteps.getMenuDropDownTabListText(), EXPECTED_MENU_DROP_DOWN_TAB_LIST,
                "Expected and actual dropdown headers are different.");
        menuTabSteps.clickOnMenuTab("RU");
        Assert.assertEquals(menuTabSteps.getMenuLangDropDownListText(), EXPECTED_MENU_LANG_DROP_DOWN_LIST,
                "Expected and actual dropdown headers are different.");
        Assert.assertTrue(menuTabSteps.isMenuTabIconsListVisible(), "Menu tab icons are not visible");
        Assert.assertEquals(menuTabSteps.getScheduleText(), EXPECTED_SCHEDULE);
        Assert.assertEquals(menuTabSteps.getPrimaryPhoneText(), EXPECTED_PRIMARY_PHONE);
    }

    @Test
    public void verifySearchFunctionality() {
        homePageSteps.inputSearchField(SEARCH_WORD);
        homePageSteps.clickOnSearchButton();
        Assert.assertTrue(homePageSteps.isContainExpectedWord(SEARCH_WORD));
    }

    @Test
    public void verifyItemDetails() {
        homePageSteps.inputSearchField(SEARCH_WORD);
        homePageSteps.clickOnSearchButton();
        itemDetailsPageSteps.clickOnItem(0);
        Assert.assertTrue(itemDetailsPageSteps.isLikeButtonVisible());
        Assert.assertTrue(itemDetailsPageSteps.isPicturesFormVisible());
        Assert.assertTrue(itemDetailsPageSteps.isBuyButtonVisible());
        Assert.assertTrue(itemDetailsPageSteps.isBuyOneClickButtonVisible());
        Assert.assertTrue(itemDetailsPageSteps.isBuyInInstallmentButtonVisible());
        Assert.assertEquals(itemDetailsPageSteps.getBuyButtonText(), EXPECTED_BUY_BUTTON);
        Assert.assertEquals(itemDetailsPageSteps.getBuyOneClickButtonText(), EXPECTED_BUY_ONE_CLICK_BUTTON);
        Assert.assertEquals(itemDetailsPageSteps.getBuyInInstallmentButtonText(), EXPECTED_BUY_IN_INSTALLMENT_BUTTON);
        Assert.assertEquals(itemDetailsPageSteps.getAdditionalInfoListText(), EXPECTED_ADDITIONAL_INFO_LIST);
        itemDetailsPageSteps.clickOnDeliveryAndPaymentMethods();
        Assert.assertTrue(itemDetailsPageSteps.isTabItemsListVisible());
        boolean result = itemDetailsPageSteps.isItemContainExpectedText(DELIVERY) &&
                itemDetailsPageSteps.isItemContainExpectedText(CHARACTERISTIC) &&
                itemDetailsPageSteps.isItemContainExpectedText(GUARANTEE);
        Assert.assertTrue(result);
    }

    @Test
    public void verifyFeedbackForm() { ;
        homePageSteps.inputSearchField(SEARCH_WORD);
        //wait for search button
        //wait.until(ExpectedConditions.elementToBeClickable(homePage.getSearchButton()));
        homePageSteps.clickOnSearchButton();
        itemDetailsPageSteps.clickOnItem(0);
        itemDetailsPageSteps.clickOnDeliveryAndPaymentMethods();
      //  wait.until(ExpectedConditions.visibilityOfAllElements(itemDetailsPage.getTabItemsList()));
        itemDetailsPageSteps.clickOnTabItem("Отзывы");
        //add wait to form review
      //  wait.until(ExpectedConditions.visibilityOf(feedbackForm.getReviewBox()));
        //verify form review
        Assert.assertTrue(feedbackFormSteps.isReviewBoxVisible());
        //verify enable and disable buttons
        Assert.assertTrue(feedbackFormSteps.isTabReviewListEnabled());
        //add wait to list stars
       // wait.until(ExpectedConditions.visibilityOfAllElements(feedbackForm.getStarsListButtons()));
        //assert
        Assert.assertTrue(feedbackFormSteps.isStarsListButtonsVisible());
        feedbackFormSteps.clickOnStarsListButtons(4);
        feedbackFormSteps.sendReview("Стильный интерфейс","Минусов нет", "great" , "fol677@gmail.com", "Olga" );
//        feedbackForm.inputPlusField("Стильный интерфейс");
//        feedbackForm.inputMinusField("Минусов нет");
//        feedbackForm.inputTextReviewInFeedbackForm("Everything is great");
//        feedbackForm.inputEmailReview("user234@gmail.com");
//        feedbackForm.inputCustomerNameReview("Di");
       // wait.until(ExpectedConditions.visibilityOf(feedbackForm.getSendReviewButton()));
       // WindowHandler.scrollToWebElement(feedbackForm.getSendReviewButton(), 1, 1, driver);
       // wait.until(ExpectedConditions.elementToBeClickable(feedbackForm.getSendReviewButton()));
        feedbackFormSteps.clickOnSendReviewButton();

//        //popup
//      //  wait.until(ExpectedConditions.visibilityOf(feedbackForm.getConfirmThatReviewSent()));
//        feedbackFormSteps.isConfirmThatReviewSent();
//        //asser popup
//        Assert.assertEquals(feedbackForm.getConfirmThatReviewSentText(), "Отзыв отправлен!");
//        //return back
//        wait.until(ExpectedConditions.elementToBeClickable(feedbackForm.getCloseButton()));
//        feedbackForm.clickOnCloseButton();
//        itemDetailsPage.clickOnDeliveryAndPaymentMethods();
//        wait.until(ExpectedConditions.visibilityOfAllElements(itemDetailsPage.getTabItemsList()));
//        itemDetailsPage.clickOnTabItem("Отзывы");
//        //go to comment
//        wait.until(ExpectedConditions.elementToBeClickable(feedbackForm.getReviewBox()));
//        feedbackForm.clickOnTabReviewList("Комментарий");
//        //write comment
//        feedbackForm.inputReviewFieldComment("I like this");
//        feedbackForm.inputEmailFieldComment("moli111poli@gmail.com");
//        feedbackForm.inputCustomerNameFieldComment("Dara");
//        //click
//        feedbackForm.clickOnSendCommentButton();
//        //wait popupКомментарий
//        Assert.assertTrue(feedbackForm.isConfirmThatCommentSent());
//        //asser popup
//        Assert.assertEquals(feedbackForm.getConfirmThatCommentSentText(), "Успешно!");


    }


}
