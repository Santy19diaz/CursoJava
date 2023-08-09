import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un numero entero");
        //String numeroStr = scanner.nextLine();
        int numeroDecimal = 0;

        try{
             numeroDecimal =scanner.nextInt();//Integer.parseInt(numeroStr);
        }catch (Exception e){
            System.out.println(" Error, solo ingresar numeros enteros!");
            main(args);
            System.exit(0);
        }

        System.out.println("numero Decimal = " + numeroDecimal);

        String resultadoBinario = "numero Binario = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

        String resultadoOctal = "numero Octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);

        String resultadoHexadecimal = "numero Hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);


        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHexadecimal;
        System.out.println(mensaje);;
    }
}