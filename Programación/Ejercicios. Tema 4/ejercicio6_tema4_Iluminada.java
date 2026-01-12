import java.lang.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ejercicio6_tema4_Iluminada {
    public static void main (String [] args) {
        //Creo una lista vacía
        List<Integer> lista = new ArrayList<>();

        System.out.println("Dime 10 números:");
        //Cuando el usuario registre los 10 numeros yo los guardo y los añado a la lista
        for (int i = 0; i < 10; i++){
            int numeros_Usuario = new Scanner(System.in).nextInt();
            lista.add(numeros_Usuario);
        }
        //Declaro el mayor y menor numero de la lista con la primera posición
        int mayor = lista.get(0);
        int menor = lista.get(0);
        //Consulto los numeros de la lista y voy viendo uno a uno si es mayor o menor que el que esté actualmente visible en i
        for (int i = 0; i<lista.size(); i++) {
            int numero = lista.get(i);
            if (numero > mayor) {
                mayor = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }
        System.out.println("El mayor es: " + mayor);
        System.out.println("El menor es: " + menor);
    }
}
