package _module2.les_17_170103.TestOOP;

public class Test11 {
    public static void main(String[] args) {
        int[][] x = new int[2][5];
        int[][] y = new int[2][5];
        System.out.println(x[1][3]);
        System.arraycopy(x, 0, y, 0, x.length);
        System.out.println(x[1][3]);
    }
}