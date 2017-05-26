package _module1.les_02_161129._1_2_types_vars;

public class NumSystems {
    public static void main(String[] args) {
        int i10 = 22;
        System.out.println(i10);
        int i16 = 0xF; // 15
        //int i16 = 0xG; // не существует
        System.out.println(i16);// 15
        int i8 = 010;
        System.out.println(i8); //8
        int i2 = 0b1011;
        System.out.println(i2);// 7
        System.out.println("Number 15:");
        int number = 15;
        String str = Integer.toString(number);
        System.out.println("String: "+str);
        str = Integer.toString(number, 16);
        System.out.println("16: "+str);
        str = Integer.toString(number, 8);
        System.out.println("8: "+str);
        str = Integer.toString(number, 2);
        System.out.println("2: "+str);
        str = Integer.toString(number, 10);
        System.out.println("10: "+str);
        System.out.println("3: "+Integer.toString(number, 3));

    }
}
