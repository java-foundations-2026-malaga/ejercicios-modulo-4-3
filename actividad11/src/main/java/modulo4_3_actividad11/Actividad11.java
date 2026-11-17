package modulo4_3_actividad11;

public class Actividad11 {
    public static void main(String[] args) {
        String fullName = "Ana Maria Lopez";

        int primerEspacio = fullName.indexOf(' ');
        int segundoEspacio = fullName.indexOf(' ', primerEspacio + 1);

        char inicial1 = fullName.charAt(0);
        char inicial2 = fullName.charAt(primerEspacio + 1);
        char inicial3 = fullName.charAt(segundoEspacio + 1);

        System.out.println(inicial1 + "." + inicial2 + "." + inicial3 + ".");
    }
}
