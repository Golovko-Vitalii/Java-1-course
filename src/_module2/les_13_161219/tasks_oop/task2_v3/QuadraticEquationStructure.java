package _module2.les_13_161219.tasks_oop.task2_v3;

public class QuadraticEquationStructure {
    private double a,b,c;

    public QuadraticEquationStructure(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double A() {
        return a;
    }

    public double B() {
        return b;
    }

    public double C() {
        return c;
    }

    @Override
    public String toString() {
        return "Quadratic Equation: { f(x) = " +
                a +"x^2 + " +
                b +"x +" +
                 c +
                '}';
    }
}
