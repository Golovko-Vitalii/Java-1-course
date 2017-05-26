package _module1.les_04_161201._1_4_arrays;

public class ArraysForEachTest {
    public static void main(String[] args) {
        int [] a =new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        //fore
        for (int item :
                a) {
            System.out.print(item+ " ");
        }
        System.out.println();
        // iter
        for (int item : a) {
            System.out.print(item+ " ");
        }
    }
}
