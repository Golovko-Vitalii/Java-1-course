package _module1.les_02_161129.home_work;

import java.util.Arrays;

public class StringTask2 {

    public static void main(String[] args) {
        String fio,f,i,o;
        fio = "Головко Виталий Владимирович";
        int pos = 0, posend = fio.length(), pos1 = fio.indexOf(" ",pos);
        f = fio.substring(pos,pos1);
        pos = pos1+1;
        pos1 = fio.indexOf(" ",pos);
        i = fio.substring(pos,pos1);
        pos = pos1+1;
        o = fio.substring(pos, posend);
        System.out.println("fio = " + fio);
        System.out.println("f = " + f);
        System.out.println("i = " + i);
        System.out.println("o = " + o);

            System.out.println(Arrays.toString(fio.split(" ")));

    }
}
