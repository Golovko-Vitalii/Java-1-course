package _module1.les_04_161201.home_work;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        /*String inputStr = "ab!456,rtY@&";
        char [] input = inputStr.toCharArray();
        System.out.println("input = " + Arrays.toString(input));*/
        char[] input = "ab!456,rtY@&".toCharArray();// заменяет предыдущий код
        System.out.println("input = " + Arrays.toString(input));
        //String s = String.valueOf(input);// обратно
        /*String digits = "0123456789"; // 1способ
        char c = '0';
        if (digits.indexOf(Character.toString(c))>=0);
        System.out.println("ok!");*/
        char[] digits = new char[input.length];
        char[] lerrers = new char[input.length];
        char[] others = new char[input.length];
        int ind1 = -1, ind2 = -1, ind3 = -1;
        // iter
        for (char c : input) {
            if (Character.isDigit(c)) {
                digits[++ind1] = c;
            } else if (Character.isLetter(c)) {
                lerrers[++ind2] = c;
            } else {
                others[++ind3] = c;
            }
        }
        for (int i = 0; i <= ind1; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();
        for (int i = 0; i <= ind2; i++) {
            System.out.print(lerrers[i] + " ");
        }
        System.out.println();
        for (int i = 0; i <= ind3; i++) {
            System.out.print(others[i] + " ");
        }
        System.out.println();
    }
}

