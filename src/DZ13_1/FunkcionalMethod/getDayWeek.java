package DZ13_1.FunkcionalMethod;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class getDayWeek {

    public static void main (String[] args) {
        Calendar now = Calendar.getInstance();
        int  dayOfWeek = 3;
        int weekday = now.get(Calendar.DAY_OF_WEEK);
        int i = (Calendar.SATURDAY - weekday + dayOfWeek) %7;
        now.add(Calendar.DAY_OF_YEAR, i);
        Date dayAdd = now.getTime();
        String o = new SimpleDateFormat("E dd.MM.yyyy").format(dayAdd);
        System.out.print(o);

    }
}
