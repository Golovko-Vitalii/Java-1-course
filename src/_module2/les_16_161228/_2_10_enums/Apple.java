package _module2.les_16_161228._2_10_enums;

import java.util.Comparator;

public enum Apple {
    JONATHAN(10), GOLDEN(15), RED(9), CORTLAND(20);
    static Comparator<Apple> BY_PRICE = new Comparator<Apple>() {
        @Override
        public int compare(Apple a1, Apple a2) {
                return Integer.compare(a1.price,a2.price);
        }
    };
    private int price;

    Apple(int price) {
        this.price = price;
    }//constructor alt+ins

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {return "Apple{" + name()+ " (price=" + price +")} " ;
    }
}
