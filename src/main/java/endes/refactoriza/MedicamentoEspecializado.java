package endes.refactoriza;

/**
 * Clase que representa un medicamento especializado.
 */
public class MedicamentoEspecializado extends Medicamento {
    private String tipo;

    /**
     * Constructor de la clase MedicamentoEspecializado.
     * @param nombre Nombre del medicamento especializado.
     * @param precio Precio del medicamento especializado.
     * @param tipo Tipo de enfermedad para la que está especializado el medicamento.
     */
    public MedicamentoEspecializado(String nombre, double precio, String tipo) {
        super(nombre, precio);
        this.tipo = tipo;
    }

    /**
     * Método para obtener el tipo de enfermedad para la que está especializado el medicamento.
     * @return El tipo de enfermedad.
     */
    public String getTipo() {
        return tipo;
    }
}
