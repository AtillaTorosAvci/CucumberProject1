package StepDefinitions;

import Pages.Elements;
import Pages.ParentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class _605_TransferFundsSteps {
    Elements e = new Elements();
    ParentPage pp = new ParentPage();

    @And("Navigate to TransferFunds")
    public void navigateToTransferFunds(){
        pp.myClick(e.transferFunds);
    }

    @When("Money transfer between Accounts")
    public void moneyTransfer(){
        pp.myClick(e.fromAccount);
        pp.myClick(e.toAccount);
        pp.mySendKeys(e.amount, "158");
        pp.myClick(e.transfer);
    }

    @Then("Success message should be displayed")
    public void succesMessageShouldBeDisplayed() {
        String expectedText = "$158.00 has been transferred from account";
        pp.wait.until(ExpectedConditions.textToBePresentInElement(e.showResult,expectedText));
        Assert.assertTrue(e.showResult.getText().contains("$158.00 has been transferred from account"));
    }

    @And("Navigate to Accounts Overview")
    public void navigateToAccountsOverview(){
        pp.myClick(e.accountsOverview);
    }

    @When("Accounts Overview")
    public void accountOverview(){
        pp.myClick(e.accountNumber);
        pp.myClick(e.fundTransferReceived);
        pp.myClick(e.transactionIDnumber);
    }

}
