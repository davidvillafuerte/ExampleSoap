package com.example.ExampleSoap.bussine.Imple;

import com.example.ExampleSoap.bussine.Service;

import com.wstutorial.ws.tutorialservice.TutorialType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Implementacion implements Service {

    Map<String,TutorialType> tutorials = new HashMap<>();

    @Override
    public List<TutorialType> getListPerson() {
        List<TutorialType> tutorialsList = new ArrayList<>();
        if (tutorialsList.isEmpty()){
            tutorialsList.addAll(tutorials.values());
        }
        return tutorialsList;
    }

    private void data(){
        TutorialType tu1 =  new TutorialType();
        tu1.setId("523");
        tu1.setName("Dave");
        tu1.setLastName("Martinez");
        tu1.setAge("23");
        tu1.setCountry("Peru");

        TutorialType tu2 =  new TutorialType();
        tu2.setId("523");
        tu2.setName("Irma");
        tu2.setLastName("Hidalgo");
        tu2.setAge("25");
        tu2.setCountry("Peru");


        TutorialType tu3 =  new TutorialType();
        tu3.setId("523");
        tu3.setName("Juan");
        tu3.setLastName("Quispe");
        tu3.setAge("18");
        tu3.setCountry("Peru");

        tutorials.get(tu1);
        tutorials.get(tu2);
        tutorials.get(tu3);
    }
}
