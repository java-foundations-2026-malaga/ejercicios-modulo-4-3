package modulo4_3_actividad11;

public class Actividad11 {
    public static void main(String[] args) {
    	
    	String fullName = "Ana Maria Lopez";

        int espacio1 = fullName.indexOf(' ');
        int espacio2 = fullName.indexOf(' ', espacio1 + 1);

        char primero = fullName.charAt(0);
        char segundo = fullName.charAt(espacio1 + 1);
        char tercero = fullName.charAt(espacio2 + 1);

        System.out.println(primero + "." + segundo + "." + tercero + ".");
      
    }
}
