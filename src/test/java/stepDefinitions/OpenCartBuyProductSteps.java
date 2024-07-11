package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import pages.OpenCartBuyProductPage;

public class OpenCartBuyProductSteps {

    OpenCartBuyProductPage buyProductPage = new OpenCartBuyProductPage();

    @Given("the user navigates to the OpenCart page {string}")
    public void starBrowser(String url) {buyProductPage.starBrowser(url);}

    @When("user logs in with his username and password")
    public void userLoginTest() {buyProductPage.userLoginTest();}

    @And("the user is logged in")
    public void submitLogin(){buyProductPage.submitLogin();}

    @Given("the user returns to the home page")
    public void retunsHomePage() {
        buyProductPage.retunsHomePage();
    }

    @When("the user adds the products to the cart")
    public void sendProductsToCart() {buyProductPage.sendProductsToCart();}

    @And("the user navigates to the shopping cart page")
    public void browseShoppingCart() {buyProductPage.browseShoppingCart();}
}
