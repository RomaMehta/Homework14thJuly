Feature: User wants to log-in OrangeHRM successfully.

  Scenario: User should be able to log-in with valid credentials.
    Given user is on OrangeHRM login page
      And enters URL as 'https://opensource-demo.orangehrmlive.com/'.
    When user enters valid username as 'Admin'
      And enters valid password as 'admin123'
      And user clicks on login button.
    Then user should be logged in and able to see welcome message.

  Scenario Outline: User should not be able to log-in with invalid credentials.
    Given user is on OrangeHRM login page
      And enters URL as 'https://opensource-demo.orangehrmlive.com/'.
    When user enters username as <Username>
      And enters password as <Password>
      And user clicks on login button.
    Then user should not be logged in
      And user should see an error message.
    Examples:
      | Username | Password |
      | invalid  | invalid  |
      | invalid  | valid    |
      | valid    | invalid  |
      |          | valid    |
      |          | invalid  |
      | valid    |          |
      | invalid  |          |