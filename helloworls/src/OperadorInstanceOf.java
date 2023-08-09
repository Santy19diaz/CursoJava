public class OperadorInstanceOf {
    public static void main(String[] args) {
        String texto = "tipo String";

        Integer num = 7;

        boolean b1 = texto instanceof String;
        System.out.println("texto es de tipo String? " + b1);

        b1 = texto instanceof Object;
        System.out.println("texto es de tipo Object? " + b1);

        b1 = num instanceof Integer;
        System.out.println("num es de tipo Integer? " + b1);
        b1 = num instanceof Object;
        System.out.println("num es de tipo Object? " + b1);
        b1 = num instanceof Number;
        System.out.println("num es de tipo Number? " + b1);
        
    }
}
