#Author: your.email@your.domain.com
Feature: Add Customer
  User creating new account

 Scenario: Hardcoded
    Given User launch telecom application
    And User navigates into add customer page
    When User enters all the feilds
    And User click on submit button
    Then User should be displayed customer id is generated

  Scenario: one dimensional list
  Given User launch telecom application
    And User navigates into add customer page
    When User enters all the feilds by using 1dim list
      | soundar | rajan | sr@gmail.com | pvi | 8976436275 |
    And User click on submit button
    Then User should be displayed customer id is generated

  Scenario: one dimensional map
  Given User launch telecom application
    And User navigates into add customer page
    When User enters all the feilds by using 1dim map
      | fname | java           |
      | lname | selenium       |
      | mail  | java@gmail.com |
      | add   | chennai        |
      | phno  |      876544433 |
    And User click on submit button
    Then User should be displayed customer id is generated

  Scenario: Two dimensional list
  Given User launch telecom application
    And User navigates into add customer page
    When User enters all the feilds by using 2dim list
      | soundar | rajan | sr@gmail.com  | pvi | 8976436275 |
      | karthi  | rajan | kr@gmail.com  | tvi | 8976436275 |
      | ajith   | rajan | sr@gmail.com  | pvi | 8976436275 |
      | achu    | rajan | acr@gmail.com | cvi | 8976436275 |
    And User click on submit button
    Then User should be displayed customer id is generated

  Scenario: Two dimensional Map
  Given User launch telecom application
    And User navigates into add customer page
    When User enters all the feilds by using 2dim map
      | Fname   | Lname | Mail          | Address | Phno       |
      | soundar | rajan | sr@gmail.com  | pvi     | 8976436275 |
      | karthi  | rajan | kr@gmail.com  | tvi     | 8976436275 |
      | ajith   | rajan | sr@gmail.com  | pvi     | 8976436275 |
      | achu    | rajan | acr@gmail.com | cvi     | 8976436275 |
    And User click on submit button
    Then User should be displayed customer id is generated

  Scenario Outline: by using outline
  Given User launch telecom application
    And User navigates into add customer page
    When User enters all the feilds "<Fname>","<Lname>","<Mail>","<Address>","<Phno>"
    And User click on submit button
    Then User should be displayed customer id is generated

    Examples: 
      | Fname   | Lname | Mail          | Address | Phno       |
      | soundar | rajan | sr@gmail.com  | pvi     | 8976436275 |
      | karthi  | rajan | kr@gmail.com  | tvi     | 8976436275 |
      | ajith   | rajan | sr@gmail.com  | pvi     | 8976436275 |
      | achu    | rajan | acr@gmail.com | cvi     | 8976436275 |
