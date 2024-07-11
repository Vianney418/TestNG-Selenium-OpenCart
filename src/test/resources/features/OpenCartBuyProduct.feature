@OpenCartBuyProduct


Feature: Product Purchase in OpenCart

  Scenario: Successful product purchase on the OpenCart page
    Given the user navigates to the OpenCart page "http://localhost/opencartsite"
    When user logs in with his username and password
    And the user is logged in
    Given the user returns to the home page
    When the user adds the products to the cart
    And the user navigates to the shopping cart page
#    And the user estimates the shipping cost with the following details:
#      | Country   | Region / State | Post Code |
#      | Chile     | Los Lagos      | 30001     |
#    And the user selects the flat rate shipping option
#    And the user navigates to the checkout page
#    And the user enters personal details and payment methods with the following details:
#      | First Name | Last Name | Address 1  | City         | Country | Post Code | Region / State |
#      | Vienna     | Gutierrez | Bombero 355| Puerto Montt | Chile   | 30001     | Los Lagos      |
#    And the user selects the payment method "Cash On Delivery"
#    And the user adds a comment to the order "Please deliver to the house with the grey gate, ring the bell"
#    And the user confirms the order
#    Then the user should see the order confirmation message "Your order has been placed!"
#    And the user completes the purchase process
#    And the user navigates to the order history
#    And the user views the order
#    Then the user should see the order description "Order History"
#    And the user ends their navigation on the page
