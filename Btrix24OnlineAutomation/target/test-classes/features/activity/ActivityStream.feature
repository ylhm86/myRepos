
  Feature: As a user I should be able to create a task from activity stream
  Background: user is on the landing page

    @task1
    Scenario Outline: Verify that user can create new task by clicking on tasks on activity stream
      Given user logs in with following credentials
        | username | <username> |
        | password | <password> |

      When user clicks on task button

      Examples:
      | username                       | password |
      | helpdesk27@cybertekschool.com  | UserUser |
      | helpdesk28@cybertekschool.com  | UserUser |
      | marketing27@cybertekschool.com | UserUser |
      | marketing28@cybertekschool.com | UserUser |
      | hr27@cybertekschool.com        | UserUser |
      | hr28@cybertekschool.com        | UserUser |


