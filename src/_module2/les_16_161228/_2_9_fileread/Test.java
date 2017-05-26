package _module2.les_16_161228._2_9_fileread;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {

        List <String> list = Files.readAllLines(Paths.get("les_15.txt"));
        List <String> words = new ArrayList<>();


        for (int i = 0; i < list.size(); i++) {
            //System.out.println(list.get(i)); //[i]
            String line = list.get(i);
            String [] tmp = line.split(" ");
            for (String word : tmp) {
                words.add(word);
            }
        }
        System.out.println(words);
        System.out.println();

        for (String stroka : list) {
            System.out.println(stroka);
        }

        System.out.println();
        list.forEach(stroka -> System.out.println(stroka));

        //class X implements Comparator - noName!
        Comparator <String> c1 = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        };

        System.out.println();
        String [] arr = new String[]{"z","b","c"};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, c1);
        System.out.println(Arrays.toString(arr));


    }
}