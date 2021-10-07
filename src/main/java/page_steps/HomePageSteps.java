package page_steps;

import org.openqa.selenium.WebElement;
import pages.selenium.HomePage;

public class HomePageSteps {

    private HomePage homePage = new HomePage();

    public HomePage getHomePage() {

        return homePage;
    }

    public void clickOnSearchButton() {
        homePage.getSearchButton().click();
    }

    public void inputSearchField(String text) {
        homePage.getSearchFiled().sendKeys(text);
    }

    public boolean isContainExpectedWord(String s) {
        boolean b = false;
        for (WebElement w : homePage.getSearchItems()) {
            b = w.getText().toLowerCase().contains(s.toLowerCase());
        }
        return b;
    }
}
