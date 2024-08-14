@BuyProducts


  Feature: purchase of products

    Scenario: Product selection validation and purchasing process
      When user visit E-comm page "http://localhost:4200/"
      Given the user selects multiple products
      And the user goes to shopping cart
      And the user click on click here
      And the user enters his data:
        | Enter email          | Enter password  |
        | sienna@gmail.com     | 12345678        |
      And the user goes to shopping cart
      And the user click on check out
      And the user enter your shipping information:
         | Enter email                | Address                  | Number  |
         | sienna@gmail.com     | bombero guillermo grebe  | 355     |
      Then the user will see this Message "My Orders"