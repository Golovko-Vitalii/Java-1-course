package _module2.les_16_161228._2_10_enums;

import java.util.Arrays;
import java.util.Comparator;

public class AppleTest {
    public static void main(String[] args) {
        Apple []apples = Apple.values();
        for (Apple apple : apples) {
            System.out.println(apple);
        }
        System.out.println("Sorted natural:");
        Arrays.sort(apples);
        for (Apple apple : apples) {
            System.out.println(apple);
        }

        System.out.println("---------------------");
        Arrays.sort(apples,Apple.BY_PRICE);
        System.out.println("Sort by price: (anonymous method)");
        System.out.println(Arrays.toString(apples));
        System.out.println("---------------------");

        System.out.println("Sorted by price: (new class ByPrice)");
        Arrays.sort(apples,new ByPrice());
        System.out.println(Arrays.toString(apples));
        System.out.println("---------------------");

        System.out.println("Sorted by name: (anonymous method)");
        Arrays.sort(apples, new Comparator<Apple>() {
                    @Override
                    public int compare(Apple a1, Apple a2) {
                        return a1.name().compareTo(a2.name());
                    }
                }
        );
        System.out.println(Arrays.toString(apples));
        System.out.println("---------------------");

        System.out.println("Sorted by price reversed: (new class ByPrice)");
        Arrays.sort(apples,new ByPrice().reversed());
        System.out.println(Arrays.toString(apples));
        System.out.println("---------------------");
        //-------------------------------------------------
        System.out.println("Sorted by name:");
        Arrays.sort(apples, (a1, a2) -> a1.name().compareTo(a2.name()));
        System.out.println(Arrays.toString(apples));
        //-------------------------------------------------
        Arrays.sort(Apple.values(), new ByPrice());
        Apple.values()[0] = Apple.CORTLAND;// не можем заменить
        Apple.values()[0].setPrice(1000);
        Apple.values()[0]=Apple.GOLDEN; //не меняется
        System.out.println(Apple.JONATHAN);
        System.out.println(Apple.values()[0]);
        System.out.println("--------------");
        for (Apple a : Apple.values()) {
            System.out.println(a);
        }

        // for (int i = 0; i <apples.length ; i++) {  int price=apples[i].getPrice(); }
        /*int max=apples[0].getPrice(), min=apples[0].getPrice();
        for (int i = 0; i <= apples.length; i++) {if(apples[i].getPrice() > max){max =apples[i].getPrice();};
            if(apples[i].getPrice() < min){min =apples[i].getPrice();};}
        System.out.println("Самые дорогие яблоки= "+max+" Самые дешевые яблоки= "+min);
*/
        // Arrays.sort(apples); for (Apple apple:apples){ System.out.print(apple+" "); }


    }
}
