package _module3.les_18_170104._3_1_1_exception;

/*Создать массив, заполнить его значениями от 10 до 100,
 создать второй массив и заполнить его значениями от 0
 до 9. Через for перебрать все значения 1-го массива
 которые делятся без остатка на значения 2-го.
 Предусмотреть соответствующие исключения.*/

public class HomeWork {
    public static void main(String[] args) {
        int [] a = new int [90];
        int [] b = new int [10];
        try {
            for (int i = 10; i < 105; i++) {
                a[i-10] = i;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("error = "+e);
        }
        try {
            for (int i = 0; i < 10; i++) {
                b[i] = i;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("error = "+e);
        }

        a[0]= 2520;

        for (int i = 0; i < 90; i++) {
            for (int j = 0; j < 10; j++) {
                try {
                    if (a[i]%b[j]==0){
                        System.out.println(a[i]+" делится без остатка на "+b[j]);
                    }
                } catch (ArithmeticException e) {
                    System.out.println("error can't divide "+a[i]+" на "+b[j]);
                }
            }
        }
    }
}
