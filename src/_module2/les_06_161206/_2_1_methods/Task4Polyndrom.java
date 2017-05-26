package _module2.les_06_161206._2_1_methods;

import java.util.Scanner;

public class Task4Polyndrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
        int a = scanner.nextInt();
        System.out.println("Palindrom "+a+" = "+check(a));
        System.out.println(isPalindrome(a));
    }
    static boolean check (int a){
        String s = Integer.toString(a);
        for (int i = 0; i < s.length()/2; i++) {
            if (!s.substring(i,i+1).equals(s.substring(s.length()-i-1,s.length()-i))){
                return false;
            }
        }
        return true;
    }
    static boolean isPalindrome (int n){
        char [] digits = Integer.toString(n).toCharArray();
        int len = digits.length / 2;
        for (int i = 0; i < len; i++) {
            if (digits[i]!= digits[digits.length-1-i]) return false;
            // digits[i] - идет на увеличение,
            // а digits[digits.length - 1 - i] идет на уменьшение.
        }
        return true;
    }
}
