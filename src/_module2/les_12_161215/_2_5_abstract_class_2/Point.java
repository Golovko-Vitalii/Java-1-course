package _module2.les_12_161215._2_5_abstract_class_2;

public abstract class Point {
    private String color;

    public Point(String color) {
        this.color = color;
    }

    public abstract void show(); // {}; //в абстрактном методе не должно быть тела {}
    // наследники обязательно должны реализовать этот метод!!!
    // (либо сами объявить себя абстрактными)
}
