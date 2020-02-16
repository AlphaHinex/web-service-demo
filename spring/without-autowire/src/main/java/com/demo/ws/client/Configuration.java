package com.demo.ws.client;

import com.demo.ws.client.EchoServiceClient;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.jaxws.JaxWsPortProxyFactoryBean;

import java.net.MalformedURLException;
import java.net.URL;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public JaxWsPortProxyFactoryBean echoServiceImpl() throws MalformedURLException {
        JaxWsPortProxyFactoryBean factoryBean = new JaxWsPortProxyFactoryBean();
        factoryBean.setServiceInterface(EchoServiceClient.class);
        factoryBean.setNamespaceUri("http://server.ws.demo.com/");
        factoryBean.setServiceName("EchoServiceEndpointService");
        factoryBean.setWsdlDocumentUrl(new URL("http://localhost:8088/echo?wsdl"));
        return factoryBean;
    }

}
