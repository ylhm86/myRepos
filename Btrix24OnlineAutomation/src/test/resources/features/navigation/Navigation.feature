@navigation
Feature: navigate module options
  Background:
    Given user is on the landing page

  Scenario Outline: Verify module title
    Given I log in as a "<user>"
    When I click a "<module>"
    Then the title should be "<title>"


    Examples: hr
    |user|module|title|
    |hr|Company|Company|
#    |hr|Tasks|My tasks|
#    |hr|Chat and Calls|Chat and Calls|
#    |hr|Workgroups|Workgroups and projects|
#    |hr|Drive|My Drive|
#    |hr|Contact Center|Contact Center|

    Examples: marketing
      |user|module|title|
      |marketing|Company| Company|
#      |marketing|Drive| My Drive|
#      |marketing|Contact Center|Contact Center|
#      |marketing|Tasks|My tasks|
#      |marketing|Chat and Calls|Chat and Calls|
#      |marketing|Workgroups|Workgroups and projects|