import java.util.Properties;

public class EjemploPropiedaadesDeSistema {
    public static void main(String[] args) {


        String username = System.getProperty("user.name");
        System.out.println("username = " + username);
        
        String home = System.getProperty("user.home");
        System.out.println("home = " + home);

        String java = System.getProperty("java.version");
        System.out.println("java = " + java);

        String lineseparator = System.getProperty("line.separator");
        System.out.println("lineseparator = " + lineseparator + "linea nueva");

        Properties p = System.getProperties();
        p.list(System.out);
    }
}

