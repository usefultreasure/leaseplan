package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.*;

public class SearchStepDefinitions {

    @When("he calls endpoint {string}")
    public void heCallsEndpoint(String arg0) {
        SerenityRest.given().get(arg0);
    }

    @Then("he does not see the results")
    public void he_Does_Not_See_The_Results() {
        restAssuredThat(response -> response.statusCode(404));
        restAssuredThat(response -> response.body("detail.error", is(true)));
    }

    @Then("he sees the results displayed for {string}")
    public void heSeesTheResultsDisplayedFor(String arg0) {
        restAssuredThat(response -> response.statusCode(200));
        restAssuredThat(response -> response.body("title", hasItem(containsString(arg0))));
    }
}
