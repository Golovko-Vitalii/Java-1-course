package _module2.les_13_161219._2_6_2_comparable2;

public class Person implements Comparable <Person> {
    private String name;
    private int age;

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

    /* @Override
        public int compareTo(Object o) {
            Person other = (Person)o;
            if (this.age>other.age) return 1;
            if (this.age<other.age) return -1;
            return 0;
            //return this.age-other.age;
        }*/
   /* @Override
    public int compareTo(Object o) {
       Person other = (Person)o;
       if (this.name._3_2_4_equals(other.name)) return (this.age-other.age);
       return this.name.compareTo(other.name);
    }*/

    @Override
    public int compareTo(Person other) {
        if (this.name.equals(other.name)) return (this.age-other.age);
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

