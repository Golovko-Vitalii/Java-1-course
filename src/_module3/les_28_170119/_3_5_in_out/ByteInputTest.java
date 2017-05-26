package _module3.les_28_170119._3_5_in_out;

import java.io.*;
import java.util.Arrays;

public class ByteInputTest {
    public static void main(String[] args) {
        byte[] array = new byte[5];//5 simwolow hotim s4itat
        try (FileInputStream fis = new FileInputStream("les_28_Byte.txt")) {
            for (int i = 65; i < 75; i++) {
                //byte b = (byte)oos.read();//int -> byte
                //int b = oos.read();
                //System.out.print(b + " ");
                System.out.print((byte) fis.read() + " ");
            }
            fis.read(array);
            System.out.println();
            System.out.println(Arrays.toString(array));
        } catch (IOException e) {
            e.printStackTrace();
        }
        //read and sout the whole file:
        System.out.println("all bytes:");
        int b = 0;
        try (FileInputStream oos = new FileInputStream("les_28_Byte.txt")) {
            while ((b = oos.read()) != -1) {
                System.out.print(b + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
