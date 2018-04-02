package allure.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementLocatorFactory;

import java.util.List;

import static org.openqa.selenium.support.PageFactory.initElements;

public class QueryPage extends HtmlElement {

    public QueryPage(WebDriver driver) {
        initElements(new HtmlElementDecorator(new HtmlElementLocatorFactory(driver)), this);
    }

    @FindBy(css = "input[name=q]")
    private HtmlElement queryInput;

    @FindBy(css="ul.sbsb_b li")
    private List<HtmlElement> suggestions;

    public HtmlElement getQueryInput() {
        return queryInput;
    }

    public List<HtmlElement> getSuggestions() {
        return suggestions;
    }
}
