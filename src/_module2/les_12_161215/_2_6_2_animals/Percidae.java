package _module2.les_12_161215._2_6_2_animals;

public class Percidae extends Fish {
    private int numberOfScales;

    public Percidae(String name, double weight, boolean freshwater, int numberOfScales) {
        super(name, weight, freshwater);
        this.numberOfScales = numberOfScales;
    }

    @Override
    public void swim() {
        System.out.println("Percidae swimming");
    }

    @Override
    public void eat() {
        System.out.println("Percidae eating meat, other fishes...");
    }

    @Override
    public void sound() {
        System.out.println("Percidae sound like *^%&&^$...");
    }

    @Override
    public String toString() {
        return "Percidae{" +
                "numberOfScales=" + numberOfScales +
                "} " + super.toString();
    }
}
