Feature: Transfer Funds

  Background:
    Given Navigate to ParaBank
    When  The user fills in the registration form with valid data
    And   Clicks the "Register" button
    Then  The user should see a message confirming successful registration


  Scenario: Money transfer between Accounts
    And Navigate to TransferFunds
    Then Money transfer between Accounts
    Then Success message should be displayed
    And Navigate to Accounts Overview
    When Accounts Overview


