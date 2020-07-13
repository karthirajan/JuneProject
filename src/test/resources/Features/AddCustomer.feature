#Author: your.email@your.domain.com
@sanityCustomer
Feature: Add Customer
  User creating new account

  Background: 
    And User navigates into add customer page

  @sanity @karthi
  Scenario: Hardcoded
    When User enters all the feilds
    And User click on submit button
    Then User should be displayed customer id is generated

 @sanity @karthi
  Scenario: one dimensional list
    When User enters all the feilds by using 1dim list
      | soundar | rajan | sr@gmail.com | pvi | 8976436275 |
    And User click on submit button
    Then User should be displayed customer id is generated

  Scenario: one dimensional map
    When User enters all the feilds by using 1dim map
      | fname | java           |
      | lname | selenium       |
      | mail  | java@gmail.com |
      | add   | chennai        |
      | phno  |      876544433 |
    And User click on submit button
    Then User should be displayed customer id is generated

  Scenario: Two dimensional list
    When User enters all the feilds by using 2dim list
      | soundar | rajan | sr@gmail.com  | pvi | 8976436275 |
      | karthi  | rajan | kr@gmail.com  | tvi | 8976436275 |
      | ajith   | rajan | sr@gmail.com  | pvi | 8976436275 |
      | achu    | rajan | acr@gmail.com | cvi | 8976436275 |
    And User click on submit button
    Then User should be displayed customer id is generated

  @sanity
  Scenario: Two dimensional Map
    When User enters all the feilds by using 2dim map
      | Fname   | Lname | Mail          | Address | Phno       |
      | soundar | rajan | sr@gmail.com  | pvi     | 8976436275 |
      | karthi  | rajan | kr@gmail.com  | tvi     | 8976436275 |
      | ajith   | rajan | sr@gmail.com  | pvi     | 8976436275 |
      | achu    | rajan | acr@gmail.com | cvi     | 8976436275 |
    And User click on submit button
    Then User should be displayed customer id is generated

  Scenario Outline: by using outline
    When User enters all the feilds "<Fname>","<Lname>","<Mail>","<Address>","<Phno>"
    And User click on submit button
    Then User should be displayed customer id is generated

    Examples: 
      | Fname   | Lname | Mail          | Address | Phno       |
      | soundar | rajan | sr@gmail.com  | pvi     | 8976436275 |
      | karthi  | rajan | kr@gmail.com  | tvi     | 8976436275 |
      | ajith   | rajan | sr@gmail.com  | pvi     | 8976436275 |
      | achu    | rajan | acr@gmail.com | cvi     | 8976436275 |
