package net.testiteasy.steps.search;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.testiteasy.screens.search.SearchScreen;
import net.testiteasy.screens.search.SearchScreenObjectFactory;

import static org.junit.Assert.assertEquals;


public class SearchStepDefinitions {

  private final SearchScreen searchScreen = SearchScreenObjectFactory.get();

  @When("user type in search line {string}")
  public void userTypeInSearchLine(String searchInput) {
    searchScreen.typeOnSearchLine(searchInput);
  }


  @Then("user follow find first link that contains {string}")
  public void userFollowFindFirstLinkThatContains(String text) {
    searchScreen.clickOnFirstLink();
    assertEquals(searchScreen.getTextFromFirstLink(), text);
  }
}
