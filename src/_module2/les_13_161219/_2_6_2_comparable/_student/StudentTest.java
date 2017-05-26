package _module2.les_13_161219._2_6_2_comparable._student;

import java.util.Arrays;

public class StudentTest {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("Ivan",4);
        students[1] = new Student("Ivan",1);
        students[2] = new Student("Tetyana",3);
        students[3] = new Student("Mariya",5);
        students[4] = new Student("Ivan",1);
        Student [] students1 = Arrays.copyOfRange(students,0,students.length);
        Student [] students2 = Arrays.copyOfRange(students,0,students.length);
        Student [] students3 = Arrays.copyOfRange(students,0,students.length);
        Student [] students4 = Arrays.copyOfRange(students,0,students.length);
        Student [] students5 = Arrays.copyOfRange(students,0,students.length);
        //
        System.out.println(Arrays.toString(students1));
        Arrays.sort(students1);
        System.out.println("Sort вызов сортировки через class Student implements Comparable");
        System.out.println(Arrays.toString(students1));
        System.out.println("---------------------");
        //
        System.out.println(Arrays.toString(students2));
        ByName byName = new ByName();
        Arrays.sort(students2,byName);
        System.out.println("Sort by Name Comparator");
        System.out.println(Arrays.toString(students2));
        System.out.println("---------------------");
        //
        System.out.println(Arrays.toString(students3));
        ByCourse byCourse = new ByCourse();
        Arrays.sort(students3,byCourse);
        System.out.println("Sort by Course Comparator");
        System.out.println(Arrays.toString(students3));
        System.out.println("---------------------");
        //
        System.out.println(Arrays.toString(students4));
        Arrays.sort(students4,byCourse.reversed());
        System.out.println("Sort by Course.reversed() Comparator");
        System.out.println(Arrays.toString(students4));
        System.out.println("---------------------");
        //
        System.out.println(Arrays.toString(students5));
        Arrays.sort(students5,Student.BY_NAME);
        System.out.println("Sort by inside anonymous class Student.BY_NAME Comparator");
        System.out.println(Arrays.toString(students5));
        System.out.println("---------------------");
    }
}
