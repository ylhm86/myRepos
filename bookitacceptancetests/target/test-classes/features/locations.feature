Feature: campus location

  @wip
  Scenario: VA -  dark side
    Given user on the login page
    When user logs using "" and ""
    Then location should be " dark-side"
