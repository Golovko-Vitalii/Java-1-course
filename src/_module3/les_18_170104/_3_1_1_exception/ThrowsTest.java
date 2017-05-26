package _module3.les_18_170104._3_1_1_exception;

public class ThrowsTest {
    public static void main(String[] args) {
        try {
            m1();
            System.out.println("vse ok!");
            //Thread.currentThread().interrupt();
        } catch (InterruptedException e) {
            System.out.println("I was interrupted by other thread!");
            //e.printStackTrace();
        }catch (ArithmeticException e) {
            System.out.println("catched!");
            //e.printStackTrace();
        }
    }
    static void m1() throws InterruptedException {m2();}
    static void m2() throws InterruptedException {
            m3();
    }
    static void m3() throws ArithmeticException  {//IOException
        //Thread.sleep(1000);
        int a = 0/0;
        Thread.currentThread().interrupt();
        /*try {                       // alt-enter   ili ctrl-alt-t dlja oborachivanija v try-catch
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }
}
