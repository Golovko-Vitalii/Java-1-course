package _module2.les_11_161214._2_4_stringbuilder;

public class StringBuilderShort {
    public static void main(String[] args) {
        String s = "     Hello    from   us!    ";

        System.out.println(delSpaces(s));
    }

    static String delSpaces(String input){
        StringBuilder sb = new StringBuilder(input);

        /*int pos = sb.indexOf("  ");
        while (pos>=0){
            sb.deleteCharAt(pos);
            pos = sb.indexOf("  ");
        }
        // есть еще один варинт оптимизированного кода
        */
        int pos;
        while ((pos = sb.indexOf("  "))>=0){
            sb.deleteCharAt(pos);
        }
        return sb.toString();
    }
}
