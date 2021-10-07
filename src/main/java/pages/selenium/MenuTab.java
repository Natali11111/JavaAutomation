package pages.selenium;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

@Getter
public class MenuTab extends BasePage{

    public MenuTab() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(@class, 'header-top')]")
    private List<WebElement> menuTabList;

    @FindBy(xpath = "//ul[@class = 'menu-dropdown']//a")
    private List<WebElement> menuDropDownTabList;

    @FindBy(xpath = "//ul[contains(@class,'dropdown__lang')]//a")
    private List<WebElement> menuLangDropDownList;

    @FindBy(xpath = "//div[@class = 'time-work flex-wrap']")
    private WebElement schedule;

    @FindBy(xpath = "//a[contains(@class, 'primary-phone')]")
    private WebElement primaryPhone;

    @FindBy(xpath = "//ul[contains(@class, 'header__soc')]//i[contains(@class, 'icon')]")
    private List<WebElement> menuTabIconsList;
}
