package com.example.ExampleSoap.web;

import com.example.ExampleSoap.bussine.Imple.Implementacion;
import com.wstutorial.ws.tutorialservice.GetTutorialsRequest;
import com.wstutorial.ws.tutorialservice.GetTutorialsResponse;
import com.wstutorial.ws.tutorialservice.ObjectFactory;
import com.wstutorial.ws.tutorialservice.TutorialType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.List;

@Endpoint
public class PersonEndpoint {
    private static final String NAMESPACE_URI="http://www.wstutorial.com/ws/TutorialService";

    @Autowired
    Implementacion implementacion;

    @PayloadRoot(namespace = NAMESPACE_URI,localPart = "getTutorialsRequest")
    @ResponsePayload
    public GetTutorialsResponse getCountry(@RequestPayload GetTutorialsRequest request) throws Exception{
        ObjectFactory factory = new ObjectFactory();
        GetTutorialsResponse response = factory.createGetTutorialsResponse();
        List<TutorialType> tutorials = implementacion.getListPerson();
        response.getTutorials().addAll(tutorials);
        return response;
    }
}
