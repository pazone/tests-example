package allure.driver;

import org.junit.rules.ExternalResource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import static allure.driver.Config.getBrowserCapabilities;

/**
 * @author pazone
 *         02/04/18
 */
public class WebDriverRule extends ExternalResource {

    private static final String LOCAL_GRID = "http://localhost:4444/wd/hub";
    private static final String INVALID_SELENIUM_GRID_URL = "Invalid Selenium grid URL";
    private WebDriver driver;

    @Override
    protected void before() {
        try {
            this.driver = new RemoteWebDriver(new URL(LOCAL_GRID), getBrowserCapabilities());
        } catch (MalformedURLException e) {
            throw new RuntimeException(INVALID_SELENIUM_GRID_URL, e);
        }
    }

    @Override
    protected void after() {
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
