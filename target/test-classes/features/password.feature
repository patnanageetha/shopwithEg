Feature: password functionality



Scenario: error validation for passwordfield
    Given user launch url
    And user clicks logonbutton
    And user enter invalid password to the password field
    Then check the signinbutton
    Then validate the errormessage
