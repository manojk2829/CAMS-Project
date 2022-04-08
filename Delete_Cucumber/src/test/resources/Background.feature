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
@tagBrand
Feature: Testing Brand Page
  I want to test brand Creation Page

Background: Brand Feature Test
    Given I login 'Catalog Admin'
    And Click Manage Brand link
    And Open Brand Creation Page
      
  @BrandCreate
  Scenario: Create New Brand
    When Enter all Mandatory Field
    And Enter all Mandatory Brand Properties
    And Click on Submit Button
    Then I validate Brand Created

  @BrandEdit
  Scenario: Edit Created Brand
    When Edit all Mandatory Field
    And Edit all Mandatory Brand Properties
    And Click on update Button
    Then I validate Edit Feature
