package endes.refactoriza;

/**
 * Clase que representa una farmacia con su inventario de medicamentos.
 */
public abstract class Medicamento {
    protected String nombre;
    protected double precio;

    /**
     * Constructor de la clase Medicamento.
     * @param nombre Nombre del medicamento.
     * @param precio Precio del medicamento.
     */
    public Medicamento(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    /**
     * Método para obtener el nombre del medicamento.
     * @return El nombre del medicamento.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para obtener el precio del medicamento.
     * @return El precio del medicamento.
     */
    public double getPrecio() {
        return precio;
    }
}
