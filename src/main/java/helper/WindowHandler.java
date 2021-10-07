package helper;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WindowHandler {

    public static void scrollToWebElement(WebElement element, int x, int y, WebDriver driver) {
        String code = "window.scroll(" + (element.getLocation().x + x) + "," + (element.getLocation().y + y) + ");";
        ((JavascriptExecutor) driver).executeScript(code, element, x, y);
    }

    public static void scrollToListWebElement(List<WebElement> list, int x, int y, WebDriver driver) {
        for (WebElement w : list) {
            String code = "window.scroll(" + (w.getLocation().x + x) + "," + (w.getLocation().y + y) + ");";
            ((JavascriptExecutor) driver).executeScript(code, w, x, y);
        }
    }
}
