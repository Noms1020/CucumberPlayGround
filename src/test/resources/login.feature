Feature: Login

  Scenario Outline: As a student I want to login to Ndosi website
    Given  I am in login page
    And I enter valid username <email>
    And I enter valid password <password>
    When I clik on login button
    Then I should be logged in successfully
    Examples:
      | email          | password   |
      | noms@gmail.com | Password@2 |
