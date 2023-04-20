Feature: createaccount functionality

  Scenario: verify createaccount with valid credentials
    Given user launches Shopwitheg
    When user clicks on login button
    And user clicks on createaccount button
    When user enters firstname  with lessthan 2 characters
    And user clicks another create account
    Then validate the error message
