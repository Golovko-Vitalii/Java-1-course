package _module2.les_11_161214._2_4_stringbuilder;

import java.util.Date;

public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer stringBuffer1 = new StringBuffer("HELLO!");
        StringBuffer stringBuffer2 = new StringBuffer();
        StringBuffer stringBuffer3 = new StringBuffer(10);
        System.out.println("stringBuffer1 = " + stringBuffer1);
        stringBuffer1.setLength(3);//обрезание буффер до 3 символов
        System.out.println("stringBuffer1 = " + stringBuffer1);
        System.out.println(stringBuffer1.charAt(1));
        char [] ch = new char[2];
        stringBuffer1.getChars(0,2,ch,0);
        for (char c : ch) {
            System.out.print(" " + c);
        }
        System.out.println();
        stringBuffer1.append("LO ;)");
        System.out.println("stringBuffer1 = " + stringBuffer1);
        String s =  " from JAVA ";
        stringBuffer1.insert(5,s);
        System.out.println("stringBuffer1 = " + stringBuffer1);
        System.out.println(stringBuffer1.reverse());
        System.out.println(stringBuffer1.reverse());
        stringBuffer1.delete(5,10);
        System.out.println("stringBuffer1 = " + stringBuffer1);
        stringBuffer1.deleteCharAt(12);
        System.out.println("stringBuffer1 = " + stringBuffer1);
        stringBuffer1.replace(0,5,"HI");
        System.out.println("stringBuffer1 = " + stringBuffer1);
        System.out.println(stringBuffer1.indexOf("HELLO"));
        System.out.println(stringBuffer1.indexOf("JAVA"));
        //inefficient version using immutable String
        System.out.println("Time need for String:");
        String s1 = "Some Text";
        System.out.println("Begin "+new Date(System.currentTimeMillis()));
        for (int i = 0; i < 50000; i++) {
            s1+=i;
        }
        System.out.println("Ending "+new Date(System.currentTimeMillis()));
        System.out.println("---------");
        System.out.println("Time need for StringBuffer:");
        StringBuffer stringBuffer = new StringBuffer("Some Text");
        System.out.println("Begin "+new Date(System.currentTimeMillis()));
        for (int i = 0; i < 50000; i++) {
            stringBuffer.append(i);
        }
        System.out.println("Ending "+new Date(System.currentTimeMillis()));

    }
}
