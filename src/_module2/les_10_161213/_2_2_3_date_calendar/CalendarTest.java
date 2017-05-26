package _module2.les_10_161213._2_2_3_date_calendar;

import java.text.DateFormatSymbols;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarTest {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar(2014,9,19,10,15);
        System.out.println(calendar);
        // переопределим метод toString через анонимный класс:
        GregorianCalendar anonymousCalendar = new GregorianCalendar(1986,9,25,10,15){
            @Override
            public String toString() {
                return super.get(GregorianCalendar.YEAR)+"."+
                        (super.get(GregorianCalendar.MONTH)+1)+"."+
                        super.get(GregorianCalendar.DAY_OF_MONTH);
            }
        };
        System.out.println("anonymousCalendar = " + anonymousCalendar);
        //
        System.out.println(calendar.equals(anonymousCalendar));
        System.out.println(calendar.get(GregorianCalendar.YEAR));
        System.out.println(calendar.get(GregorianCalendar.MONTH)+1);
        System.out.println(calendar.get(GregorianCalendar.DAY_OF_MONTH));

        System.out.println(calendar.getTime());
        calendar.add(GregorianCalendar.MONTH,1);// +1 month
        System.out.println(calenToString(calendar));

        calendar.add(GregorianCalendar.DATE,60); // + 60 days
        System.out.println(calenToString(calendar));

        Date date = calendar.getTime();
        System.out.println("calendar to time = "+date);

        Date date1 = new Date(616464165466L);
        System.out.println("date1 = " + date1);
        GregorianCalendar calendar1 = new GregorianCalendar();
        calendar1.setTime(date1);
        System.out.println("calendar1 = " + calenToString(calendar1));


        DateFormatSymbols df = new DateFormatSymbols();
        String [] days = df.getWeekdays();
        for (String day : days){
            System.out.println(day);
        }
        String [] months = df.getMonths();
        for (String month : months){
            System.out.println(month);
        }
        System.out.println(new DateFormatSymbols().getMonths()[0]);
    }
    static String calenToString(GregorianCalendar calendar){
        return calendar.get(GregorianCalendar.YEAR)+"."
                + (calendar.get(GregorianCalendar.MONTH)+1)+"."
                + calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }
}
