public class PrimitivosFloat {

    static float VarFlotante;

    public static void main(String[] args) {

        float real = 1.5e1f;
        System.out.println("real = " + real);
        System.out.println("Float corresponde en byte a = " + Float.BYTES);
        System.out.println("Float corresponde en byte a = " + Float.SIZE);
        System.out.println("Float corresponde en byte a = " + Float.MAX_VALUE);
        System.out.println("Float corresponde en byte a = " + Float.MIN_VALUE + '\n');

        double realDoble = 3.4028235E39;
        System.out.println("realDoble = " + realDoble);
        System.out.println("double corresponde en byte a = " + Double.BYTES);
        System.out.println("double corresponde en byte a = " + Double.SIZE);
        System.out.println("double corresponde en byte a = " + Double.MAX_VALUE);
        System.out.println("double corresponde en byte a = " + Double.MIN_VALUE + '\n');

        //float VarFlotante = 3.1416f;
        System.out.println("VarFlotante = " + VarFlotante);


    }
}
