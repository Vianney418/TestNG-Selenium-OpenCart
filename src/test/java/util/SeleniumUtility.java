package util;

import drivers.WebDrivers;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SeleniumUtility {

    public WebDriver driver = null;

    WebDrivers webDrivers;
    protected Actions actions;

    public SeleniumUtility() {
        webDrivers = new WebDrivers();

        driver = webDrivers.createAndGetDriver();
        PageFactory.initElements(driver, this);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        actions = new Actions(driver);
    }

    protected void waitForVisibleElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(element));
    }


    protected void waitForClickeableElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void scrollToElement(WebElement webElement, int yOffset) {
        int elementPosition = webElement.getLocation().getY();
        int offsetPosition = elementPosition - yOffset;
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, arguments[0]);", offsetPosition);
    }




}
