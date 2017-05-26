package _module2.les_06_161206.syntax2;

/**
 * Проверить строку на правильность скобок ()()(((())))
 */
public class TaskB1 {
    public static void main(String[] args) {
        String s1 = "Текст с символами ( и ), который нужно проверить" +
                " на правильность скобок ()()(((())))";
        System.out.println("s1 = " + s1);
        System.out.println("Result for s1 = "+chkBrackets(s1));
        String s2 = "(( )Текст с символами (( и ), который нужно проверить" +
                " на правильность скобок ()()(((())))";
        System.out.println("s2 = " + s2);
        System.out.println("Result for s2 = "+chkBrackets(s2));
        String s3 = "( ))Текст с символами ( и ), который нужно проверить" +
                " на правильность скобок ()()(((())))";
        System.out.println("s3 = " + s3);
        System.out.println("Result for s3 = "+chkBrackets(s3));
    }
    static String chkBrackets (String s){
        int ind1=0,index=0;
            for (int i = 0; i < s.length(); i++) {
                if (index>=0) {
                if (s.charAt(i)=='(') {index++;}
                if (s.charAt(i)==')') {ind1=i; index--;}
                } else
                    return ("Not correct, position of redudent symbol << ) >> = "+(ind1+1));
            }
            if (index==0) return "All is correct";
            else return ("Not correct, we have "+index+" redudent symbol(s) << ( >> in text!");
    }
}
