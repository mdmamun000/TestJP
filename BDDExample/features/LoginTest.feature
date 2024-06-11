Feature: Login Functionality for OpenCart E-commerce Website

  Background: 
  Given I am on the OpenCart Login Page
  
  Scenario Outline: Unsuccessful login with invalid or empty credentials
    Given I have entered invalid "<username>" and "<password>"
    When I clicked on the login button
    Then I should see an error message indicating "<error_message>"

    Examples: 
      | username	                | password        | error_message |
      | saintjohn.usc@gmail.com | 123456mmA$#        | 	            |
      | saintjohn.usc@gmail.com | 123456mmA##        |               | 
      | saintjohn.usc@gmail.com |                   |   Warning: No match for E-Mail address and/or Password.|
      | saintjohn.usc@gmail.com |  weioew           |   Warning: No match for E-Mail address and/or Password.|  
     
    Scenario Outline: Successful login with valid credentials
    Given I have entered a valid <"username"> and <"password">
    When I click on the login button
    Then I should be logged in successfully
    
    Examples: 
    	  | username	                | password        |
        | saintjohn.usc@gmail.com   | 123456mmA#        | 
     