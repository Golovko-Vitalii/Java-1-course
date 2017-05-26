package _module1.les_05_161202._1_5_strings;

import java.util.Arrays;
import java.util.stream.Stream;

public class Task2 {
    public static void main(String[] args) {
        String input = "22.11.1963";
        String output = "";// получить наоборот
        // переворот зеркально
        for (int i = 0; i < input.length(); i++) {
            output = output + input.substring(Math.abs(i-input.length())-1,Math.abs(i-input.length()));
        }
        System.out.println("output = " + output);
        // поменять местами
        // способ 1
        int n1 = input.indexOf(".");
        int n2 = input.indexOf(".",n1+1);

        output = input.substring(n2+1)+"."
                 +input.substring(n1+1,n2)+"."
                 +input.substring(0,n1);
        System.out.println("output = " + output);
        // способ 2
        // "\\." два обратных сплеша это разре, а "." показуем по какому символу
        String [] parts = input.split("\\.");
        System.out.println("parts = " + Arrays.toString(parts));
        output = parts[2]+"."+parts[1]+"."+parts[0];
        System.out.println("output = " + output);
        //обратно сплиту, склеить эл-ты массива
        String s = Stream.of(parts)
                .reduce((s1,s2) -> s1+"."+s2).get();
        System.out.println("s = " + s);
    }
}
