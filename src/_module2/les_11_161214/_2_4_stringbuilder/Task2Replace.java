package _module2.les_11_161214._2_4_stringbuilder;

/*Написать метод, который преобразует входящую строку:
        Заменяет точки на «/»*/
public class Task2Replace {
    public static void main(String[] args) {
        String s = "...Hello... from .. us!..";
        System.out.println("s = " + s);
        System.out.println("Result: "+delPoints(s));
    }
    static String delPoints(String input){
        StringBuilder sb = new StringBuilder(input);
        for (  ;  ; ) {
            int flag=0;
            for (int i = 1; i <=sb.length() ; i++) {
                if ((sb.charAt(i-1)=='.')||(sb.charAt(i-1)=='.')){
                    sb.replace(i-1,i,"/");
                    flag++;}
            }
            if (flag==0) {return sb.toString();}
        }
    }
}
