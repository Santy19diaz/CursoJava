
public class EjemploArreglosForBubbleSort {
    public static void main(String[] args) {

        String[] productos = new String[7];
        productos[0] = "msi raider ge76";
        productos[1] = "msi raider ge66";
        productos[2] = "msi leopard gp56";
        productos[3] = "Asus tuf dash f15";
        productos[4] = "Asus tuf gaming f15";
        productos[5] = "Asus rog zephyrus m16";
        productos[6] = "Asus rog flow g15";

        String auxiliar = " ";

        for(int i = 0; i< productos.length-1;i++){

            for(int j = 0; j < productos.length -1 -i; j++){
                if(productos[j+1].compareTo(productos[j])<0){
                    auxiliar = productos[j];
                    productos[j] = productos[j+1];
                    productos[j] = auxiliar;
                }
            }
        }

        for (String producto : productos) {
            System.out.println("productos = " + producto);
        }


    }
} 
