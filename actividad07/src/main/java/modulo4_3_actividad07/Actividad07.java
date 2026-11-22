package modulo4_3_actividad07;

// Imprime el primero, cuarto y último carácter de Programming.
public class Actividad07 {
    public static void main(String[] args) {
        String text = "Programming";
        System.out.println("Primero: " + text.charAt(0));
        System.out.println("Cuarto: " + text.charAt(3));
        System.out.println("Último: " + text.charAt(text.length() - 1));
    }
}
