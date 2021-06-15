@nf
Feature: verification test cases with invalid values

  Background: user is on landing page

  Scenario: verification of fields, accept numbers from 0 to 999,999,999 with invalid values
    When User enters invalid values to Current combined annual income
    Then User should be able to see the error message
    And User enters invalid values to Monthly auto payments
    Then User should be able to see the error message1
    And User enters invalid values to Monthly association fees
    Then User should be able to see the error message2
    And User enters invalid values to Monthly child support payments
    Then User should be able to see the error message3
    And User enters invalid values to Monthly credit card payments
    Then User should be able to see the error message4
    And User enters invalid values to Other monthly obligations
    Then User should be able to see the error message5
    And User enters invalid values to Funds available for a down payment
    Then User should be able to see the error message6
    And User enters invalid values to Estimated annual homeowner's insurance
    Then User should be able to see the error message7
    And User enters invalid values to Estimated annual property taxes
    Then User should be able to see the error message8

  Scenario: verification of mortgage rate with invalid values, accepts numbers between 0 to 40
    When User enters invalid values to Annual interest rate on new mortgage
    Then the error message should be appeared


