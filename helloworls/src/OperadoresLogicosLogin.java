import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {
        String[] usernames = new String[2];
        String[] passwords = new String[2];
        usernames[0] = "Santiago";
        passwords[0] = "2175";
        usernames[1] = "Alejandra";
        passwords[1] = "2105";


        Scanner scan = new Scanner(System.in);

        System.out.println(" ingrese el username: ");
        String user = scan.next();

        System.out.println("ingrese el password");
        String pass = scan.next();

        boolean valido = false;

        for (int i = 0; i < usernames.length; i++) {
            valido = (usernames[i].equals(user) && passwords[i].equals(pass)) ? true : valido;
            /*if (usernames[i].equals(user) && passwords[i].equals(pass)) {
                valido = true;
                break;
            }*/
        }

        String mensaje = valido ? "Bienvenido usuario ".concat(user).concat("!") : "usuario y/o contraseña incorrecto";
        System.out.println(mensaje);

        /*if(valido){
            System.out.println("Bienvenido usuario ".concat(user).concat("!"));
        }
        else {
            System.out.println("usuario incorrecto");
        }*/

    }

}
