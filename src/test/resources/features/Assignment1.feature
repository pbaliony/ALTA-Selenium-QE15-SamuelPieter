@Assignment
Feature: Test Login, Add to Cart, Checkout

  #Login
  Scenario Outline: Login with valid login user
    Given User open the web sauce demo
    When User input "<UserName>" as userName and "<Password>" as password and click login
    Then User should be directed to the dashboard page
    Examples:
      | UserName                | Password     |
      | standard_user           | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
      | error_user              | secret_sauce |
      | visual_user             | secret_sauce |


  Scenario: Login with locked_out_user
    Given User open the web sauce demo
    When User input "locked_out_user" as userName and "secret_sauce" as password and click login
    Then User should see error message "Epic sadface: Sorry, this user has been locked out."

#  Scenario: Login with problem_user
#    Given User open the web sauce demo
#    When User input "problem_user" as userName and "secret_sauce" as password and click login
#    Then User should be directed to the dashboard page
#    And User should see wrong picture is displayed in product
#
#  Scenario: Login with performance_glitch_user
#    Given User open the web sauce demo
#    When User input "performance_glitch_user" as userName and "secret_sauce" as password and click login
#    Then User should be directed to the dashboard page
#
#  Scenario: Login with error_user
#    Given User open the web sauce demo
#    When User input "error_user" as userName and "secret_sauce" as password and click login
#    Then User should be directed to the dashboard page
#    And User cannot click Add to Cart Button on product "Sauce Labs Bolt T-Shirt"
#
#  Scenario: Login with visual_user
#    Given User open the web sauce demo
#    When User input "visual_user" as userName and "secret_sauce" as password and click login
#    Then User should be directed to the dashboard page
#    And User Should see missposition on Cart button

#Add To Cart
  Scenario: Add Sauce Labs Backpack to Cart
    When User login with valid username"standard_user" and password "secret_sauce"
    Then On the product page verify the saucelabs backpack
    And Add to Cart button saucelabs backpack is displayed
    And Click Add to Cart saucelabs backpack

#    #CheckOut
  Scenario: Simple Checkout Saucelabs Backpack
    When User login with valid username"standard_user" and password "secret_sauce"
    Then On the product page verify the saucelabs backpack
    And Add to Cart button saucelabs backpack is displayed
    And Click Add to Cart saucelabs backpack
    And click cart icon
    And click checkout button
    And Input FirstName "Samuel" and LastName "Pieter" and PostalCode "040202"
    And click Continue button
    And click finish button
    Then should be displayed checkout complete with title "Thank you for your order!"

    #Assignment 2 (Search Feature)
  Scenario: Simple Checkout Saucelabs Backpack
    When User login with valid username"standard_user" and password "secret_sauce"
#    Then Sort Product from "Name (Z to A)"
    And Click Add to Cart saucelabs Onesie
    And Click Add to Cart saucelabs T-Shirt (Red)
    And click cart icon
    And Remove button on the saucelabs T-Shirt (Red) is displayed
    And Remove the saucelabs T-Shirt (Red) from cart
    And click checkout button
    And Input FirstName "Samuel" and LastName "Pieter" and PostalCode "040202"
    And click Continue button
    And click finish button
    Then should be displayed checkout complete with title "Thank you for your order!"