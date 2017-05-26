package _module2.les_13_161219._2_6_2_comparable._bug;

import java.util.Comparator;

public class Bug implements Comparable,Comparator,BugInfo {
    String name; double razmer; String color;
    public Bug(String name, double razmer, String color){
        this.name=name;
        this.razmer=razmer;
        this.color=color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRazmer(double razmer) {
        this.razmer = razmer;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void print(){
        System.out.println();
        System.out.println("Название"+name);
        System.out.println("Размер"+razmer+"cm");
        System.out.println("Цвет"+color);
    }
    @Override
    public int compare(Object bug_a, Object bug_b) {
        Bug a = (Bug) bug_a;
        Bug b= (Bug) bug_b;
        return (int)(a.razmer-b.razmer);
    }
    @Override
    public int compareTo(Object bug_b) {
        Bug that= (Bug) bug_b;
        return (int)(this.razmer-that.razmer);
    }

}
