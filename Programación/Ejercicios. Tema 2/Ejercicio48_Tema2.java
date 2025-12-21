import java.lang.*;
import bpc.daw.objetos.MarcadorMejorado;

public class Ejercicio48_Tema2 {
    public static void main (String [] args) {
        MarcadorMejorado baloncesto = new MarcadorMejorado("Estudiantes", "CB Granada");

        //Anoto las canastas de los equipos
        baloncesto.anotarCanasta(MarcadorMejorado.CANASTA_LOCAL, MarcadorMejorado.NORMAL);
        baloncesto.anotarCanasta(MarcadorMejorado.CANASTA_LOCAL, MarcadorMejorado.NORMAL);
        baloncesto.anotarCanasta(MarcadorMejorado.CANASTA_LOCAL, MarcadorMejorado.TIRO_LIBRE);
        baloncesto.anotarCanasta(MarcadorMejorado.CANASTA_LOCAL, MarcadorMejorado.TIRO_LIBRE);


        baloncesto.anotarCanasta(MarcadorMejorado.CANASTA_VISITANTE, MarcadorMejorado.TRIPLE);
        baloncesto.anotarCanasta(MarcadorMejorado.CANASTA_VISITANTE, MarcadorMejorado.NORMAL);
        baloncesto.anotarCanasta(MarcadorMejorado.CANASTA_VISITANTE, MarcadorMejorado.TRIPLE);

        //Muestro el nombre de los equipos y sus puntos
        System.out.println(baloncesto.anotarCanasta(MarcadorMejorado.CANASTA_VISITANTE, MarcadorMejorado.NORMAL));

        //Muestro el nombre del ganador y el nombre del perdedor
        System.out.println("Por lo que el ganador es " + baloncesto.getNombreEquipoGanador());
        System.out.println("Y el equipo perdedor es " + baloncesto.getNombreEquipoPerdedor());

    }
}