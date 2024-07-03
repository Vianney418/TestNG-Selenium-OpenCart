package pages;

import io.cucumber.java.Scenario;
import util.SeleniumUtility;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GoogleSearchHomePage extends SeleniumUtility {

    @FindBy(how = How.XPATH, using = "//textarea[@title='Buscar']")
    private WebElement SearchBar;
    @FindBy(how = How.XPATH, using = "//div[@class='FPdoLc lJ9FBc']//input[@value='Google Search']")
    private WebElement GoogleSearch_Btn;

    public void launchUrl(String url) {
        driver.get(url);
    }

    public void entersTextInGoogleSearch(String searchText) {
        SearchBar.sendKeys(searchText);
    }

    public void clickOnGoogleSearchBtn() {
        SearchBar.sendKeys(Keys.RETURN);
    }

}
