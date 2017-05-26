package _module2.les_10_161213._2_2_3_date_calendar;

import java.util.GregorianCalendar;

/*Посчитать разницу в днях между днями рождения двух человек*/
public class Task {
    public static void main(String[] args) {
        GregorianCalendar calendar1 = new GregorianCalendar(1986,9,25);
        GregorianCalendar calendar2 = new GregorianCalendar(1982,4,7);
        long d = calendar1.getTime().getTime()-calendar2.getTime().getTime();
        System.out.println("Difference between birthdays = "+d/1000/60/60/24+" days.");
    }
}
