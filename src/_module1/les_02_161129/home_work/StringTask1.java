package _module1.les_02_161129.home_work;

public class StringTask1 {
    public static void main(String[] args) {
        String s = "AB1234CD",s1,s3;
        s1 = s.substring(0,2);
        int s2 = Integer.parseInt(s.substring(2,6));
        s3 = s.substring(6,8);
        System.out.println("s = " + s);
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
    }
}
