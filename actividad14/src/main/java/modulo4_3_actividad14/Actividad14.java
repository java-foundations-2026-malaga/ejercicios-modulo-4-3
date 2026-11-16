package modulo4_3_actividad14;

public class Actividad14 {
    public static void main(String[] args) {
        String first = "perro", second = "casa";
        // TODO
        if (first.compareTo(second) > 0) { //si es mayor que 0 es por que second esta en primer lugar lexicograficamente
            System.out.println(second + "\n" + first);//si esta primero second se escribe al reves
        } else {
            System.out.println(first + "\n" + second);
        }
    }
}
