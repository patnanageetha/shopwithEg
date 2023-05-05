Feature: password functionality



Scenario: error validation for passwordfield
    Given user launches Shopwitheg
    And user clicks login button
    And user enter valid password to the password field
    Then check the signinbutton
    Then validate password
    When user not enter uppercase
    Then validate uppercase error message
    When user not enters special character 
    Then validate special character error message
    When user not enter numerics
    Then validate error messagefor numerics
    When user not enter lowercase
    then validate error message for lowercase 
    
