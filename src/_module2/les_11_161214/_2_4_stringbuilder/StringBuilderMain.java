package _module2.les_11_161214._2_4_stringbuilder;

import java.util.Arrays;

public class StringBuilderMain {
    public static void main(String[] args) {
        String s = "Hello from java";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb);

        System.out.println("sb[0]="+sb.charAt(0));
        sb.setCharAt(11,'J');
        System.out.println(sb);
        char [] chars = new char[5];
        sb.getChars(0,5,chars,0);
        System.out.println(Arrays.toString(chars));

        sb.append("!");
        System.out.println(sb);

        sb.insert(sb.length()-1," courses");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
        sb.reverse();

        /*sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);*/

        sb.delete(sb.length()-2,sb.length());
        System.out.println(sb);

        sb.replace(11,11+4,"Scala");
        System.out.println(sb);

    }
}
