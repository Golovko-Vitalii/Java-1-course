package _module2.les_09_161209._2_2_1_static_nonstatic;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("Sam", 1983);
        Person p2 = new Person("Max", 1988);
        /*
        //v1
        if (Person.compareByAge(p1,p2)<0) {
            System.out.println(p1.getName() + " is older than " + p2.getName());
        } else {
            System.out.println(p1.getName() + " is younger than " + p2.getName());
        }*/
        //v2
        String s;
        if (Person.compareByAge(p1,p2)<0) {
            s = " is older than ";
        } else {
            s = " is younger than ";
        }
        System.out.println(p1.getName() + s + p2.getName());

        /*
        // методы класса
        String.valueOf()
        //методы объекта
        "sdgsdg".substring()
        */
        System.out.println("AB".compareTo("AC"));
        System.out.println("AB".compareTo("AD"));
        System.out.println("AC".compareTo("AB"));
        System.out.println("ABAC".compareTo("ACAB"));
    }
}