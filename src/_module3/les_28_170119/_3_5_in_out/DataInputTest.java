package _module3.les_28_170119._3_5_in_out;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputTest {
    public static void main(String[] args) {
        double d = 0;
        boolean b = false;
        int i = 0;
        StringBuffer s = new StringBuffer("");
        try (DataInputStream dis = new DataInputStream(
                new FileInputStream("les_28_Data.dat")
        )) {
            d = dis.readDouble();
            b = dis.readBoolean();//1 byte:  false - 0, 1 - true
            i = dis.readInt();
            while (dis.available() > 0) {
                s.append(dis.readUTF());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(d + " " + b + " " + i);
        System.out.println("s = " + s);
    }
}
