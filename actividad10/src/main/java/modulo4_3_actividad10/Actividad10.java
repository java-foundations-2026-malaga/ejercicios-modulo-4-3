package modulo4_3_actividad10;

public class Actividad10 {
    public static void main(String[] args) {
        String fullName = "Ana Garcia";
        // TODO Separa Ana Garcia usando indexOf y substring.
        int espacio = fullName.indexOf(" ");
        String nombre = fullName.substring(0, espacio);
        String apellido = fullName.substring(espacio + 1);
        System.out.println("Nombre: "+nombre+"\nApellido: "+apellido);
    }
}
