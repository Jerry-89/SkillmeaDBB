Feature: pokus
  #toto je komentar

  Scenario: Pokusny test 1
    Given nastavenie pociatocnych podmienok
    And dalsi nastavovaci krok
    When  toto je nejaka akcia
    And toto je nejaka akcia 2
    Then  overenie vysledku
    And dalsie overenie vysledku

    Scenario: Pokusny test 2
      Given nastavenie pociatocnych podmienok
      When toto je nejaka akcia
      Then  dalsie overenie vysledku

  Scenario: Kalkulacka - sucet 2 cisel
    Given uzivatel ma zadane dve cisla 5 a 8
    When  Uzivatel scita tieto dve cisla
    Then Uzivatel vidi na kalkulacke vysledok 13