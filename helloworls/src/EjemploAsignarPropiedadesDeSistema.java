import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class EjemploAsignarPropiedadesDeSistema {
    public static void main(String[] args) {

        try {
            FileInputStream archivo = new FileInputStream("src/config.properties");
            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad","mi.valor");

            

            System.setProperties(p);
            Properties ps =System.getProperties();
            System.out.println("ps.getProperty(config.autor.nombre) = " + ps.getProperty("config.autor.nombre"));
            System.out.println(System.getProperty("config.autor.email"));
            
            ps.list(System.out);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
