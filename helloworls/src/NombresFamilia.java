import java.util.Scanner;

public class NombresFamilia {
    public static void main(String[] args) {
        
        String nombre1 = "";
        int largo1 = nombre1.length();
        String nombre2 = "";
        int largo2 = nombre2.length();
        String nombre3 = "";
        int largo3 = nombre3.length();
        
        Scanner scan = new Scanner(System.in);

        System.out.println("ingrese el primer nombre: ");
        nombre1 = scan.nextLine();
        String nombrea = nombre1.toUpperCase().charAt(1) + "." + nombre1.substring(nombre1.length()-2);
        System.out.println("ingrese el segundo nombre: ");
        nombre2 = scan.nextLine();
        String nombreb = nombre2.toUpperCase().charAt(1) + "." + nombre2.substring(nombre2.length()-2);
        System.out.println("ingrese el tercer nombre: ");
        nombre3 = scan.nextLine();
        String nombrec = nombre3.toUpperCase().charAt(1) + "." + nombre3.substring(nombre3.length()-2);


        String resultado = nombrea + "_" + nombreb + "_" + nombrec;
        System.out.println(resultado);
    }
}
