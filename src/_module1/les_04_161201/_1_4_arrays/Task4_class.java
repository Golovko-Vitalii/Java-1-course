package _module1.les_04_161201._1_4_arrays;

import java.util.Scanner;

public class Task4_class {
    public static void main(String[] args) {
        int depth;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input depth of Pascal triangle: " );
        depth = sc.nextInt();

        // 0     1
        // 1    1 1
        // 2   1 2 1
        // 3  1 3 3 1
        // 4 1 4 6 4 1

        int[][] a = new int[depth+1][];
        //инициализируем массив, заполняем единицами
        for(int i=0; i<=depth; i++){
            a[i] = new int[i+1];
            for(int j=0; j<=i; j++){
                a[i][j] = 1;
            }
        }
        //"паскализация" массива
        if (depth > 1) {
            for(int i=2; i<=depth; i++){
                for(int j=1; j<i; j++){
                    a[i][j] = a[i-1][j-1] + a[i-1][j];
                }
            }
        }
        //вывод на экран
        for(int i=0; i<=depth; i++){
            for(int j=0; j<=i; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
