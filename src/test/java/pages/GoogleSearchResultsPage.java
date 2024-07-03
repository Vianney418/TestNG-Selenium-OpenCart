package pages;

import util.SeleniumUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class GoogleSearchResultsPage extends SeleniumUtility {

    @FindBy(xpath = "//*[@id=\"search\"]")
    private WebElement googleSearch_Results;

    public void getFirstGoogleSearchResult() {
        Assert.assertNotNull(googleSearch_Results, "Google search result exists");
    }

}
