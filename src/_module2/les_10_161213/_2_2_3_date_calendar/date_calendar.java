package _module2.les_10_161213._2_2_3_date_calendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class date_calendar {
    public static void main(String[] args) {
        //Date date = new Date(); что равносильно:
        Date date = new Date(System.currentTimeMillis());
        System.out.println("date = " + date);
        Date date1 = new Date(9999999999999L);
        System.out.println("date1 = " + date1);
        Date date2 = new Date(Long.MAX_VALUE+1);
        System.out.println(Long.MAX_VALUE+1);
        Date date3 = new Date(-Long.MIN_VALUE);//двойное переполнение
        System.out.println("date1 = " + date2);
// ctrl+space автозаполнение
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy:MMMM:dd G");
        System.out.println("Минимальная дата = "+sdf.format(date2));
        System.out.println(sdf.format(date3));
    }
}
