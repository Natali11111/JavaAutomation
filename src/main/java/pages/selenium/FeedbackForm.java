package pages.selenium;


import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Getter
public class FeedbackForm extends BasePage {

    @FindBy(xpath = "//div[@id='feature-all-4']//ul[contains(@class, 'tab--form')]//a//span")
    private List<WebElement> tabReviewList;

    @FindBy(xpath = "//form[@id='write-mess-form']//img")
    private List<WebElement> starsListButtons;

    @FindBy(xpath = "//div[@id='feature-all-4']//input[@name='ru[plus]']")
    private WebElement plusField;

    @FindBy(xpath = "//div[@id='feature-all-4']//input[@name= 'ru[minus]']")
    private WebElement minusField;

    @FindBy(xpath = "//button[@data-callback='onReviewSubmit']")
    private WebElement sendReviewButton;

    @FindBy(xpath = "//form[@id='write-mess-form']//textarea[@name='ru[comment]']")
    private WebElement reviewFieldRev;

    @FindBy(xpath = "//form[@id='write-mess-form']//input[@name= 'ru[name]']")
    private WebElement customerNameFieldReview;

    @FindBy(xpath = "//form[@id='write-mess-form']//input[@name= 'email']")
    private WebElement emailFieldReview;

    @FindBy(xpath = "//button[@data-callback='onCommentSubmit']")
    private WebElement sendCommentButton;

    @FindBy(xpath = "//div[@id='feature-all-4']//div[@class='write-review-box']")
    private WebElement reviewBox;

    @FindBy(xpath = "//div[@id='modalAlert']//div[@class='modal-middle']")
    private WebElement confirmThatReviewSent;

    @FindBy(xpath = "//div[@id='modalAlert']//button[@title='Close']")
    private WebElement closeButton;

    @FindBy(xpath = "//div[@id='write-comment']//input[@name='email']")
    private WebElement emailFieldComment;

    @FindBy(xpath = "//div[@id='write-comment']//input[@name='ru[name]']")
    private WebElement customerNameFieldComment;

    @FindBy(xpath = "//div[@id='write-comment']//textarea[@name='ru[comment]']")
    private WebElement reviewFieldComment;

    @FindBy(xpath = "//div[@id='modalAlert']//div[@class='modal-top']")
    private WebElement confirmThatCommentSent;

}
