package _module1.les_04_161201.home_work;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        //1
        int[] a = {1, 2, 3, 2, 1};
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[a.length - 1 - i];
        }
        if (Arrays.toString(a).equals(Arrays.toString(b))) {
            System.out.println(Arrays.toString(a) + " палиндром");
        } else {
            System.out.println(Arrays.toString(a) + " не палиндром");
        }
        //2
        boolean isPalindrome = true;
        int len = a.length/2;
        for (int i = 0; i < len; i++) {
            if (a[i]!=a[a.length-i-1]){
                isPalindrome = false;
                break;
            }
        }
        System.out.println("isPalindrome = " + isPalindrome);
    }
}
