package allure.steps;

import allure.elements.QueryPage;
import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

import static allure.driver.DriverUtil.screenshot;
import static allure.driver.DriverUtil.waitForVisibility;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

/**
 * @author pazone
 *         02/04/18
 */
public class GoogleSteps {

    private WebDriver driver;
    private QueryPage queryPage;

    public GoogleSteps(WebDriver driver) {
        this.driver = driver;
        this.queryPage = new QueryPage(driver);
    }

    @Step
    @Description("Open google.com")
    public void goToGoogle() {
        driver.get("http://google.com");
    }

    @Step
    @Description("Type '{}' to search bar")
    @Attachment(value = "Screenshot", type = "image/png")
    public void typeQuery(String query) {
        queryPage.getQueryInput().sendKeys(query);
        waitForVisibility(queryPage.getQueryInput(), driver);
        screenshot(driver);
    }

    @Step
    @Description("Suggestion verification")
    public void verifySuggestion() {
        assertThat(queryPage.getSuggestions()).isNotEmpty();
    }

}
