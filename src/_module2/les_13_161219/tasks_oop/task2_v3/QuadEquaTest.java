package _module2.les_13_161219.tasks_oop.task2_v3;

import java.util.ArrayList;

/*1)	Создать классы, спецификации которых приведены ниже.
        2)	Реализовать методы сложения, вычитания, умножения
        и деления объектов (для тех классов, объекты которых
        могут поддерживать арифметические действия). Желательно
        сделать это, создав соответствующий интерфейс.
        3. Определить класс Квадратное уравнение. Реализовать методы для поиска
        корней, экстремумов, а также интервалов убывания/возрастания. Создать
        массив/список/множество объектов и определить наибольшие и наимень-
        шие по значению корни.*/
public class QuadEquaTest {
    public static void main(String[] args) {
        ArrayList <QuadraticEquation> qe = new ArrayList<>();
        qe.add(new QuadraticEquation(3,5,-3));
        qe.add(new QuadraticEquation(2,5,-25));
        qe.add(new QuadraticEquation(-3,5,-3));
        qe.add(new QuadraticEquation(1,0,0));
        for (QuadraticEquation equation : qe) {
            System.out.println("---"+equation.toString()+"---");
            System.out.println("root 1 = " +equation.FindRoot1());
            System.out.println("root 2 = " +equation.FindRoot2());
            System.out.println("extremum point: x = " +equation.FindExtremum()+
                    ", y = "+equation.FindOrdinat(equation,equation.FindExtremum()));
            System.out.println(equation.FindIntervalIncrease());
            System.out.println(equation.FindIntervalDecrease());
            System.out.println("----------------------------");
        }
        System.out.println("Max root = "+QuadraticEquation.MaxRoot(qe));
        System.out.println("Min root = "+QuadraticEquation.MinRoot(qe));


    }
}
