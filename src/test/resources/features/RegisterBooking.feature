@RegisterBooking



Feature: User register in Booking

  Scenario: User register in Booking
    Given the user is on the main page of Booking "https://www.booking.com/"
    When the user click on Hazte una cuenta
    And the user click on E-mail and write your email "mariaperdomopuerta@gmail.com"
    And the user click on Contraseña and whrite your password "22333414Mariap"
    And the user confirm your password "22333414Mariap"
    And the user click on Crear una cuenta
    #Then the user click on button Entendido

