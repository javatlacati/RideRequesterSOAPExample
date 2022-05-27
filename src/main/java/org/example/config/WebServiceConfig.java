package org.example.config;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.example.service.RideRequesterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

@Configuration
public class WebServiceConfig {
    @Autowired
    private Bus bus;

    @Bean
    public Endpoint endpoint(){
        Endpoint endpoint = new EndpointImpl(bus, new RideRequesterService());
        endpoint.publish("/ride");
        return endpoint;
    }
}
