package test.java.utilities;

/**
 * Created by rajivbhati on 3/1/18.
 */
public class RequestResponse {
    private static RequestResponse requestResponse = null;
    private String endPointUrl;

    public static RequestResponse getInstance() {
        if(requestResponse == null)
            requestResponse = new RequestResponse();
        return requestResponse;
    }

    private RequestResponse() {
    }

    public String getEndPointUrl() {
        return endPointUrl;
    }

    public void setEndPointUrl(String endPointUrl) {
        this.endPointUrl = endPointUrl;
    }

}
