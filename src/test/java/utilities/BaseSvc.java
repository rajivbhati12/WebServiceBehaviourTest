package test.java.utilities;

/**
 * Created by rajivbhati on 2/28/18.
 */
public class BaseSvc {
    private String endPoint;
    TestConfig testConfig = TestConfig.getInstance();
    RequestResponse requestResponse = RequestResponse.getInstance();

    private String setEndPoint() throws Throwable {
        return testConfig.getProperty(
                testConfig.getServiceName() + "_endpoint"
        );
    }

    public String getEndPointUrl() throws Throwable{
        if(this.endPoint == null)
            this.endPoint = setEndPoint();
        return this.endPoint;
    }
}
