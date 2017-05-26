package _module2.les_10_161213.home_work;

public class Star extends SpaceObjects{
    private int luminosity;

    public Star(double weight, int luminosity) {
        super(weight);
        this.luminosity = luminosity;
    }

    @Override
    public String toString() {
        return "Star{" +
                "luminosity=" + luminosity +
                "} " + super.toString();
    }

    @Override
    public void show() {
        System.out.println("I'm a star!");
    }
}
