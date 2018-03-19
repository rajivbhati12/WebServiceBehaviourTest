package test.java.runner;

/**
 * Created by rajivbhati on 2/26/18.
 */


import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"test/java/steps"},
        format = {"pretty","html:target","json:target/WebServiceBehaviourTest.json"},
//        tags = {"@Smoke","@Service-GoogleMapsApi","@Operation-directions"},
        monochrome = true
)
public class CucumberRunnerTest {
}

