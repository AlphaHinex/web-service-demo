package com.demo.ws.client;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(
        targetNamespace = "http://server.ws.demo.com/",
        name = "EchoServiceEndpoint"
)
public interface EchoServiceClient {

    @WebMethod
    String echo(String content);

}
