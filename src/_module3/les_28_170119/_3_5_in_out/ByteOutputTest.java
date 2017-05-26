package _module3.les_28_170119._3_5_in_out;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteOutputTest {
    public static void main(String[] args) {
        byte[] array = {76, 77, 78, 79, 80};
        try (FileOutputStream fos = new FileOutputStream("les_28_Byte.txt")) {
            for (int i = 65; i < 75; i++) {
                fos.write(i);//zapis
            }
            fos.write(array);//dopisat
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
