@Login
Feature: Login feature of OrangeHRM application
 
Background: Open OrangeHRM application
	Given Open the browser and Launch OrangeHRM application

  @valid
  Scenario: Title of your scenario
    When Enter the Username "Admin"
 		And Enter the password "admin123"
 		Then Click LoginIn button
 		And User navigates to homepage

  @invalid
  Scenario Outline: Title of your scenario outline
    When Enter the Username "<username>"
 		And Enter the password "<password>"
 		Then Click LoginIn button
 		And User does not navigates to homepage

    Examples: 
      |username|password|
      |admin121|admin@12|
      
