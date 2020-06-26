#Author: your.email@your.domain.com
Feature: Add Tariff plan
  User creating new account

  
  Scenario: Hardcoded
    Given User launch telecom application
    And User navigates into add tariff page
    When User enters all the plan feilds
    And User click on tariff submit button
    Then User should be displayed congratulation message
