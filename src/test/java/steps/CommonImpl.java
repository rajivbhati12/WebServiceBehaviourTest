package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by rajivbhati on 2/27/18.
 */
public class CommonImpl {
    @Given("^the service api$")
    public void setServiceApi() throws Throwable{
        Assert.assertTrue("Missing Step impl",false);
    }
    @When("^I initiate the call$")
    public void initiateCall() throws Throwable{
        Assert.assertTrue("Missing Step impl",false);
    }
    @Then("^I should get a success in response$")
    public void verifySuccessfulResponse() throws Throwable{
        Assert.assertTrue("Missing Step impl",false);
    }
}
