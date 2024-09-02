@UserLoginOpenCart


Feature: User Login in OpenCart

  Scenario: Successful login with valid credentials
    Given the user is directed to the main page of OpenCart "http://localhost/opencartsite"
    When the user navigate to the my account on Login
    And the user fills out the login form with the following details:
      | E-Mail Address          | Password     |
      | medicenney13@gmail.com   | 22333418Vian |
    And the user logs in
    Then the user should see a message showing that he-she was logged in "My Account"