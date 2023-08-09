public class EjemploClaseMath {
    public static void main(String[] args) {

        int absoluto = Math.abs(-3);
        System.out.println("absolut" +
                "o = " + absoluto);

        int maximo = Math.max(12,21);
        System.out.println("maximo = " + maximo);

        int minimo = Math.max(30,21);
        System.out.println("minimo = " + minimo);

        double techo = Math.ceil(4.5);
        System.out.println("techo = " + techo);

        double piso = Math.floor(5.5);
        System.out.println("piso = " + piso);

        long entero = Math.round(Math.PI);
        System.out.println("entero = " + entero);

        double exp = Math.exp(1);
        System.out.println("exp = " + exp);

        System.gc();

        double log = Math.log(10);
        System.out.println("log = " + log);

        double potencia = Math.pow(10,3);
        System.out.println("potencia = " + Math.round(potencia));

        double raiz = Math.sqrt(9);
        System.out.println("raiz = " + Math.round(raiz));

        double grados = Math.toDegrees(1.57);
        grados = Math.round(grados);
        System.out.println("Convertir radianes a grados = " + grados);

        double radianes  = Math.toRadians(90);
        System.out.println("radianes = " + radianes);

        System.out.println("sin(90): " + Math.sin(radianes));
        System.out.println("cos(90): " + Math.cos(radianes));






    }
}
