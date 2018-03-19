package test.java.utilities;

import cucumber.api.Scenario;
import cucumber.api.java.en.Then;
import org.apache.commons.lang3.StringUtils;
import org.springframework.core.env.Environment;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by rajivbhati on 2/28/18.
 */
public class TestConfig {
    private static TestConfig testConfig = null;
    private Environment environment = null;
    private Scenario scenario = null;
    private Object apiClassInstance = null;

    public static TestConfig getInstance() {
        if(testConfig == null)
            testConfig = new TestConfig();
        return testConfig;
    }
    private TestConfig() {
    }

    public void setEnvironment(Environment environment) throws Throwable{
        this.environment = environment;
    }

    public void setScenario(Scenario scenario) throws Throwable{
        this.scenario = scenario;
    }

    public Scenario getScenario() throws Throwable{
        return this.scenario;
    }

    public String getTagValue(String tagName) throws Throwable{
        List<String> tagList = this.scenario.getSourceTagNames().stream()
                .filter(tag -> tag.startsWith(tagName))
                .collect(Collectors.toList());
        return tagList.size() == 0 ? "" : StringUtils.substringAfter(tagList.get(0),tagName);
    }
    public String getProperty(String propertyName) throws Throwable{
        return this.environment.getProperty(propertyName);
    }
    public String getServiceName() throws Throwable{
        return this.getTagValue("@Service-");
    }
    public String getOperationName() throws Throwable{
        String operation = this.getTagValue("@Operation-");
        return operation.equalsIgnoreCase("") ?
                "default" : operation;
    }

    public void setApiClassInstance() throws Throwable{
        Class<?> apiClass = null;
        try {
            apiClass = Class.forName("test.java.steps." + getServiceName());
        }catch (ClassNotFoundException e){
            apiClass = Class.forName("test.java.utilities.BaseSvc");
        }
        this.apiClassInstance = apiClass.getConstructor().newInstance();
    }
    public Object getApiClassInstance() throws Throwable{
        return this.apiClassInstance;
    }
}
