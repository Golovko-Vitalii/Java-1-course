package _module2.les_10_161213._2_2_3_date_calendar.home_work;

import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/*Ввести с консоли дату. Сравнить ее с текущей датой в системе. Вывести отличающиеся части (год, месяц) на экран.*/
public class Task1 {
    public static void main(String[] args) throws ParseException {
        GregorianCalendar myCal = new GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        Date date;
        System.out.println("Input date dd.MM.yyyy");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        date = sdf.parse(s);
        myCal.setTime(date);
        System.out.println("myCal = " + myCal);
        GregorianCalendar curCal = new GregorianCalendar();
        curCal.setTime(new Date(System.currentTimeMillis()));
        System.out.println("curCal = " + curCal);
        System.out.println("equal? = "+myCal.equals(curCal));
        if (myCal.get(GregorianCalendar.YEAR)!=curCal.get(GregorianCalendar.YEAR)){
            System.out.println("Different years! In myCal year = " +"\n"+ myCal.get(GregorianCalendar.YEAR)+
            ", and in curCal year = "+curCal.get(GregorianCalendar.YEAR));
        }
        if (myCal.get(GregorianCalendar.MONTH)!=curCal.get(GregorianCalendar.MONTH)){
            System.out.println("Different months! In myCal month = " +"\n"+
                    new DateFormatSymbols().getMonths()[myCal.get(GregorianCalendar.MONTH)]+
                    ", and in curCal month = "+new DateFormatSymbols().getMonths()[curCal.get(GregorianCalendar.MONTH)]);
        }
        if (myCal.get(GregorianCalendar.DAY_OF_MONTH)!=curCal.get(GregorianCalendar.DAY_OF_MONTH)){
            System.out.println("Different days of months! In myCal day = " +"\n"+ myCal.get(GregorianCalendar.DAY_OF_MONTH)+
                    ", and in curCal day = "+curCal.get(GregorianCalendar.DAY_OF_MONTH));
        }
    }
}
