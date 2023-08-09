import javax.swing.*;

public class OperadorAritmetico {
    public static void main(String[] args) {

        int i = 5, j = 4;
        int suma = i+j;
        System.out.println("suma = " + suma);
        System.out.println("i+j = " +(i+j));
        int resta = i-j;
        System.out.println("resta = " + resta);
        System.out.println("i = -j" + (i - j));

        int modulo = i%j;
        System.out.println("modulo = " + modulo);
        modulo = 8%5;
        System.out.println("modulo = " + modulo);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        if(numero % 2 == 0){
            System.out.println("el numero es par");
        }else{
            System.out.println("el numero es impar");
        }
    }
}
