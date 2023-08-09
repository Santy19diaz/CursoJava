import java.util.Arrays;

public class EjemploArreglosForInverso {
    public static void main(String[] args) {

        String[] productos = new String[7];
        productos[0] = "msi raider ge76";
        productos[1] = "msi raider ge66";
        productos[2] = "msi leopard gp56";
        productos[3] = "Asus tuf dash f15";
        productos[4] = "Asus tuf gaming f15";
        productos[5] = "Asus rog zephyrus m16";
        productos[6] = "Asus rog flow g15";

        Arrays.sort(productos);

        for (String producto : productos) {
            System.out.println("productos = " + producto);
        }
        System.out.println("\n");

        for (int i = 0; i < productos.length; i++) {
            System.out.println("productos = " + productos[productos.length - 1 - i]);

        }

        System.out.println("\n");

        for (int i = productos.length - 1; i >= 0; i--) {
            System.out.println("productos = " + productos[i]);
        }

    }
}
