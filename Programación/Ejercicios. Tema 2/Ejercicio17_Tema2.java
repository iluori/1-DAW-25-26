import java.lang.*;
import java.util.*;

public class Ejercicio17_Tema2 {
    public static void main (String [] args) {
        System.out.println("Escribe tu nombre:");
        String nombre = new Scanner (System.in).nextLine();
        System.out.println("Escribe tu dominio:");
        String dominio = new Scanner (System.in).nextLine();

        String com = ".com";
        String es = ".es";

        if (dominio.indexOf(com) == -1 && dominio.indexOf(es) == -1) {
            System.out.println("Tu dominio es incorrecto");
        } else {
            System.out.println("Tu correo es: " + nombre + "@" + dominio);
        }
    }
}
