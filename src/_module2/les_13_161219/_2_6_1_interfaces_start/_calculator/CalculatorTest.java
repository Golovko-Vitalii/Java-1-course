package _module2.les_13_161219._2_6_1_interfaces_start._calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Arithmetic a;// polymorph...
        Info info;// polymorph...




        System.out.println(calculator.plus(1,2));
        System.out.println(calculator.printInfo());

        a = calculator;
        ((Calculator)a).printInfo();
        a.plus(2,3);// только методы интерфейса Arithmetic
        // но, если нужно другой метод, можно и так:
        ((Info)a).printInfo();

        info = calculator;//// только методы интерфейса Info
        System.out.println(info.printInfo());
        // но, если нужно другой метод, можно и так:
        ((Arithmetic)info).plus(1,2);

        //((String)info).compareTo() // String final и не по дереву
    }
}
