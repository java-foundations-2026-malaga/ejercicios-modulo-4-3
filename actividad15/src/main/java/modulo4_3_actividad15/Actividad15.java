package modulo4_3_actividad15;

public class Actividad15 {
    public static void main(String[] args) {
        String order = "Ana:Camisa:3";
        String name = order.substring(0, order.indexOf(':'));
        String[] stuff = order.split(":");
        // TODO
        System.out.println("Cliente: " + name);
        System.out.println("Producto: " + stuff[1]);
        System.out.println("Cantidad: " + stuff[2]);
    }
}
