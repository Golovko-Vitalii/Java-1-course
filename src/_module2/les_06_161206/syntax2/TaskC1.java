package _module2.les_06_161206.syntax2;

/**
 * Задана строка. Построить новую строку, в которой все символы
 * записаны в обратном порядке.
 */
public class TaskC1 {
    public static void main(String[] args) {
        String s = "Переворачиваем символы в строке зеркально!";
        System.out.println("s = " + s);
        System.out.println(mirrorStr(s));
    }
    static String mirrorStr (String s){
        String rez="";
        for (int i = s.length(); i > 0; i--) {
            rez+=s.substring(i-1,i);
        }
        return rez;
    }
}
