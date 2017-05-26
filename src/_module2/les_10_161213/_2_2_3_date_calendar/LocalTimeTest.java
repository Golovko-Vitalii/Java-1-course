package _module2.les_10_161213._2_2_3_date_calendar;

import java.time.LocalTime;

public class LocalTimeTest {
    public static void main(String[] args) {

        LocalTime time = LocalTime.of(15,27);
        System.out.println("time = " + time);
        // +1.5 hour
        LocalTime time1 = time.plusHours(1).plusMinutes(30);
        System.out.println("time1 = " + time1);
    }
}
