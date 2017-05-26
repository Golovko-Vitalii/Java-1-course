package _module1.les_03_161130.home_work;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("n = ");
        int n = scanner.nextInt();
        int res=1;
        if (n>4 && n<12) {
            for (int i = 1; i <= n; i++) {
            res*=i;
            }
            System.out.println("Факториал n = "+ res);
        } else {System.out.println("Неверный ввод числа: 4<n<12");}
        boolean valid = (n>4 && n<12);
        if (!valid){
            System.out.println("Astalavista!");
            return;
        }
    }
}
