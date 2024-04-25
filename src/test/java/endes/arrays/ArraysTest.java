package endes.arrays;


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class ArraysTest {
    static int[] array1, array2, resul, array3, array4, resul2;
    static MisArrays arra;

    @Order(3)
    @Test
    public void testSumar() {
        MisArrays arra = new MisArrays();

        assertArrayEquals(resul, arra.sumar(array1, array2));

    }

    @Order(2)
    @Test
    public void testSumar2() {
        MisArrays arra = new MisArrays();

        assertArrayEquals(resul2, arra.sumar(array3, array4));
    }

    @Order(1)
    @Test
    public void testDecrementar() {
        MisArrays arra = new MisArrays();
        arra.decrementar(array1, 1);
        assertArrayEquals(array1, new int[]{1, 3, 4});
    }

    @BeforeAll
    static void iniciar() {
        array1 = new int[]{2, 4, 5};
        array2 = new int[]{1, 1, 1};
        resul = new int[]{3, 5, 6};
        array3 = new int[]{10, 15, 12, 1, 5};
        array4 = new int[]{1, 2, 3, 4, 5};
        resul2 = new int[]{11, 17, 15, 5, 10};
    }

    @BeforeEach
    void iniciar2() {
        array1 = new int[]{2, 4, 5};
        array2 = new int[]{1, 1, 1};
        resul = new int[]{3, 5, 6};
    }

    @AfterAll
    static void finalizar() {
        System.out.println("Fin de los tests");
    }

    @AfterEach
    void finalizar2() {
        System.out.println("Finaliza un test");
    }


}
