package modulo4_3_actividad10;

public class Actividad10 {
    public static void main(String[] args) {
    	 String fullName = "Ana Garcia";

         int espacio = fullName.indexOf(' ');

         System.out.println("Nombre: " + fullName.substring(0, espacio));

         System.out.println("Apellido: " + fullName.substring(espacio + 1));
    } 
}
