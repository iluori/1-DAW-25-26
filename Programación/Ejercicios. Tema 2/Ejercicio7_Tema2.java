import java.lang.*;
import bpc.daw.objetos.DepositoAgua;

public class Ejercicio7_Tema2 {
    public static void main (String [] args) {
        DepositoAgua deposito_Agua = new DepositoAgua(15,50);

        deposito_Agua.dibujar();

        int tanto_Cien = 15*100 /50;
        System.out.println("El porcentaje ocupado es del " + tanto_Cien + "%");
    }
}
