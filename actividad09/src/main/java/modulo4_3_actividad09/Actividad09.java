package modulo4_3_actividad09;

public class Actividad09 {
    public static void main(String[] args) {
        String phone = "404-543-2345";
        // TODO
        int idx = phone.indexOf("-");
        
        System.out.println("Segundo guion: " + phone.indexOf("-", idx+1));
    }
}
