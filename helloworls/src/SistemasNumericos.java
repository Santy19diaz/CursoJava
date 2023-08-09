import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null,"ingrese un numero entero");

        int numeroDecimal =0;
        try{
             numeroDecimal = Integer.parseInt(numeroStr);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null," Error, solo ingresar numeros enteros");
            main(args);
            System.exit(0);
        }

        System.out.println("numero Decimal = " + numeroDecimal);

        String resultadoBinario = "numero Binario = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);
        int numeroBinario = 0b10101;
        System.out.println("numero Binario = " + numeroBinario);

        String resultadoOctal = "numero Octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);
        int numeroOctal = 025;
        System.out.println("numero Octal = " + numeroOctal);

        String resultadoHexadecimal = "numero Hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHexadecimal);
        int numeroHexadecimal = 0x15;

        System.out.println("numeroHexadecimal = " + numeroHexadecimal);

        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHexadecimal;
        JOptionPane.showMessageDialog(null,mensaje);
    }
}