package modulo4_3_actividad15;

public class Actividad15 {
    public static void main(String[] args) {
        String order = "Ana:Camisa:3";

        int primerDosPuntos = order.indexOf(':');
        int segundoDosPuntos = order.indexOf(':', primerDosPuntos + 1);

        String cliente = order.substring(0, primerDosPuntos);
        String producto = order.substring(primerDosPuntos + 1, segundoDosPuntos);
        String cantidad = order.substring(segundoDosPuntos + 1);

        System.out.println("Cliente: " + cliente);
        System.out.println("Producto: " + producto);
        System.out.println("Cantidad: " + cantidad);
    }
}
