package _module2.les_17_170103._lototron;

import java.util.Scanner;

public class LotoTest {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("count = ");
        int count = scanner.nextInt();
        Loto loto = new Loto(count);
        System.out.println("----------");
        while(loto.hasNext()) System.out.println(loto.next()+" ");
        loto.reset();
        System.out.println("-----NEW LOTO-----");
        System.out.println("Count output");
        int cc = scanner.nextInt();
        for (int i = 0; i < cc ; i++) {
            if (loto.hasNext()) System.out.println(loto.next()+" ");
            else System.out.println("ERROR, no elements index = "+i);
        }
    }
}
