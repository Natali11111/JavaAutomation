package page_steps;

import driver.DriverManager;
import helper.WindowHandler;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import pages.ItemFilteringForm;

public class ItemFilteringFormSteps {
    private ItemFilteringForm filteringForm = new ItemFilteringForm();

    public ItemFilteringForm getFilteringForm() {
        return filteringForm;
    }

    public boolean isCategoryItemsListVisible() {
        boolean b = false;
        for (WebElement w : filteringForm.getCategoryItemsList()) {
            b = w.isDisplayed();
        }
        return b;
    }

    public void clickOnCategoryItemsList(String s) {
        int attempts = 0;
        while (attempts < 3) {
            try {
                for (WebElement w : filteringForm.getCategoryItemsList()) {
                    if (w.getText().contains(s)) {
                        w.click();
                    }
                }
                break;
            } catch (StaleElementReferenceException e) {
                e.printStackTrace();
            }
            attempts++;
        }
    }

    public boolean isSubCategoryItemsListVisible() {
        boolean b = false;
        for (WebElement w : filteringForm.getSubCategoryItemsList()) {
            b = w.isDisplayed();
        }
        return b;
    }

    public void clickOnSubCategoryItemsList(String s) {
        int attempts = 0;
        while (attempts < 3) {
            try {
                for (WebElement w : filteringForm.getSubCategoryItemsList()) {
                    if (w.getText().contains(s)) {
                        w.click();
                    }
                }
                break;
            } catch (StaleElementReferenceException e) {
                e.printStackTrace();
            }
            attempts++;
        }
    }

    public boolean isFilterFormVisible() {
        return filteringForm.getFilterForm().isDisplayed();
    }

    public void checkFilterCheckBoxList(String s) {
        int attempts = 0;
        while (attempts < 1) {
            try {
                for (WebElement w : filteringForm.getFilterCheckBoxList()) {
                    if (w.getText().contains(s)) {
                        w.click();
                    }
                }
                break;
            } catch (StaleElementReferenceException e) {
                e.printStackTrace();
            }
            attempts++;
        }
    }

    public void clickOnFilterSectionList(String s) {
        int attempts = 0;
        while (attempts < 1) {
            try {
                for (WebElement w : filteringForm.getFilterSectionList()) {
                    if (w.getText().contains(s)) {
                        w.click();
                    }
                }
                break;
            } catch (StaleElementReferenceException e) {
                e.printStackTrace();
            }
            attempts++;
        }
    }

    public void inputMinPriceField(String s) {
        filteringForm.getMinPriceField().clear();
        filteringForm.getMinPriceField().sendKeys(s);
    }

    public void inputMaxPriceField(String s) {
        filteringForm.getMaxPriceField().clear();
        filteringForm.getMaxPriceField().sendKeys(s);
    }

    public void clickOnShowButton() {
        filteringForm.getShowButton().click();
    }

    public void scrollToFilter(int x, int y){
        WindowHandler.scrollToWebElement(filteringForm.getFilterForm(),x,y, DriverManager.getInstance().getDriver());
    }
}
