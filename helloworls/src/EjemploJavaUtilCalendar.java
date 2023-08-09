import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();

        //calendario.set(2021,4,21,20,00,00);
        calendario.set(Calendar.YEAR,2021);
        calendario.set(Calendar.MONTH,4);
        calendario.set(Calendar.DAY_OF_MONTH,21);
        calendario.set(Calendar.HOUR_OF_DAY,21);
        calendario.set(Calendar.MINUTE,20);

        Date fecha = calendario.getTime();
        System.out.println("calendario = " + fecha);

        SimpleDateFormat sf = new SimpleDateFormat("yy-MM-dd HH:MM:ss");
        String fechaf = sf.format(fecha);
        System.out.println("fechaf = " + fechaf);



    }
}
