package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RegisterBookingPage;

public class RegisterBookingSteps {

    RegisterBookingPage registerBookingPage= new RegisterBookingPage();

    @Given("the user is on the main page of Booking {string}")
    public void startBrowser (String url) {registerBookingPage.startBrowser(url);}

    @When("the user click on Hazte una cuenta")
    public void createAccount () {registerBookingPage.createAccount();}

    @And("the user click on E-mail and write your email {string}")
    public void enterEmail (String txtEmail) {registerBookingPage.enterEmail(txtEmail);}

    @And("the user click on Contraseña and whrite your password {string}")
    public void enterPassword (String txtPassword1) {registerBookingPage.enterPassword(txtPassword1);}

    @And("the user confirm your password {string}")
    public void confirmedPassword(String txtPassword2) {registerBookingPage.confirmedPassword(txtPassword2);}

    @And("the user click on Crear una cuenta")
    public void setCreateAccountbtn () {registerBookingPage.setCreateAccountbtn();}

    @Then("the user click on button Entendido")
    public void closePopOut () {registerBookingPage.closePopOut();}

}
