package _module3.les_19_170105._home_work._calculator;

import java.util.Scanner;

/*Реализовать мини-калькулятор двух операндов, с возможностью
 ввода пользователем чисел из консоли, (запрашиваем числа,
 запрашиваем операцию, или, по желанию, можете разбирать строку
  вида Число1 Пробел Оператор Число2) А также если вводится
   sqrt(16) например, то выдает 4 (кв.корень числа).
   Реализовать обработку исключений в делении и корне.*/
public class CalculatorTest {
    public static void main(String[] args) {
        int a = 0, b = 0;
        Scanner scanner = new Scanner(System.in);
        String s = "";
        try {
            System.out.println("Input first int or input sqrt(Integer)");
            s = scanner.nextLine();
            if (!(s.length()>5&&s.substring(0, 5).equals("sqrt(")&&s.charAt(s.length()-1)==')')){
                a = Integer.parseInt(s);
            try {
                System.out.println("Input second int");
                s = scanner.nextLine();
                b = Integer.parseInt(s);
                try {
                    Calculator calc = new Calculator(a, b);
                    System.out.println(calc.sum(a, b));
                    System.out.println(calc.minus(a, b));
                    System.out.println(calc.mult(a, b));
                    System.out.println(calc.div(a, b));
                } catch (MyException e) {
                    System.out.println(e.getMessage() + " error");
                    System.out.println(e + " error");
                }
            } catch (Exception e) {
                System.out.println(new MyException("WRONG input b = "+"\"" + s +"\""+ "; " + e));
            }
        } else {
                s=s.substring(5,s.length()-1);
                a = Integer.parseInt(s);
                try {
                    Calculator calc = new Calculator(a, b);
                    System.out.println(calc.sqrt(a));
                } catch (MyException e) {
                    System.out.println(e.getMessage() + " error");
                    System.out.println(e + " error");
                }
            }
        } catch (Exception e) {
            System.out.println(new MyException("WRONG input!! Need Integer or sqrt(Integer); a = "+"\"" + s +"\""+ "; " + e));
        }
    }
}
