public class WrapperInteger {
    public static void main(String[] args) {
        Integer intobjeto = Integer.valueOf(32768);
        Integer intobjet2 = 32768;
        System.out.println("intobjeto = " + intobjeto);

        int num = intobjeto;
        int num2 = intobjet2.intValue();
        System.out.println("num2 = " + num2);

        String valortvlcd = "6700";
        Integer valor = Integer.valueOf(valortvlcd);
        System.out.println("valor = " + valor);
    }
}
