package _module2.les_12_161215._2_6_2_animals;

public class Owl extends Bird {
    private int photosensitivity;

    public Owl(String name, double weight, boolean predator, int photosensitivity) {
        super(name, weight, predator);
        this.photosensitivity = photosensitivity;
    }

    @Override
    public void makeEggs() {
        System.out.println("I am owl, I made 5 eggs");
    }

    @Override
    public void eat() {
        System.out.println("I am owl, I eat meat, an so on");

    }

    @Override
    public void sound() {
        System.out.println("I am owl, my sound is: uuhuuuuuhuuuu");

    }

    @Override
    public String toString() {
        return "Owl{" +
                "photosensitivity=" + photosensitivity +
                "} " + super.toString();
    }
}
