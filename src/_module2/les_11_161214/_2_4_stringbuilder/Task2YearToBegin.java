package _module2.les_11_161214._2_4_stringbuilder;

import static java.lang.Character.isDigit;

/*Написать метод, который преобразует входящую строку:
        Ищет в строке год и перемещает его в начало строки*/
public class Task2YearToBegin {
    public static void main(String[] args) {
        String s = "...Hello.2011. from .. us!..2016";
        System.out.println("s = " + s);
        System.out.println("Result: "+delPoints(s));
    }
    static String delPoints(String input){
        StringBuilder sb = new StringBuilder(input);
            for (int i = 1; i <=sb.length()-2 ; i++) {
                if ((isDigit(sb.charAt(i-1)))&&(isDigit(sb.charAt(i)))&&(isDigit(sb.charAt(i+1)))&&(isDigit(sb.charAt(i+2)))){
                    sb.insert(0,sb.substring(i-1,i+3));
                    sb.delete(i-1+4,i+2+5);
                    return sb.toString();
                    }
            }
        return sb.toString();
    }
}
