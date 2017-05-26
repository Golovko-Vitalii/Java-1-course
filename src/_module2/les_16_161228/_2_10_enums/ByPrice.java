package _module2.les_16_161228._2_10_enums;

import java.util.Comparator;

public class ByPrice implements Comparator <Apple> {
    @Override
    public int compare(Apple a1, Apple a2) {
        return Integer.compare(a1.getPrice(),a2.getPrice());
    }
}
