package _module2.les_17_170103.TestOOP;

public class Test16 {
    int getX() { return x; }
    int y = getX();
    int x = 3;
    public static void main(String[] args) {
        Test16 a = new Test16();
        System.out.println(a.x + "," + a.y);
    }
}