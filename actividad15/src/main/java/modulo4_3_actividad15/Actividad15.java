package modulo4_3_actividad15;

public class Actividad15 {
	public static void main(String[] args) {

        String order = "Ana:Camisa:3";

        int primerSeparador = order.indexOf(":");
        int segundoSeparador = order.indexOf(":", primerSeparador + 1);

        String cliente = order.substring(0, primerSeparador);

        String producto = order.substring(primerSeparador + 1, segundoSeparador);

        String cantidad = order.substring(segundoSeparador + 1);

        System.out.println("Cliente: " + cliente);
        System.out.println("Producto: " + producto);
        System.out.println("Cantidad: " + cantidad);

    }

}