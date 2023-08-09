import java.util.Scanner;

public class SentenciaIfElse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese su promedio");
        float promedio = scan.nextFloat();

        if(promedio >= 9.5){
            System.out.println("Excellent promedio!!");
        }else if (promedio >= 8.0){
            System.out.println("mUY BUEN PROMEDIO");

        }
    }
}
