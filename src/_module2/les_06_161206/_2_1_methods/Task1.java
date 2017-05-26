package _module2.les_06_161206._2_1_methods;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Длина аквариума");
        double dlina = scanner.nextDouble();
        System.out.println("Высота аквариума");
        double visota = scanner.nextDouble();
        System.out.println("Ширина аквариума");
        double shirina = scanner.nextDouble();
        System.out.println("volume = " + volume(dlina, visota, shirina)+" m3");
    }
    static double volume (double dlina, double visota, double shirina){
        return dlina*visota*shirina;
    }
}
