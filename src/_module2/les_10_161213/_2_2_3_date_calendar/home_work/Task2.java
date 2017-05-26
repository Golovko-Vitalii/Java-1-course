package _module2.les_10_161213._2_2_3_date_calendar.home_work;

import java.util.Date;
import java.util.GregorianCalendar;

/*Посчитать сколько прошло дней например, с даты Вашего рождения.*/
public class Task2 {
    public static void main(String[] args) {
        GregorianCalendar calendar1 = new GregorianCalendar(1986,9,25);
        GregorianCalendar calendar2 = new GregorianCalendar();
        calendar2.setTime(new Date(System.currentTimeMillis()));
        long d = calendar2.getTime().getTime()-calendar1.getTime().getTime();
        System.out.println("Days after my birthday, I've lived already "+d/1000/60/60/24+" days.");
    }
}
