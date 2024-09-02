package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.OpenCartWishListPage;

public class OpenCartWishListStep {
    OpenCartWishListPage wishListPage = new OpenCartWishListPage();


    @Given("User visits OpenCart page {string}")
    public void starBrowser(String url) {wishListPage.starBrowser(url);};
    @When("The user logs in with his username and password")
    public void userLogin() {wishListPage.userLogin();}
    @And("The user goes to the OpenCart home page")
    public void goToHome() {wishListPage.goToHome();}
    @And("The user adds several items to his wish list")
    public void selectProducts() {wishListPage.selectProducts();}
    @And("the user navigates to his wish list")
    public void getWishList() {wishListPage.getWishList();}
}
