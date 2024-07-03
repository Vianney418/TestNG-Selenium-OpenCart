package pages;

import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.SeleniumUtility;

import java.util.List;
import java.util.Map;

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

    public void userBrowsePageRegistration(){
        btnMyAccount.click();
        btnRegister.click();
    }


    public void fillRegistrationForm(DataTable dataTable){
        List<Map<String,String>> registrationDetails =dataTable.asMaps(String.class, String.class);
        for (Map<String, String> details : registrationDetails) {
            inputFirstName.sendKeys(details.get("First Name"));
            inputLastname.sendKeys(details.get("Last Name"));
            inputEmail.sendKeys(details.get("Email"));
            inputPassword.sendKeys(details.get("Password"));
        }
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
