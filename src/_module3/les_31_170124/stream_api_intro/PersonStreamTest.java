package _module3.les_31_170124.stream_api_intro;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PersonStreamTest {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Max", 25));
        persons.add(new Person("Anna", 25));
        persons.add(new Person("Tom", 20));
        persons.add(new Person("Kat", 20));
        persons.add(new Person("Dan", 25));
        persons.add(new Person("Nick", 30));
        //print person age = 20
        persons.stream().filter(p -> p.getAge() == 20)
                .forEach(p -> System.out.println(p));
        // print persons NAMES, age ==20
        persons.stream()
                .filter(p -> p.getAge() == 20)
                .map(Person::getName)
                .forEach(System.out::println);
        //average age
        double average;
        average = persons.stream()
                .map(p -> p.getAge())
                .reduce((i1, i2) -> i1 + i2)
                .get() / persons.size();
        System.out.println("average = " + average);
        //find oldest;
        Person oldest;
        oldest = persons.stream()
                .max((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()))
                .get();
        System.out.println("oldest = " + oldest);
        //------------COLLECT-----------
        List<Person> drinkers;
        drinkers = persons.stream()
                .filter(p -> p.getAge() >= 21)
                .collect(Collectors.toList());
        System.out.println("drinkers = " + drinkers);
        //all persons group by age
        System.out.println("Grouping names by age:");
        //Stream.of("abcd".toCharArray()).filter()
        Map<Integer, String> ageStat =
                persons.stream()
                        .collect(Collectors.toMap(
                                Person::getAge, // how to get key
                                Person::getName, // how to get value
                                (s1, s2) -> s1 + " and " + s2 //join values
                        ));
        System.out.println(ageStat);
        System.out.println("Grouping Persons by age:");
        //Stream.of("abcd".toCharArray()).filter()
        Map<Integer, List<Person>> statMap =
                persons.stream()
                        .collect(Collectors.groupingBy(Person::getAge));
        statMap.entrySet().forEach(System.out::println);
    }

}
