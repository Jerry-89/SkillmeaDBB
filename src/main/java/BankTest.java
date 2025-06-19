import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import product.BankAccount;


public class BankTest {
BankAccount firstAccount;


    @Given("Bank account with {int} eur")
    public void bankAccountWithEur(int initialBalance) {  //arg0 treba prepisat na premennu
      firstAccount = new BankAccount(initialBalance);


    }

    @Then("A user account balance is {int} eur")
    public void aUserAccountBalanceIsEur(int expectedBalance) {


    }
}
