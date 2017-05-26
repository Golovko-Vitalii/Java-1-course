package _module3.les_20_170106._3_2_1_collections;

import java.util.ArrayList;
import java.util.List;

/**
 Написать метод конвертации массива строк\чисел в список
 */
public class Task1 {
    public static void main(String[] args) {
        String [] strArr=new String[10];
        Integer [] intArr = new Integer[10];
        for (int i = 0; i < 10; i++) {
            strArr[i] = Integer.toString(i+1);
            intArr[i] = i+1;
        }
        List <String> listStr = convert(strArr);
        List <Integer> listInt = convert(intArr);
        System.out.println("listInt = " + listInt);
        System.out.println("listStr = " + listStr);
    }

    public static <T> List<T> convert (T [] array){
        List <T> list = new ArrayList<T>();
        for (T t : array) {
            list.add(t);
        }
        return list;
    }

}
