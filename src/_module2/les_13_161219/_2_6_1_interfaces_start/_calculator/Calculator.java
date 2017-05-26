package _module2.les_13_161219._2_6_1_interfaces_start._calculator;

import java.lang.reflect.Method;

public class Calculator implements Arithmetic, Info {
    @Override
    public String printInfo() {
        String s = "";
        for (Method m:this.getClass().getDeclaredMethods()){
            s += m.getName() + " ";
        }
        return "Calculator version 1.0 { " + s + " }";
    }

    @Override
    public double plus(double a, double b) {
        return a+b;
    }

    @Override
    public double minus(double a, double b) {
        return a-b;
    }

    @Override
    public double div(double a, double b) {
        if (b!=0)return a/b;else return 0;
    }

    @Override
    public double mult(double a, double b) {
        return a*b;
    }
}
