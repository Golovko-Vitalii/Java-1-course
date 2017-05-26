package _module2.les_14_161222._2_8_6_generic;

public class Life {
    public static class X {
         public static class Y {
             public static String Z = "life is good";
         }
         public static C Y;
    }

     public static class C {
         public static String Z = "life is pain";
     }

     public static void main(String[] args) {
            System.out.println(X.Y.Z);
            System.out.println((new X.Y()).Z);
     }
}
