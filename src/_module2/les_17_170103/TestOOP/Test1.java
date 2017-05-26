package _module2.les_17_170103.TestOOP;

public class Test1 {
    public int count;
    public void increment(){
        count++;
    }
    public int get(){
        return count;
    }

    public static void main(String[] args) {
        Test1 c = new Test1();
        c.count = 5;
        c.count+=c.get();
        c.increment();
        System.out.println(c.count);
    }
}
