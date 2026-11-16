package modulo4_3_actividad13;

public class Actividad13 {
    public static void main(String[] args) {
        String name = "Ana", surname = "Garcia";
        // TODO
        String name1 = name.toLowerCase(); //Convierte toda la cadena en minuscula
        char primeraletra = name1.charAt(0);
        String surname2 = surname.toLowerCase();
        
        System.out.println("Usuario: " + primeraletra + "." + surname2);
    }

}
