public class PrimitivoBoolean {
    public static void main(String[] args) {
        
        boolean datologico = Boolean.TRUE;

        System.out.println("datologico = " + datologico);
        
        double d = 98654.42e-3;
        float f = 1.2345e2f;
        System.out.println("d = " + d);
        System.out.println("f = " + f);

        datologico = d < f;
        System.out.println("datologico = " + datologico);

        boolean esigual = 3-2 !=1;
        System.out.println("esigual = " + esigual);

    }
}
