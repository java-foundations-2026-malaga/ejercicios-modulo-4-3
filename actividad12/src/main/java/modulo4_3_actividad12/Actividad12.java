package modulo4_3_actividad12;

public class Actividad12 {
    public static void main(String[] args) {
        String code = "PROD-2026-ABC";
        // TODO
        int a = code.indexOf("-");
        int b = code.indexOf("-", a+1);
        String ano = code.substring(a+1, b);
        System.out.println("Año: " + ano);
        System.out.println("Código: " + code.replace("-", "/"));
    }
}
