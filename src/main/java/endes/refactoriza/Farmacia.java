package endes.refactoriza;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Clase que representa una farmacia con su inventario de medicamentos.
 */
public class Farmacia {
    private Map<String, Integer> inventario;

    /**
     * Constructor de la clase Farmacia.
     */
    public Farmacia() {
        this.inventario = new HashMap<>();
    }

    /**
     * Método para agregar un medicamento al inventario de la farmacia.
     * @param medicamento El medicamento a agregar.
     * @param cantidad La cantidad de unidades del medicamento a agregar.
     */
    public void agregarMedicamento(Medicamento medicamento, int cantidad) {
        String nombre = medicamento.getNombre();
        if (inventario.containsKey(nombre)) {
            int cantidadExistente = inventario.get(nombre);
            inventario.put(nombre, cantidadExistente + cantidad);
        } else {
            inventario.put(nombre, cantidad);
        }
    }

    /**
     * Método principal que inicializa el programa y simula el funcionamiento de la farmacia.
     * @param args Los argumentos de la línea de comandos (no utilizados en este programa).
     */
    public static void main(String[] args) {
        Farmacia farmacia = new Farmacia();
        Random random = new Random();

        // Agregar medicamentos genéricos al inventario
        final int CANTIDAD_MEDICAMENTOS = 10;
        for (int i = 1; i <= CANTIDAD_MEDICAMENTOS; i++) {
            String nombre = "Medicamento" + i;
            double precio = random.nextDouble() * 100;
            MedicamentoGenerico medicamentoGenerico = new MedicamentoGenerico(nombre, precio);
            farmacia.agregarMedicamento(medicamentoGenerico, 100);
        }

        // Agregar medicamentos especializados al inventario
        final String[] TIPOS_ESPECIALIZADOS = {"Diabetes", "Hipertensión", "Asma", "Cáncer", "VIH"};
        for (int i = 0; i < TIPOS_ESPECIALIZADOS.length; i++) {
            String nombre = "MedicamentoEspecializado" + (i + 1);
            double precio = random.nextDouble() * 100;
            MedicamentoEspecializado medicamentoEspecializado = new MedicamentoEspecializado(nombre, precio, TIPOS_ESPECIALIZADOS[i]);
            farmacia.agregarMedicamento(medicamentoEspecializado, 20);
        }

        // Mostrar el inventario de la farmacia
        System.out.println("Inventario de la farmacia:");
        for (Map.Entry<String, Integer> entry : farmacia.inventario.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " unidades");
        }
    }
}
