package com.demo.ws.server;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.xml.ws.Endpoint;

@Component
@Lazy(false)
public class EndpointPublish {

    @PostConstruct
    public void publish() {
        System.out.println("PUBLISH ECHO WSDL");
        Endpoint.publish("http://localhost:8088/echo", new EchoServiceEndpoint());
    }

}
