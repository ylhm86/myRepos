
Feature: Home page

  As a user, when I entered correct login information,
  I should be able to login

  Background:
    Given user on the login page


  @leader @wip
  Scenario: login as team lead
    Given user on the login page
    When user logs as a team lead
    Then homepage should be displayed
    And the title should be correct


    @member
    Scenario: login as team member
      Given user on the login page
      When user logs as a team member
      Then homepage should be displayed
      And the Ylham must be understand