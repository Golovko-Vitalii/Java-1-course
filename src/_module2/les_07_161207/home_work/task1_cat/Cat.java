package _module2.les_07_161207.home_work.task1_cat;

public class Cat {
    private String name;
    private String color;
    private double weight;

    public Cat(String name, String color, double weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public void sound(){
        System.out.println("MEEEYY~!!");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
