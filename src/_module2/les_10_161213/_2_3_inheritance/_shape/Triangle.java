package _module2.les_10_161213._2_3_inheritance._shape;

public class Triangle extends Shape {
    private double a,b,c;


    public Triangle (String color, double a, double b, double c){
        //this(a,b,c);//все будут black
        super(color);
        this.a =a;
        this.b= b;
        this.c= c;
    }

    @Override
    public  void show(){
        System.out.println("I am triangle!");
    }

    @Override
    public String toString() {
        return "Triangle{" + getColor() + " " +
                "a= " + a +
                ", b= " + b +
                ", c= " + c +
                '}';
    }
}
