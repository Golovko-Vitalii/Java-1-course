package _module2.les_12_161215._2_6_2_animals;

public abstract class Bird extends Animal{
    private boolean predator;
    public abstract void makeEggs();

    public Bird(String name, double weight, boolean predator) {
        super(name, weight);
        this.predator = predator;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "predator=" + predator +
                "} " + super.toString();
    }
}
