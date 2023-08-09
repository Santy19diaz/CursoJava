public class PasarReferencia {
    public static void main(String[] args) {

        int[] edad = {10,11,12};

        System.out.println("inicio = ");
        for(int i = 0 ;i<edad.length; i++){
            System.out.println("edad[i] = " + edad[i]);
        }
        System.out.println("Antes de llamar a metodo test");
        test(edad);
        System.out.println("Despues de llamar a metodo test");
        for(int i = 0 ;i<edad.length; i++){
            System.out.println("edad[i] = " + edad[i]);
        }
        System.out.println("Fin metodo main con los datos modificados");

    }
    public static void test(int[] x){
        System.out.println("inicio metodo test x");
        for(int i = 0 ;i<x.length; i++){
            System.out.println("edad[i] = " + x[i]);
            x[i] = x[i]+20;
        }
        System.out.println("finaliza el metodo test ");
    }
}
