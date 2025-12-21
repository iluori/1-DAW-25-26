import java.lang.*;
import bpc.daw.mario.*;

public class Ejercicio2_Tema2 {
    public static void main (String [] args) {
        Mario m1 = new Mario (100);
        Mario m2 = new Mario (640,320);

        Seta seta = new Seta(0,0);

        Cañon cañon = new Cañon(100,320);

        Planta p1 = new Planta(400,500);
        Planta p2 = new Planta(450,500);
        Planta p3 = new Planta(500,500);

        Luigi luigi = new Luigi(200);
        Mario m3 = new Mario(luigi, 50);
    }
}
