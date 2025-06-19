Feature: Checkout

  #REQ-001
  Scenario: Checkout bananas
    Given the price of a "banana" is 5 eur
    #ak je slovo v "" tak sa zmeni na premennu
    When User checkout "banana" 2
    Then Total price should be 10
