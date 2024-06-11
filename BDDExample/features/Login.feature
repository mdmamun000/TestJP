Feature: Login Functionality for OpenCart E-commerce Website

  Background: 
  Given I am on the OpenCart Login Page
  
  Scenario: Successful login with valid credentials
    Given I have entered a valid username and password
    When I click on the login button
    Then I should be logged in successfully
    	
  
  Scenario Outline: Unsuccessful login with invalid or empty credentials
    Given I have entered invalid "<username>" and "<password>"
    When I clicked on the login button
    Then I should see an error message indicating "<error_message>"

    Examples: 
      | username	                | password        | error_message |
      | saintjohn.usc@gmail.com | 123456mmA#        | 	            |
      | saintjohn.usc@gmail.com | 123456mmA#        |               | 
      | saintjohn.usc@gmail.com | 123456mmA#123   |  Warning: No match for E-Mail address and/or Password. |
     
     Scenario: Navigating for the forgotten password page
     When I click on the "Forgotten Password" link
     Then I should be redirected to the possword reset page
     ## Warning: No match for E-Mail address and/or Password.