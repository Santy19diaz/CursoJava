import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String factura = " ";
        double precio1 = 0;
        double precio2 = 0;
        double totalb = 0;
        double total = 0;
        double impuesto = 0;
        String mensaje = " ";

        System.out.println("Ingrese el nombre de facturazion");

        factura = scanner.nextLine();

        System.out.println("Ingrese el precio del primer producto: ");
        precio1 = scanner.nextDouble();
        System.out.println("Ingrese el precio del segundo producto: ");
        precio2 = scanner.nextDouble();

        totalb = precio1 + precio2;

        impuesto = (19*totalb)/100;

        total = totalb + impuesto;

        System.out.println("La factura: " + factura +" Tiene un total de: " + Double.toString(totalb) + ", con un impuesto de: " + Double.toString(impuesto) + ". Dando un total de: " + Double.toString(total));


    }
}
