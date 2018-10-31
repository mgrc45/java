//of, parse, now -- Metodos que usualmente vemos en certificacion
package curso;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;
import java.util.Date; //Depreciado

public class j_fechas {
    public static void main(String[] args) {
         Date d = new Date();
         System.out.println(d);
         //Default time iso = 8601 (YYYY-MM-DD)
         LocalDate myDate = LocalDate.now();
         System.out.println("Today's date: " + myDate);
         System.out.println("Fecha actual: " + myDate.format(DateTimeFormatter.ISO_DATE));
         // YYYY-MM-DDtHH:mm:ss
         LocalDateTime myDate2 = LocalDateTime.now();
         System.out.println(myDate2);
         // HH:mm:ss
         LocalTime myDate3 = LocalTime.now();
         System.out.println(myDate3);
         
         JapaneseDate jDate = JapaneseDate.from(myDate);
         System.out.println(jDate);
    }
   
}
