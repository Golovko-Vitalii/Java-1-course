package _module2.les_16_161228._2_9_fileread;

public class TestStatic {
    public static void main(String[] args) {
        System.out.println("psvm");
        System.out.println(new Integer(5).equals(new Integer(5)));//true
        System.out.println(new Integer(5)==(new Integer(5)));//false
    }
    static{
        System.out.println("static");//first of all
    }

}
