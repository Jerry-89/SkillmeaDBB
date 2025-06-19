import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.jupiter.api.Assertions.*;

public class KalkulackaTest {
    int prvCislo;
    int druCislo;
    int vypocitanyVysledok;


    @Given("uzivatel ma zadane dve cisla {int} a {int}")
    public void uzivatelMaZadaneDveCislaA(int prveCislo, int druheCislo) {
        prvCislo = prveCislo;
        druCislo = druheCislo;

    }

    @When("Uzivatel scita tieto dve cisla")
    public void uzivatelScitaTietoDveCisla() {
        vypocitanyVysledok = prvCislo + druCislo;
    }

    @Then("Uzivatel vidi na kalkulacke vysledok {int}")
    public void uzivatelVidiNaKalkulackeVysledok(int predpokladanyVysledok) {
        assertEquals(vypocitanyVysledok, predpokladanyVysledok);
        //assert bude porovnavat dve hodnoty, ci sa rovnaju
    }

    @When("Uzivatel vydeli tieto dve cisla")
    public void uzivatelVydeliTietoDveCisla() {
        vypocitanyVysledok = prvCislo / druCislo;
    }
}
