@UserLoginOpenCart


Feature: User Login in OpenCart

  Scenario: Successful login with valid credentials
    Given the user is directed to the main page of OpenCart "https://demo.opencart.com/index.php?route=account/logout&language=en-gb"
    When the user navigate to the my account on Login
    And the user fills out the login form with the following details:
      | E-Mail Address          | Password     |
      | medicenney3@gmail.com   | 22333418Vian |
    And the user logs in
    Then the user should see a message showing that he-she was logged in "My Account"



