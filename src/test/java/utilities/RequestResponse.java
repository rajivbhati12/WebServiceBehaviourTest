package test.java.utilities;


import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.WebResource.Builder;
import com.sun.jersey.core.util.MultivaluedMapImpl;
import gherkin.deps.com.google.gson.JsonParser;
import org.apache.commons.lang3.StringUtils;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by rajivbhati on 3/1/18.
 */
public class RequestResponse extends Helper{
    private static RequestResponse requestResponse = null;
    private Object response;
    private Object request;
    private Integer responseStatus;
    private TestConfig testConfig = TestConfig.getInstance();

    public static RequestResponse getInstance() {
        if(requestResponse == null)
            requestResponse = new RequestResponse();
        return requestResponse;
    }

    private RequestResponse() {
    }


    public <T> T getResponse() {
        return (T) response;
    }

    public <T> void setResponse(T response) {
        this.response = response;
    }

    private void setResponse(String response, String mediaType) {
        switch (mediaType){
            case "application/json":
                this.setResponse((new JsonParser()).parse(response));
                break;
            default:
                this.setResponse(response);
                break;
        }
    }

    public <T> T getRequest() {
        return (T) request;
    }

    public <T> void setRequest(T request) {
        this.request = request;
    }

    private void createRequest() throws Throwable{
        executeMethod(testConfig.getApiClassInstance(),
                "createRequest_" + testConfig.getOperationName());
    }

    private void postRequest() throws Throwable{
        Client client = Client.create();
        WebResource webResource = client.resource(this.getEndPoint());
        webResource = webResource.queryParams(this.getQueryParams());
        Builder builder = webResource.getRequestBuilder();
        builder.entity(this.getEntity(),this.getMediaType());
        for(Map.Entry<String,String> entry : this.getRequestHeaders().entrySet())
            builder = builder.header(entry.getKey(),entry.getValue());
        builder.type(this.getMediaType());
        ClientResponse clientResponse = this.executeMethod(builder,this.getMethod(),ClientResponse.class);
        this.setResponseStatus(clientResponse.getStatus());
        this.setResponse(clientResponse.getEntity(String.class),
                StringUtils.substringBefore(clientResponse.getType().toString(),";"));
        client.destroy();
    }

    public <T> T getRequest(String key, T defaultValue){
        return
                (this.getRequest() != null) && (((HashMap) this.getRequest()).containsKey(key)) ?
                        (T) ((HashMap) this.getRequest()).get(key) :
                        (T) defaultValue ;
    }

    public String getEndPoint() {
        return this.getRequest("ENDPOINT", "");
    }

    public String getMethod() {
        return this.getRequest("METHOD", "get");
    }

    public MultivaluedMap<String,String> getQueryParams() {
        return this.getRequest("QUERY_PARAMS",new MultivaluedMapImpl());
    }

    public <T> T getEntity() {
        return this.getRequest("ENTITY", null);
    }

    public String getMediaType() {
        return this.getRequest("MEDIA_TYPE",MediaType.APPLICATION_FORM_URLENCODED);
    }

    public HashMap<String,String> getRequestHeaders() {
        return this.getRequest("HEADERS",new HashMap<String, String>());
    }

    public Integer getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(Integer responseStatus) {
        this.responseStatus = responseStatus;
    }

    public void InitiateRequestCall() throws Throwable{
        this.createRequest();
        this.postRequest();
    }
}
