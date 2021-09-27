package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static constants.PropertyConstants.CHROME_DRIVER;
import static constants.PropertyConstants.DRIVER_PATH;

public class DriverManager {

    private static final DriverManager INSTANCE = new DriverManager();
    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static DriverManager getInstance() {
        return INSTANCE;
    }

    public DriverManager createWebDriver() {
        System.setProperty(CHROME_DRIVER, DRIVER_PATH);
        driver.set(new ChromeDriver());
        return this;
    }

    public WebDriver getDriver() {
        return driver.get();
    }
}
