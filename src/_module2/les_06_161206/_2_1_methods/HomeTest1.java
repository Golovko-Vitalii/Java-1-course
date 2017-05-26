package _module2.les_06_161206._2_1_methods;

import java.util.Date;

public class HomeTest1 {
    public static void main(String[] args) {
        System.out.println(new HomeTest1().getDate());
        System.out.println(new DateUtils().getDate());
        System.out.println(newHomeTest2());
        System.out.println(DateUtils1.newHomeTest1());
    }
    static Date newHomeTest2 (){
        return new Date();
    }
    static class DateUtils1{
        static Date newHomeTest1 (){
            return new Date();
        }
    }
    // non static inside this class, method for object HomeTest1
    Date getDate(){
        return new Date();
    }

    // non static inside other class inside this class,  method for object DateUtils
    static class DateUtils {
        Date getDate(){
            return new Date();
        }
    }
}
