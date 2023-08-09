import java.util.Scanner;

public class OperadorTNumeroMayor {
    public static void main(String[] args) {

        int max = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("ingrese un numero: ");
        int num1 = scan.nextInt();

        System.out.println("ingrese un segundo numero: ");
        int num2 = scan.nextInt();

        System.out.println("ingrese un tercer numero: ");
        int num3 = scan.nextInt();

        max = (num1 > num2) ? num1 : num2;
        max = (max > num3) ? max : num3;
        System.out.println("max = " + max);


    }
}
