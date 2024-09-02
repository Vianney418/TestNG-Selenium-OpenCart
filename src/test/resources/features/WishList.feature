@WishListOpenCart

Feature: OpenCart page wishlist

  Scenario: Add and view products to the OpenCart page wishlist
    Given User visits OpenCart page "http://localhost/opencartsite"
    When The user logs in with his username and password
    And The user goes to the OpenCart home page
    And The user adds several items to his wish list
    And the user navigates to his wish list
#    And the user clicks to continue
#    Then The user should see the message "My Account"