Feature: login functionality


  @wip
  Scenario: team member login
    Given user on the login page
    When user logs using "myemail@gmail.com" and "regularpassword"
    Then homepage should be displayed
    And the title should be "homepage"
    And there should be 44 menu options




  @wip
  Scenario: team leader login
    Given user on the login page
    When user logs using "myemail@hotmail.com" and "securepassword"
    Then homepage should be displayed
    And the title should be "homepage"
   # And there should be 4 menu options