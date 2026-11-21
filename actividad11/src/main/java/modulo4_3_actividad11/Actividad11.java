package modulo4_3_actividad11;

public class Actividad11 {

    public static void main(String[] args) {
        String nombreCompleto = "Ana Maria Lopez";

        int primerEspacio = nombreCompleto.indexOf(" ");
        int segundoEspacio = nombreCompleto.indexOf(" ", primerEspacio + 1);

        char inicial1 = nombreCompleto.charAt(0);
        char inicial2 = nombreCompleto.charAt(primerEspacio + 1);
        char inicial3 = nombreCompleto.charAt(segundoEspacio + 1);

        System.out.println(inicial1 + "." + inicial2 + "." + inicial3 + ".");
    }
}
