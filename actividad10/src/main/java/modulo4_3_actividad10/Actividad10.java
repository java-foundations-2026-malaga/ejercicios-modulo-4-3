package modulo4_3_actividad10;

public class Actividad10 {

    public static void main(String[] args) {
        String nombreCompleto = "Ana Garcia";

        int espacio = nombreCompleto.indexOf(" ");

        String nombre = nombreCompleto.substring(0, espacio);
        String apellido = nombreCompleto.substring(espacio + 1);

        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
    }
}
