package _module2.les_09_161209._2_2_1_fibo;

public class FiboStandart {
    public static void main(String[] args) {
        int number = 6;
        int n1 = -1;
        int n2 = 1;
        for (int i = 0; i <= number; i++) {
            int nn2 = n1 + n2;
            n1 = n2;
            n2 = nn2;
            System.out.println("nn2 = " + nn2);
        }
        System.out.println("Число Фибоначи с номером " + number + " равно " + n2);
    }
}
