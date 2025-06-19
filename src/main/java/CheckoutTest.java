import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import product.Checkout;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class CheckoutTest {
    Checkout myCheckout;
    @Before
    public void totoSaSpustiPredKazdymTestom (){
        myCheckout = new Checkout();
    }
    @Given("the price of a {string} is {int} eur")
    public void thePriceOfAIsEur(String name, int price) {

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

    @And("price of {string} is {int} eur")
    public void priceOfIsEur(String arg0, int arg1) {
    }

    @And("user checkout {string} {int}")
    public void userCheckout(String arg0, int arg1) {
    }

    @Then("total price should be {int} eur")
    public void totalPriceShouldBeEur(int arg0) {
    }
}
