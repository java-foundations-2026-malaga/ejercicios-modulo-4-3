package modulo4_3_actividad14;

public class Actividad14 {
    public static void main(String[] args) {
        String palabra1 = "perro";
        String palabra2 = "casa";

        if (palabra1.compareTo(palabra2) < 0) {
            System.out.println(palabra1);
            System.out.println(palabra2);
        } else {
            System.out.println(palabra2);
            System.out.println(palabra1);
        }
    }
}