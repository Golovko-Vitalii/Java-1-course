package _module1.les_03_161130.home_work;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a1 = ");
        int a1 = scanner.nextInt();
        System.out.println("a2 = ");
        int a2 = scanner.nextInt();
        System.out.println("a3 = ");
        int a3 = scanner.nextInt();
        System.out.println("a4 = ");
        int a4 = scanner.nextInt();
        if (a1>a2 && a1>a3 && a1>a4) {
            System.out.println("max = " +a1);
        } else {
            if (a2>a3 && a2>a4){
                System.out.println("max = " +a2);
            } else {
                if (a3>a4){
                    System.out.println("max = " +a3);
                } else {
                    System.out.println("max = " +a4);
                }
            }
        }
        int max1,max2,max;
        max1 = (a1>a2) ? a1:a2;
        max2 = (a3>a4) ? a3:a4;
        max = (max1>max2)? max1:max2;
        System.out.println("max = " + max);
        max = (((a1>a2)?a1:a2)>((a3>a4)?a3:a4))?(a1>a2)?a1:a2:(a3>a4)?a3:a4;
        System.out.println("max = " + max);

    }
}
