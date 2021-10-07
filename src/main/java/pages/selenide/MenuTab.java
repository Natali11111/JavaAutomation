package pages.selenide;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Selenide.*;

@Getter
public class MenuTab {

    private final SelenideElement schedule = $x("//div[@class = 'time-work flex-wrap']");
    private final SelenideElement primaryPhone = $x("//a[contains(@class, 'primary-phone')]");
    private final ElementsCollection menuTabList = $$x("//a[contains(@class, 'header-top')]");
    private final ElementsCollection menuDropDownTabList = $$x("//ul[@class = 'menu-dropdown']//a");
    private final SelenideElement menuLangDropDown = $x("//ul[contains(@class,'dropdown__lang')]//a");
    private final ElementsCollection menuTabIconsList = $$x("//ul[contains(@class, 'header__soc')]//i[contains(@class, 'icon')]");


    public void clickOnMenuTab(String menuName) {
        $$(menuTabList).stream().filter(c -> c.getText().equals(menuName)).findFirst().get().click();
    }

    public void assertMenuTabListVisible() {
        $$(menuTabList).shouldBe(CollectionCondition.allMatch("Not all elements visible", WebElement::isDisplayed));
    }

    public void assertMenuTabIconsListVisible(){
        $$(menuTabIconsList).shouldBe(CollectionCondition.allMatch("Not all elements visible", WebElement::isDisplayed));
    }

    public void assertMenuTabListTitles(String titleNames) {
        List<String> expectedHeaders = Arrays.asList(titleNames.split(","));
        expectedHeaders.forEach(h -> {
            Assert.assertTrue($$(menuTabList).stream().map(SelenideElement::getText).collect(Collectors.toList()).contains(h), "");
        });
    }

    public void assertMenuDropDownTabListCheckboxes(String checkboxes) {
        List<String> expectedHeaders = Arrays.asList(checkboxes.split(","));
        expectedHeaders.forEach(h -> {
            Assert.assertTrue($$(menuDropDownTabList).stream().map(SelenideElement::getText).collect(Collectors.toList()).contains(h), "");
        });
    }

    public void assertPrimaryPhoneTitle(String s) {
        $(primaryPhone).shouldHave(Condition.text(s));
    }

    public void assertScheduleTitle(String s) {
        $(schedule).shouldHave(Condition.text(s));
    }

    public void assertMenuLangDropDownTitle(String s) {
        $(menuLangDropDown).shouldHave(Condition.text(s));
    }
}
