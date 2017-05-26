package _module2.les_06_161206.syntax2;

/**
 * В заданной строке, после каждого слова вида «sin», «cos» или «log»,
 * поставить скобку «(».
 */

public class TaskC5 {
    public static void main(String[] args) {
        String s = "В заданной строке sin cos sin, после каждого слова вида" +
                " «sin», «cos» или «log», log cos " +
                "поставить скобку «(».";
        System.out.println(s);
        System.out.println("Result: "+searchTFunc(s));
    }
    static String searchTFunc (String s){
        int index = -1;
        for (int i = 0; i < s.length(); i++) {
            index = s.indexOf("sin",i);if (index==-1)index = s.indexOf("cos",i);
            if (index==-1)index = s.indexOf("cos",i);
            if (index!=-1){
            s=s.substring(0,index+3)+"("+s.substring(index+3,s.length());
            i=index+1;}
        }
        return s;
    }
}
