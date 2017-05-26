package _module2.les_10_161213._2_3_inheritance._shape;

public class Shape {
    private String color;

    public Shape (){
        this.color = "black";
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public  void show(){
        System.out.println("I am shape");
    }
}
