Feature: Sign Up feature

  Scenario: Sign Up with user credential
    Given User navigate to sign up page
    When User enters name and email and password and re-password
    And User click create account button
    And User input otp
    And User click continue
    And User input phone number
    And User click continue
    Then User is navigate to homepage
