package modulo4_3_actividad12;

public class Actividad12 {
    public static void main(String[] args) {
        String code = "PROD-2026-ABC";
        // TODO Extrae el año y reemplaza guiones por barras.
        int primerGuion = code.indexOf("-")+1;
        int segundoGuion = code.indexOf("-", primerGuion +1);
        String anio = code.substring(primerGuion, segundoGuion);
        String codeSalida = code.replace("-", "/");
        System.out.println("Año: "+anio+"\nCódigo: "+codeSalida);
    }
}
