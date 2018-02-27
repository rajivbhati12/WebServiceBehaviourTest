package runner;

/**
 * Created by rajivbhati on 2/26/18.
 */


import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"steps"},
        format = {"pretty","html:target","json:target/WebServiceBehaviourTest.json"},
        tags = {"@heartbeat"},
        monochrome = true
)
public class CucumberRunnerTest {
}

