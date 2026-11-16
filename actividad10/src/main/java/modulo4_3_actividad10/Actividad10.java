package modulo4_3_actividad10;

public class Actividad10 {
    public static void main(String[] args) {
        String fullName = "Ana Garcia";
        // TODO
        int idx = fullName.indexOf(" ");
        
        System.out.println("Nombre: " + fullName.substring(0, idx));
        System.out.println("Apellido: " + fullName.substring(idx + 1));
    }
}
