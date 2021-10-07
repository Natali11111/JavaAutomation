package selenium;

import driver.DriverManager;
import helper.Randomizer;
import helper.WindowHandler;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page_steps.FeedbackFormSteps;
import page_steps.HomePageSteps;
import page_steps.ItemDetailsPageSteps;
import test_data.data_provider.DataProviderClass;
import utils.Wait;

import static test_data.constants.TestData.*;

public class FeedBackFormTest extends BaseTest {
    FeedbackFormSteps feedbackFormSteps;
    HomePageSteps homePageSteps;
    ItemDetailsPageSteps itemDetailsPageSteps;

    @BeforeTest
    public void setup() {
        homePageSteps = new HomePageSteps();
        itemDetailsPageSteps = new ItemDetailsPageSteps();
        feedbackFormSteps = new FeedbackFormSteps();
    }

    @Test(dataProvider = "dataForFeedBackForm", dataProviderClass = DataProviderClass.class)
    public void verifyFeedbackForm(String searchWord, String searchItem, String review,
                                   String comment) {
        homePageSteps.inputSearchField(searchWord);
        Wait.waitElementToBeClickable(homePageSteps.getHomePage().getSearchButton());
        homePageSteps.clickOnSearchButton();
        itemDetailsPageSteps.clickOnItemList(searchItem);
        itemDetailsPageSteps.clickOnDeliveryAndPaymentMethods();
        Wait.waitVisibilityOfAllElementsList(itemDetailsPageSteps.getItemDetailsPage().getTabItemsList());
        itemDetailsPageSteps.clickOnTabItem(review);
        Wait.waitVisibilityOf(feedbackFormSteps.getFeedbackForm().getReviewBox());
        Assert.assertTrue(feedbackFormSteps.isReviewBoxVisible());
        Assert.assertTrue(feedbackFormSteps.isTabReviewListEnabled());
        Wait.waitVisibilityOfAllElementsList(feedbackFormSteps.getFeedbackForm().getStarsListButtons());
        Assert.assertTrue(feedbackFormSteps.isStarsListButtonsVisible());
        feedbackFormSteps.clickOnStarsListButtons(Randomizer.randomNumberForStarts());
        feedbackFormSteps.sendReview(
                Randomizer.randomWord(10),
                Randomizer.randomWord(12),
                Randomizer.randomWord(8),
                Randomizer.randomEmail(15),
                Randomizer.randomWord(5));

        Wait.waitVisibilityOf(feedbackFormSteps.getFeedbackForm().getSendReviewButton());
        WindowHandler.scrollToWebElement(feedbackFormSteps.getFeedbackForm().getSendReviewButton(), 1, 1, DriverManager.getInstance().getDriver());
        Wait.waitElementToBeClickable(feedbackFormSteps.getFeedbackForm().getSendReviewButton());
        feedbackFormSteps.clickOnSendReviewButton();
        Wait.waitVisibilityOf(feedbackFormSteps.getFeedbackForm().getConfirmThatReviewSent());
        feedbackFormSteps.isConfirmThatReviewSent();
        Assert.assertEquals(feedbackFormSteps.getConfirmThatReviewSentText(), CONFIRM_REVIEW_SEND);
        Wait.waitElementToBeClickable(feedbackFormSteps.getFeedbackForm().getCloseButton());
        feedbackFormSteps.clickOnCloseButton();
        itemDetailsPageSteps.clickOnDeliveryAndPaymentMethods();
        Wait.waitVisibilityOfAllElementsList(itemDetailsPageSteps.getItemDetailsPage().getTabItemsList());
        itemDetailsPageSteps.clickOnTabItem(review);
        Wait.waitElementToBeClickable(feedbackFormSteps.getFeedbackForm().getReviewBox());
        feedbackFormSteps.clickOnTabReviewList(comment);
        feedbackFormSteps.sendComment(
                Randomizer.randomWord(30),
                Randomizer.randomEmail(17),
                Randomizer.randomWord(5));
        WindowHandler.scrollToWebElement(feedbackFormSteps.getFeedbackForm().getSendCommentButton(), 1, 1, DriverManager.getInstance().getDriver());
        feedbackFormSteps.clickOnSendCommentButton();
        Assert.assertTrue(feedbackFormSteps.isConfirmThatCommentSent());
        Assert.assertEquals(feedbackFormSteps.getConfirmThatCommentSentText(), CONFIRM_COMMENT_SEND);
    }
}
