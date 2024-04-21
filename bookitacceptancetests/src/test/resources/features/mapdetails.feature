Feature: Map page details

  @wip
  Scenario: Light side rooms - ping pong
    Given user on the login page
    When user logs using "storemanager" and "UserUser123"
    Then I should be able to see "all manage dashboards" room

    Scenario:Light side all rooms
    Given user on the login page
    When user logs using "storemanager" and "UserUser123"
    Then user should be able to see following conference rooms
      | harvard   |
      | yale      |
      | princeton |
      | standford |
      | duke      |
      | berkeley  |
      | ping pong |

      # shortcut to format file in intellij
  # CMD+Optinal+L mac
  # CMRT+ALT+L windows

