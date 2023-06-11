
 
 Feature: Login test
 
  @p100
  Scenario Outline: Successful login with valid credentials
    Given User is on mercury tours page
    When user click on register
    Then enter '<FirstName>' and '<LastName>'
    Then click on submit
    Then login successful message is displayed
    
    Examples:
      | FirstName | LastName |
      | Jagruthi | K |
      | Dolly    | L |
      | Rohan    | H |
     
   
      
    
    