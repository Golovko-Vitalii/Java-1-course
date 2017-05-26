package _module3.les_28_170119._3_5_in_out;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) {
        String tmp = "";
        try (BufferedReader br = new BufferedReader(new FileReader("les_28_Text.txt"))) {
            while ((tmp = br.readLine()) != null) {//mozhno i equals
                System.out.println(tmp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
