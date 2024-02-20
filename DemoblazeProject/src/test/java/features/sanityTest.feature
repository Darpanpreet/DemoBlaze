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
@Edureka
Feature: Performing Sanity Testing

  @Edu_1 @EPIC01
  Scenario: To verify the URL for Demo_blaze on Google browser
    Given The user is on webBrowser
    When the user Open the Google browser
    And Enter the URL"https://www.demoblaze.com/"
    Then It should navigate to Google homepage
    And It should generate the list of Related Sites
    
    
    @Edu_2
    Scenario: To verify whether the site displays Greetings to the user.
    Given The user is on webBrowser and giving the greetings
    When the user open google browser
    And Enter the Url
    Then It should navigate to Google homepage
    And It should generate the list of Related Sites
    And It should display "Welcome to Demo_blaze"
    
    
    @Edu_3
    Scenario: To verify that the user redirects to the sign up page
    Given The URL has to be Valid and exist on browser
    And The URL has direct to sign up page
    When the user open the google browse
    And enters the url
    And  click on the site link
    And click on signup
    Then It should navigate to Google homepage
    And It should generate the list of Related Sites
    And It should navigate to Demo_blaze Homepage
    And it should direct to signup page
       
    
    @Edu_4
    Scenario: To verify that the user enters the valid user name
    Given The URL has to be Valid and exist on browser
    And The URL has direct to sign up page
    And Name field has to be visible and editable
    When the user opens the browser
    And Enters the url
    And click on the site link
    And click on signup
    And enter valid name
    Then It should display the name entered
    
    
#@PMexmp
#Scenario Outline: parametrization example
# Given I want to write a step with <name>
#When I check for the <value> in step
#Then I verify the <status> in step

#Examples: 
# | Username | Password |
# | EdurekaAB | Redhat |
# | Admin | Purdue01 |
