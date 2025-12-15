Feature: Profile search and edit

  Scenario Outline: Search user and open profile
    Given I am logged in with <user> and password <pass>
    When I search for user <username> with id <id>
    Then I should see the profile page for <username>
    Examples:
      | user     | pass     | username        | id |
      | "liviu.oloi@yahoo.com" | "Poli1993!" | "Liviu Oloi" | "liviu_oloi_3"|