@LoginValidation


  Feature: User registration and data validation.

    Scenario: Check that the form has data validation
      When user visits E-comm page "http://localhost:4200/"
      Given the user goes to Login-Sign-up
      And the user clicks on username and does not enter any data
      Then the user will see the following message "Name shoud not be empty"
      And the user clicks on email and does not enter any data
      Then the user will see this message "Email shoud not be empty & Valid email"
      And the user clicks on password and does not enter any data
      Then user will see the following message "Password shoud not be empty & Password >= 6"






    Scenario: Fill out the form with incorrect information to verify data validations.
        When user visits E-comm page "http://localhost:4200/"
        Given the user goes to Login-Sign-up
        And the user enters his username "Sienna25"
        And the user misspelled his email "siennagmail.com"
        Then the user will see this message "Email shoud not be empty & Valid email"
        And the user enters a 6-digit password "1234"
        Then user will see the following message "Password shoud not be empty & Password >= 6"




    Scenario: User registration with valid data
      When user visits E-comm page "http://localhost:4200/"
      Given the user goes to Login-Sign-up
      And the user enters his username "Sienna25"
      And the user enters his Email "sienna@gmail.com"
      And the user enters his Password "12345678"
      And the user Logs in
