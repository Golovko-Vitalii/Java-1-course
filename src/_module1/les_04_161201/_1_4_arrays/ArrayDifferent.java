package _module1.les_04_161201._1_4_arrays;

public class ArrayDifferent {
    public static void main(String[] args) {
        int [][] b = new int[8][];
        for (int i = 0; i < b.length; i++) {
            b[i] = new int[i+1];
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = i+j+1;
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}
