package allure.driver;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

/**
 * @author pazone
 *         02/04/18
 */
public class DriverUtil {

    public static byte[] screenshot(WebDriver driver) {
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }

    public static void waitForVisibility(HtmlElement element, WebDriver driver) {
        new WebDriverWait(driver, 3).until(d -> element.isDisplayed());
    }
}
