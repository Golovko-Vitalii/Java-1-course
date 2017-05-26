package _module3.les_19_170105._3_1_2_my_exceptions;

public class Test2 {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(m1(i));
            }
        } catch (Exception e) {
            System.out.println("MY ERROR");
        }
    }
    public static int m1(int a) throws Exception{
        if (a==5) throw new Exception();
        return a;
    }

}
