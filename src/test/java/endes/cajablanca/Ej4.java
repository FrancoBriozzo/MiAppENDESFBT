package endes.cajablanca;

public class Ej4 {
    static int ejercicio4(char[] cadena, char letra) {
        int contador, n, lon;
        n = 0;
        contador = 0;
        lon = cadena.length;
        if (lon > 0) {
            do {
                if (cadena[contador] == letra)
                    n++;
                contador++;
                lon--;
            } while (lon > 0);
        }
        return n;
    }

}
