package modulo4_3_actividad11;

public class Actividad11 {
    public static void main(String[] args) {
        String fullName = "Ana Maria Lopez";
        // TODO Extrae A.M.L. de un nombre con tres partes.
        int primerEspacio = fullName.indexOf(" ");
        int segundoEspacio = fullName.indexOf(" ", primerEspacio +1);
        char inicial_1 = fullName.charAt(0);
        char inicial_2 = fullName.charAt(primerEspacio + 1);
        char inicial_3 = fullName.charAt(segundoEspacio + 1);
        System.out.println(inicial_1+"."+inicial_2 + "." + inicial_3+".");
        /*int espacio = fullName.indexOf(" ");
        String nombre = fullName.substring(0, 1);
        String apellido1 = fullName.substring(espacio + 1, espacio+2);
        int espacio2 = fullName.indexOf(" ", espacio + 1);
        String apellido2 = fullName.substring(espacio2 +1, espacio2 +2);
        
        System.out.println(nombre+"."+apellido1 + "." + apellido2);*/
        
    }
}
