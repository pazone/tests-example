package allure;

import allure.driver.BasicWebdriverTest;
import allure.steps.GoogleSteps;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GoogleSuggestTest extends BasicWebdriverTest {

    private GoogleSteps steps;

    @Before
    public void setUp() throws Exception {
        steps = new GoogleSteps(getDriver());
    }

    @Test
    public void searchSuggestionsShouldBeVisible() throws Exception {
        steps.goToGoogle();
        steps.typeQuery("why testing is ");
        steps.verifySuggestion();
    }

    @Test
    public void suggestionsShouldContainThePyramid() throws Exception {
        steps.goToGoogle();
        steps.typeQuery("testing automation");
        steps.verifySuggestion();
    }
}
