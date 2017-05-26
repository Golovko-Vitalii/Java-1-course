package _module1.les_02_161129._1_2_types_vars;

public class OverFlowTest {
    public static void main(String[] args) {
        //int x = 2147483647;
        int x = Integer.MAX_VALUE;
        System.out.println("before "+x);
        x++;
        System.out.println("after "+x);
        System.out.println(Integer.MIN_VALUE);
        System.out.println("------------");
        System.out.println("Double +Inf: "+ (Double.MAX_VALUE*2));
        System.out.println("Double -Inf: "+ (-Double.MAX_VALUE-Double.MAX_VALUE));
    }
}
