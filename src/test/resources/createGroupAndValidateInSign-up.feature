Feature: Create Group and Validate in Sign-up

  Scenario Outline: As an admin I want to create a group and validate it appears in the sign-up dropdown

    Given the admin is on the login page
    And the admin enters email <email>
    And the admin enters password <password>
    And the admin clicks the login button
    When the admin clicks on the user menu
    And the admin clicks on Admin Panel
    And the admin clicks on Groups in the sidebar
    And the admin clicks on Create New Group button
    And the admin enters group name <groupName>
    And the admin enters group description <description>
    And the admin enters group year <year>
    And the admin enters max capacity <maxCapacity>
    And the admin enters start date <startDate>
    And the admin enters end date <endDate>
    And the admin clicks the Create Group button
    Then the admin clicks on the user menu to logout
    And the admin clicks Logout
    And the user navigates to the sign-up page
    Then the group <groupName> with year <year> should be visible in the group dropdown

    Examples:
      | email          | password   | groupName                 | description                          | year | maxCapacity | startDate  | endDate    |
      | noms@gmail.com | Password@2 | Cucumber First Group 2026 | Cucumber assessment first group 2026 | 2026 | 100         | 2026/05/20 | 2026/12/31 |

