package pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

@Getter
public class HomePage extends BasePage {

    public HomePage() {
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(id = "input_search")
    private WebElement searchFiled;

    @FindBy(xpath = "//button[contains(@class, 'reset search-btn')]")
    private WebElement searchButton;

    @FindBy(xpath = "//div[@class = 'prod-cart__descr']")
    private List<WebElement> searchItems;

    @FindBy(xpath = "//div[contains(@class, 'more_content ')]/p")
     private WebElement searchResultLabel;

}
