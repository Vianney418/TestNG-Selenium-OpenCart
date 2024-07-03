package stepDefinitions;

import pages.GoogleSearchHomePage;
import pages.GoogleSearchResultsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSteps {

    GoogleSearchHomePage googleSearchHomePage = new GoogleSearchHomePage();
    GoogleSearchResultsPage googleSearchResultsPage = new GoogleSearchResultsPage();

    @Given("User navigates to Google home page")
    public void userNavigatesToGoogleHomePage() {
        googleSearchHomePage.launchUrl("https://www.google.com/");
    }

    @When("User enters {string} in Google searchbox")
    public void userEntersTextInGoogleSearchBox(String searchText) {
        googleSearchHomePage.entersTextInGoogleSearch(searchText);
    }

    @And("User clicks on search button")
    public void userClicksOnSearchButton() {
        googleSearchHomePage.clickOnGoogleSearchBtn();
    }

    @Then("Retrieve the first Google search result")
    public void retrieveTheFirstGoogleSearchResult() {
        googleSearchResultsPage.getFirstGoogleSearchResult();
    }
}
