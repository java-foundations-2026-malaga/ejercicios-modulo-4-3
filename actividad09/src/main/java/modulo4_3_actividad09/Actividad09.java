package modulo4_3_actividad09;

public class Actividad09 {
    public static void main(String[] args) {
        String phone = "404-543-2345";
        // TODO Usa la posición del primero para buscar el segundo.
        System.out.println("Segundo guion: "+phone.indexOf(phone.charAt(3),phone.indexOf(phone.charAt(3))+1));
    }
}
