package _module2.les_17_170103.TestOOP;

public class Test2 {
    final String s;
    public Test2(){s="default";}
    public Test2(String s1){s="no default";}

    public static void main(String[] args) {
        System.out.println(new Test2().s);
        System.out.println(new Test2("no").s);
        System.out.println("final String s = "+new Test2().s+" and "+"final String s = "+new Test2("no").s);
    }

}
