package endes.cajablanca;

import java.util.Scanner;

public class Ej3 {
    public static void ejercicio3() {
        Scanner entrada = new Scanner(System.in);

        int x, y, z, max;

        System.out.println("Introduce x, y, z: ");
        x = Integer.parseInt(entrada.next());
        y = Integer.parseInt(entrada.next());
        z = Integer.parseInt(entrada.next());

        if (x > y && x > z) {
            max = x;
        } else if (z > y) {
            max = z;
        }
        else {
            max = y;
        }
        System.out.println("El máximo es " + max);
    }
}
