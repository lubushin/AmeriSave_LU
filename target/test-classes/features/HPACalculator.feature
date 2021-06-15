Feature: As a user I entered valid credentials, click Calculate
  and Results and Summary Table should be displayed

  @hp
  Scenario: I entered valid credentials and Calculated affordable mortgage
    Given user sees both tabs at the same time
    When User enters: Current combined annual income
    And User enters: Monthly auto payments
    And User enters: Monthly association fees
    And User enters: Monthly child support payments
    And User enters: Monthly credit card payments
    And User enters: Other monthly obligations
    And User enters: Annual interest rate on new mortgage
    And User enters: Funds available for a down payment
    And User enters: Estimated annual homeowner's insurance
    And User selects: Back-end ratio
    And User selects: Term of new mortgage
    And User enters: Estimated annual property taxes
    And User selects: Front-end ratio
    And User clicks on Calculate button
    Then Results and Summary Table should be displayed
