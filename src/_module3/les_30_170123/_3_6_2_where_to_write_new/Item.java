package _module3.les_30_170123._3_6_2_where_to_write_new;

public class Item {
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return
                name + '-' +
                        price +
                        "grn";
    }
}
