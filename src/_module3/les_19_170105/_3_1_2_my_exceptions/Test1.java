package _module3.les_19_170105._3_1_2_my_exceptions;

public class Test1 {
    public static void main(String[] args) {
        int a;
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(a(i));
            }

        } catch (Exception e) {
            System.out.println("My Exception a = 5!!");
        }
    }
    public static int a (int a){
        if (a==5) throw new ArithmeticException();
        return a;
    }
}
