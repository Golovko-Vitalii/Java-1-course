package _module2.les_13_161219._2_6_2_comparable._student;

import java.util.Comparator;

public class Student implements Comparable {
    //Comparable - public int compareTo(T o);
    //Comparator - int compare(T o1, T o2);
    static Comparator BY_NAME=
        new Comparator() {//anonymous class
            //class X implements Comparator, new X()
            @Override
            public int compare(Object o1, Object o2) {
                Student s1 = (Student)o1;
                Student s2 = (Student)o2;
                return s1.getName().compareTo(s2.getName());
            }
        };

    private String name;
    private int course;
    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }
    public String getName() {
        return name;
    }
    public int getCourse() {
        return course;
    }

    //сортировка implements Comparable
    @Override
    public int compareTo(Object o){
        Student other = (Student) o;
        if (this.name.compareTo(other.name)!=0)
        //сортировка по имени
        {return this.name.compareTo(other.name);}
        //by course
        /*if(this.course > other.course) return  1;
        if(this.course < other.course) return -1;
        return 0;*/
        // это равносильно
        return this.course-other.course;
    }

    @Override
    public String toString() {
        return "\n"+"Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
