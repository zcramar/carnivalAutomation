package org.carnival.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.carnival.questions.PriceFilter;
import org.carnival.tasks.OpenPage;
import org.openqa.selenium.WebDriver;
import org.carnival.questions.DurationOfEachCruise;
import org.carnival.questions.PricesSorted;
import org.carnival.questions.ResultGridStatus;
import org.carnival.tasks.ApplyPriceFilter;
import org.carnival.tasks.SearchCruiser;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class SearchCruiserStepDefinitions {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor actor = Actor.named("user");

    @Before
    public void setUp(){actor.can(BrowseTheWeb.with(hisBrowser));}

    @Given("the user is in the page")
    public void theUserIsInThePage() {
      actor.wasAbleTo(OpenPage.open(hisBrowser));
    }

    @When("they search a cruise")
    public void theySearchACruise() {
        actor.wasAbleTo(SearchCruiser.search(hisBrowser));
    }

    @Then("they should see the result grid")
    public void TheyShouldSeeTheResultGrid() {
        actor.should(seeThat(ResultGridStatus.validateGrid()));
    }

    @Then("all the results must have a duration between 6 and 9 days")
    public void AllTheResultsMustHaveADurationBetween6And9Days() {
        actor.should(seeThat(DurationOfEachCruise.displayed()));
    }

    @Then("they should see prices sorted in increasing order")
    public void TheyShouldSeePricesSortedInIncreasingOrder() {
        actor.should(seeThat(PricesSorted.displayed()));
    }

    @And("they displayed pricing filter")
    public void TheyDisplayedPricingFilter() {
        actor.wasAbleTo(ApplyPriceFilter.priceFilter(hisBrowser));
    }

    @Then("they should see that the results collection is adjusted by the filter values")
    public void TheyhSouldSeeThatTheResultsCollectionIsAdjustedByTheFilterValues() {
        actor.should(seeThat(PriceFilter.displayed()));
    }
}
