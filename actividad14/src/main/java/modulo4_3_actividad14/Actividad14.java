package modulo4_3_actividad14;

public class Actividad14 {
    public static void main(String[] args) {
        String first = "perro", second = "casa";

        if (first.compareTo(second) < 0) {
            System.out.println(first);
            System.out.println(second);
        } else {
            System.out.println(second);
            System.out.println(first);
        }
    }
}
