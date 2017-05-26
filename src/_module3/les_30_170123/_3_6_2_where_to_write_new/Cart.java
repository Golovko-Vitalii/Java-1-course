package _module3.les_30_170123._3_6_2_where_to_write_new;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Entry> entries;

    public Cart() {
        this.entries = new ArrayList<>();
    }

    public void add(Item t, int amount) { //Entry - not right!!!
        entries.add(new Entry(t, amount));
    }

    public int sumAll() {
        int sum = 0;
        for (Entry entry : entries) {
            sum += entry.count*entry.tovar.getPrice();
        }
        return sum;
    }

    private static class Entry { //nested
        Item tovar;
        int count;

        public Entry(Item tovar, int count) {
            this.tovar = tovar;
            this.count = count;
        }

        @Override
        public String toString() {
            return "{" +
                    tovar +
                    ", " + count +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Cart{" +
                "entries=" + entries +
                '}';
    }
}
