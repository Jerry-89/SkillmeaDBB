import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import product.BankAccount;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {
BankAccount firstAccount;
BankAccount secondAccount;


    @Given("Bank account with {int} eur")
    public void bankAccountWithEur(int initialBalance) {  //arg0 treba prepisat na premennu
      firstAccount = new BankAccount(initialBalance);
      secondAccount = new BankAccount(initialBalance);
    }

    @Then("A user account balance is {int} eur")
    public void aUserAccountBalanceIsEur(int expectedBalance) {
    assertEquals(expectedBalance, firstAccount.getAccountBalance());

    }

    @When("User withdraws {int} eur")
    public void userWithdrawsEur(int withdrawAmount) {
        firstAccount.withdraw(withdrawAmount);
    }

    @And("User transfer {int} eur to this account")
    public void userTransferEurToThisAccount(int transferAmount) {
        firstAccount.transfer(transferAmount);
    }

    @And("Another Bank account with {int} eur")
    public void anotherBankAccountWithEur(int initialBalance) {
        secondAccount = new BankAccount(initialBalance);
    }

    @When("User transfer from first one to second one {int} eur")
    public void userTransferFromFirstOneToSecondOneEur(int transferAmount) {
        firstAccount.withdraw(transferAmount);
        secondAccount.transfer(transferAmount);
    }

    @And("A user second account balance is {int} eur")
    public void aUserSecondAccountBalanceIsEur(int expectedBalance) {
        assertEquals(expectedBalance, secondAccount.getAccountBalance());
    }
}
