package _module3.les_28_170119._3_5_in_out;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputTest {
    public static void main(String[] args) {
        try (DataOutputStream dos = new DataOutputStream(
                new FileOutputStream("les_28_Data.dat"))) {
            dos.writeDouble(Double.MAX_VALUE);
            dos.writeBoolean(true);//1 byte  false - 0 byte
            dos.writeInt(1);
            dos.writeUTF("ABCD");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
