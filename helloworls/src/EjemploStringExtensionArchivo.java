public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        String archivo = "alguna_imagen.pdf";
        System.out.println("archivo.length() = " + archivo.length());
        int i = archivo.lastIndexOf(".");
        System.out.println("archivo.substring(archivo.length()-4) = " + archivo.substring(i+1));

    }
}
