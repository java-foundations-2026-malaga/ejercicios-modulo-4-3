package modulo4_3_actividad09;

public class Actividad09 {
    public static void main(String[] args) {
        String phone = "404-543-2345";
        // TODO
        int first = phone.indexOf('-');
        int second = phone.indexOf('-', first + 1);
        System.out.println("Segundo guion: " + second);
    }
}
