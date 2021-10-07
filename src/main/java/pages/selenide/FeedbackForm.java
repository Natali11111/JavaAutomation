package pages.selenide;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.*;

@Getter
public class FeedbackForm {

    public SelenideElement searchButton = $x("//button[contains(@class, 'reset search-btn')]");
    public ElementsCollection reviewAndCommentList = $$x("//div[@id='feature-all-4']//ul[contains(@class, 'tab--form')]//a//span");
    public ElementsCollection starsListButtons = $$x("//form[@id='write-mess-form']//img");
    public SelenideElement plusField = $x("//div[@id='feature-all-4']//input[@name='ru[plus]']");
    public SelenideElement minusField = $x("//div[@id='feature-all-4']//input[@name= 'ru[minus]']");
    public SelenideElement sendReviewButton = $x("//button[@data-callback='onReviewSubmit']");
    public SelenideElement reviewFieldReview = $x("//form[@id='write-mess-form']//textarea[@name='ru[comment]']");
    public SelenideElement customerNameFieldReview = $x("//form[@id='write-mess-form']//input[@name= 'ru[name]']");
    public SelenideElement emailFieldReview = $x("//form[@id='write-mess-form']//input[@name= 'email']");
    public SelenideElement sendCommentButton = $x("//button[@data-callback='onCommentSubmit']");
    public SelenideElement reviewBox = $x("//div[@id='feature-all-4']//div[@class='write-review-box']");
    public SelenideElement confirmThatReviewSent = $x("//div[@id='modalAlert']//div[@class='modal-middle']");
    public SelenideElement closeButton = $x("//div[@id='modalAlert']//button[@title='Close']");
    public SelenideElement emailFieldComment = $x("//div[@id='write-comment']//input[@name='email']");
    public SelenideElement customerNameFieldComment = $x("//div[@id='write-comment']//input[@name='ru[name]']");
    public SelenideElement reviewFieldComment = $x("//div[@id='write-comment']//textarea[@name='ru[comment]']");
    public SelenideElement confirmThatCommentSent = $x("//div[@id='modalAlert']//div[@class='modal-top']");

    public void assertReviewBoxVisible() {
        $(reviewBox).shouldBe(Condition.visible);
    }

    public void assertThatCommentSent(String message) {
        $(confirmThatCommentSent).shouldHave(Condition.text(message));
    }

    public void assertThatReviewSent(String message) {
        $(confirmThatReviewSent).shouldHave(Condition.text(message));
    }

    public void assertReviewAndCommentListVisible() {
        $$(reviewAndCommentList).shouldBe(CollectionCondition.allMatch("Not all elements visible", WebElement::isDisplayed));
    }

    public void clickOnTabReviewList(String title) {
        $$(reviewAndCommentList).stream().filter(c -> c.getText().equals(title)).findFirst().get().click();
    }

    public void assertStarsListButtonsVisible() {
        $$(starsListButtons).shouldBe(CollectionCondition.allMatch("Not all elements visible", WebElement::isDisplayed));
    }

    public void clickOnStarsListButtons(int index) {
        $$(starsListButtons).get(index).click();
    }

    public void clickOnSendCommentButton() {
        $(sendCommentButton).click();
    }

    public void clickOnSendReviewButton() {
        $(sendReviewButton).click();
    }

    public void clickOnCloseButton() {
        $(closeButton).click();
    }

    public void sendReview(String plus, String minus, String text, String email, String name) {
        $(plusField).setValue(plus);
        $(minusField).setValue(minus);
        $(reviewFieldReview).setValue(text);
        $(emailFieldReview).setValue(email);
        $(customerNameFieldReview).setValue(name);
    }

    public void sendComment(String text, String email, String name) {
        $(reviewFieldComment).setValue(text);
        $(emailFieldComment).setValue(email);
        $(customerNameFieldComment).setValue(name);
    }

    public void scroll() {
        $(reviewBox).scrollTo();
    }
}
