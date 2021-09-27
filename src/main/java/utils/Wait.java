package utils;

import driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Wait {

  private  static WebDriverWait wait = new WebDriverWait(DriverManager.getInstance().getDriver(), 20);

    public static void waitElementToBeClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void waitVisibilityOf(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitVisibilityOfAllElementsList(List<WebElement> list) {
        wait.until(ExpectedConditions.visibilityOfAllElements(list));
    }

}
