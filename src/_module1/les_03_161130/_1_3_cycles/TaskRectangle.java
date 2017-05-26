package _module1.les_03_161130._1_3_cycles;

import java.util.Scanner;

public class TaskRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Чем будем рисовать, a=");
        char a = scanner.next().charAt(0);
        System.out.println("Длина стороны, n=");
        int n = scanner.nextInt();

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print(a);
            }
            System.out.println();
        }
    }
}
