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
protected WebDriverWait wait;
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
        wait = new WebDriverWait(driver, 10);
    }

    protected void waitForVisibleElement(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }


    protected void waitForClickeableElement(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }


    public void scrollToElement(WebElement webElement, int yOffset) {
        int elementPosition = webElement.getLocation().getY();
        int offsetPosition = elementPosition - yOffset;
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, arguments[0]);", offsetPosition);
    }



    public void scrollForVariableHeight() {
        try {
            long lastHeight = (long) ((JavascriptExecutor) driver).executeScript("return document.body.scrollHeight");

            while (true) {
                ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
                Thread.sleep(2000);

                long newHeight = (long) ((JavascriptExecutor) driver).executeScript("return document.body.scrollHeight");
                if (newHeight == lastHeight) {
                    break;
                }
                lastHeight = newHeight;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    protected void scrollToElementOnVariableHeight(WebElement element) {
        try {
            // Obtener la ubicación del elemento
            int elementPosition = element.getLocation().getY();

            long lastHeight = (long) ((JavascriptExecutor) driver).executeScript("return document.body.scrollHeight");

            while (true) {
                // Hacer scroll hasta la ubicación del elemento
                ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, " + elementPosition + ");");
                Thread.sleep(2000);

                // Obtener la nueva altura del documento
                long newHeight = (long) ((JavascriptExecutor) driver).executeScript("return document.body.scrollHeight");

                // Verificar si el elemento está en la vista
                boolean isElementInView = (Boolean) ((JavascriptExecutor) driver).executeScript(
                        "var element = arguments[0];" +
                                "var rect = element.getBoundingClientRect();" +
                                "return (rect.top >= 0 && rect.bottom <= window.innerHeight);",
                        element
                );

                if (isElementInView) {
                    break;
                }

                // Verificar si la altura del documento ha cambiado (para evitar bucles infinitos)
                if (newHeight == lastHeight) {
                    break;
                }
                lastHeight = newHeight;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
