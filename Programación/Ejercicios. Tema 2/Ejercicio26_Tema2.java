import java.lang.*;
import java.util.*;

public class Ejercicio26_Tema2 {
    public static void main (String [] args) {
        //Pregunto al usuario y guardo el numero en una variable entera
        System.out.println("Cuantos segundos quieres esperar?");
        int segundos = new Scanner (System.in).nextInt();

        //Pongo una excepcion en el sleep y pongo los segundos guardados
        try {
            Thread.sleep(segundos);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
