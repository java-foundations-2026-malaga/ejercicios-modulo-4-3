package modulo4_3_actividad05;

public class Actividad05 {

    public static void main(String[] args) {
        String palabra1 = "abeja";
        String palabra2 = "zorro";

        if (palabra1.compareTo(palabra2) < 0) {
            System.out.println(palabra1);
            System.out.println(palabra2);
        } else {
            System.out.println(palabra2);
            System.out.println(palabra1);
        }
    }
}