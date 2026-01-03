import bpc.daw.consola.*;
import java.awt.*;
import java.lang.*;

public class ejercicio20_Tema3 {
    public static void main (String[]args) {
        Consola consola = new Consola();
        CapaTexto capaTexto = consola.getCapaTexto();
        Teclado teclado = consola.getTeclado();

        int fila = 1;
        int columna = 1;

        int sumar = 0;
        for(int i = 0; i<20; i++) {
            sumar++;
            String frase = sumar + ") En clase no se juega";
            if (sumar%2 != 0){
                columna = 1;
            }else{
                columna = 30;
            }
            capaTexto.situarCursor(fila,columna);
            capaTexto.println(frase);
            fila ++;
        }
        teclado.leerCaracter();
    }
}
