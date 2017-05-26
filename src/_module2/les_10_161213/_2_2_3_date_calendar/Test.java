package _module2.les_10_161213._2_2_3_date_calendar;

import java.util.Calendar;

public class Test {
    public static void main(String[] args) {
        Calendar cl = Calendar.getInstance();
        System.out.println("cl = " + cl);
        System.out.println(cl.get(Calendar.DATE));
        System.out.println(cl.get(Calendar.MONTH));
        System.out.println(cl.get(Calendar.YEAR));
        System.out.println(cl.get(Calendar.HOUR));
        System.out.println(cl.get(Calendar.MINUTE));
        System.out.println(cl.get(Calendar.SECOND));
    }
}
