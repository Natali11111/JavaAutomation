package page_steps;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import pages.selenium.ItemDetailsPage;

import java.util.stream.Collectors;

public class ItemDetailsPageSteps {

    private ItemDetailsPage itemDetailsPage = new ItemDetailsPage();

    public ItemDetailsPage getItemDetailsPage() {

        return itemDetailsPage;
    }

    public void clickOnItemList(String s) {
        int attempts = 0;
        while (attempts < 3) {
            try {
                for (WebElement w : itemDetailsPage.getSearchItems()) {
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

    public String getAdditionalInfoListText() {
        return itemDetailsPage.getAdditionalInfoList().stream()
                .map(WebElement::getText)
                .collect(Collectors.joining(","));
    }

    public boolean isLikeButtonVisible() {
        return itemDetailsPage.getLikeButton().isDisplayed();
    }

    public boolean isBuyButtonVisible() {
        return itemDetailsPage.getBuyButton().isDisplayed();
    }

    public String getBuyButtonText() {
        return itemDetailsPage.getBuyButton().getText();
    }

    public boolean isBuyOneClickButtonVisible() {
        return itemDetailsPage.getBuyOneClickButton().isDisplayed();
    }

    public String getBuyOneClickButtonText() {
        return itemDetailsPage.getBuyOneClickButton().getText();
    }

    public boolean isBuyInInstallmentButtonVisible() {
        return itemDetailsPage.getBuyInInstallmentButton().isDisplayed();
    }

    public String getBuyInInstallmentButtonText() {
        return itemDetailsPage.getBuyInInstallmentButton().getText();
    }

    public void clickOnDeliveryAndPaymentMethods() {
        itemDetailsPage.getDeliveryAndPaymentButton().click();
    }

    public boolean isPicturesFormVisible() {
        return itemDetailsPage.getPicturesForm().isDisplayed();
    }

    public boolean isTabItemsListVisible() {
        boolean b = false;
        for (WebElement w : itemDetailsPage.getTabItemsList()) {
            b = w.isDisplayed();
        }
        return b;
    }

    public void clickOnTabItem(String s) {
        for (WebElement w : itemDetailsPage.getTabItemsList()) {
            if (w.getText().contains(s)) {
                w.click();
            }
        }
    }

    public boolean isItemContainExpectedText(String s) {
        for (WebElement w : itemDetailsPage.getTabItemsList()) {
            if (w.getText().contains(s)) {
                return true;
            }
        }
        return false;
    }

    public int getItemPriceLabelNumbers() {
        return Integer.parseInt(itemDetailsPage.getItemPriceLabel().getText());
    }

    public boolean isCorrectPrice(int actualPrice, int maxPrice, int minPrice) {
        if (actualPrice >= minPrice && actualPrice <= maxPrice) {
            return true;
        }
        return false;
    }

    public boolean isColorMatchedToChoosing(String color) {
        return itemDetailsPage.getChoosingItemColor().getAttribute("title").contains(color);
    }

    public String getActualItemColor() {
        return itemDetailsPage.getChoosingItemColor().getAttribute("title");
    }
}
