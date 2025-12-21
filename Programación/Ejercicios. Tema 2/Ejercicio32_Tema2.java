import java.lang.*;
import bpc.daw.reproductor.*;

public class Ejercicio32_Tema2 {
    public static void main (String [] args) {
        //Creo el objeto y meto la ruta del archivo mp3
        ArchivoMP3 archivoMP3 = new ArchivoMP3("C:\\Users\\orihu\\Desktop\\DAW 2025-26\\Programación 25-26\\Tonta.mp3");

        //Creo el reproductor para reproducir y lo pongo en marcha
        Reproductor reproductor = new Reproductor(archivoMP3,false,true);
        reproductor.play();

        //Hago que s emuestre el titulo, el autor y la duración
        System.out.println("El título de la canción es: " + archivoMP3.getTitulo());
        System.out.println("El autor es " + archivoMP3.getAutor());
        System.out.println("La canción dura " + archivoMP3.getDuracion() + " segundos");
    }
}
