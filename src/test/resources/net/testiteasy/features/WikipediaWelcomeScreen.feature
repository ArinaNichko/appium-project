@smoke
Feature: Wikipedia welcome screen

  As a regular user of the Wikipedia application, I want to be able to see the Welcome screen.

  @smoke
  @regression
  Scenario: Open application on the welcome screen
    Given user open application
    When welcome screen ready
    Then user can see Explore icon


  @smoke
  @regression
  Scenario: Check list icon
    Given user open application
    When welcome screen ready
    Then user can see List icon

  @smoke
  @regression
  Scenario: User enter the word Appium in the search field
  and follow the first link that contains the text - Automation for Apps
    Given user open application
    When welcome screen ready
    When user tap on the search field
    When user type in search line "Appium"
    Then user follow find first ling that contains Automation for Apps


