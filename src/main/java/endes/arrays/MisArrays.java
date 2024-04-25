package endes.arrays;

public class MisArrays {
    public MisArrays() {
        super();
    }

    //Este método recibe dos vectores y devuelve un vector que en cada posición tiene la suma
//de la misma posición de los dos vectores recibidos como parámetros
    public int[] sumar(int[] a1, int[] a2) {
        if (a1.length != a2.length) {
            return null;
        }
        int[] salida = new int[a1.length];
        for (int i = 0; i < a1.length; i++) {
            salida[i] = a1[i] + a2[i];
        }

        return salida;
    }

    public void decrementar(int[] array1, int i) {
        for (int j = 0; j < array1.length; j++) {
            array1[j] -= i;
        }

    }
}
