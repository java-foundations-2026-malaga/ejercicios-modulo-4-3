package modulo4_3_actividad09;

public class Actividad09 {
	 public static void main(String[] args) {

	        String phone = "404-543-2345";

	        int primerGuion = phone.indexOf("-");

	        int segundoGuion = phone.indexOf("-", primerGuion + 1);

	        System.out.println("Segundo guion: " + segundoGuion);

	    } 
}
