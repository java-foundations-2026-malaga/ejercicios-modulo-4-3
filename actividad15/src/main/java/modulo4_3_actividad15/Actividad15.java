package modulo4_3_actividad15;

public class Actividad15 {
    public static void main(String[] args) {
        String lineaPedido = "Ana Camisa 3";

        int primerEspacio = lineaPedido.indexOf(" ");
        int segundoEspacio = lineaPedido.indexOf(" ", primerEspacio + 1);

        String cliente = lineaPedido.substring(0, primerEspacio);
        String producto = lineaPedido.substring(primerEspacio + 1, segundoEspacio);
        String cantidad = lineaPedido.substring(segundoEspacio + 1);

        System.out.println("Cliente: " + cliente);
        System.out.println("Producto: " + producto);
        System.out.println("Cantidad: " + cantidad);
    }
}
