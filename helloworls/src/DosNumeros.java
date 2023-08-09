import java.util.Scanner;

public class DosNumeros {
    public static void main(String[] args) {

        int maximo = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("ingrese el primer numero: ");
        int numero1 = scan.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int numero2 = scan.nextInt();
         maximo = (numero1 > numero2)? numero1 : numero2;
        System.out.println("el numero mas grande es: " + maximo);


    }
}
