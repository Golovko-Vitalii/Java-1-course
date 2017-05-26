package _module2.les_16_161228._2_10_enums;

import java.util.Arrays;

public class EnumTest {
    public static void main(String[] args) {

        Season w = Season.WINTER;

        // enum -> String
        System.out.println(w.toString());
        // String -> enum
        Season w1 = Season.valueOf("WINTER");
        System.out.println(w1);

        System.out.print("All seasons: ");
        System.out.println(
                Arrays.toString(Season.values()));

        // index -> enum
        System.out.print("1st season is ");
        System.out.println(Season.values()[0]);
        // enum -> index
        System.out.print("Summer is number ");
        System.out.print(Season.SUMMER.ordinal() + 1);
        System.out.println(" season");
        System.out.println("Season, next to Autumn is ");
        System.out.println(EnumTest.nextSeason(Season.AUTUMN));


        //
        System.out.println();
        System.out.println(Season.AUTUMN.nextSeason());//WINTER
        System.out.println(Season.WINTER.nextSeason());
        System.out.println(Season.WINTER.prevSeason());


    }
    static Season nextSeason(Season season){
        if (season.equals(Season.AUTUMN)) return Season.WINTER;
        return Season.values()[season.ordinal()+1];


    }
}
