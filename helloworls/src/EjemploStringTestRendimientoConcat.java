public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);
        long inicio = System.currentTimeMillis();

        for (int i = 0; i<100000 ; i++){
            //c = c.concat(a).concat(b).concat("\n");//500 => 1ms,1000=>2ms,10000 84ms,100000=> 4078ms
            //c += a + b + "\n"; //500 => 8ms,1000 => 14ms, 10000 46ms, 100000 => 1587ms
            sb.append(a).append(b).append("\n");//500=>0ms,1000=>0ms,10000 =>2ms, 100000 6ms;

        }

        System.gc();//limpiar buffer de memoria


        long fin = System.currentTimeMillis();

        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());

    }
}
