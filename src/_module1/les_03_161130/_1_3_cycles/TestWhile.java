package _module1.les_03_161130._1_3_cycles;

import java.util.Scanner;

public class TestWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        /*while (n>0) {
            System.out.println("n = " + n);
            n--;
        }
        n = scanner.nextInt();*/
        do {
            System.out.println("n = " + n);
            n--;
        } while (n>0);

    }
}
