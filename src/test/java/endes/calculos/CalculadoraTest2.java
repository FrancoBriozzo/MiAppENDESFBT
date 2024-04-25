package endes.calculos;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest2 {


    @Test
    public void testDividir1() {
        assertEquals(1, Calculadora.dividir(4, 4));
    }

    @Test
    public void testDividir2() {
        assertEquals(1, Calculadora.dividir(3, 2));
    }

    @Test
    public void testDividir3() {
        assertThrows(ArithmeticException.class,()->Calculadora.dividir(4, 0));
    }

    @Test
    public void testDividir4(){
        assertAll("Juntado Test",
                ()->assertEquals(1,Calculadora.dividir(4,4)),
                ()->assertEquals(1,Calculadora.dividir(3,2)));
    }

    @Test
    public void testDividir5(){
        assertTrue(Calculadora.dividir(6,2) == 3);
    }

    @Test
    public void testPar(){
        assertTrue(Calculadora.esPar(2));
        assertFalse(Calculadora.esPar(3));
    }

    @Test
    public void testParOImpar(){
        //Válidas CU
        assertEquals("Par",Calculadora.esParOImpar(0));
        assertEquals("Impar",Calculadora.esParOImpar(25));

    }


}

