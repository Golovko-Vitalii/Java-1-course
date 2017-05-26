package _module1.les_05_161202._1_5_strings;

import static java.lang.Character.*;

public class Task2YearToBeginning {
    public static void main(String[] args) {
        String input = "10000 days Author 2005 Hello";
        String output;
        String test = " "+input+" ";
        //" YYYY " - mask
        int index = -1;
        for (int i = 0; i < test.length()-5; i++) {
               if (!isDigit(test.charAt(i))&&
                    isDigit(test.charAt(i+1))&&
                    isDigit(test.charAt(i+2))&&
                    isDigit(test.charAt(i+3))&&
                    isDigit(test.charAt(i+4))&&
                   !isDigit(test.charAt(i+5))
                    ){
                index = i+1;
                break;
            }
        }
        System.out.println(index);
        output = test.substring(index, index+4)
                +test.substring(0, index)
                +test.substring(index+4+1);
        System.out.println("output = " + output);


    }
}
