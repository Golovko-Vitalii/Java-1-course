package _module2.les_09_161209._2_2_1_static_nonstatic;

public class Person {//по возрасту -1;0;1
    private String name;
    private int age;

    //метод с маленькой буквы!!!
    protected static int compareByAge(Person p1, Person p2) { //доступ в пакете и в наследниках
        if (p1.age < p2.age) return -1;
        if (p1.age > p2.age) return 1;
    /*// нельзя ссылаться на нестатический метод из статики (не статика вызывается на объекте)
    boolean k = isOlderThan()*/
        return 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isOlderThan(Person p) {
    /*if (this.age > p.age) return true;
    return false;*/
        //refactoring
        return this.age > p.age;
    }
    // можно ссылаться на статический метод из нестатики (статика вызывается на классе)!!!
    public boolean isOlderThan2(Person p) {
    return Person.compareByAge(this,p)>0; // тоже что Person.compareByAge(this,p)>0;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}