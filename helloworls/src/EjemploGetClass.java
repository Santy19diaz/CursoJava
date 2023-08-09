import java.lang.reflect.Method;

public class EjemploGetClass {
    public static void main(String[] args) {

        String texto = "hola que tal";

        Class strClass = texto.getClass();

        System.out.println("strclass = " + strClass.getName());
        System.out.println("strclass = " + strClass.getSimpleName());
        System.out.println("strclass = " + strClass.getPackageName());

        for(Method metodo: strClass.getMethods()){
            System.out.println("metodo.getName() = " + metodo.getName());
        }


    }
}

