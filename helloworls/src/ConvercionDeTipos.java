public class ConvercionDeTipos {
    public static void main(String[] args) {
        String numero = "50";
        
        int numeroInt = Integer.parseInt(numero);
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "1212.32e-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String logicoStr = "TruE";
        boolean logicoBolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBolean = " + logicoBolean);

        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);

        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        otroNumeroStr = String.valueOf(otroNumeroInt+10);//conversor multiple dato
        System.out.println("otroNumeroStr = " + otroNumeroStr);
        double otroRealDouble = 1.23456e2;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);
        
        otroRealStr = String.valueOf(1.23456e2f);
        System.out.println("otroRealStr = " + otroRealStr);

        int i = 22768;
        short s = (short) i;
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
        char b = (char) i;
        System.out.println("b = " + b);
        float f = (float) i;
        System.out.println("f = " + f);

    }
}
