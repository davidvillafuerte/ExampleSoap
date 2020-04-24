package SoapTest;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import com.example.ExampleSoap.bussine.Imple.Implementacion;
import com.example.ExampleSoap.bussine.Service;
import com.wstutorial.ws.tutorialservice.TutorialType;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

   @Mock
   Service service;

   @Mock
   Implementacion implementacion;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

   @Test
   public void testgetListPersons() {
       List<TutorialType> list = new ArrayList<>();
       TutorialType tu1 = new TutorialType();
       TutorialType tu2 = new TutorialType();
       TutorialType tu3 = new TutorialType();
       tu1.setId("540");
       tu1.setName("Dave");
       tu1.setLastName("Martinez");
       tu1.setAge("23");
       tu1.setCountry("España");

       tu2.setId("605");
       tu2.setName("Tula");
       tu2.setLastName("Loza");
       tu2.setAge("50");
       tu2.setCountry("Chile");

       tu3.setId("780");
       tu3.setName("Juan");
       tu3.setLastName("Ramos");
       tu3.setAge("18");
       tu3.setCountry("Peru");

       list.add(tu1);
       list.add(tu2);
       list.add(tu3);


       when(implementacion.getListPerson()).thenReturn(list);
       assertEquals(3,list.size());


   }
}
