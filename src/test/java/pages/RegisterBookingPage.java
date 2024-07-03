package pages;

import net.bytebuddy.pool.TypePool;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.SeleniumUtility;

public class RegisterBookingPage extends SeleniumUtility {

    @FindBy(xpath = "//a[@aria-label='Crear una cuenta']")
    private WebElement makeAccountBtn;

    @FindBy(xpath = "//button[contains(@class, 'bf33709ee1') and @aria-label='Ignorar información sobre el inicio de sesión.']")
    private WebElement ignoreBtn;

    @FindBy(id = "username")
    private WebElement emailInput;

    @FindBy(xpath = "//button[@type='submit'][contains(.,'Continuar con e-mail')]")
    private WebElement continuebtn;

    @FindBy(xpath = "//input[contains(@name,'new_password')]")
    private WebElement passwordInput;

    @FindBy(xpath = "//input[contains(@name,'confirmed_password')]")
    private WebElement confirmedPasswordInput;

    @FindBy(xpath = "//button[@type='submit'][contains(.,'Crear una cuenta')]")
    private WebElement createAccountbtn;

    @FindBy(xpath = "//button[@type='button'][contains(.,'¡Entendido!')]")
    private WebElement buttonEntendido;


    public void startBrowser(String url) {
        driver.get(url);
    }

    public void createAccount(){
        ignoreBtn.click();
        makeAccountBtn.click();
    }

    public void enterEmail(String txtEmail){
        emailInput.click();
        emailInput.sendKeys(txtEmail);
        continuebtn.click();
    }

    public void enterPassword(String txtPassword1){
        waitForElement(passwordInput);
        passwordInput.click();
        passwordInput.sendKeys(txtPassword1);
    }

    public void confirmedPassword(String txtPassword2){
        confirmedPasswordInput.click();
        confirmedPasswordInput.sendKeys(txtPassword2);
    }

    public void setCreateAccountbtn(){
        createAccountbtn.click();
    }

    public void closePopOut() {
        waitForElement(buttonEntendido);
        buttonEntendido.click();
    }
}
