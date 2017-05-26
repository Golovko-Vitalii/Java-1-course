package _module3.les_20_170106._home_work;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Написать ф-ю, которая сохранит содержимое каталога
 * в список и выведет все элементы (первые 5 элементов) на экран.
 */
public class Task2 {
    public static void main(String[] args) {
        System.out.println("list of files dir C:\\ :");
        File dirFiles = new File("C:"+File.separator);
        List <String> listDir = new ArrayList<>();
        for (String s : dirFiles.list()) {
            listDir.add(s);
        }
        int i =0;
        for (String s : listDir) {
            if (i++<5)
            System.out.println(s);
            else break;
        }
    }
}
