package pages.selenide;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Selenide.*;

@Getter
public class ItemDetailsPage {

    private final ElementsCollection searchItemsList = $$x("//div[@class = 'prod-cart__descr']");
    private final SelenideElement picturesForm = $x("//div[contains(@class, 'product-main-slider')]");
    private final SelenideElement likeButton = $x("//a[contains(@class, 'prod-addto')]/i");
    private final SelenideElement buyButton = $x("//a[contains(@class, 'main-btn--large')]");
    private final SelenideElement buyOneClickButton = $x("//a[contains(@class, 'main-btn--middle')]");
    private final SelenideElement buyInInstallmentButton = $x("//span[contains(@class , 'installment')]");
    private final SelenideElement deliveryAndPaymentButton = $x("//a[contains(@class,'review')]");
    private final ElementsCollection additionalInfoList = $$x("//div[@class = 'additional-info__text']");
    private final ElementsCollection tabItemsList = $$x("//ul[contains(@class, 'tab--fill')]//span[@class = 'tab-item']");
    private final SelenideElement itemPriceLabel = $x("//div[@class = 'new-prise']/span");
    private final SelenideElement itemTitle = $x("//h1[@class = 'page-title']");

    public void clickOnSearchItemList(String searchItemName) {
        $$(searchItemsList).stream().filter(c -> c.getText().contains(searchItemName)).findFirst().get().click();
    }

    public void assertAdditionalInfoListTitles(String titleNames) {
        List<String> expectedHeaders = Arrays.asList(titleNames.split(","));
        expectedHeaders.forEach(h -> {
            Assert.assertTrue($$(additionalInfoList).stream().map(SelenideElement::getText).collect(Collectors.toList()).contains(h), "");
        });
    }

    public void assertLikeButtonVisible() {
        $(likeButton).shouldBe(Condition.visible);
    }

    public void assertBuyButtonVisible() {
        $(buyButton).shouldBe(Condition.visible);
    }

    public void assertBuyButtonTitle(String title) {
        $(buyButton).shouldHave(Condition.text(title));
    }

    public void assertBuyOneClickButtonVisible() {
        $(buyOneClickButton).shouldBe(Condition.visible);
    }

    public void assertBuyOneClickButtonTitle(String title) {
        $(buyOneClickButton).shouldHave(Condition.text(title));
    }

    public void assertBuyInInstallmentButtonVisible() {
        $(buyInInstallmentButton).shouldBe(Condition.visible);
    }

    public void assertBuyInInstallmentButtonTitle(String title) {
        $(buyInInstallmentButton).shouldHave(Condition.text(title));
    }

    public void clickOnDeliveryAndPaymentMethods() {
        $(deliveryAndPaymentButton).click();
    }

    public void assertPicturesFormVisible() {
        $(picturesForm).shouldBe(Condition.visible);
    }

    public void assertTabItemsListVisible() {
        $$(tabItemsList).shouldBe(CollectionCondition.allMatch("Not all elements visible", WebElement::isDisplayed));
    }

    public void clickOnTabItemList(String title) {
        $$(tabItemsList).stream().filter(c -> c.getText().contains(title)).findFirst().get().click();
    }

    public void assertTabItemListTitles(String titleNames) {
        List<String> expectedHeaders = Arrays.asList(titleNames.split(","));
        expectedHeaders.forEach(h -> {
            Assert.assertTrue($$(tabItemsList).stream().map(SelenideElement::getText).collect(Collectors.toList()).contains(h), "");
        });
    }

    public int getItemPriceLabelNumbers() {
        return Integer.parseInt(itemPriceLabel.getText());
    }

    public void assertPrice(int actualPrice, int minPrice, int maxPrice) {
        SoftAssertions.assertSoftly(softly -> {
            softly.assertThat(actualPrice >= minPrice);
            softly.assertThat(actualPrice <= maxPrice);
        });
    }

    public void assertColor(String color) {
        itemTitle.shouldHave(Condition.matchText(color));
    }
}
