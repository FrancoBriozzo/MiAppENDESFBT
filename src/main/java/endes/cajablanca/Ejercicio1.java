package endes.cajablanca;

public class Ejercicio1 {
    public static void imprimeMedia(int x, int y) {
        int resultado = 0;
        if (x < 0 || y < 0) {
            System.out.println("x e y deben ser positivos");
        } else {
            resultado = (x + y) / 2;
            System.out.println("La media es: " + resultado);
        }
    }
}
