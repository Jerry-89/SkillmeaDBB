#vzdy na zaciatku kazdeho feature suboru je potrebne zadat tento riadok
  Feature: Bank

    Scenario: Bank account balance
      Given Bank account with 1000 eur
      Then  A user account balance is 1000 eur

    Scenario: Bank account transfer
      Given Bank account with 500 eur
      When User withdraws 250 eur
      And User transfer 1250 eur to this account
      Then A user account balance is 1500 eur

    Scenario Outline: Bank account transfer
      Given Bank account with <initBalance> eur
      When User withdraws <transferAmount> eur
      And User transfer <withdrawAmount> eur to this account
      Then A user account balance is <expectedBalance> eur
      #opat viacero hodnot, treba napisat scenario outline, | sa pise na AJ klavensici Shift + klaves pri prehlasovanom A
      Examples:
      | initBalance | withdrawAmount | transferAmount | expectedBalance |
      | 500 | 250 | 1250 | 1500 |
      | 500 | 100 | 1000 | 1400 |
      | -500 | 0 | 600 | -500 |

      ###########################

  Scenario: Multiple Bank Account Transfer
    Given Bank account with 1000 eur
    And Another Bank account with 2000 eur
    When User transfer from first one to second one 500 eur
    Then A user account balance is 500 eur
    And A user second account balance is 2500 eur