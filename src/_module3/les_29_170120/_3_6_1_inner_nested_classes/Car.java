package _module3.les_29_170120._3_6_1_inner_nested_classes;

import java.util.Arrays;

// inner - внутренний не может существовать без enclosing
//nested - вложенный, должен быть static
public class Car {//enclosing class
    private String name;
    private Engine engine;

    public Car(String name, String engName, int engPower) {
        this.name = name;
        this.engine = new Engine(engName, engPower);//sozdaem klass wnutri wneshnego klassa
    }

    class Engine {//inner class (внутренний)//class wnutri classa
        private String name;
        private int power;

        public Engine(String name, int power) {
            this.name = name;
            this.power = power;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "name= '" + this.name + '\'' +
                    ", power= " + power +
                    " of car " + Car.this.name +//tolko wo wnutr. classe
                    '}';
        }
    }

    //nested class — wlozhennyj
    static class Info {
        void printInfo() {
            System.out.println(new Car("NEW", "V1", 1000));
            System.out.println("Car info: " + Arrays.toString(Car.class.getDeclaredFields()));
            System.out.println("Engine info: " + Arrays.toString(Engine.class.getDeclaredFields()));
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                engine +//engine sam wse propishet
                '}';
    }
}
