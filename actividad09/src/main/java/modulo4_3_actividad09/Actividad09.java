package modulo4_3_actividad09;

public class Actividad09 {
    public static void main(String[] args) {
        String phone = "404-543-2345";
        // TODO
        System.out.println("Segundo guion: " + (phone.substring(phone.indexOf('-') + 1).indexOf('-') + phone.indexOf('-') + 1));
    }
}
