package _module1.les_03_161130.home_work;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Чем будем рисовать, a=");
        String a = scanner.next(),b=a;int i=1;
        System.out.print("Длина (если четное, то n + 1), n=");
        int n = scanner.nextInt();
        if((n%2)==0){n=n+1;};System.out.println(" Теперь n = "+n);
        for (int j = 0; j < n ; j++) {
            if (j<=Math.round(n/2)){System.out.println(b);b = b + a; i=j;}
            else {System.out.println(b.substring(0,i));--i;}
        }
    }

}
