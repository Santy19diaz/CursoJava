public class SentenciaEtiquetas {
    public static void main(String[] args) {

        Bucle1:
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2){
                    continue Bucle1;
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }

        etiqueta:
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2){
                    break etiqueta;
                }
                System.out.println("i = " + i + ", j = " + j);
            }

        }

    }
}
