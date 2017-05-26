package _module3.les_18_170104._3_1_1_exception;
import java.util.Scanner;
public class TestException3 {
    public static void main(String[] args) {
               Scanner scanner = new Scanner(System.in);
        String a;   System.out.print("Введите числo a=");    a=scanner.nextLine();    //String a="12";
        String b;   System.out.print("Введите числo b=");    b=scanner.nextLine();    //String b="13a";

        try {
            double a1=Double.parseDouble(a);
            double b1=Double.parseDouble(b);
            System.out.println("a="+a);
            System.out.println("b="+b);
            double c=a1/b1;
            System.out.println("a/b="+c);
        }
        catch (NumberFormatException e){System.out.println("Введена не цифра!");}
        finally {System.out.println("Повторите ввод числа");}
        System.out.println("Конец программы");
    }
}
