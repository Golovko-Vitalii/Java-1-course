package _module3.les_18_170104._3_1_1_exception;
public class TestException2 {
    public static void main(String[] args) {
        //m() stek primer
        int[] a = new int[2];//0,1
        try {
           //a[2] = 0 / 0;
            //a[(int)System.currentTimeMillis()%4] = 0 / 0;
            a[(int)System.currentTimeMillis()%3] = 1;// 1 ili 2
            a[0] = 0 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Message= "+e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Message2= "+e.getMessage());
        } catch (Exception e) {
            System.out.println("Unknown Exception");
            System.out.println(e.getMessage());
        }

        System.out.println("End of program.");
        System.out.println((double)0/0);
        System.out.println((double)5/0);
        System.out.println(Double.isInfinite((double) 5 / 0));

        /*//stek primer
        static void m(){g();}
        static void g(){int aa=0/0;}*/
    }
}
