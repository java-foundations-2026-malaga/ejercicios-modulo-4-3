package modulo4_3_actividad12;

public class Actividad12 {
    public static void main(String[] args) {
        String code = "PROD-2026-ABC";
        // TODO
        String anio = code.substring(code.indexOf('-')+1,9);
        String codigo = code.replace('-','/');
        System.out.println("Año: " + anio);
        System.out.println("Código: " + codigo);
    }
}
