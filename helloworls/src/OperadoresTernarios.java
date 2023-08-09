import java.util.Scanner;

public class OperadoresTernarios {
    public static void main(String[] args) {
       /* String Variable = 7 == 7 ? "si es verdadero" : "si es falso";
        System.out.println("Variable = " + Variable);*/


        double promedio = 0.0;
        double matematicas = 0.0;
        double histortia = 0.0;
        double ciencias = 0.0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la calificacion de matematicas");
        matematicas = scan.nextDouble();
        System.out.println("Ingrese la calificacion de historia");
        histortia = scan.nextDouble();
        System.out.println("Ingrese la calificacion de ciencias");
        ciencias = scan.nextDouble();

        promedio = (matematicas + ciencias + histortia)/3;

        String estado = promedio >= 6.0?"aprobado ":"rechazado ";
        System.out.println("estado = " + estado + promedio);
    }


}
