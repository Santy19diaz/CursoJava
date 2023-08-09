public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {

        String Trabalenguas = "trabalenguas";
        char[] arreglo = Trabalenguas.toCharArray();
        int largo = arreglo.length;
        System.out.println("largo = " + largo);
        for (int i = 0; i < largo; i++) {
            System.out.println(arreglo[i]);
        }
        String[] arreglo2 = Trabalenguas.split("a" );
        int largo2 = arreglo2.length;
        for (int i = 0; i < largo2; i++) {
            System.out.println(arreglo2[i]);
        }


    }
}
