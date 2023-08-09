import java.util.Scanner;

public class MinimoDeScan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int limite;
        int numero;
        int menor = Integer.MAX_VALUE;

        System.out.println("ingrese la cantidad de numeros a comparar: ");
        limite = scan.nextInt();
        if(limite >= 10){
            for (int i = 0; i < limite ; i++ ){
                System.out.println("ingrese el numero: " + (i+1));
                numero = scan.nextInt();
                menor = (numero < menor) ? numero : menor;

            }

        }else{
            System.out.println("error!, la cantidad minima es de 10.");
            main(args);

        }
        System.out.println("El valor minimo es: " + menor);


    }
}
