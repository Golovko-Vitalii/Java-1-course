package _module2.les_06_161206.syntax2;

/**
 * В заданной строке удалить последний символ « » (пробел), который
 * найдется в строке.
 */
public class TaskC4 {
    public static void main(String[] args) {
        //String s = "В заданной строке удалить последний символ « » (пробел)," +
        //        " который найдется в строке.";
        String s = "В заданной строке удалить последний символ_«_»_(пробел)," +
                "_который_найдется_в_строке.";
        System.out.println(s);
        char ch = ' ';
        System.out.println("Result: "+searchSymbol(ch,s));
    }
    static String searchSymbol (char ch, String s){
        for (int i = s.length()-1; i >= 0 ; i--) {
            if (ch==s.charAt(i)){
                return (s.substring(0,i)+s.substring(i+1,s.length()));
            }
        }
        return ("Символа «"+ch+"» нет в данной строке!");
    }
}
