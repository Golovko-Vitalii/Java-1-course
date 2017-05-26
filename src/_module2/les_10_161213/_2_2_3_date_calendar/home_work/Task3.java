package _module2.les_10_161213._2_2_3_date_calendar.home_work;

import java.util.Date;
import java.util.GregorianCalendar;

/*Сколько дней осталось до Нового года?*/
public class Task3 {
    public static void main(String[] args) {
        GregorianCalendar calendar1 = new GregorianCalendar();
        GregorianCalendar calendar2 = new GregorianCalendar(2017,11,31,23,59,59);
        calendar1.setTime(new Date(System.currentTimeMillis()));
        double d = calendar2.getTime().getTime()-calendar1.getTime().getTime()+1;
        System.out.println("Days to New Year 2018! = "+d/1000/60/60/24+" days.");
    }
}
