package _module2.les_13_161219.tasks_oop.task1_v3;

import java.util.Random;
import java.util.Scanner;

/*3. Abiturient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Оценки.
        Создать массив объектов. Вывести:
        a) список абитуриентов, имеющих неудовлетворительные оценки;
        b) список абитуриентов, у которых сумма баллов выше заданной;
        c) выбрать заданное число n абитуриентов, имеющих самую высокую
        сумму баллов (вывести также полный список абитуриентов, имеющих
        полупроходную сумму).*/

public class Test {
    public static void main(String[] args) {
        Abiturients abiturients = new Abiturients();
        Scanner scanner = new Scanner(System.in);
        int counMarks = new Random().nextInt(2)+3;
        int [] marks = new int [counMarks];
        String s="";
        //Create array list of abiturients
        for (int i = 1; i <= new Random().nextInt(10) + 10; i++) {
            for (int j = 0; j < counMarks; j++) {marks[j]= new Random().nextInt(4) + 2;}
            abiturients.add(new Abiturient(i, new Random().nextInt(888888888) + 111111111,
                    marks, RandName(), RandName(), RandName(), RandName()));}
        //
        abiturients.print();
        println("Введите ID (Integer) студента для удаления:");
        s = inputStr();if (chkInt(s)) println(abiturients.delete(Integer.parseInt(s)));
        abiturients.print();
        println("a) список абитуриентов, имеющих неудовлетворительные оценки < 3 : ");
        abiturients.getNegativeMark().print();
        println("b) список абитуриентов, у которых сумма баллов выше заданной n");
        println("Введите средний балл n (Float example 3.3):");
        s = inputStr();if (chkFloat(s))abiturients.getWithBiggerThenMark(Float.parseFloat(s)).print();
        println("c) выбрать заданное число n абитуриентов, имеющих самую высокую"+"\n" +
                "сумму баллов (вывести также полный список абитуриентов, имеющих"+"\n" +
                "полупроходную сумму). Введите кол-во n (Integer)");
        abiturients.sortByAverageMark();
        s = inputStr();if (chkInt(s))abiturients.print(Integer.parseInt(s));
        println("Вывести полный список абитуриентов, имеющих полупроходную сумму");
        println("Полупроходная сумма = "+String.format("%1$.1f",abiturients.getHalfSummMarks()));
        abiturients.getWithHalfSummMark().print();
        println("Поиск по имени. Введите имя:");
        s = inputStr();if (abiturients.findByName(s)==null)println("Нет абитуриента с именем "+s);
        System.out.println(abiturients.findByName(s));
        println("Поиск по ID. Введите ID:");
        s = inputStr();
        if (chkInt(s)){
            if (abiturients.findById(Integer.parseInt(s))==null)println("Нет абитуриента с ID "+s);
            System.out.println(abiturients.findById(Integer.parseInt(s)));
        }
        System.out.println("------PROGRAMM-END-----");
    }

    static String RandName() {
        return chr() + chr() + chr() + chr() + chr();
    }

    static String chr() {
        return Character.toString((char) (new Random().nextInt(24) + 65));
    }
    static String inputStr() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
    static boolean chkInt (String s)
    {
        try {int i = Integer.parseInt(s); return true;}
        catch (NumberFormatException e){println("Некоректный ввод, это не целое число"+" = "+e);return false; }
    }
    static boolean chkFloat (String s)
    {
        try {float i = Float.parseFloat(s); return true;}
        catch (NumberFormatException e){println("Некоректный ввод, это не вещественное число"+" = "+e);return false; }
    }
    static void println(String s) {
        System.out.println(s);
    }
}
