package _module2.les_09_161209._2_2_1_fibo;

public class FiboTest {
    public static void main(String[] args) {
        int number = 7;
        Fibo fibo = new Fibo();
        System.out.println(fibo.next());
        System.out.println(fibo.next());
        System.out.println(fibo.next());
        System.out.println(fibo.next());
        System.out.println(fibo.next());
        fibo.reset();
        System.out.println("Числа Фибоначи до номера " + number + ":");
        for (int i = 0; i < number; i++) {
            System.out.print(fibo.next() + " ");
        }
    }
}
