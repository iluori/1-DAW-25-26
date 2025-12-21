import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.*;
import java.io.PrintWriter;
import java.util.*;

public class Ejercicio24_Tema2 {
    public static void main (String [] args) {
        System.out.println("Escribe una frase:");
        String frase1 = new Scanner (System.in).nextLine();
        System.out.println("Escribe una segunda frase:");
        String frase2 = new Scanner (System.in).nextLine();

        //Creo un objeto file con una ruta
        File archivo = new File("datos.txt");

        //Creo un nuevo archivo en esta ruta
        try {
            archivo.createNewFile();
            System.out.println("Se ha creado el archivo correctamente");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Creo el objeto para escribir en el archivo
        try {
            PrintWriter escribir = new PrintWriter(archivo);
            escribir.println(frase1 + frase2);
            System.out.println("Se ha escrito con éxito");
            escribir.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
