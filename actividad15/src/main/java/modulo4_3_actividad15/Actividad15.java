package modulo4_3_actividad15;

public class Actividad15 {
    public static void main(String[] args) {
        String order = "Ana:Camisa:3";
        // TODO
        
        int p1 = order.indexOf(":");
        int p2 = order.indexOf(":",p1+1);
        
        
        System.out.println("Cliente: " + order.substring(0, p1)); //devuelve la cadena desde 0 hasta p1
        System.out.println("Producto: " + order.substring(p1+1, p2));
        System.out.println("Cantidad: " + order.substring(p2+1));
    }
}
