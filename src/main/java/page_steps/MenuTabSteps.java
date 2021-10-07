package page_steps;

import org.openqa.selenium.WebElement;
import pages.selenium.MenuTab;

import java.util.stream.Collectors;

public class MenuTabSteps{

   private MenuTab menuTabPage = new MenuTab();

    public MenuTab getMenuTabPage() {

        return menuTabPage;
    }

    public void clickOnMenuTab(String menuName) {
        for (WebElement w : menuTabPage.getMenuTabList()) {
            if (w.getText().contains(menuName)) {
                w.click();
            }
        }
    }

    public boolean isMenuTabListVisible() {
        boolean b = false;
        for (WebElement w : menuTabPage.getMenuTabList()) {
            b = w.isDisplayed();
        }
        return b;
    }

    public String getMenuTabListText() {
        return menuTabPage.getMenuTabList().stream()
                .map(WebElement::getText)
                .collect(Collectors.joining(","));
    }

    public String getScheduleText() {
        return menuTabPage.getSchedule().getText();
    }

    public String getPrimaryPhoneText() {
        return menuTabPage.getPrimaryPhone().getText();
    }

    public String getMenuDropDownTabListText() {
        return menuTabPage.getMenuDropDownTabList().stream()
                .map(WebElement::getText)
                .collect(Collectors.joining(","));
    }

    public String getMenuLangDropDownListText() {
        return menuTabPage.getMenuLangDropDownList().stream()
                .map(WebElement::getText)
                .collect(Collectors.joining(","));
    }

    public boolean isMenuTabIconsListVisible() {
        boolean b = false;
        for (WebElement w : menuTabPage.getMenuTabIconsList()) {
            b = w.isDisplayed();
        }
        return b;
    }

}
