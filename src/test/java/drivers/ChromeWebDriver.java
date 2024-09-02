package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ChromeWebDriver {

    WebDriver driver;

    public WebDriver initializeAndGetChromeDriver() {
        try {
            System.setProperty("webdriver.chrome.driver", (new File(System.getProperty("user.dir") + "/src/test/resources/chromedriver").getCanonicalPath()));

            System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, (new File(System.getProperty("user.dir") + "/src/test/resources/chromedriver").getCanonicalPath()));
//            ChromeDriverService service = ChromeDriverService.createDefaultService();
//            service.start();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            options.addArguments("--test-type");
            options.addArguments("--disable-extensions");
            options.addArguments("--disable-notifications");
            options.addArguments("--incognito");
            options.addArguments("--ignore-certificate-errors");
            options.addArguments("--disable-popup-blocking");
            options.addArguments("--allow-running-insecure-content");
            options.addArguments("--disable-translate");
            options.addArguments("--always-authorize-plugins");
            options.addArguments("--disable-infobars");
            options.addArguments("--enable-automation");
            /*options.setExperimentalOption("useAutomationExtension", false);
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(ChromeOptions.CAPABILITY, options);
            options.merge(capabilities);*/

            driver = new ChromeDriver(options);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return driver;
    }

}
