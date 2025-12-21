import java.lang.*;

public class Ejercicio36_Tema2 {
    public static void main (String [] args) {
        //Raiz cuadrada de 150
        double raizC = Math.sqrt(25.0);
        System.out.println("Resultado de la raiz cuadrada: " + raizC);

        //2 elevado a 9, y se divide entre el logaritmo neperiano de 6
        double potencia = Math.pow(2, 9);
        double neperiano = Math.log(potencia);
        double division = potencia/neperiano;
        System.out.println("a) Resultado de la elevacion y la division con el logaritmo neperiano: " + division);

        //Coseno de 0.16 radianes
        double coseno = Math.cos(0.16);
        System.out.println("b) Resultado del coseno: " + coseno);

        //Seno de 45 grados
        double grados = 45.0;
        double converGrados = Math.toRadians(grados);
        System.out.println("45 grados son en radianes: " + converGrados);
        double seno = Math.sin(0.78);
        System.out.println("c) Resultado del seno: " + seno);
    }
}
