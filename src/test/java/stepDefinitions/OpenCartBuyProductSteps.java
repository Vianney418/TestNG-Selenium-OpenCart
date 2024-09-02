package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import pages.OpenCartBuyProductPage;

import javax.xml.crypto.Data;

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
    public void searchProduct() {buyProductPage.searchProduct();}

    @And("the user navigates to the shopping cart page")
    public void browseShoppingCart() {buyProductPage.browseShoppingCart();}

    @And("the user estimates the cost of shipping to Chile")
    public void estimateShippingTaxes() {buyProductPage.estimateShippingTaxes();}

    @And("the user navigates to the checkout page")
    public void continueWithCheckout() {buyProductPage.continueWithCheckout();}

    @And("the user enters personal details and payment methods with the following details:")
    public void formShippingAddress(DataTable dataTable) {buyProductPage.formShippingAddress(dataTable);}
}
