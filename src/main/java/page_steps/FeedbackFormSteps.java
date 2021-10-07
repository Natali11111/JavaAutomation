package page_steps;

import org.openqa.selenium.WebElement;
import pages.selenium.FeedbackForm;

public class FeedbackFormSteps {
    private FeedbackForm feedbackForm = new FeedbackForm();

    public FeedbackForm getFeedbackForm() {
        return feedbackForm;
    }

    public String getConfirmThatCommentSentText() {
        return feedbackForm.getConfirmThatCommentSent().getText();
    }

    public boolean isConfirmThatCommentSent() {
        return feedbackForm.getConfirmThatCommentSent().isDisplayed();
    }

    public boolean isConfirmThatReviewSent() {
        return feedbackForm.getConfirmThatReviewSent().isDisplayed();
    }

    public boolean isReviewBoxVisible() {
        return feedbackForm.getReviewBox().isDisplayed();
    }

    public boolean isTabReviewListEnabled() {
        boolean b = false;
        for (WebElement w : feedbackForm.getTabReviewList()) {
            b = w.isEnabled();
        }
        return b;
    }

    public boolean isTabFormListVisible() {
        boolean b = false;
        for (WebElement w : feedbackForm.getTabReviewList()) {
            b = w.isDisplayed();
        }
        return b;
    }

    public void clickOnTabReviewList(String text) {
        for (WebElement w : feedbackForm.getTabReviewList()) {
            if (w.getText().contains(text)) {
                w.click();
            }
        }
    }

    public boolean isStarsListButtonsVisible() {
        boolean b = false;
        for (WebElement w : feedbackForm.getStarsListButtons()) {
            b = w.isDisplayed();
        }
        return b;
    }

    public void clickOnStarsListButtons(int index) {
        feedbackForm.getStarsListButtons().get(index).click();
    }

    public void clickOnSendCommentButton() {
       feedbackForm.getSendCommentButton().click();
    }

    public void clickOnSendReviewButton() {
        feedbackForm.getSendReviewButton().click();
    }

    public String getConfirmThatReviewSentText() {
        return feedbackForm.getConfirmThatReviewSent().getText();
    }

    public void clickOnCloseButton() {
       feedbackForm.getCloseButton().click();
    }

    public void sendReview(String plus, String minus,String text, String email, String name){
        feedbackForm.getPlusField().sendKeys(plus);
        feedbackForm.getMinusField().sendKeys(minus);
        feedbackForm.getReviewFieldRev().sendKeys(text);
        feedbackForm.getEmailFieldReview().sendKeys(email);
        feedbackForm.getCustomerNameFieldReview().sendKeys(name);
    }

    public void sendComment(String text, String email, String name){
       feedbackForm.getReviewFieldComment().sendKeys(text);
       feedbackForm.getEmailFieldComment().sendKeys(email);
       feedbackForm.getCustomerNameFieldComment().sendKeys(name);
    }
}
