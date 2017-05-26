package _module2.les_08_161208._2_2_1_static_basic;

public class CarTest {
    public static void main(String[] args) {
       /* Car[]cars=new Car[3];
        cars[0]new Car("Honda",2016);
        cars[0]new Car("BMW",2000);
        cars[0]new Car("Opel",2010);
       // shop.add()
        //shop.delite(4)
                for(Car car:cars){
            System.out.print(Car);*/
        CarShop shop=new CarShop(10);
        shop.add(new Car("Honda",2016));
        shop.add(new Car("BMW",2000));
        shop.add(new Car("Opel",2010));
        shop.add(new Car("Toyota",2005));
        shop.add(new Car("Tesla",2015));
        shop.add(new Car("Volvo",2011));
        shop.add(new Car("Volvo",2010));
        shop.add(new Car("Volvo",2009));
        shop.add(new Car("Opel",1998));
        shop.add(new Car("Opel",1999));
        shop.add(new Car("...",0));//oveflow number>10
        shop.print();
        System.out.println("________________");

        //shop.delete(3);//ситуации, когда порядок важен и когда неважен(смещение вверх)
        shop.delete(1);
        shop.print();

        System.out.println("Cars afrer year 2007");
        shop.printCarsAfterYear(2007);

        System.out.println("Cars name after letter O:");
        shop.printCarsAfterLetter('O');
        //средний возраст машин (int)
        System.out.println(shop.getAverageAge());
        System.out.println(shop.getAverageAgeClass());
        //наличие машины по имени (boolean)
        String name="Opel";
        System.out.println("There is car in shop with name " +name+" : "+ shop.containsCar(name));
        name="BMW";
        System.out.println("There is car in shop with name " +name+" : "+ shop.containsCar(name));

    }
}
