package _module3.les_20_170106._generic_intro;

public class Bag <T> {
    private T value;

    public Bag (T input){
        this.value = input;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T values) {
        this.value = values;
    }

    @Override
    public String toString() {
        return "Bag{" +
                "values=" + value +
                '}';
    }
}
