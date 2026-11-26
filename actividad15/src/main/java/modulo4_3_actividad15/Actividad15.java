package modulo4_3_actividad15;

public class Actividad15 {
    public static void main(String[] args) {
        String order = "Ana:Camisa:3";
        // TODO
        String cliente = order.substring(0,order.indexOf(':'));
        String producto = order.substring(order.indexOf(':')+1,10);
        String cantidad = order.substring(producto.length()+5, order.length());
        System.out.println("Cliente: " + cliente);
        System.out.println("Producto: " + producto);
        System.out.println("Cantidad: " + cantidad);
    }
}
