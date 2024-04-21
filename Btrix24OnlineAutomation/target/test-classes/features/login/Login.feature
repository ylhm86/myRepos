@BTX

Feature: Login
  As user I want to login under different roles

  Background:
    Given user is on the landing page

  @helpdesk
  Scenario: Login as a helpdesk
    Then user logs in as a helpdesk
    And user verifies that "Portal" page name is displayed
    Then user quits

  @marketing
  Scenario: Login as a marketing
    Then user logs in as a marketing
    And user verifies that "Portal" page name is displayed
    Then user quits

  @hr
  Scenario: Login as a hr
    Then user logs in as a hr
    And user verifies that "Portal" page name is displayed
    Then user quits

