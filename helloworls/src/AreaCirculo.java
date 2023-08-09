import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {


        int radio = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el radio de un circulo para calcular su area");
        radio = scan.nextInt();

        double area = 0.00;
        area = ((Math.PI)*(Math.pow(radio,2)));
        System.out.println("area = " + area);
    }
}
