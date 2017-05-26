package _module3.les_27_170118._3_4_threads;

import java.util.Scanner;

public class AskMeNumberTest {
    public static void main(String[] args) throws InterruptedException {

        Thread thread = new AskMeNumber();
        thread.start();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Press Enter to get number");
        scanner.nextLine();

        //((AskMeNumber)thread).setStop(true);// 1
        thread.interrupt();//2 throw Inter..Exception
        System.out.println(((AskMeNumber) thread).getCount());
    }
}
