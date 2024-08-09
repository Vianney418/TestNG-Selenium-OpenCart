package stepDefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.EcommLoginValidationPage;

public class EcommLoginValidationSteps {
    EcommLoginValidationPage loginValidationPage = new EcommLoginValidationPage();

    @Given("user visits E-comm page {string}")
    public void starBrowser(String url) {loginValidationPage.starBrowser(url);}

    @When("the user goes to Login-Sign-up")
    public void goToLogin(){loginValidationPage.goToLogin();}

    @And("the user clicks on username and does not enter any data")
    public void inputUserName() {loginValidationPage.inputUserName();}

    @Then("the user will see the following message {string}")
    public void validateUsernameTxt(String txtExpectedResult) {
        Assert.assertEquals(txtExpectedResult, loginValidationPage.validateUsernameTxt());
    }

    @And("the user clicks on email and does not enter any data")
    public void inputEmail() {loginValidationPage.inputEmail();}

    @Then("the user will see this message {string}")
    public void validateEmailTxt(String txtExpectedResult) {
        Assert.assertEquals(txtExpectedResult, loginValidationPage.validateEmailTxt());
    }

    @And("the user clicks on password and does not enter any data")
    public void inputPassword() {loginValidationPage.inputPassword();}

    @Then("user will see the following message {string}")
    public void validatePasswordTxt(String txtExpectedResult) {
        Assert.assertEquals(txtExpectedResult, loginValidationPage.validatePasswordTxt());
    }

    @And("the user enters his username {string}")
    public void enterUsername(String txtUsername) {loginValidationPage.enterUsername(txtUsername);}

    @And("the user misspelled his email {string}")
    public void enterEmail(String txtEmail) {loginValidationPage.enterEmail(txtEmail);}

    @And("the user enters a 6-digit password {string}")
    public void enterPassword(String txtPassword) {loginValidationPage.enterPassword(txtPassword);}

    @And("the user enters his Email {string}")
    public void setCorrectEmail(String txtEmail2){loginValidationPage.setCorrectEmail(txtEmail2);}

    @And("the user enters his Password {string}")
    public void setCorrectPassword(String txtPassword2) {loginValidationPage.setCorrectPassword(txtPassword2);}
    @And("the user Logs in")
    public void setSignUpBtn() {loginValidationPage.setSignUpBtn();}

}
