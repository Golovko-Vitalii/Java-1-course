package _module3.les_23_170112._3_2_4_equals;

public class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    /*@Override
    public boolean equals(Object obj) {
        Product other = (Product)obj;
        return (this.price==other.price && this.name.equals(other.name));
        // сравнение прайса первой в ленивом
        // операторе, т.к. int сравнивается быстрее чем String
    }*/

    /*@Override
    public int hashCode() {
        return (name.hashCode()+((int)price));
        //return 0;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (price != product.price) return false;
        return name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return 31 * name.hashCode() + price;
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price &&
                Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }*/

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
