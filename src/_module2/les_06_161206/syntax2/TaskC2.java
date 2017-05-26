package _module2.les_06_161206.syntax2;

/**
 * Построить строку, состоящую из малых
 * букв латинского алфавита (по
 * алфавиту).
  */
public class TaskC2 {
    public static void main(String[] args) {
        String s="";
        System.out.println(alphabet(s));
    }
    static String alphabet (String s){
        for (char i = 97; i < 123 ; i++) {
               s+=i;
        }
        return s;
    }
}
