package _module2.les_07_161207._2_2_1_oopstart;

public class CarTest {
    public static void main(String[] args) {
        Car m1 = new Car();
        //m1.color="green";//private, access denied
        m1.setColor("green");
        //m1.weight=1500;//private, access denied
        m1.setWeight(1500);
        //m1.year=1982;//private, access denied
        m1.SetYear(1982);
        m1.print();
        System.out.println();
        m1.accelerate(30);
        m1.print();
        System.out.println();
        Car m2 = new Car("red", 1800.0,1991);
        System.out.println("car2:");
        m2.printInfo();
        System.out.println();
        System.out.println(m2.getColor());
        System.out.println(m2.getWeight());
        System.out.println(m2.getYear());
        System.out.println();
        m2.accelerate(10);
        System.out.println("car2:");
        m2.printInfo();
        System.out.println();
        System.out.println("-----");
        System.out.println(m2);

        /*//new CarTest().fact();
        CarTest t=new CarTest(fact());
        System.out.println();*/

    }
    //int fact(){return 45;}
}
