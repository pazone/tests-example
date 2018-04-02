package allure.driver;

import org.junit.Rule;
import org.openqa.selenium.WebDriver;

/**
 * @author pazone
 *         02/04/18
 */
public class BasicWebdriverTest {

    @Rule
    public WebDriverRule webDriverRule = new WebDriverRule();

    protected WebDriver getDriver() {
        return webDriverRule.getDriver();
    }
}
