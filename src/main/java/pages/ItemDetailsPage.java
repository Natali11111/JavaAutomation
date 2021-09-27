package pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

@Getter
public class ItemDetailsPage extends BasePage {

    public ItemDetailsPage() {
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//div[@class = 'prod-cart__descr']")
    private List<WebElement> searchItems;

    @FindBy(xpath = "//div[contains(@class, 'product-main-slider')]")
    private WebElement picturesForm;

    @FindBy(xpath = "//a[contains(@class, 'prod-addto')]/i")
    private WebElement likeButton;

    @FindBy(xpath = "//a[contains(@class, 'main-btn--large')]")
    private WebElement buyButton;

    @FindBy(xpath = "//a[contains(@class, 'main-btn--middle')]")
    private WebElement buyOneClickButton;

    @FindBy(xpath = "//span[contains(@class , 'installment')]")
    private WebElement buyInInstallmentButton;

    @FindBy(xpath = "//a[contains(@class,'review')]")
    private WebElement deliveryAndPaymentButton;

    @FindBy(xpath = "//div[@class = 'additional-info__text']")
    private List<WebElement> additionalInfoList;

    @FindBy(xpath = "//ul[contains(@class, 'tab--fill')]//span[@class = 'tab-item']")
    private List<WebElement> tabItemsList;

    @FindBy(xpath = "//div[@class = 'new-prise']/span")
    private WebElement itemPriceLabel;

    @FindBy(xpath = "//div[@class = ' choose-config__left ']//span")
    private WebElement choosingItemColor;
}
