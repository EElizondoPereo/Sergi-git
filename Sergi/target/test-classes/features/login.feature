#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@login
Feature: Login
  I want to use this template for my feature file
	
	@ignore  
  @validLogin
  Scenario: Happy Login
    Given User click on Sign in 
    When User enter valid email address "test800@hotmail.com"
    And User enter valid password "test123"
    And Useer clicks sign in button 
    Then  User should be in profile page
    

  @BuySomething
  Scenario: Buying Something
  	Given User click on Sign in
  	And User logs in
  	When User clicks on Women button
  	And User clicks on product
  	And User continues shopping
  	Then User should be in Store page
  	
   
   
   
   
   
   
   
   
	 