package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import org.testng.Assert;
import pages.OpenCartRegisterPage;

public class OpenCartRegisterSteps {

    OpenCartRegisterPage registerUserPage = new OpenCartRegisterPage();

    @Given("the user is on the main page of OpenCart {string}")
    public void startBrowser (String url) {registerUserPage.startBrowser(url);}

    @When("the user click on My Account")
    public void clickMyAccount () {registerUserPage.clickMyAccount();}

    @And("the user click on Register")
    public void clickBtnRegister () {registerUserPage.clickBtnRegister();}

    @And("the user click on First Name and write your name {string}")
    public void setInputFirstName (String txtInputName) {registerUserPage.setInputFirstName(txtInputName);}

    @And("the user click on Last Name and write your last name {string}")
    public void setInputLastname (String txtInputLastname) {registerUserPage.setInputLastname(txtInputLastname);}

    @And("the user click on e-mail and write your email {string}")
    public void setInputEmail (String txtInputEmail) {registerUserPage.setInputEmail(txtInputEmail);}

    @And("the user click on password and whrite your password {string}")
    public void setInputPassword (String txtInputPassword) {registerUserPage.setInputPassword(txtInputPassword);}

    @And("the user click on button 'I have read and agree to the Privacy Policy'")
    public void inputRadio () {registerUserPage.inputRadio();}

    @And("the user click on button Continue")
    public void onClickContinue () {registerUserPage.onClickContinue();}

    @Then("validate that the post registration text is {string}")
            public void validateCreatedAccountText(String txtResultadoEsperado){
        Assert.assertEquals(txtResultadoEsperado,  registerUserPage.validateCreatedAccountText());
    }

    @And("the user logout")
    public void userLogOut () {registerUserPage.userLogOut();}

    @Then("validate that the post LogOut text is {string}")
    public void validateAccountLogOutTxt(String txtResultado){
        Assert.assertEquals(txtResultado,  registerUserPage.validateAccountLogOutTxt());
    }
}
