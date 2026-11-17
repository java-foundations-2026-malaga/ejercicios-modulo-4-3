package modulo4_3_actividad15;

public class Actividad15 {
    public static void main(String[] args) {
        String order = "Ana:Camisa:3";
        // TODO Extrae cliente, producto y cantidad usando indexOf y substring.
        int separador01 = order.indexOf(":");
        int separador02 = order.indexOf(":", separador01 + 1);
        String cliente = order.substring(0, separador01);
        String producto = order.substring(separador01 + 1, separador02);
        String cantidad = order.substring(separador02 + 1);
        
        System.out.println("Cliente: "+cliente+"\nProducto: "+producto+"\nCantidad: "+ cantidad);
    }
}
