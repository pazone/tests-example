package allure.driver;

import org.openqa.selenium.remote.DesiredCapabilities;

import static org.apache.commons.lang3.StringUtils.isBlank;

/**
 * @author pazone
 *         02/04/18
 */
public class Config {

    public static DesiredCapabilities getBrowserCapabilities() {
        String name = System.getenv("BROWSER");
        String version = System.getenv("VERSION");
        if (isBlank(version)) {
            throw new IllegalArgumentException("VERSION environment variable must be set");
        }
        if (isBlank(name)) {
            throw new IllegalArgumentException("BROWSER environment variable must be set");
        }
        return BrowsersCapabilities.fromEnv(name, version).getCapabilities();
    }
}
