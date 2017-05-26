package _module3.les_19_170105._home_work._parse_int;

import java.util.Scanner;

/*Написать аналог Integer.parseInt и использовать исключений.*/
public class ParseIntTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input String for parsing to Integer: ");
        String s = scanner.nextLine();
        try {
            parse(s);
            System.out.println(s+" - is Integer");
            System.out.println("Integer.parseInt(s) = "+Integer.parseInt(s));
        } catch (MyException e) {
            System.out.println(e.getMessage()+" s = "+s);
            System.out.println(e.toString()+" s = "+s);
        }
    }
    static void parse (String s)throws MyException{
        chk(s);
    }
    static void chk (String s) throws MyException{
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='1'||s.charAt(i)=='2'||s.charAt(i)=='3'
                    ||s.charAt(i)=='4'||s.charAt(i)=='5'||s.charAt(i)=='6'
                    ||s.charAt(i)=='7'||s.charAt(i)=='8'||s.charAt(i)=='9'
                    ||s.charAt(i)=='0'); else throw new MyException("- NOT Integer!!!");
        }
    }
}

