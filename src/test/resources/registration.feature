Feature:  Create Account Registration

  Scenario Outline: As a student I want to register to Ndosi TestAutomation Website
    Given the user is on the "Create Your Account" registration screen
    When the user enters  First Name <firstName>
    And the user enters Last Name <lastName>
    And the user enters  Email <email>
    And the user enters  Password <password>
    And the user re-enters Password  to Confirm Password <ConfirmPassword>
    And the user selects QA Group from the Group dropdown <group>
    And the user clicks the Create Account button
    Then the account should be created successfully
    Examples:
      | firstName | lastName | email          | password   | ConfirmPassword | group                 |
      | Musa      | Mdhluli  | Musa@gmail.com | Password@3 | Password@3      | 1st Group 2026 (2026) |