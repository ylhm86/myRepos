Feature: Map page details

  @wip
  Scenario: Light side rooms - ping pong
    Given user on the login page
    When user logs using "storemanager" and "UserUser123"
    Then I should be able to see "ping pong" room

    @Scenario:
    Given user on the login page
    When user logs using "storemanager" and "UserUser123"
    Then I should be able to see "ping pong" room
