package _module1.les_03_161130._1_3_cycles;

public class TestLazyLogic {
    public static void main(String[] args) {

        //& проверяются все условия
        /*int a = 1, b = 0;
        if (a==0 & 1/b==1){
            System.out.println("ok");
        } else {
            System.out.println("else");
        }*/
        //&& - проверка до первого "false"
        int a = 1, b = 0;
        if (a==0 && 1/b==1){
            System.out.println("ok");
        } else {
            System.out.println("else");
        }
    }
}
