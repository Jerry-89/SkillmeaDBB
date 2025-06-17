import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class KalkulackaTest {
    int prvCislo;
    int druCislo;
    int vypocitanyVysledok;


    @Given("uzivatel ma zadane dve cisla {int} a {int}")
    public void uzivatelMaZadaneDveCislaA(int prveCislo, int druheCislo) {
    }

    @When("Uzivatel scita tieto dve cisla")
    public void uzivatelScitaTietoDveCisla() {
    }

    @Then("Uzivatel vidi na kalkulacke vysledok {int}")
    public void uzivatelVidiNaKalkulackeVysledok(int predpokladanyVysledok) {
    }
}
