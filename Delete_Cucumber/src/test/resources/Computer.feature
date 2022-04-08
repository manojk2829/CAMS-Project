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
@BuyComputer
Feature: Title of your feature
  I want to use this template for my feature file

Background: Buying Dell PC
  Given I want to buy a 'PC'
  And PC must be Dell company
  
  @BuyingDesktop
  Scenario: Buying a Desktop
    And It should be a 'Desktop' system  
    When I select monitor size as 18 inch
    #And Create a Corban finished
    #And I select Hard disk size 1 TB
    #And Ram must be 8 GB
    Then Price must be less then 60000

  @BuyingLaptop
  Scenario Outline: Buy a Laptop
  Given Ram must be 16 GB
    And It should be a 'Laptop'  
    When I select screen size as 14 inch
    And a 'silver' finished
    And I select Hard disk size 1 TB
    And Ram must be 16 GB
    Then Price must be less then 85000
