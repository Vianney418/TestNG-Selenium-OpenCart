package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import org.testng.Assert;
import pages.OpenCartRegisterPage;

public class OpenCartRegisterSteps {

    OpenCartRegisterPage registerUserPage = new OpenCartRegisterPage();

    @Given("the user is on the main page of OpenCart at {string}")
    public void startBrowser (String url) {registerUserPage.startBrowser(url);}

    @When("the user navigates to the registration page")
    public void userBrowsePageRegistration () {registerUserPage.userBrowsePageRegistration();}

    @And("the user fills out the registration form with the following details:")
    public void fillRegistrationForm (DataTable dataTable) {registerUserPage.fillRegistrationForm(dataTable);}

    @And("the user agrees to the Privacy Policy")
    public void inputRadio () {registerUserPage.inputRadio();}

    @And("the user submits the registration form")
    public void onClickContinue () {registerUserPage.onClickContinue();}

    @Then("the user should see the registration confirmation message {string}")
            public void validateCreatedAccountText(String txtResultadoEsperado){
        Assert.assertEquals(txtResultadoEsperado,  registerUserPage.validateCreatedAccountText());
    }

    @And("the user logs out")
    public void userLogOut () {registerUserPage.userLogOut();}

    @Then("the user should see the logout confirmation message {string}")
    public void validateAccountLogOutTxt(String txtResultado){
        Assert.assertEquals(txtResultado,  registerUserPage.validateAccountLogOutTxt());
    }
}
