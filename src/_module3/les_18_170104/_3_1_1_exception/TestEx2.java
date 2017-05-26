package _module3.les_18_170104._3_1_1_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TestEx2 {
    public static void main(String[] args) {
        File ff  = new File("les_18.txt");
        try{
            int [] a = new int [2];
            a[0] = 22/2;
            a[1] = 33/3;
            //a[2] = 33/0;
            a[3] = 22;
            //if (!ff.exists()) ff.createNewFile();
            PrintWriter pw = new PrintWriter(ff.getAbsoluteFile());
            try {
                for (int i = 0; i < 10; i++) {
                    pw.println(i);
                    System.out.println("print");
                }
            } finally {
                pw.close();
            }
        } /*catch (ArrayIndexOutOfBoundsException e){
            System.out.println("wou1! " + e);
        }*/catch (FileNotFoundException e){
            System.out.println("wou2! " + e);
        } /*catch (ArithmeticException e){
            System.out.println("wou3! " + e);
        }*/ catch (OutOfMemoryError e){
            System.out.println("wou4! " + e);
        } catch (Exception e) {
            System.out.println("wou5! " + e);
        }
    }
}
