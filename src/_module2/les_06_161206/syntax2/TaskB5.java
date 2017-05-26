package _module2.les_06_161206.syntax2;

/**
 * Описать функцию, которая удаляет из строки все лишние пробелы.
 * Пробелы считаются лишними, если их подряд идет более двух,
 * если они стоят в конце строки после последней точки,
 * если стоят после открывающегося парного знака препинания.
 */
public class TaskB5 {
    public static void main(String[] args) {
        String s = "   { Java:   }  Hello (   Hi  )   from   us.    ";
        System.out.println("s = " + s);
        System.out.println("Result s = "+delPunctuationSpace(delLastSpace(delDoubleSpaces(s))));
    }
// подряд идет более двух
    static String delDoubleSpaces(String input){
        StringBuilder sb = new StringBuilder(input);
        int pos = sb.indexOf("  ");
        while (pos>=0){
            sb.deleteCharAt(pos);
            pos = sb.indexOf("  ");
        }
        return sb.toString();
    }
//  в конце строки после последней точки
    static String delLastSpace(String input){
        StringBuilder sb = new StringBuilder(input);
        int pos = sb.lastIndexOf(".");
        if (pos!=sb.length())if (sb.charAt(pos+1)==' ')
            sb.deleteCharAt(pos+1);
        return sb.toString();
    }
// после открывающегося парного знака препинания "{", "("
    static String delPunctuationSpace(String input){
        StringBuilder sb = new StringBuilder(input);
        int pos = sb.indexOf("( ");
        while (pos>=0){
            sb.deleteCharAt(pos+1);
            pos = sb.indexOf("  ");
        }
        pos = sb.indexOf("{ ");
        while (pos>=0){
            sb.deleteCharAt(pos+1);
            pos = sb.indexOf("  ");
        }
        return sb.toString();
    }
}
