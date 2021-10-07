package selenide;

import helper.Randomizer;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.selenide.FeedbackForm;
import pages.selenide.HomePage;
import pages.selenide.ItemDetailsPage;
import test_data.data_provider.DataProviderClass;

import static com.codeborne.selenide.Selenide.open;
import static constants.HostConstants.AVIC_URL;
import static test_data.constants.TestData.CONFIRM_COMMENT_SEND;
import static test_data.constants.TestData.CONFIRM_REVIEW_SEND;

public class FeedbackFormTest extends BaseTest {
    HomePage homePage;
    FeedbackForm feedbackForm;
    ItemDetailsPage itemDetailsPage;

    @BeforeTest
    public void openUrl(){
        homePage = new HomePage();
        feedbackForm = new FeedbackForm();
        itemDetailsPage = new ItemDetailsPage();
        open(AVIC_URL);
    }

    @Test(dataProvider = "dataForFeedBackForm", dataProviderClass = DataProviderClass.class)
    public void verifyFeedbackForm(String searchWord, String searchItem, String review,
                                   String comment) {
        homePage.inputField(searchWord);
        homePage.assertSearchListTitle(searchWord);
        itemDetailsPage.clickOnSearchItemList(searchItem);
        itemDetailsPage.clickOnDeliveryAndPaymentMethods();
        itemDetailsPage.clickOnTabItemList(review);
        feedbackForm.assertReviewBoxVisible();
        feedbackForm.assertReviewAndCommentListVisible();
        feedbackForm.assertStarsListButtonsVisible();
        feedbackForm.clickOnStarsListButtons(Randomizer.randomNumberForStarts());
        feedbackForm.sendReview(
                Randomizer.randomWord(10),
                Randomizer.randomWord(12),
                Randomizer.randomWord(8),
                Randomizer.randomEmail(15),
                Randomizer.randomWord(5));
        feedbackForm.scroll();
        feedbackForm.clickOnSendReviewButton();
        feedbackForm.assertThatReviewSent(CONFIRM_REVIEW_SEND);
        feedbackForm.clickOnCloseButton();
        itemDetailsPage.clickOnDeliveryAndPaymentMethods();
        itemDetailsPage.clickOnTabItemList(review);
        feedbackForm.clickOnTabReviewList(comment);
        feedbackForm.sendComment(
                Randomizer.randomWord(30),
                Randomizer.randomEmail(17),
                Randomizer.randomWord(5));
        feedbackForm.scroll();
        feedbackForm.clickOnSendCommentButton();
        feedbackForm.assertThatCommentSent(CONFIRM_COMMENT_SEND);
    }
}
