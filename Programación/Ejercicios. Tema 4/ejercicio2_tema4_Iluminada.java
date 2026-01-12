import java.lang.*;
import java.util.*;

public class ejercicio2_tema4_Iluminada {
    public static void main (String [] args) {
        //Creo una nueva lista
        List<String> mensajes =  new ArrayList<>();

        boolean repetir = true;
        //Bucle while con menú y termina cuando yo ponga false en repetir (opción 6)
        while(repetir) {
            System.out.println("1) Añadir mensaje");
            System.out.println("2) Consultar tamaño");
            System.out.println("3) Consultar mensaje");
            System.out.println("4) Comprobar mensaje");
            System.out.println("5) Consultar todos los mensajes");
            System.out.println("6) Borrar todo");

            int eleccion = new Scanner(System.in).nextInt();

            switch(eleccion) {
                case 1:
                    //Escribe mensaje y lo añado a la lista
                    System.out.println("Escribe un mensaje:");
                    String mensaje_Usuario = new Scanner(System.in).nextLine();
                    mensajes.add(mensaje_Usuario);
                    break;
                case 2:
                    //Devuelvo el tamaño de la lista
                    System.out.println("Su tamaño es: " + mensajes.size());
                    break;
                case 3:
                    //Consulto un número de mensaje si la lista no está vacía
                    if (!mensajes.isEmpty()) {
                        System.out.println("¿Qué número de mensaje desea consultar?");
                        int posicion = new Scanner(System.in).nextInt();
                        if(posicion < 0 && posicion>mensajes.size()) {
                            System.out.println("Ese número de mensaje no existe");
                        } else {
                            System.out.println(mensajes.get(posicion));
                        }
                    } else {
                        System.out.println("No hay mensajes");
                    }
                    break;
                case 4:
                    //Compruebo que un mensaje de la lista, digo si está o no y devuelvo la posición en caso de que esté
                    System.out.println("Escribe un mensaje:");
                    String mensaje_Usuario2 = new Scanner(System.in).nextLine();
                    if (mensajes.indexOf(mensaje_Usuario2) == -1){
                        System.out.println("No está tu mensaje en la lista");
                    }else {
                        System.out.print("Tu mensaje está en la lista y está en la posición: ");
                        System.out.println(mensajes.indexOf(mensaje_Usuario2));
                    }
                    break;
                case 5:
                    //Muestro todos los mensajes de la lista
                    for (int i=0;i<mensajes.size();i++){
                        System.out.println(mensajes.get(i));
                    }
                    break;
                case 6:
                    //Elimino todos los mensajes de la lista
                    mensajes.clear();
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }
}
