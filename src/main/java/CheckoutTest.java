import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import product.Checkout;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CheckoutTest {
    Checkout myCheckout;
    @Given("the price of a {string} is {int} eur")
    public void thePriceOfAIsEur(String name, int price) {
        myCheckout = new Checkout();
        myCheckout.addItem(name, price);
    }

    @When("User checkout {string} {int}")
    public void userCheckout(String name, int count) {
        myCheckout.scanItems(name, count);
    }

    @Then("Total price should be {int}")
    public void totalPriceShouldBe(int expectedTotalPrice) {
        assertEquals(expectedTotalPrice, myCheckout.totalCart());
    }
}
