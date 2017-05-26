package _module2.les_15_161223._2_9_file_write_read;

import java.io.*;

public class Fw {
    public static void main(String[] args) {
        File ff = new File("les_15.txt");
        try {
            if (!ff.exists()){
                ff.createNewFile();
            }
            //TestPrintWriter pw=new TestPrintWriter(System.out,true);//console как назначение TestPrintWriter
            PrintWriter pw=new PrintWriter(ff.getAbsoluteFile());//ff как назначение TestPrintWriter
            try {
                pw.println(ff.getAbsolutePath());
                for (int i = 0; i < 10; i++) {
                    pw.println(i);
                }
            }
            finally {
                    pw.close();
                }
        } catch (IOException e) {
                System.out.println("ERROR!");
            }
    }
}
