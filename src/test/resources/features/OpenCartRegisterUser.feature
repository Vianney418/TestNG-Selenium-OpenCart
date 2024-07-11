@OpenCartRegister



Feature: User register in OpenCart

  Scenario: Successful user registration in OpenCart
    Given the user is on the main page of OpenCart at "http://localhost/opencartsite"
    When the user navigates to the registration page
    And the user fills out the registration form with the following details:
      | First Name  | Last Name  | Email                  | Password        |
      | Vienna      | Gutierrez  | medicenney13@gmail.com  | 22333418Vian    |
    And the user agrees to the Privacy Policy
    And the user submits the registration form
    Then the user should see the registration confirmation message "Your Account Has Been Created!"
    And the user logs out
    Then the user should see the logout confirmation message "Account Logout"
