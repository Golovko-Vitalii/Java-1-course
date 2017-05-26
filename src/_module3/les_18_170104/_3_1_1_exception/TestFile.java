package _module3.les_18_170104._3_1_1_exception;

import java.io.*;

public class TestFile {
    public static void main(String[] args) {
        File ff  = new File("les_18.txt");
        try{
            if (!ff.exists()) ff.createNewFile();
            PrintWriter pw = null;

                pw = new PrintWriter(ff.getAbsoluteFile());

            try {
                for (int i = 0; i < 10; i++) {
                    pw.println(i);
                    System.out.println("print");
                }
            }catch (Exception e){
                System.out.println(e);
                System.out.println("Error to write");
            }

            finally {
                pw.close();
                System.out.println("finally1 отработал");
            }
        } catch (IOException e) {
            System.out.println("ERROR!");
        }
        finally {
            System.out.println("finally2 отработал");
        }

        ///
        try {
            int [] a = new int [2];
            a[0] = 11;
            a[1] = 22;
            a[46] = 33;
        } catch (ArithmeticException|ArrayIndexOutOfBoundsException e) {
            System.out.println("error = "+e);
            //e.printStackTrace();
        }

    }
}
