package _module1.les_04_161201._1_4_arrays;

import java.util.Arrays;

public class ArrayMethodsTest {
    public static void main(String[] args) {
        int [] a = new int[10];
        // fill array with 1
        Arrays.fill(a,1);
        System.out.println(Arrays.toString(a));

        //copy array 1
        int [] aCopy = new int [a.length];
        System.arraycopy(a,0,aCopy,0,a.length/2);
        System.out.println(Arrays.toString(aCopy));
        // copy array 2
        int [] aCopy2;
        //в этом методе можно увеличить размер массива
        aCopy2 = Arrays.copyOfRange(a,0,a.length+10);
        System.out.println(Arrays.toString(aCopy2));
        // sort array
        int [] b =new int[10];
        for (int i = 0; i < a.length; i++) {
            b[i] = (int)(Math.random()*a.length*10);
        }
        System.out.println("before sort:"+Arrays.toString(b));
        Arrays.sort(b);
        System.out.println("after sort:"+Arrays.toString(b));
    }
}
