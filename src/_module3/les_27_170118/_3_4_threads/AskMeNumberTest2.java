package _module3.les_27_170118._3_4_threads;

import java.util.Scanner;

public class AskMeNumberTest2 {
    public static void main(String[] args) throws InterruptedException {

        Thread thread = new AskMeNumber2();
        thread.start();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Press Enter to get number");
        scanner.nextLine();
        Thread.yield();

        thread.interrupt();
        System.out.println(((AskMeNumber2) thread).getCount());
        Thread.sleep(1);
        System.out.println(thread.getState());
    }
}
