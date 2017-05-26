package _module3.les_28_170119._io;

import java.io.*;

public class TestRead {
    public static void main(String[] args) {
        InputStream in;
        int integer1 = 2435235; // convert to 4 x byte length
        byte[] tmp1 = new byte[4];
        for (int i = 0; i < 4; i++) {
            tmp1[3 - i] = (byte) (integer1 >>> (i * 8));//mirror
        }
        int integer2 = 1992435235; // convert to 4 x byte length
        byte[] tmp2 = new byte[4];
        for (int i = 0; i < 4; i++) {
            tmp2[3 - i] = (byte) (integer2 >>> (i * 8));
        }
        //tmp = BigInteger.valueOf(integer1).toByteArray();
        try {
            in = new DataInputStream(new ByteArrayInputStream(tmp1));
            /*System.out.println(in.read());
            System.out.println(in.read());
            System.out.println(in.read());
            System.out.println(in.read());*/
            System.out.println("in.available() = " + in.available());
            System.out.println("in1 = " + ((DataInputStream) in).readInt());
            System.out.println("in.available() = " + in.available());
            in = new DataInputStream(new ByteArrayInputStream(tmp2));
            System.out.println("in.available() = " + in.available());
            System.out.println(in.markSupported());
            //in.mark(0);
            System.out.println("in2 = " + ((DataInputStream) in).readInt());
            System.out.println("in.available() = " + in.available());
            in.reset();
            System.out.println("in.available() = " + in.available());
            System.out.println(in.skip(1));
            System.out.println("in.available() = " + in.available());
            in = new DataInputStream(new ByteArrayInputStream("JAVA".getBytes()));
            System.out.print("\"JAVA\" in bytes = ");
            while (in.available() != 0)
                System.out.print(((DataInputStream) in).readByte() + " ");
            in = new DataInputStream(new ByteArrayInputStream(new byte[]{74, 65, 86, 65}));
            System.out.println();
            System.out.print("\"byte [] {74,65,86,65}\" in chars = ");
            while (in.available() != 0)
                System.out.print((char) (((DataInputStream) in).readByte()));// =/= read(), -1 => (byte)
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
