public class SentenciasBucleEtiquetasBuscar {
    public static void main(String[] args) {

        String frase = "pepe pecas pica papas papas papas";
        String palabra = "papas";
        int maxpalabra = palabra.length();
        int maxfrase = frase.length() - maxpalabra;

        int cantidad = 0;
        char letra = 'a';
        etiqueta:
        for(int i = 0; i <= maxfrase; i++){
            int k = i;
            for(int j = 0; j<maxpalabra ; j++) {

                if (frase.charAt(k++) != palabra.charAt(j)) {
                    continue etiqueta;
                }
            }
            cantidad ++;
        }
        System.out.println("Encontrado = " + cantidad + " de papas");
    }
}
