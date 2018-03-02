package test.java.utilities;

//import com.sun.jersey.api.client.Client;
//import org.glassfish.jersey.client.JerseyClient;

import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.uri.internal.JerseyUriBuilder;

import javax.ws.rs.client.*;
import javax.ws.rs.core.*;

/**
 * Created by rajivbhati on 3/1/18.
 */
public class RequestResponse extends Helper{
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

    public void callRestService() throws Throwable{
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(this.getEndPointUrl());
        Invocation.Builder builder = target.request(this.getMediaType());
        builder = builder.headers(this.getHeadersMap());

        this.executeMethod(builder,this.postVia(), this.getEntity(),this.getMediaType());

        builder.post(Entity.entity(this.getEntity(),this.getMediaType()));

//        UriBuilder uriBuilder = new JerseyUriBuilder();
////        uriBuilder.s
//        client.target(uriBuilder);
//        WebTarget target = null;
//        target.

    }

    private String postVia() {
        return "post";
    }

    public MediaType getMediaType() {
        return MediaType.APPLICATION_JSON_TYPE;
    }

    public MultivaluedMap<String,Object> getHeadersMap() {
        return new MultivaluedHashMap<>();
    }

    public <T> T getEntity() {
        return entity;
    }
}
