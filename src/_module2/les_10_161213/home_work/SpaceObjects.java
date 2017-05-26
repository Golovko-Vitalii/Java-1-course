package _module2.les_10_161213.home_work;

public class SpaceObjects {
    private double weight;

    public SpaceObjects(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "SpaceObjects{" +
                "weight=" + weight +
                '}';
    }
    public void show(){
        System.out.println("I'm a space object :)");
    }
}
