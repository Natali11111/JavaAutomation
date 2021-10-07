package pages.selenide;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;

import java.util.stream.Collectors;

import static com.codeborne.selenide.Selenide.*;

@Getter
public class HomePage {

    private final SelenideElement searchButton = $x("//button[contains(@class, 'reset search-btn')]");
    private final SelenideElement inputField = $(By.id("input_search"));
    private final ElementsCollection searchList = $$x("//div[@class = 'prod-cart__descr']");

    public void inputField(String value){
       inputField.setValue(value);
       searchButton.click();
    }

    public void assertSearchListTitle(String s) {
       searchList.shouldHave().stream().map(SelenideElement::getText).collect(Collectors.toList()).contains(s);
    }

}
