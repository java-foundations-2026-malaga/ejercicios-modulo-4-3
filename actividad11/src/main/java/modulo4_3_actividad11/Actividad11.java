package modulo4_3_actividad11;

public class Actividad11 {
    public static void main(String[] args) {
        String fullName = "Ana Maria Lopez";
        // TODO
        
        char a = fullName.charAt(0);//Primera letra
        int b = fullName.indexOf(" ");
        char c = fullName.charAt(b + 1); //Segunda letra
        int d = fullName.indexOf(" ", b+1);
        char e = fullName.charAt(d+ 1); //Tercera letra
        
        System.out.println(a + "." + c + "." + e + ".");
        
        
    }
}
