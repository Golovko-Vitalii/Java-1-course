package _module2.les_17_170103.TestOOP;

public class Test12 {
    public static void main(String[] args) {
        int[][] x = new int[][]{new int[]{1, 1}, new int[]{2, 7}};
        int[][] y = new int[][]{new int[]{3, 3}, new int[]{4, 6}};
        System.out.println(y[1][1]);
        System.arraycopy(x, 0, y, 0, x.length);
        System.out.println(y[1][1]);
    }
}
