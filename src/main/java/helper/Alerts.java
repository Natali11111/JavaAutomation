package helper;

import driver.DriverManager;
import org.openqa.selenium.NoAlertPresentException;

public class Alerts {

    public static void closeTheDialogWindow() {
        try {
            DriverManager.getInstance().getDriver().switchTo().alert().dismiss();
        } catch (NoAlertPresentException e) {
            e.printStackTrace();
        }
    }

}
