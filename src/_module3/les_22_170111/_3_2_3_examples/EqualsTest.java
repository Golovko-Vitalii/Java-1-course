package _module3.les_22_170111._3_2_3_examples;

import java.util.HashSet;
import java.util.Set;

public class EqualsTest {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        e1.setId(100);
        e2.setId(100);
        System.out.println(e1.equals(e2));//true
        Set<Employee> employees = new HashSet<Employee>();
        employees.add(e1);
        employees.add(e2);
        System.out.println(employees);//print two obj
        for (Employee employee : employees) {
            System.out.println("employee.hashCode() = " + employee.hashCode());
        }
    }
    static class Employee{// implements Comparable
        private int id;

        public void setId(int id) {
            this.id = id;
        }

        public boolean equals(Employee that) {
            return this.id==that.id;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    '}';
        }
        /*@Override
        public int compareTo(Object that) {
            return (this.id - ((Employee)that).id);
        }*/

    }
}
