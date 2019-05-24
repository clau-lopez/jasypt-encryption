package com.example.encriptacionproperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class PropertyServiceForJasyptStarter {

    @Value("${encrypted.property}")
    private String property;

    @PostConstruct
    public void getProperty() {

        System.out.println("properties : "+property);
    }

}
