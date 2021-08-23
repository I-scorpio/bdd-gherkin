Feature: QA Assessment
  This is a test to develop automated tests for https://visp.net website. All of the following scenarios must be automated.

  Background:
    Given I open visp.net in Chrome browser

  Scenario: Verify different pricing options available
    When I go to pricing page
    Then I should see three pricing options i.e. '0 to 1000 subscribers', '1000+ subscribers', '5000+ subscribers'

  Scenario: Verify billing features
    When I go to Bill page
    Then I should billing features i.e. 'Fully automated invoice creation', 'Auto-credit card payment processing'

  Scenario: Verify ways of growth
    When I go to Grow page
    Then I should see three steps i.e. 'STREAMLINE', 'CONTROL', 'GROW'

  Scenario: Verify that app.visp.net can be launched from visp.net
    When I click on login
    Then httpsAppVispNetLoginIsOpenedInANewTab
    Then I can see Username, password, and Sign-in web elements
