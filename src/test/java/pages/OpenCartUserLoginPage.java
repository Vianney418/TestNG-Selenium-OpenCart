package pages;

import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.SeleniumUtility;

import java.util.List;
import java.util.Map;

public class OpenCartUserLoginPage extends SeleniumUtility {


    @FindBy(xpath = "//a[@class='dropdown-toggle'][contains(.,'My Account')]")
    WebElement myAccountBtn;

    @FindBy(xpath = "//a[contains(.,'Login')]")
    WebElement loginBtn;

    @FindBy(id = "input-email")
    WebElement inputEmail;

    @FindBy(id = "input-password")
    WebElement inputPassword;

    @FindBy(xpath = "//button[@type='submit'][contains(.,'Login')]")
    WebElement getLoginBtn;

    @FindBy(xpath = "//h2[contains(.,'My Account')]")
    WebElement myAccountTxt;


    public void starBrowser(String url) {driver.get(url);}

    public void userLogin(){
        myAccountBtn.click();
        loginBtn.click();
    }

    public void loginFom(DataTable dataTable){
        List<Map<String, String>> loginDetails = dataTable.asMaps(String.class, String.class);
        for (Map<String ,String> details : loginDetails){
            inputEmail.sendKeys(details.get("E-Mail Address"));
            inputPassword.sendKeys(details.get("Password"));
        }
    }

    public void clickOnLoginBtn(){
        getLoginBtn.click();
    }

    public String ValidateLogInTxt(){
        waitForElement(myAccountTxt);
        return myAccountTxt.getText();
    }
}
