import java.lang.*;
import java.util.Scanner;

public class ejercicio15_tema4_Iluminada {
    public static void main (String []args) {
        System.out.println("Escribe tu número de DNI");
        int num_dni = new Scanner(System.in).nextInt();

        int resto_division = num_dni%23;

        int[] lista = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','B','T'};

        System.out.println("Te corresponde la letra: " + (char)lista[resto_division]);
    }
}
