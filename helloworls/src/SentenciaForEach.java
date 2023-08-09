public class SentenciaForEach {
    public static void main(String[] args) {
        int[] numeros = {1,3,5,7,11,17};

        for(int num: numeros){
            System.out.println("num = " + num);
        }

        String[] nombres = {"Alejandra","Angel","Santiago","Carmen","lizeth","Diana"};

        for(String nombre:nombres){
            System.out.println("nombre = " + nombre);
        }
    }
}
