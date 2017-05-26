package _module3.les_19_170105._3_1_2_my_exceptions;

public class Test4 {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(m(i));
            }
        } catch (MyException1 e) {
            System.out.println(e.getMessage());
            System.out.println(e);
        }

    }
    static int  m(int i) throws MyException1{
        if (i==5) throw new MyException1();
        return i;
    }
    static class MyException1 extends Exception{
        @Override
        public String getMessage() {
            return "new class message exception";
        }

        @Override
        public String toString() {
            return "new class to string exception";
        }
    }
}

