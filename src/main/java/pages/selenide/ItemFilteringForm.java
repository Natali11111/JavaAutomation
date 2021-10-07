package pages.selenide;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.*;

@Getter
public class ItemFilteringForm {

    private final ElementsCollection categoryItemsList = $$x("//div[@class='sidebar']//span//span");
    private final ElementsCollection subCategoryItemsList = $$x("//div[@class='brand-box__title']/a");
    private final SelenideElement filterForm = $x("//form[@id = 'filters']");
    private final ElementsCollection filterCheckBoxList = $$x("//div[contains(@class,'filter-area')]//label");
    private final ElementsCollection filterSectionList = $$x("//p[contains(@class,'filter-title')]");
    private final SelenideElement minPriceField = $x("//input[contains(@class,'form-control-min')]");
    private final SelenideElement maxPriceField = $x("//input[contains(@class,'form-control-max')]");
    private final SelenideElement showButton = $x("//div[contains(@class, 'form-group')]//span[@class='filter-tooltip-inner']");

    String showAllForSectionXpath = "//p[contains(text(), '%s')]//..//a[contains(@class,'js-filter-more')]";

    public void assertCategoryItemsListVisible() {
        $$(categoryItemsList).shouldBe(CollectionCondition.allMatch("Not all elements visible", WebElement::isDisplayed));
    }

    public void clickOnCategoryItemsList(String categoryName) {
        $$(categoryItemsList).stream().filter(c -> c.getText().equals(categoryName)).findFirst().get().click();
    }

    public void assertSubCategoryItemsListVisible() {
        $$(subCategoryItemsList).shouldBe(CollectionCondition.allMatch("Not all elements visible", WebElement::isDisplayed));
    }

    public void clickOnSubCategoryItemsList(String subcategoryName) {
        $$(subCategoryItemsList).stream().filter(c -> c.getText().equals(subcategoryName)).findFirst().get().click();
    }

    public void assertFilterFormVisible() {
        $(filterForm).shouldHave(Condition.visible);
    }

    public void clickOnFilterCheckboxList(String checkboxName) {
        $$(filterCheckBoxList).stream().filter(c -> c.getText().equals(checkboxName)).findFirst().get().click();
    }

    public void clickOnFilterSectionList(String filterSectionName) {
        $$(filterSectionList).stream().filter(c -> c.getText().equals(filterSectionName)).findFirst().get().click();
    }

    public void inputMinPriceField(String minPrice) {
        $(minPriceField).clear();
        $(minPriceField).sendKeys(minPrice);
    }

    public void inputMaxPriceField(String maxPrice) {
        $(maxPriceField).clear();
        $(maxPriceField).sendKeys(maxPrice);
    }

    public void clickOnShowButton() {
        $(showButton).click();
    }

    public void clickOnShowAllList(String input) {
        $x(String.format(showAllForSectionXpath, input)).click();
    }
}
