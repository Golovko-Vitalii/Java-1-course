package _module2.les_12_161215._2_6_2_animals;

public abstract class Animal {
    private String name;
    private double weight;
    public abstract void eat();
    public abstract void sound();
    public String info(){
        return "We are animal";
    }

    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", weight=" + weight;
    }
}
