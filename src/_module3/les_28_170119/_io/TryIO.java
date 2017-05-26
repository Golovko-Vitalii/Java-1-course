package _module3.les_28_170119._io;

import java.io.*;

public class TryIO {
    public static void main(String[] args) {
        try (FileOutputStream out = new FileOutputStream("les_28_try.txt")) {
            for (int i = 76; i < 96; i++) {
                out.write(i);
            }
        } catch (IOException e) {
            System.out.println("FILE WRITE ERROR!");
        }
        try (FileInputStream in1 = new FileInputStream("les_28_try.txt");
             FileInputStream in2 = new FileInputStream("les_28_try.txt")) {
            System.out.println("read each byte from file");
            while (in1.available() != 0) {
                System.out.print((char) in1.read());
            }
            System.out.println();
            System.out.println("array bytes from file");
            byte[] bytes = new byte[in2.available()];
            in2.read(bytes);
            for (byte b : bytes) {
                System.out.print((char) b);
            }
        } catch (IOException e) {
            System.out.println("FILE READ ERROR!");
        }
    }
}
