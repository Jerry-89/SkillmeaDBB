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
    Given uzivatel ma zadane dve cisla 2 a 10
    When  Uzivatel scita tieto dve cisla
    Then Uzivatel vidi na kalkulacke vysledok 12

    Scenario: Kalkulacka - delenie 2 cisel
      Given uzivatel ma zadane dve cisla 20 a 2
      When  Uzivatel vydeli tieto dve cisla
      Then  Uzivatel vidi na kalkulacke vysledok 10

  # komentar / pouzijeme scenario outline aby sme mohli pouzit viac premennych naraz
  Scenario Outline: Kalkulacka / scitanie viacerych scenarov
    Given uzivatel ma zadane dve cisla <prveCislo> a <druheCislo>
    When  Uzivatel scita tieto dve cisla
    Then Uzivatel vidi na kalkulacke vysledok <vysledok>
    #pride tabulka testovacich dat    znak "|"  sa pise Alt+124 alebo anglicka klavesnica / Shift+ klavesa vedla prehlasovaneho A
    # tieto premenne si vymyslis nove / nesuvisia s predoslymi
    Examples:
    | prveCislo | druheCislo | vysledok |
    | 120       | 24         | 144      |
    | 1011      | 10         | 1021     |
    | 0         | -24        | -24      |