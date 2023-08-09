public class PasarValor {
    public static void main(String[] args) {

        int i = 10;

        System.out.println("inicio = " + i);
        test(i);
        System.out.println("i = " + i);

    }
    public static void test(int x){
        System.out.println("inicio metodo test con i = " +x);
        x=35;
        System.out.println("finaliza el metodo test " + x);
    }
}
