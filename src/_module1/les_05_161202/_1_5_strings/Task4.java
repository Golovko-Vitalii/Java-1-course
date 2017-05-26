package _module1.les_05_161202._1_5_strings;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = "Этот текст нужно зеркально перевернуть";
        System.out.println("a = " + a);
        int n1 = a.indexOf(" ");
        int n2 = a.indexOf(" ", n1+1);
        int n3 = a.indexOf(" ", n2+1);
        int n4 = a.indexOf(" ", n3+1);
        String a1;
        a1 = a.substring(n4+1,a.length())+" "
                +a.substring(n3+1,n4)+" "
                +a.substring(n2+1,n3)+" "
                +a.substring(n1+1,n2)+" "
                +a.substring(0,n1);
        System.out.println("a1 = " + a1);

    }
}
