package _module3.les_28_170119._3_5_in_out;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

//for TXT data
public class FileWriterTest {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("les_28_Text.txt", true)) {//true - добавлять
            fw.write("Time is: " + new Date() + '\n');//perenos stroki
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
