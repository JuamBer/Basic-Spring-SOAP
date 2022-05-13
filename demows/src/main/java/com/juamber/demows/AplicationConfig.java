package com.juamber.demows;

import com.juamber.demows.impl.SumServiceImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;
import javax.xml.ws.soap.SOAPBinding;

@Configuration
public class AplicationConfig {

    @Autowired
    private Bus bus;

    @Bean
    public Endpoint endpoint(SumServiceImpl sumServiceImpl){
        Endpoint endpoint = new EndpointImpl(bus, sumServiceImpl, SOAPBinding.SOAP12HTTP_BINDING);
        endpoint.publish("/soap/SumService");
        return endpoint;
    }
}
