package _module2.les_10_161213._2_2_2_date_is_mutable;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Date dd = new Date();
        System.out.println(dd);
        long t = 6416546416416L;
        dd = new Date(t);
        System.out.println(dd);
        SimpleDateFormat sdf = new SimpleDateFormat("G:yyyy:MMMM:MMM:MM:dd:EEEE:hh:mm:ss:a:Z:z");
        String str = sdf.format(dd);
        System.out.println(str);
        long tt = System.currentTimeMillis();
        dd = new Date(tt);
        sdf = new SimpleDateFormat("'Это дата: 'G:yyyy' год ':MMMM:MMM:MM:dd:EEEE:hh:mm:ss:a:Z:z");
        System.out.println(sdf.format(dd));

        // Удобный ввод даты
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input date");
        str = scanner.nextLine();
        sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            dd = sdf.parse(str);
            System.out.println(dd);
        }
        catch (ParseException e){
            System.out.println("Wrong input");
        }
        Date ddd = new Date();
        ddd=dd;
        ddd.setTime(876876786L);
        System.out.println(dd);

    }

}
