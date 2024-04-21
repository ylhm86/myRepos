Feature: My details

  Scenario: my information

    Given user on the login page
    And user logs using {string} and {string}
    When the user goes to the "my self" page
    Then user should be see their informations

      | name   | Ruthann Johnes    |
      | role   | student-team-lead |
      | batch  | #8                |
      | campus | VA                |

