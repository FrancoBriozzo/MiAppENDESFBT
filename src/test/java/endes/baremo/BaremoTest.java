package endes.baremo;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;



public class BaremoTest {

    static String noAdjudicada, adjudicada, datoNoValido;

    @Test
    public void testValidas() {
        Baremo baremo = new Baremo();

        Assertions.assertEquals(noAdjudicada, baremo.comprobarBaremo("1234567A",4));
        Assertions.assertEquals(adjudicada, baremo.comprobarBaremo("1234567A",9));
    }
    @Test
    public void testNoValidas(){
        Baremo baremo = new Baremo();
        Assertions.assertEquals(datoNoValido, baremo.comprobarBaremo("123456A",2));
        Assertions.assertEquals(datoNoValido, baremo.comprobarBaremo("1234567890A",2));
        Assertions.assertEquals(datoNoValido, baremo.comprobarBaremo("1234ABC5",2));
        Assertions.assertEquals(datoNoValido, baremo.comprobarBaremo("ABCD12345",6));
        Assertions.assertEquals(datoNoValido, baremo.comprobarBaremo("1234567A",-5));
        Assertions.assertEquals(datoNoValido, baremo.comprobarBaremo("1234567A",20));
//        Assertions.assertEquals(datoNoValido, baremo.comprobarBaremo("1234567A",7.5));

    }

    @BeforeAll
    static void iniciar(){
        noAdjudicada = "No adjudicada";
        adjudicada = "Adjudicada";
        datoNoValido = "Dato no valido";
    }
}