package _module2.les_06_161206._2_1_methods;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.print("Ввести число для вычисления факториала:");
        Scanner scanner= new Scanner(System.in);
        int nfact=scanner.nextInt();
        System.out.println();
        long fact=1;
        for (int i = 2; i <=nfact ; i++) {
            fact*=i;
        }
        System.out.println("Факториал из метода main - "+fact);
        System.out.println("Факториал из метода factorial - "+factorial(nfact));
        System.out.println("количество сочетаний n!/(k!(n-k)!);(k = 5); - "+Cnk(nfact,5));
    }
    static long factorial(int n){
        long fact=1;
        for (int i = 2; i <=n ; i++) {
            fact*=i;
        }
        return fact;
    }
    static long Cnk(int n, int k){
        //количество сочетаний n!/(k!(n-k)!)
        //long Cnk=factorial(int n)/(factorial(int k)*factorial(int (n-k)))
        //return factorial(n)/(factorial(k)*factorial(n-k));
        //оптимизация - сократить лишние умножения (n-k+1)*(n-k+2)*...*(n)/k!
        long mult=1;
        for (int i = n-k+1; i <=n ; i++) {
            mult*=i;//верхняя часть
        }
        return mult/factorial(k);
        //return factorial(n)/(factorial(k)*factorial(n-k));//overflow!!
    }
}
