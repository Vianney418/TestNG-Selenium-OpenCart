package pages;

import org.apache.http.conn.util.PublicSuffixList;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.SeleniumUtility;

public class EcommLoginValidationPage extends SeleniumUtility {


    @FindBy(xpath = "//a[@routerlink='/user-auth'][contains(.,'Login/Sign-up')]")
    WebElement  loginBtn;
    @FindBy(name = "name")
    WebElement userNameInput;
    @FindBy(name = "email")
    WebElement emailInput;
    @FindBy(name = "password")
    WebElement passwordInput;
    @FindBy(xpath = "//p[@class='error-handle'][contains(.,'Name shoud not be empty')]")
    WebElement errorMessageTxt1;
    @FindBy(xpath = "//p[@class='error-handle'][contains(.,'Email shoud not be empty & Valid email')]")
    WebElement errorMessageTxt2;
    @FindBy(xpath = "//p[@class='error-handle'][contains(.,'Password shoud not be empty & Password >= 6')]")
    WebElement errorMessageTxt3;
    @FindBy(xpath = "//button[@type='submit'][contains(.,'Sign Up')]")
    WebElement signUpBtn;

    public void starBrowser(String url) {driver.get(url);}

    public void goToLogin(){
        loginBtn.click();
    }

    public void inputUserName(){
        userNameInput.click();
        emailInput.click();
    }

    public String validateUsernameTxt() {
        waitForVisibleElement(errorMessageTxt1);
        return errorMessageTxt1.getText();
    }

    public void inputEmail() {
        emailInput.click();
        userNameInput.click();
    }

    public String validateEmailTxt() {
        waitForVisibleElement(errorMessageTxt2);
        return errorMessageTxt2.getText();
    }

    public void inputPassword() {
        passwordInput.click();
        emailInput.click();
    }

    public String validatePasswordTxt() {
        waitForVisibleElement(errorMessageTxt3);
        return errorMessageTxt3.getText();
    }

    public void enterUsername(String txtUsername){
        userNameInput.click();
        userNameInput.sendKeys(txtUsername);
    }

    public void enterEmail(String txtEmail){
        emailInput.click();
        emailInput.sendKeys(txtEmail);
        passwordInput.click();
    }

    public void enterPassword(String txtPassword){
        passwordInput.click();
        passwordInput.sendKeys(txtPassword);
        emailInput.click();
    }

    public void  setCorrectEmail(String txtEmail2){
        emailInput.click();
        emailInput.sendKeys(txtEmail2);
        passwordInput.click();
    }

    public void setCorrectPassword(String txtPassword2){
        passwordInput.click();
        passwordInput.sendKeys(txtPassword2);
    }

    public void setSignUpBtn(){
        signUpBtn.click();
    }
}
