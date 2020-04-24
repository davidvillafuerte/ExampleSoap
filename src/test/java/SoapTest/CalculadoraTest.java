package SoapTest;

import com.example.ExampleSoap.web.Calculadora;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculadoraTest {

    @Test
    public void sumar(){
        double resultado=10.0;
        Calculadora calculadora = new Calculadora();
        assertEquals(resultado,calculadora.sumar(5,5),0.0001);
        assertEquals(resultado,calculadora.sumar(5,5),0.0001);
        assertEquals(resultado,calculadora.sumar(5,5),0.0001);
        assertEquals(resultado,calculadora.sumar(5,5),0.0001);
    }
}
