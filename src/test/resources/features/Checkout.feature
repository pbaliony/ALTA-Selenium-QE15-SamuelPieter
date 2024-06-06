Feature: Checkout test
  Scenario: Checkout Saucelab Backpack until Finish
    When User login with valid username"standard_user" and password "secret_sauce"
    And Add to Cart button saucelabs backpack is displayed
    And click cart icon
    And click checkout button
    And Input FirstName "Samuel" and LastName "Pieter" and PostalCode "040202"
    And click Continue button
    And click finish button
    Then should be displayed checkout complete with title "Thank you for your order!"