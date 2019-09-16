@Search
Feature: search
  As an end user
  I want to add a product to basket
  So that i can see the product in basket
  @basket
   Scenario:
    Given I am on Homepage
     When I search for a product "Tv"
     And I select the filtered "Price: Low - High"
     Then I can add the "product" to Basket
     Then I can see the product in tne trolley

