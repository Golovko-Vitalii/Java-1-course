package _module3.les_18_170104._3_1_1_exception;
public class TestException1 {
    public static void main(String[] args) {
        int a=3;
        int b=0;
        try {
            System.out.println(a);
            System.out.println(a/b);//Намеренный вызов
            System.out.println(b);//ошибки (никогда не будет выведено)
        }
        catch (ArithmeticException e){//Перехват исключения
            System.out.println("Деление на ноль");
        }
        finally {//Участок кода который выполняется в любом случае
            System.out.println("но программа всё равно работает");
        }
        System.out.println("Конец программы");
    }
}
