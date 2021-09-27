package pages;

import driver.DriverManager;
import org.openqa.selenium.WebDriver;

public class PageObject {

    protected WebDriver driver = DriverManager.getInstance().getDriver();
}
