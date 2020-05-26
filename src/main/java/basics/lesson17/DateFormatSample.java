package basics.lesson17;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateFormatSample {

    public static void main(String[] args) {
	Calendar birthDay = new GregorianCalendar(1988, 7, 1);
	String s1 = String.format("My birthday: %1$td - %1$tm - %1$tY", birthDay);
	System.out.println(s1);

	SimpleDateFormat dateFormatter = new SimpleDateFormat("E, y-M-d 'at' h:m:s a z");
	Date now = new Date();
	System.out.println("Format:   " + dateFormatter.format(now));
    }
}
