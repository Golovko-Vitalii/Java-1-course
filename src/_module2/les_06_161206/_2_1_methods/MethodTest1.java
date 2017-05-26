package _module2.les_06_161206._2_1_methods;

public class MethodTest1 {
    public static void main(String[] args) {
        int n1 = 4;
        int n2 = 5;
        int m=sum (n1,n2);
        System.out.println("m = " + m);

        String s="java";//строка неизменяемый тип
        //s.charAt() //Метод charAt() возвращает указанный символ из строки.
        /*Метод concat() объединяет текст из двух или более строк и возвращает
         новую строку. Изменения в тексте в одной строке не затрагивают остальные строки.*/
        changeStr1(s);
        System.out.println("outside method - "+s);

        int[] b={1};
        System.out.println("in main до метода "+b[0]);
        changeStr2(b);
        System.out.println("in main после метода "+b[0]);

    }
    static int sum (int a,int b){//a=n1;//b=n2;
        //static void printsum (int a,int b){
        //System.out.println(a+b);
        return a+b;
    }

    static void changeStr1(String s){
        s.toUpperCase();//не меняет саму строковую переменную, нужно присваивать
        s.concat("!");//не меняет саму строковую переменную, нужно присваивать
        System.out.println("inside method без присвоения в переменную - "+s);
        s=s.concat("!");
        s=s.toUpperCase();
        System.out.println("inside method с присвоением в переменную - "+s);
    }
    static int changeStr2(int[] a){
        a[0]=1000000;
        return a[0];

    }
}
