package _module2.les_12_161215._2_6_2_animals;

public class Penguin extends Bird implements Swim {
    private double swimSpeed;

    public Penguin(String name, double weight, boolean predator, double swimSpeed) {
        super(name, weight, predator);
        this.swimSpeed = swimSpeed;
    }

    @Override
    public void swim() {
            System.out.println("penguin swimming!!");
    }

    @Override
    public void makeEggs() {
        System.out.println("I am penguin, I made 1 or 2 eggs");
    }

    @Override
    public void eat() {
        System.out.println("I am penguin, I eat fish, an so on");
    }

    @Override
    public void sound() {
        System.out.println("I am penguin, my sound is: ouuuouuuouuu");
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "swimSpeed=" + swimSpeed +
                "} " + super.toString();
    }
}
