@Search
Feature: search
  As an end user
  I want to search for a product
  So that i can see the refined product
  @singUp
Scenario:
    Given I am on Homepage
    When I click the create account
    And move to account page
    Then I enter the email and pass word and click the sing up button
    Then I able to sing Up

