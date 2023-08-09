import java.util.Random;

public class EjemploRandom {
    public static void main(String[] args) {


        String[] colores = {"azul","amarillo","rojo","blanco","negro","verde","naranja"};
        double random = Math.random();// devuelve un numero aleatoria entre 0 y 1
        System.out.println("random = " + random);

        random *= colores.length;
        random = Math.floor(random);
        System.out.println("random = " + random);

        System.out.println("colores = " + colores[(int) random]);

        Random randomObj = new Random();
        int Randomint = 15 + randomObj.nextInt(25-15);
        System.out.println("Random = " + Randomint);


    }
}
