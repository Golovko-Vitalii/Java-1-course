package _module1.les_03_161130.home_work;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("r = ");
        int r = scanner.nextInt();
        System.out.println("x = ");
        int x = scanner.nextInt();
        System.out.println("y = ");
        int y = scanner.nextInt();
        if (x*x+y*y<=r*r) {
            System.out.println("Point x="+x+" y="+y+" inside");
        } else {
            System.out.println("Point x="+x+" y="+y+" outside");
        }
    }
}
