package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

@Getter
public class ItemFilteringForm extends BasePage {

    public ItemFilteringForm() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='sidebar']//span//span")
    private List<WebElement> categoryItemsList;

    @FindBy(xpath = "//div[@class='brand-box__title']/a")
    private List<WebElement> subCategoryItemsList;

    @FindBy(xpath = "//form[@id = 'filters']")
    private WebElement filterForm;

    @FindBy(xpath = "//div[contains(@class,'filter-area')]//label")
    private List<WebElement> filterCheckBoxList;

    @FindBy(xpath = "//p[contains(@class,'filter-title')]")
    private List<WebElement> filterSectionList;

    String showAllOrHideBtnXpath = "/following-sibling::div/a";

    @FindBy(xpath = "//input[contains(@class,'form-control-min')]")
    private WebElement minPriceField;

    @FindBy(xpath = "//input[contains(@class,'form-control-max')]")
    private WebElement maxPriceField;

    @FindBy(xpath = "//div[contains(@class, 'form-group')]//span[@class='filter-tooltip-inner']")
    public WebElement showButton;
}
