package test.java.utilities;


import com.sun.jersey.core.util.MultivaluedMapImpl;
import gherkin.deps.com.google.gson.JsonObject;

import javax.ws.rs.core.MultivaluedMap;
import java.util.HashMap;

/**
 * Created by rajivbhati on 2/28/18.
 */
public class BaseSvc extends Helper{

    protected TestConfig testConfig = TestConfig.getInstance();
    protected RequestResponse requestResponse = RequestResponse.getInstance();
    protected static HashMap<String, Object> request = null;


    public BaseSvc(){}

    public void createRequest_default() throws Throwable{
        this.setRequestToCache();
    }

    public String getApiPropertyEndPoint() throws Throwable{
        return testConfig.getProperty(
                testConfig.getServiceName() + ".endpoint"
        );
    }

    public HashMap<String, Object> getRequestMap() throws Throwable{
        if(this.request == null)
            this.request = new HashMap<>();
        return this.request;
    }

    protected void setMethod(String method) throws Throwable{
        this.getRequestMap().put("METHOD",method);
    }
    protected void setEndPoint(String endPoint) throws Throwable{
        this.getRequestMap().put("ENDPOINT",endPoint);
    }
    protected void setMediaType(String mediaType) throws Throwable{
        this.getRequestMap().put("MEDIA_TYPE",mediaType);
    }

    protected void setEntity(JsonObject entity) throws Throwable{
        this.getRequestMap().put("ENTITY", entity.toString());
    }

    public MultivaluedMap<String,String> getQueryParams() throws Throwable{
        if(! this.getRequestMap().containsKey("QUERY_PARAMS"))
            this.getRequestMap().put("QUERY_PARAMS", new MultivaluedMapImpl());
        return (MultivaluedMap<String,String>) this.getRequestMap().get("QUERY_PARAMS");
    }

    protected void setQueryParams(String key, String value) throws Throwable{
        this.getQueryParams().add(key,value);
    }

    protected void setRequestToCache() throws Throwable{
        requestResponse.setRequest(this.getRequestMap());
    }
}
