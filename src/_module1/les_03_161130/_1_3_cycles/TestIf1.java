package _module1.les_03_161130._1_3_cycles;

import java.util.Scanner;

public class TestIf1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a:");
        int a = scanner.nextInt();
        System.out.println("Input b:");
        int b = scanner.nextInt();
        if (a<b){
            System.out.println("a<b");
        } else {
            if (a>b) {
                System.out.println("a>b");
            } else System.out.println("a=b");
        }
    }
}
