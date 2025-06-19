#vzdy na zaciatku kazdeho feature suboru je potrebne zadat tento riadok
  Feature: Bank

    Scenario: Bank account balance
      Given Bank account with 1000 eur
      Then  A user account balance is 1000 eur