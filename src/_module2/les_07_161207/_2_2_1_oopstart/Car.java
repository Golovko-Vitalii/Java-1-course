package _module2.les_07_161207._2_2_1_oopstart;

    public class Car {
//class Car = default class Car, члены класса - св-ва
//и методы объекта, доступны внутри пакета.
//public(видны всем)-->protected(пакет+наследники)-->
//-->default(пакет)-->private(только класс)
    private String color;
    private double weight;
    private int year;
    private double velocity;

    public Car(){
    }

    public Car(String color, double weight, int year) {
    this.color = color;
    this.weight = weight;
    this.year = year;
    this.velocity = 0;
    }

        public String getColor(){String color = "blue"; return this.color;}
        public double getWeight(){return weight;}
        public int getYear(){return year;}

    public void setColor(String color){
        this.color=color;
    }
    public void setWeight(double weight) {
    this.weight = weight;
    }
    public void SetYear(int year){
        this.year = year;
    }

    void beep(){
        System.out.println("BEEP-BEEP!!!");
    }
    /*void acceleration(double a){
        velocity = velocity + a;
    }*/
        public void accelerate(int delta){
            velocity += delta;
        }

    /*void deceleration(double b){
        if (velocity-b>=0) velocity=velocity-b;
    }*/
    public void decelerate(int delta){
        if (velocity>delta) velocity -= delta;
        else velocity = 0;

    }
    void print(){
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight);
        System.out.println("Year car: " + year);
        System.out.println("Velocity: " + velocity);
    }
        public void printInfo(){
            System.out.println(color+" "+weight+" "+year
                    + " "+ velocity);
        }
        public String toString(){
            return color+" "+weight+" "+year
                    + " "+ velocity;
        }
    }