package _module2.les_10_161213._2_2_2_date_is_mutable;

import java.util.Date;

public class TestPerson {
    public static void main(String[] args) {
        Person p = new Person("John", new Date(43495165131L),new Date(System.currentTimeMillis()));
        Person p2 = new Person("Mike", new Date(999333165131L),new Date(System.currentTimeMillis()-9999900000L));
        System.out.println(p);

        Date temp = p.getBirthDate();// ссылочный тип
        temp.setTime(651651561L);
        System.out.println("p = " + p);
        System.out.println("p2 = " + p2);
        System.out.println("Is John older then Mike? = " + p.getBirthDate().before(p2.getBirthDate()));
        System.out.println("Is John start to work after Mike? = " + p.getWorkBeginDate().after(p2.getWorkBeginDate()));

    }
}
