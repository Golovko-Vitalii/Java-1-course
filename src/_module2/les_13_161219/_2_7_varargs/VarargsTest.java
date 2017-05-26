package _module2.les_13_161219._2_7_varargs;

public class VarargsTest {
    public static void main(String ... args) {
        System.out.println(sum(1,2));
        System.out.println(sum(1,2, 3));
       // System.out.println(sum(new int []{1,2,3,4,5}));
        System.out.println(sum(1,2, 3,4,5,6,7));
        System.out.println(sum(100));
    }
    static int sum (int a, int b){
        return a + b;
    }
    static int sum (int a, int b, int c){
        return a + b + c;
    }
    /*static int sum (int [] arr){
        int sum = 0;
        for (int i : arr) {
             sum+=i;
        }
        return sum;
    }*/

    static int sum (int ... arr){ //var args
        int sum = 0;
        for (int i : arr) {
            sum+=i;
        }
        return sum;
    }

    /*static int sumV (int ... arr, boolean b){ // нельзя! ... - только последний параметр!
        return 0;
    }*/
    static int sumV (boolean b, int ... arr){ // ok!
        return 0;
    }
    static int sumV (String [] str, int [] ... arr){ // ok!
        return 0;
    }

}
