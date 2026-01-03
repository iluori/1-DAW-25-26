import java.lang.*;
import java.net.InetAddress;
import java.util.Scanner;

public class ejercicio22_Tema3 {
    public static void main (String[]args) {
        System.out.println("Dime una dirección IP:");
        //Lo meto en un String porque luego tengo que pasarle al metodo de InetAdress bytes.
        String ip = new Scanner(System.in).nextLine();

        int p1 = ip.indexOf('.');
        String primer = ip.substring(0,p1);
        int p2 = ip.indexOf('.', p1 + 1);
        String segundo = ip.substring(p1 + 1,p2);
        int p3 = ip.indexOf('.', p2 + 1);
        String tercer = ip.substring(p2 + 1,p3);
        String cuarto = ip.substring(p3, + 1);

        InetAddress.getByAddress()
    }
}
