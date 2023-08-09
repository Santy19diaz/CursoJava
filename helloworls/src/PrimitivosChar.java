public class PrimitivosChar {
    public static void main(String[] args) {
        char caracter = '\u0040';
        char decimal = 64;
        System.out.println("decimal = " + decimal);
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = caracter: "+ (decimal == caracter));

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter: " + (decimal == simbolo));


        System.out.println("Char corresponde en byte a = " + Character.BYTES);
        System.out.println("Char corresponde en byte a = " + Character.SIZE);
        System.out.println("Char corresponde en byte a = " + Character.MAX_VALUE);
        System.out.println("Char corresponde en byte a = " + Character.MIN_VALUE);

        char espacio = ' ';

        System.out.println("Char corresponde en byte a = " +espacio + Character.BYTES);
        System.out.println("Char corresponde en byte a = " + Character.SIZE);
        System.out.println("Char corresponde en byte a = " + Character.MAX_VALUE);
        System.out.println("Char corresponde en byte a = " + Character.MIN_VALUE);

        char retroceso = '\b';

        System.out.println("\rChar corresponde en byte a = " + System.getProperty("line.separator") + Character.BYTES);
        System.out.println("Char corresponde en byte a = " + Character.SIZE);
        System.out.println("Char corresponde en byte a = " + Character.MAX_VALUE);
        System.out.println("Char corresponde en byte a = " + Character.MIN_VALUE);

    }
}
