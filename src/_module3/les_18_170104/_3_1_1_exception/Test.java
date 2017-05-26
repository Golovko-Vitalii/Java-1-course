package _module3.les_18_170104._3_1_1_exception;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int [] a=new int[]{1,2,3};;
        try {
            a[1]=0;
            a[112]=0;
            int a1=5/0;
        }
        catch (ArithmeticException e){
            //e.printStackTrace();
            System.out.println("div by zero!");
        }
        catch (ArrayIndexOutOfBoundsException e) {    System.out.println("array index!");        }

        catch (Exception e) {    System.out.println("other!");        }
        System.out.println(Arrays.toString(a));

        System.out.println("finish!");
    }
}
