package _module1.les_03_161130._1_3_cycles;

public class TestBreakContinue {
    public static void main(String[] args) {
        int n =10;
        for (int i = 0; i < n; i++) {
            if (i>3 && i<7) continue;
            System.out.println("i = " + i);
            if (i==8) break;
        }
    }
}
