package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.SeleniumUtility;

public class OpenCartRegisterPage extends SeleniumUtility {


    @FindBy(xpath = "//a[@class='dropdown-toggle'][contains(.,'My Account')]")
    WebElement btnMyAccount;

    @FindBy(xpath = "//a[contains(.,'Register')]")
    WebElement btnRegister;

    @FindBy(id = "input-firstname")
    WebElement inputFirstName;

    @FindBy(id = "input-lastname")
    WebElement inputLastname;

    @FindBy(id = "input-email")
    WebElement inputEmail;

    @FindBy(id = "input-password")
    WebElement inputPassword;

    @FindBy(name = "newsletter")
    WebElement btnInputRadio;

    @FindBy(xpath = "//input[contains(@type,'checkbox')]")
    WebElement inputCheckbox;

    @FindBy(xpath = "//button[@type='submit'][contains(.,'Continue')]")
    WebElement btnContinue;

    @FindBy(xpath = "//h1[contains(.,'Your Account Has Been Created!')]")
    WebElement createdAccountText;

    @FindBy(xpath = "//a[@class='dropdown-item' and @href='https://demo.opencart.com/index.php?route=account/logout&language=en-gb']")
    WebElement btnLogOut;

    @FindBy(xpath = "//h1[contains(.,'Account Logout')]")
    WebElement accountLogOutTxt;




    public void startBrowser(String url) {
        driver.get(url);
    }

    public void clickMyAccount(){
        btnMyAccount.click();
    }

    public void clickBtnRegister(){
        btnRegister.click();
    }

    public void setInputFirstName(String txtInputName){
        inputFirstName.click();
        inputFirstName.sendKeys(txtInputName);
    }

    public void setInputLastname(String txtInputLastname){
        inputLastname.click();
        inputLastname.sendKeys(txtInputLastname);
    }

    public void setInputEmail(String txtInputEmail){
        inputEmail.click();
        inputEmail.sendKeys(txtInputEmail);
    }

    public void setInputPassword(String txtInputPassword){
        inputPassword.click();
        inputPassword.sendKeys(txtInputPassword);
    }

    public void inputRadio() {
        btnInputRadio.click();
    }

    public void onClickContinue(){
        inputCheckbox.click();
        btnContinue.click();

    }

    public String validateCreatedAccountText(){
        waitForElement(createdAccountText);
        return createdAccountText.getText();
    }

    public void userLogOut(){
        waitForElement(createdAccountText);
        btnMyAccount.click();
        btnLogOut.click();
    }

    public String validateAccountLogOutTxt(){
        waitForElement(accountLogOutTxt);
        return accountLogOutTxt.getText();
    }

}
