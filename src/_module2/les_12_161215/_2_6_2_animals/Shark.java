package _module2.les_12_161215._2_6_2_animals;

public class Shark extends Fish {
    private int teethCount;

    public Shark(String name, double weight, boolean freshwater, int teethCount) {
        super(name, weight, freshwater);
        this.teethCount = teethCount;
    }

    @Override
    public void swim() {
        System.out.println("Shark swimming");
    }

    @Override
    public void eat() {
        System.out.println("Shark eating meat, other fishes...");
    }

    @Override
    public void sound() {
        System.out.println("Shark sound like #%$%&%...");
    }

    @Override
    public String toString() {
        return "Shark{" +
                "teethCount=" + teethCount +
                "} " + super.toString();
    }
}
