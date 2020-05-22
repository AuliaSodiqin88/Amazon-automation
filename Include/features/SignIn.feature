Feature: Sign In feature

  Scenario: Sign In with valid Credentials
    Given User navigate to Sign In Page
    When User enter credential email and password
    And User Click continue button
    Then User navigate to dashboard
