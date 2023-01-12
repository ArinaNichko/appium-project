package net.testiteasy.steps.search;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.testiteasy.screens.search.SearchScreen;
import net.testiteasy.screens.search.SearchScreenObjectFactory;


public class SearchStepDefinitions {

  private final SearchScreen searchScreen = SearchScreenObjectFactory.get();

  @When("user type in search line {string}")
  public void userTypeInSearchLine(String searchInput) {
    searchScreen.clickOnSearchField();
    searchScreen.typeOnSearchLine(searchInput);
  }


  @Then("user follow find first ling that contains Automation for Apps")
  public void userFollowFindFirstLingThatContainsAutomationForApps() {
    searchScreen.clickOnFirstLink();
  }
}
