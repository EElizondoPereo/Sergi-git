@Api
Feature: Title of your feature
  I want to use this template for my feature file
	@ignore
  @GetWithoutParams
  Scenario: User sends request
    When User sends a get request to "/api/users"
    Then User should get status code 200
    And Response data should have an email
    
	
  @GetWithParams
  Scenario: Title of your scenario
  	Given User sends a parameter name "id"
  	And User sends a parameter value 1
    When User sends a get request with param "/api/users/{id}"
    Then User should get status code 200