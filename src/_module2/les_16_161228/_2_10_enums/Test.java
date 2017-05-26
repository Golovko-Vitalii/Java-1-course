package _module2.les_16_161228._2_10_enums;

import java.util.Arrays;

public class Test {
    enum Title {MR, MS};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Title.values()));
        System.out.println(Title.valueOf("MR"));
        System.out.println(Title.valueOf("MS"));
        System.out.println(Title.MR);
        System.out.println(Title.MR.name());
        System.out.println(Title.MR.name().length());
        System.out.println(Title.MR.ordinal());
        System.out.println(Title.MR.toString());
        Title title1 = Title.MR;
        Title title2 = Title.MS;
        System.out.println(title1.ordinal());
        System.out.println(title1.compareTo(title2));
        System.out.println(title1==title2);
        System.out.println(title1.equals(title2));
    }
}
