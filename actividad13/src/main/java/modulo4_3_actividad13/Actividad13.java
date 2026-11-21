package modulo4_3_actividad13;

public class Actividad13 {
    public static void main(String[] args) {
        String nombre = "Ana";
        String apellido = "Garcia";

        String usuario = nombre.substring(0, 1).toLowerCase()
                + "." + apellido.toLowerCase();

        System.out.println("Usuario: " + usuario);
    }
}