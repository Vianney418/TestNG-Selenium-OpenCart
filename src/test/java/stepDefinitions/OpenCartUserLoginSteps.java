package stepDefinitions;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.OpenCartUserLoginPage;

public class OpenCartUserLoginSteps {

    OpenCartUserLoginPage userLoginPage = new OpenCartUserLoginPage();

    @Given("the user is directed to the main page of OpenCart {string}")
    public void starBrowser(String url) {userLoginPage.starBrowser(url);}

    @When("the user navigate to the my account on Login")
    public void userLogin() {userLoginPage.userLogin();}

    @And("the user fills out the login form with the following details:")
    public void loginFom(DataTable dataTable) {userLoginPage.loginFom(dataTable);}

    @And("the user logs in")
    public void clickOnLoginBtn() {userLoginPage.clickOnLoginBtn();}

    @Then("the user should see a message showing that he-she was logged in {string}")
    public void ValidateLogInTxt(String txtResultadoEsperado){
        Assert.assertEquals(txtResultadoEsperado, userLoginPage.ValidateLogInTxt());
    }


}
