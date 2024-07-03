@UserLogin


Feature: User Login in OpenCart

  Scenario: Successful login with valid credentials
    Given the user is on the main page of OpenCart "https://demo.opencart.com/index.php?route=account/logout&language=en-gb"
    When the user click on My Account
    And the user click on Register