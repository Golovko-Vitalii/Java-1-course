package _module2.les_12_161215._2_6_2_animals;

public class Eagle extends Bird {
    private int longview;

    public Eagle(String name, double weight, boolean predator, int longview) {
        super(name, weight, predator);
        this.longview = longview;
    }

    @Override
    public void makeEggs() {
        System.out.println("I am eagle, I made 2 eggs");
    }

    @Override
    public void eat() {
        System.out.println("I am eagle, I eat meat, an so on");
    }

    @Override
    public void sound() {
        System.out.println("I am eagle, my sound is like average eagle");
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "longview=" + longview +
                "} " + super.toString();
    }
}
