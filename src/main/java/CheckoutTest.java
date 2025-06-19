import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutTest {
    @Given("the price of a {string} is {int} eur")
    public void thePriceOfAIsEur(String arg0, int arg1) {
    }

    @When("User checkout {string} {int}")
    public void userCheckout(String arg0, int arg1) {
    }

    @Then("Total price should be {int}")
    public void totalPriceShouldBe(int arg0) {
    }
}
