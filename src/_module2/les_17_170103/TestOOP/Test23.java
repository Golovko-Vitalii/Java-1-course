package _module2.les_17_170103.TestOOP;

public class Test23 {
    public static void main(String[] args) {
        int i = 1, j;
        switch (i) {
            case 0:
                j = 0;
                print(j);
            case 1:
                j = 1;
                print(j);
            case 2:
                j = 2;
                print(j);
            default:
                j = -1;
                print(j);
        }
    }

    private static void print(int j) {
        System.out.println(j);
    }
}
