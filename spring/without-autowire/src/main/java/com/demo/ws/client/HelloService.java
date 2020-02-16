package com.demo.ws.client;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;


@WebService(targetNamespace = "http://com.demo.ws/helloWorld")
public interface HelloService {

    @WebMethod(operationName = "sayHello")
    @WebResult(name = "sayHello")
    String sayHello(@WebParam(name = "sayHello") String sayHello);


    @WebMethod(operationName = "sayGoodBye")
    @WebResult(name = "sayGoodBye")
    String sayGoodBye(@WebParam(name = "sayGoodBye") String bye);

}