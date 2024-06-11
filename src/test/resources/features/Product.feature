Feature: Product Test
  Scenario: Verify Product saucelabs backpack and remove the product saucelabs backpack
    When User login with valid username"standard_user" and password "secret_sauce"
    Then On the product page verify the saucelabs backpack
    And Add to Cart button saucelabs backpack is displayed
    And Click Add to Cart saucelabs backpack
    And Remove button on the saucelabs backpack is displayed
    And Remove the saucelabs backpack from cart