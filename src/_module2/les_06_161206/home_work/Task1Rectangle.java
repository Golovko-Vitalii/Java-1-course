package _module2.les_06_161206.home_work;

import java.util.Scanner;

/*Написать метод, параметрами которого являются длина и ширина
 прямоугольника. Метод должен нарисовать с помощью символов «*»
  этот прямоугольник в консоли.*/

public class Task1Rectangle {
    public static void main(String[] args) {
        int a,b;
        try {
            println("Введите высоту:");
            a = Integer.parseInt(inputStr());
            println("Введите длину:");
            b = Integer.parseInt(inputStr());
            println("");
            drawRect(a, b);
        }
        catch (NumberFormatException e){println("Некоректный ввод, это не целое число"+" = "+e);}
    }
    static String inputStr (){
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
    static  void println (String s){
        System.out.println(s);
    }
    static void drawRect (int a, int b){
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("*");;
            }
            println("");
        }
    }
}
