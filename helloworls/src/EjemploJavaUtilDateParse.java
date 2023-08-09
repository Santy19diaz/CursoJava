import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Ingrese una fecha con el formato: yyyy-MM-dd");
        try {
            Date fecha = format.parse(scan.next());
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + format.format(fecha));

            Date fecha2 = new Date();
            System.out.println("fecha2 = " + fecha2);

            if(fecha.after(fecha2)){
                System.out.println("Fecha del usuario es después a fecha de programa");

            } else if (fecha.before(fecha2)) {
                System.out.println("Fecha de usuario es anterior");

            } else if (fecha.equals(fecha2)) {
                System.out.println("las fechas son iguales");

            }
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
