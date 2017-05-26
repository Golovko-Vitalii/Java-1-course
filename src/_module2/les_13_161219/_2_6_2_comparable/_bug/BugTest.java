package _module2.les_13_161219._2_6_2_comparable._bug;

import java.util.Arrays;
import java.util.Scanner;

public class BugTest {
    public static void main(String[] args) {
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input count of bugs + 5 has already:");
        n = scanner.nextInt();
        int k = 5;
        int n1 =n+k;
        Bug [] bugs = new Bug[n1];
        System.out.println("n1 = " + n1);
        bugs [0] = new Bug("A",1,"red");
        bugs [1] = new Bug("C",6,"blue");
        bugs [2] = new Bug("H",4,"pink");
        bugs [3] = new Bug("R",2,"white");
        bugs [4] = new Bug("StringT",5,"black");
        for (int i = 0; i < n; i++) {
            System.out.println("Input name:");
            System.out.println("Input razmer, double:");
            System.out.println("Input color:");
            bugs [k+i] = new Bug(scanner.next(),scanner.nextDouble(),scanner.next());
        }


        Arrays.sort(bugs);
        for (Bug bug : bugs) {
            bug.print();
        }
    }
}
