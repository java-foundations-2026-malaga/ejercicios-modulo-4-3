package modulo4_3_actividad11;

public class Actividad11 {
    public static void main(String[] args) {
        String fullName = "Ana Maria Lopez";
        // TODO
        System.out.println(fullName.charAt(0) + "." + fullName.charAt(fullName.indexOf(' ') + 1) + "." + fullName.substring(fullName.indexOf(' ') + 1).charAt(6) + ".");
    }
}
