package _module3.les_30_170123._3_6_2_where_to_write_new;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.add(new Item("Hleb", 10), 4);
        cart.add(new Item("Voda", 10), 2);
        cart.add(new Item("Maslo", 10), 1);
        System.out.println(cart);
        System.out.println(cart.sumAll() + "grn");
    }
}
