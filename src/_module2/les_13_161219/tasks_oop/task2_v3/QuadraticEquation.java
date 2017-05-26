package _module2.les_13_161219.tasks_oop.task2_v3;

import java.util.ArrayList;

public class QuadraticEquation extends QuadraticEquationStructure implements Operations {
    public QuadraticEquation(double a, double b, double c) {
        super(a, b, c);
    }

    @Override
    public double FindOrdinat(QuadraticEquation q, double x) {
        return q.A()*x*x+q.B()*x+q.C();
    }

    @Override
    public double FindDiscr() {
        return Math.sqrt(this.B()*this.B()-4*this.A()*this.C());
    }

    @Override
    public double FindRoot1() {
        return (-this.B()+this.FindDiscr())/(2*this.A());
    }
    @Override
    public double FindRoot2() {
        return (-this.B()-this.FindDiscr())/(2*this.A());
    }

    @Override
    public double FindExtremum() {
        return ((-this.B())/(2*this.A()));
    }

    @Override
    public String FindIntervalDecrease() {
        double xExtremum = this.FindExtremum();
        if (FindOrdinat(this,xExtremum)<FindOrdinat(this,xExtremum+1))
        return ("Интервал убывания ф-ии: ("+Double.NEGATIVE_INFINITY+", "+xExtremum+")");
        else return ("Интервал убывания ф-ии: ("+xExtremum+", "+Double.POSITIVE_INFINITY+")");
    }

    @Override
    public String FindIntervalIncrease() {
        double xExtremum = this.FindExtremum();
        if (FindOrdinat(this,xExtremum)<FindOrdinat(this,xExtremum+1))
            return ("Интервал возрастания ф-ии: ("+xExtremum+", "+Double.POSITIVE_INFINITY+")");
        else return ("Интервал возрастания ф-ии: ("+Double.NEGATIVE_INFINITY+", "+xExtremum+")");
    }
    public static double MaxRoot (ArrayList<QuadraticEquation> arr){
        double maxRoot = 0;
        for (QuadraticEquation equation : arr) {
            if ((equation.FindRoot1()-equation.FindRoot2())>0 && equation.FindRoot1()>maxRoot ) maxRoot = equation.FindRoot1();
            else if (equation.FindRoot2()>maxRoot)maxRoot = equation.FindRoot2();
        }
        return maxRoot;
    }
    public static double MinRoot (ArrayList<QuadraticEquation> arr){
        double minRoot = 0;
        for (QuadraticEquation equation : arr) {
            if ((equation.FindRoot1()-equation.FindRoot2())<0 && equation.FindRoot1()<minRoot ) minRoot = equation.FindRoot1();
            else if (equation.FindRoot2()<minRoot)minRoot = equation.FindRoot2();
        }
        return minRoot;
    }
}
