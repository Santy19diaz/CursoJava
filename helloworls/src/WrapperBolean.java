public class WrapperBolean {
    public static void main(String[] args) {
        Integer num1,num2;
        num1 = 1;
        num2 = 2;

        boolean primitibo = num1 > num2;
        Boolean objeto1 = false;
        Boolean objeto2 = Boolean.valueOf("false");

        System.out.println("primitibo = " + primitibo);
        System.out.println("objeto1 = " + objeto1);
        System.out.println("objeto2 = " + objeto2);

    }
}
