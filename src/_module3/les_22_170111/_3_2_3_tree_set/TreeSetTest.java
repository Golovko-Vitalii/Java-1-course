package _module3.les_22_170111._3_2_3_tree_set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        Set<Box> treeSet  = new TreeSet<>();
        treeSet.add(new Box(16));
        treeSet.add(new Box(32));
        treeSet.add(new Box(32));
        treeSet.add(new Box(32));
        treeSet.add(new Box(32));
        treeSet.add(new Box(64));
        System.out.println(treeSet);
    }
}
class Box implements Comparable{
    int value;

    public Box(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(Object o) {
        return Integer.compare(this.value,((Box)o).value);
    }

    @Override
    public String toString() {
        return "Box{" +
                "value=" + value + " " + hashCode() +
                '}';
    }
}