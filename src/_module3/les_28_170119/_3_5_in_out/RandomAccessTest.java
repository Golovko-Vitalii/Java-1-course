package _module3.les_28_170119._3_5_in_out;

import java.io.RandomAccessFile;

public class RandomAccessTest {
    public static void main(String[] args) {
        String filename = "les_28_RandomAccess.txt";
        try (RandomAccessFile file = new RandomAccessFile(filename, "rw")) {
            file.skipBytes((int) file.length()); //skip to the end of the file
            System.out.println("legth before = " + file.length());
            file.writeBytes("Added By RandomAccessFile" + "\n");
            System.out.println("legth after = " + file.length());
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
}