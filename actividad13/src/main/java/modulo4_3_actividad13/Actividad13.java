package modulo4_3_actividad13;

public class Actividad13 {
    public static void main(String[] args) {
        String name = "Ana", surname = "Garcia";
        // TODO Genera el usuario a.garcia.
        String incialNombre = name.substring(0,1);
        incialNombre = incialNombre.toLowerCase();
        System.out.println("Usuario: "+incialNombre+"."+surname.toLowerCase());
    }
}
