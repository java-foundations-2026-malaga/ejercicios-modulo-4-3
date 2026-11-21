package modulo4_3_actividad12;

public class Actividad12 {
    public static void main(String[] args) {
        String codigo = "PROD-2026-ABC";

        String anio = codigo.substring(5, 9);
        String codigoNormalizado = codigo.replace("-", "/");

        System.out.println("Año: " + anio);
        System.out.println("Código: " + codigoNormalizado);
    }
}
