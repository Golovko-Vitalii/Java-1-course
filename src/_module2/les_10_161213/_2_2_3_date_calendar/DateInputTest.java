package _module2.les_10_161213._2_2_3_date_calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateInputTest {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

        Date date;
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        date = sdf.parse(s);
        System.out.println("date = " + date);
    }
}
