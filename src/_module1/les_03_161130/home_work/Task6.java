package _module1.les_03_161130.home_work;

public class Task6 {
    public static void main(String[] args) {
        for (int i = 0; i <= 32 ; i++) {
            if (Math.pow(2,i)==Math.pow(i,2)){
                System.out.println("2^x = x^2, x = " + i);
            }
        }
        System.out.println("Больше ответов нет. Пока.");

    }
}
