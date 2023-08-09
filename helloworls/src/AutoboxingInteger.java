public class AutoboxingInteger {
    public static void main(String[] args) {

        Integer[] enteros = {8,10,12,14,12};
         int suma = 0;

         for(Integer i: enteros){
             if(i.intValue() %2 ==0){
                 suma += i.intValue();
             }
         }
        System.out.println("suma = " + suma);
         suma = 0;

        for(Integer i: enteros){
            if(i % 2 ==0){
                suma += i.intValue();
            }
        }
        System.out.println("suma = " + suma);
    }
}
