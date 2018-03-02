package test.java.steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import test.java.utilities.BaseSvc;
import test.java.utilities.PropertyHelper;
import test.java.utilities.RequestResponse;
import test.java.utilities.TestConfig;
/**
 * Created by rajivbhati on 2/27/18.
 */
public class CommonImpl extends BaseSvc {
    TestConfig testConfig = TestConfig.getInstance();
    RequestResponse requestResponse = RequestResponse.getInstance();

    @Before
    public void before(Scenario scenario) throws Throwable{
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(PropertyHelper.class);
        testConfig.setEnvironment(applicationContext.getEnvironment());
        testConfig.setScenario(scenario);
    }

    @Given("^the service api$")
    public void setServiceApi() throws Throwable{
        requestResponse.setEndPointUrl(this.getEndPointUrl());
    }
    @When("^I initiate the call$")
    public void initiateCall() throws Throwable{
        requestResponse.callRestService();
        Assert.assertTrue("Missing Step impl",false);
    }
    @Then("^I should get a success in response$")
    public void verifySuccessfulResponse() throws Throwable{
        Assert.assertTrue("Missing Step impl",false);
    }
    @After
    public void after() throws Throwable{}
}
