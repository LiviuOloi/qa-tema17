Feature: Login functionality
As a user
I want to login to the application
So that I can access protected features


Scenario Outline: Login attempt fail
  Given I am on the login page
  When I login with username "<user>" and password "<pass>"
  Then I should see "<result>"

  Examples:
    | user | pass | result |
    | admin@admin.com | wrong | Email or password was incorrect |

  Scenario: Login attempt success
    Given I am on the login page
    When I login with username "liviu.oloi@yahoo.com" and password "Poli1993!"
    Then I should see "Success"

