package allure.driver;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Arrays;
import java.util.Optional;

/**
 * @author pazone
 *         02/04/18
 */
public enum BrowsersCapabilities {

    FIREFOX58("firefox", "58"),
    FIREFOX57("firefox", "57"),
    CHROME63("chrome", "63"),
    CHROME62("chrome", "62");

    BrowsersCapabilities(String name, String version) {
        this.name = name;
        this.version = version;
    }

    private String name;
    private String version;

    public DesiredCapabilities getCapabilities() {
        return new DesiredCapabilities(name, version, Platform.ANY);
    }

    public static BrowsersCapabilities fromEnv(final String name, final String version) {
        Optional<BrowsersCapabilities> capabilities = Arrays.stream(BrowsersCapabilities.values())
                .filter(caps -> caps.name.equals(name) && caps.version.equals(version))
                .findFirst();

        if (!capabilities.isPresent()) {
            throw new IllegalArgumentException(String.format("Unknown browsers %s %s", name, version));
        }

        return capabilities.get();

    }

}
