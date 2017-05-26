package _module2.les_10_161213.home_work;

public class Planet extends SpaceObjects{
    private int order;

    public Planet(double weight, int order) {
        super(weight);
        this.order = order;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "order=" + order +
                "} " + super.toString();
    }

    @Override
    public void show() {
        System.out.println("I'm a planet!! ;)");
    }
}
