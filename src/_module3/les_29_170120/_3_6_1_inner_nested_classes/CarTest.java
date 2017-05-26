package _module3.les_29_170120._3_6_1_inner_nested_classes;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car("BMW", "V6", 6700);
        System.out.println(car);
        //Car.Engine eng = new Car.Engine("V100",6000);//Error:an enclosing instance that contains Car.Engine is required
        // Engine is inner! not nested(wlozhennyj)!//error!

        Car.Engine tmp = car.new Engine("V6-1", 123);// not popular )))
        System.out.println("car = " + car);
        System.out.println("tmp = " + tmp);
        Car.Info info = new Car.Info(); // ok! Info is nested
        info.printInfo();
    }
}
