package endes.calculos;

public class Calculadora {
    static int restar(int a, int b) {
        return a - b;
    }

    static int dividir(int a, int b) {
        return a / b;
    }

    static boolean esPar(int num) {
        return (num % 2 == 0);
    }

    static String esParOImpar(int num) {
        if (esPar(num)) {
            return "Par";
        }
        return "Impar";
    }
}
