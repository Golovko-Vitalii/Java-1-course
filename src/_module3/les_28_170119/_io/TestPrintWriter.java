package _module3.les_28_170119._io;

import java.io.PrintWriter;

public class TestPrintWriter {
    public static void main(String[] args) {
        try (PrintWriter pw = new PrintWriter("les_28_pw.txt")) {
            for (int i = 0; i < 10; i++) {
                pw.println(i);
            }
            pw.println();
            pw.println("Hello World");
        } catch (Exception e) {
            System.out.println("Error file write!");
        }
    }
}
