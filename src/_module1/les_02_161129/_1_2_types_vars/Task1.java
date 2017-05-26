package _module1.les_02_161129._1_2_types_vars;

public class Task1 {
    public static void main(String[] args) {
        long a = (long) (Math.pow(2,32)+1);
        System.out.println("a/641 = " + a/641);
        System.out.println("a%641 = " + a%641);
        System.out.println((int)((Math.pow(2, 32) + 1) / 641));
        System.out.println((int)((Math.pow(2, 32) + 1) % 641));
        int i = 0;
        i++;
        System.out.println(i);
        i = i++;//так писать нельзя
        System.out.println(i);
        i = i++;//так писать нельзя
        System.out.println(i);
    }
}
