package modulo4_3_actividad12;

public class Actividad12 {
	public static void main(String[] args) {

        String code = "PROD-2026-ABC";

        int primerGuion = code.indexOf("-");
        int segundoGuion = code.indexOf("-", primerGuion + 1);

        String anio = code.substring(primerGuion + 1, segundoGuion);

        String codigoNormalizado = code.replace("-", "/");

        System.out.println("Año: " + anio);
        System.out.println("Código: " + codigoNormalizado);

    }

}
