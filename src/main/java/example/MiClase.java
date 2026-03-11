package example;

public class MiClase {


    public static boolean dia_laboral(String dia) {
        if (dia == null) return false;

        String diaNormalizado = dia.trim().toLowerCase();

        switch (diaNormalizado) {
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                return true;
            case "sabado":
            case "domingo":
                return false;
            default:
                // Si escriben algo que no es un día, devolvemos false
                return false;
        }
    }
}
