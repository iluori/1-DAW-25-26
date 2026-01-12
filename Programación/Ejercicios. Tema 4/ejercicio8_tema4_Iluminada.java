import java.lang.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bpc.daw.objetos.DepositoAgua;

public class ejercicio8_tema4_Iluminada {
    public static void main (String [] args) {
        //Creo una lista de depositos de agua y despues creo el objeto con una capacidad de 100 litros
        List<DepositoAgua> lista = new ArrayList<>();
        DepositoAgua depositoAgua = new DepositoAgua(0, 100);
        //Aquí añado los 50 depositos a la lista
        for (int i = 0; i < 50; i++) {
            lista.add(depositoAgua);
        }

        boolean repetir = true;
        //Creo un bucle que solo se cierra cuando repetir es false con su respectivo menú
        while (repetir) {
            System.out.println("1. Dibujar depósito");
            System.out.println("2. Rellenar depósito");
            System.out.println("3. Vaciar depósito");
            System.out.println("4. Añadir depósito");
            System.out.println("5. Salir");

            int respuesta_Usuario = new Scanner(System.in).nextInt();

            switch (respuesta_Usuario) {
                case 1:
                    /* Pregunto el numero de deposito que quiere dibujar,
                    * almaceno su respuesta, creo un objeto deposito para almacenar
                    * el numero de deposito que escogió el usuario y después lo dibujo*/
                    System.out.println("¿Qué depósito quieres dibujar?");
                    int num_deposito = new Scanner(System.in).nextInt();
                    DepositoAgua deposito_Lista = lista.get(num_deposito);
                    deposito_Lista.dibujar();
                    break;
                case 2:
                    /* Pregunto el numero de deposito que quiere rellenar,
                     * almaceno su respuesta, pregunto los litros a añadir,
                     * creo un objeto deposito para almacenar
                     * el numero de deposito que escogió el usuario y después
                     * añado los litros*/
                    System.out.println("¿Qué depósito quieres rellenar?");
                    int num_deposito1 = new Scanner(System.in).nextInt();
                    System.out.println("¿Cuántos litros añades?");
                    int num_añadir = new Scanner(System.in).nextInt();
                    DepositoAgua deposito_Lista1 = lista.get(num_deposito1);
                    for (int i=0; i < num_añadir; i++){
                        deposito_Lista1.añadirLitro();
                    }
                    break;
                case 3:
                    /* Pregunto el numero de deposito que quiere vaciar,
                     * almaceno su respuesta, creo un objeto deposito para almacenar
                     * el numero de deposito que escogió el usuario, almaceno
                     * en una variable la cantidad de litros actuales que tiene el
                     * depósito y después retiro todos los litros*/
                    System.out.println("¿Qué depósito quieres vaciar?");
                    int num_deposito2 = new Scanner(System.in).nextInt();
                    DepositoAgua deposito_Lista2 = lista.get(num_deposito2);
                    int cantidad_actual = deposito_Lista2.getCantidadActual();
                    for (int i=0; i < cantidad_actual; i++){
                        deposito_Lista2.retirarLitro();
                    }
                    break;
                case 4:
                    //Creo un desposito nuevo y digo el lugar que ocupa
                    lista.add(depositoAgua);
                    System.out.println("El nuevo depósito ocupa la posición: " + lista.lastIndexOf(depositoAgua));
                    break;
                case 5:
                    repetir = false;
                    break;
                default:
                    System.out.println("Número erróneo");
            }
        }
    }
}
