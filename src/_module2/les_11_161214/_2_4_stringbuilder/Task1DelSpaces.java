package _module2.les_11_161214._2_4_stringbuilder;

/*Написать метод, который преобразует входящую строку:
        Заменяет пробелы идущие подряд, на один*/
public class Task1DelSpaces {
    public static void main(String[] args) {
        String s = "   Hello    from     us!   ";
        System.out.println("s = " + s);
        System.out.println("Result: "+delSpaces(s));
    }
    static String delSpaces(String input){
        StringBuilder sb = new StringBuilder(input);
        for (  ;  ; ) {
            int flag=0;
            for (int i = 1; i <sb.length() ; i++) {
                if ((sb.charAt(i-1)==' ')&&(sb.charAt(i)==' ')){
                    sb.replace(i-1,i+1," ");
                    flag++;}
            }
            if (flag==0) {return sb.toString();}
        }
    }
}
