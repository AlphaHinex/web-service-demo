package com.demo.ws.server;

import io.github.springroll.utils.StringUtil;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class EchoServiceEndpoint {

    @WebMethod(action = "http://server.ws.demo.com/echo")
    public String echo(String content) {
        return StringUtil.isBlank(content) ? "echo nothing" : "echo " + content;
    }

}
