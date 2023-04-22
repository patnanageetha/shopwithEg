tag=@login1

Feature: loginfunctionality
  

 
  Scenario: verify user with valid credentials
    Given user launches Shopwitheg
    
    When user clicks on login button
    
    And user enter valid credentials
    Then user is successfully logggedin
 tag=@login2
    Scenario: verify user with valid credentials
    Given user launches Shopwitheg
    
    When user clicks on login button
    
    And user enter valid credentials
    Then user is successfully logggedin
 
     
     
