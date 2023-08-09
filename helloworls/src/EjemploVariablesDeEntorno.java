import java.util.Map;

public class EjemploVariablesDeEntorno {
    public static void main(String[] args) {

        Map<String, String> varEnv = System.getenv();
        System.out.println("varEnv = " + varEnv);

        System.out.println("Listando variables de entorno-----");
        for(String key:varEnv.keySet()){
            System.out.println(key + "-> " + varEnv.get(key));
        }

        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);

        String javahome = System.getenv("JAVA_HOME");
        System.out.println("javahome = " + javahome);

        String path = varEnv.get("Path");
        System.out.println("path = " + path);

        String oneDrive = System.getenv("OneDrive");
        System.out.println("oneDrive = " + oneDrive);
        
        String mensaje = System.getenv("MENSAJE");
        System.out.println("mensaje = " + mensaje);
        
    }
}
