package modulo4_3_actividad11;

public class Actividad11 {
	   public static void main(String[] args) {

	        String fullName = "Ana Maria Lopez";

	        int primerEspacio = fullName.indexOf(" ");
	        int segundoEspacio = fullName.indexOf(" ", primerEspacio + 1);

	        char inicialNombre = fullName.charAt(0);
	        char inicialSegundoNombre = fullName.charAt(primerEspacio + 1);
	        char inicialApellido = fullName.charAt(segundoEspacio + 1);

	        System.out.println(inicialNombre + "." + inicialSegundoNombre + "." + inicialApellido + ".");

	    }

	}
