package test.java.steps;

import cucumber.api.java.en.And;
import test.java.utilities.BaseSvc;
import javax.ws.rs.core.MediaType;
/**
 * Created by rajivbhati on 3/12/18.
 */
public class GoogleMapsApi extends BaseSvc {
    public GoogleMapsApi(){}
    public GoogleMapsApi(String origin, String destination) throws Throwable{
        this.setSourceDestination(origin,destination);
    }

    public void createRequest_directions() throws Throwable{
        this.setMethod("get");
        this.setEndPoint(getApiPropertyEndPoint() + testConfig.getOperationName() + "/json");
        this.setMediaType(MediaType.APPLICATION_FORM_URLENCODED);
        this.setQueryParams("key",testConfig.getProperty("apiKey"));
        this.setRequestToCache();
    }

    @And("^from (.*) to (.*)$")
    public void setSourceDestination(String origin, String destination) throws Throwable{
        this.setQueryParams("origin",origin);
        this.setQueryParams("destination",destination);
    }

}
