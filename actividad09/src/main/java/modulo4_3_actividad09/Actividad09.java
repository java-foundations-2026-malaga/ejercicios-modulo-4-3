package modulo4_3_actividad09;

public class Actividad09 {

    public static void main(String[] args) {
        String telefono = "123-456-789";

        int primerGuion = telefono.indexOf("-");
        int segundoGuion = telefono.indexOf("-", primerGuion + 1);

        System.out.println("Segundo guion: " + segundoGuion);
    }
}
