@OpenCartRegister



Feature: User register in OpenCart

  Scenario: User register in OpenCart
    Given the user is on the main page of OpenCart "https://demo.opencart.com/index.php?route=account/logout&language=en-gb"
    When the user click on My Account
    And the user click on Register
    And the user click on First Name and write your name "Vienna"
    And the user click on Last Name and write your last name "Gutierrez"
    And the user click on e-mail and write your email "medicenney2@gmail.com"
    And the user click on password and whrite your password "22333418Vian"
    And the user click on button 'I have read and agree to the Privacy Policy'
    And the user click on button Continue
    Then validate that the post registration text is "Your Account Has Been Created!"
    And the user logout
    Then validate that the post LogOut text is "Account Logout"
