package _module3.les_19_170105._3_1_2_my_exceptions;

public class Test3 {
    public static void main(String[] args) {
        int a=0;
        try {
            for (int i = 0; i < 10; i++) {
                a = i;
                if (a==5)throw new Exception(){
                    @Override
                    public String getMessage() {
                        return "MY Exception message";
                    }

                    @Override
                    public String toString() {
                        return "My error to string";
                    }
                };
                System.out.println("a = " + a);
            }
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e);
        }
    }
}
