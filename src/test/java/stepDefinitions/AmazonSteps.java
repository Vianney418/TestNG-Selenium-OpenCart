package stepDefinitions;

import pages.AmazonHomePage;
import pages.AmazonSearchResultsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonSteps {

    AmazonHomePage amazonHomePage = new AmazonHomePage();
    AmazonSearchResultsPage amazonSearchResultsPage = new AmazonSearchResultsPage();

    @Given("User navigates to Amazon home page")
    public void userNavigatesToAmazonHomePage() {
        amazonHomePage.launchUrl("https://www.amazon.in/");
    }

    @When("User searches for {string} in Amazon")
    public void userPerformsAmazonSearch(String productName) {
        amazonHomePage.searchProductsOnAmazon(productName);
    }

    @Then("Retrieve the first Amazon search result")
    public void retrieveTheFirstAmazonSearchResult() {
        amazonSearchResultsPage.getFirstAmazonSearchResult();
    }
}
