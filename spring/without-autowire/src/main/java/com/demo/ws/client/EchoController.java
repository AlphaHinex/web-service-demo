package com.demo.ws.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@DependsOn("endpointPublish")
@RestController
@RequestMapping("/echo")
public class EchoController {

    private EchoServiceClient client;

    @Autowired
    public EchoController(EchoServiceClient client) {
        this.client = client;
    }

    @GetMapping
    public String echo(String content) {
        return client.echo(content);
    }

}
