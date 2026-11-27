package modulo4_3_actividad12;

public class Actividad12 {
    public static void main(String[] args) {
        String code = "PROD-2026-ABC";
        String[] words = code.split("-");
        // TODO
        System.out.println("Año: " + words[1]);
        System.out.println("Código: " + code.replace('-', '/'));

    }
}
