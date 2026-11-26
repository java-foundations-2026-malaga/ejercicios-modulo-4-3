package modulo4_3_actividad13;

public class Actividad13 {
    public static void main(String[] args) {
        String name = "Ana", surname = "Garcia";
        // TODO
        String usuario = name.substring(0, 1).toLowerCase();
        String usuarioCompleto = usuario.concat(".").concat(surname.toLowerCase());
        System.out.println("Usuario: " + usuarioCompleto);
    }
}
