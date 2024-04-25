package endes.baremo;

public class Baremo {
    public String comprobarBaremo(String DNI, int baremo) {
        if (comprobarDni(DNI)) {
            if (baremo > 5 && baremo <= 10) {
                return "Adjudicada";
            } else if (0 <= baremo && baremo < 5) {
                return "No adjudicada";
            }
        }
        return "Dato no valido";
    }

    public boolean comprobarDni(String dni) {
        return dni.matches("^[0-9]{7,8}[A-Za-z]$"); // UN regex para comprobar el DNI
    }
}
