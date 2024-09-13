package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.EcommBuyProductsPage;

public class EcommBuyProductsSteps {
    EcommBuyProductsPage buyProductsPage = new EcommBuyProductsPage();


    @Given("user visit E-comm page {string}")
    public void starBrowser(String url) {buyProductsPage.starBrowser(url);}
    @When("the user selects multiple products")
    public void selectedProductsXCart() {buyProductsPage.selectedProductsXCart();}
    @And("the user goes to shopping cart")
    public void cartBtn() {buyProductsPage.cartBtn();}
    @And("the user click on click here")
    public void clickHere(){buyProductsPage.clickHere();}
    @And("the user enters his data:")
    public void userLoginForm(DataTable dataTable) {buyProductsPage.userLoginForm(dataTable);}
    @And("the user click on check out")
    public void verifyPayment() {buyProductsPage.verifyPayment();}
    @And("the user enter your shipping information:")
    public void addShippingAddress(DataTable dataTable) {buyProductsPage.addShippingAddress(dataTable);}
    @Then("the user will see this Message {string}")
    public void validateMyOrderTxt(String txtExpectedResult) {
        Assert.assertEquals(txtExpectedResult, buyProductsPage.validateMyOrderTxt());
    }
}


