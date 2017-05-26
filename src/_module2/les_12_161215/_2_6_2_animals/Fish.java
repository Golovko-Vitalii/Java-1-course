package _module2.les_12_161215._2_6_2_animals;

public abstract class Fish extends Animal implements Swim {
    private boolean freshwater;

    public Fish(String name, double weight, boolean freshwater) {
        super(name, weight);
        this.freshwater = freshwater;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "freshwater=" + freshwater +
                "} " + super.toString();
    }
}
