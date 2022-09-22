package com.example.comptems22;

import com.example.comptems22.web.CompteJaxRSAPI;
import com.example.comptems22.web.CompteJaxRSAPI;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.SimpleJaxWsServiceExporter;

@Configuration
public class MyConfig {
  // @Bean
    public ResourceConfig resourceConfig(){
        ResourceConfig jersyServlet=new ResourceConfig();
        jersyServlet.register(CompteJaxRSAPI.class);
        return jersyServlet;
    }
    @Bean
    public SimpleJaxWsServiceExporter serviceExporter(){
        SimpleJaxWsServiceExporter serviceExporter=new SimpleJaxWsServiceExporter();
        serviceExporter.setBaseAddress("http://localhost:8888/");
        return  serviceExporter;
    }
}
