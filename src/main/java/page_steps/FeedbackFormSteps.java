package page_steps;


import org.openqa.selenium.WebElement;
import pages.FeedbackForm;

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

    public void inputEmailFieldComment(String s) {
        feedbackForm.getEmailFieldComment().sendKeys(s);
    }

    public void inputCustomerNameFieldComment(String s) {
        feedbackForm.getCustomerNameFieldComment().sendKeys(s);
    }

    public void inputReviewFieldComment(String s) {
        feedbackForm.getReviewFieldComment().sendKeys(s);
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

//    public void inputPlusField(String s) {
//
//        plusField.sendKeys(s);
//    }
//
//    public void inputMinusField(String s) {
//        minusField.sendKeys(s);
//    }
//
//    public void inputTextReviewInFeedbackForm(String s) {
//        reviewFieldRev.sendKeys(s);
//    }
//
//    public void inputEmailReview(String s) {
//        emailFieldReview.sendKeys(s);
//    }
//
//    public void inputCustomerNameReview(String s) {
//        customerNameFieldReview.sendKeys(s);
//    }


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



}
