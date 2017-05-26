package _module2.les_06_161206.syntax2;

import java.util.Scanner;

/**
 * Перевести заданное в десятичной системе число a в восьмеричную
 * систему, используя функцию перевода .
 */
public class TaskB3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input decimal number");
        String s = scanner.next();
        if (chkInt(s)){ int a = Integer.parseInt(s);
        System.out.println("Decimal number = "+a+
                "; in octal numeral system = "+convert10NumberTo8(a)+";");}
    }
    static String convert10NumberTo8 (int a) {
    return Integer.toString(a, 8);
    }
    static boolean chkInt(String s) {
        try {
            int i = Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            System.out.println(("Некоректный ввод, это не целое число" + " = " + e));
            return false;
        }
    }
}
