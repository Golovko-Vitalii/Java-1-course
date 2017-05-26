package _module2.les_06_161206.syntax2;

import java.util.Scanner;

/**
 * В заданной строке удалить первый символ « », который найдется в
 * строке.
 */
public class TaskC3 {
    public static void main(String[] args) {
        String s = "В этой строке много разных символов! )) !№;%:?* " +
                "Введите любой символ « », для поиска строке, первый найденный удалится.";
        System.out.println(s);
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        System.out.println("Result: "+searchSymbol(ch,s));
    }
    static String searchSymbol (char ch, String s){
        for (int i = 0; i < s.length(); i++) {
            if (ch==s.charAt(i)){
                return (s.substring(0,i)+s.substring(i+1,s.length()));
            }
        }
        return ("Символа «"+ch+"» нет в данной строке!");
    }
}
