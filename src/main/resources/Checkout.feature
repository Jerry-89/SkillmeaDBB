Feature: Checkout

  #REQ-001
  Scenario: Checkout bananas
    Given the price of a "banana" is 5 eur
    #ak je slovo v "" tak sa zmeni na premennu
    When User checkout "banana" 2
    Then Total price should be 10

  Scenario Outline: Checkout banana and apple
    Given the price of a "banana" is 2 eur
    And price of "apple" is 1 eur
    When User checkout "banana" 2
    And user checkout "apple" 2
    Then total price should be 6 eur

    Examples:
    | bananaPrice | applePrice | total | appleCount |
    | 80          | 140        |  160  | 5          |
