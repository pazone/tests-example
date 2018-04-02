package allure;

import allure.driver.BasicWebdriverTest;
import allure.steps.GoogleSteps;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author pazone
 *         31/03/18
 */
public class GoogleSuggestTest extends BasicWebdriverTest {

    private GoogleSteps steps;

    @Before
    public void setUp() throws Exception {
        steps = new GoogleSteps(getDriver());
    }

    @Test
    public void searchSuggestions() throws Exception {
        steps.goToGoogle();
        steps.typeQuery("why testing is ");
        steps.verifySuggestion();
    }
}
