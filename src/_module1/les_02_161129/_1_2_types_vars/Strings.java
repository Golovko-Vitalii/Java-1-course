package _module1.les_02_161129._1_2_types_vars;

public class Strings {
    public static void main(String[] args) {
        String s1 = "super";
        System.out.println("s1 = " + s1);
        String s2 = "sonic";
        System.out.println("s2 = " + s2);
        String s3 = s1 + s2;
        System.out.println("s3 = " + s3);
        String s4 = s1.substring(1,3);
        System.out.println("s4 = " + s4);
        int x = s2.length();
        System.out.println("x = " + x);
        String s5 = s1.toUpperCase();
        System.out.println("s5 = " + s5);
        char c = s1.charAt(0);
        System.out.println("c = " + c);
        int pos = s1.indexOf('s');
        System.out.println("pos = " + pos);
        String s6 = s3.replace("sonic","power");
        System.out.println("s6 = " + s6);
        {
            String s01 = "ABCD";
            String s02 = "abcd";
            System.out.println(s01.equals(s02));
            System.out.println(s02.equals(s01));
            System.out.println(s01.equalsIgnoreCase(s02));
            System.out.println(s01.compareTo(s02));
        }
        {
            String a1 = Integer.toString(777);
            System.out.println("a1 = " + a1);
            String a2 = Long.toString(888888888,2);
            System.out.println("a2 = " + a2);
            String a3 = Integer.toString(16, 16);
            System.out.println("a3 = " + a3);
            int b1 =Integer.parseInt("4455");
            System.out.println("b1 = " + b1);
            long b2 = Long.parseLong("2343554623453");
            System.out.println("b2 = " + b2);
            int b3 = Integer.parseInt("10", 16);
            System.out.println("b3 = " + b3);
            //int b4 = Integer.parseInt("10", 60);//Вавилонская система

        }
    }
}
