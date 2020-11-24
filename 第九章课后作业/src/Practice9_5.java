/**
 * @author chen
 */
import java.util.*;
public class Practice9_5{
    public static void main(String[] args) {
        GregorianCalendar Calendar = new GregorianCalendar();
        System.out.println(Calendar.get(GregorianCalendar.YEAR)
                +" "+Calendar.get(GregorianCalendar.MONTH)
                +" "+Calendar.get(GregorianCalendar.DAY_OF_MONTH));
        Calendar.setTimeInMillis(1234567898765L);
        System.out.println(Calendar.get(GregorianCalendar.YEAR)
                +" "+Calendar.get(GregorianCalendar.MONTH)
                +" "+Calendar.get(GregorianCalendar.DAY_OF_MONTH));
    }
}