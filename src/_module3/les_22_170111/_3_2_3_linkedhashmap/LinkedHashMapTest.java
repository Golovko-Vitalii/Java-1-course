package _module3.les_22_170111._3_2_3_linkedhashmap;

import java.util.*;
/**
 * Найти совпадение во всех текстах.
 */
public class LinkedHashMapTest {
    public static void main(String[] args) {
        String[] booksStr = new String[4];
        booksStr[0] = "The story in this book show you best way how to coding patterns and try to study you new patterns" +
                " java 8, there is many examples and teach you how to practice nad increase your skills :) ...";
        booksStr[1] = "Book tells us about life way of one of the best programmer in Java . Study is life and you" +
                " should to practice :) ...";
        booksStr[2] = "My dear friend! Practice - the best way :) Reading this volume is good way study and learn" +
                " how to best code in java ...";
        booksStr[3] = "There It Is :) ! Book with the best practice of JAVA , shows you way how to study ...";
        Map<String, LinkedHashMap> library = new LinkedHashMap();
        for (int i = 0; i < booksStr.length; i++) {
            library.put("book" + " " + (i + 1), convertBook(booksStr[i]));
        }
        for (Map.Entry<String, LinkedHashMap> book : library.entrySet()) {
            System.out.println(book);
            System.out.println(book.getKey() + " count of words = " + book.getValue().size());
        }
        List<String> coincidenceWordstmp = new ArrayList<>();
        // В начале задаем поиск совпадений из первой книги
        coincidenceWordstmp.addAll(library.get("book 1").values());
        // Поисковые значения в нижний регистр
        for (int i = 0; i < coincidenceWordstmp.size(); i++) {
            coincidenceWordstmp.set(i, coincidenceWordstmp.get(i).toLowerCase());
        }
        for (int i = 0; i < coincidenceWordstmp.size(); i++) {
            Iterator<Map.Entry<String, LinkedHashMap>> libraryIterable = library.entrySet().iterator();
            while (libraryIterable.hasNext()) {
                LinkedHashMap<Integer, String> book = libraryIterable.next().getValue();
                List<String> wordsOfCurrentBook = new ArrayList<>();
                for (String s : book.values()) {
                    wordsOfCurrentBook.add(s.toLowerCase());
                }
                if (!wordsOfCurrentBook.contains(coincidenceWordstmp.get(i))) {
                    coincidenceWordstmp.set(i, "");
                }
            }
        }
        Set<String> coincidenceWords = new LinkedHashSet<String>();
        for (String s : coincidenceWordstmp) {
            if (!s.equals("")) coincidenceWords.add(s);
        }
        System.out.println("coincidenceWords = " + coincidenceWords);
        Set<String> coincidenceWordsnew = new LinkedHashSet<String>() {
            @Override
            public String toString() {
                Iterator<String> it = iterator();
                if (!it.hasNext())
                    return "[]";

                StringBuilder sb = new StringBuilder();
                sb.append('[');
                sb.append(' ');
                for (; ; ) {
                    String e = it.next();
                    sb.append(e);
                    if (!it.hasNext())
                        return sb.append('!').append(']').toString();
                    sb.append(' ');
                }
            }
        };
        for (String s : coincidenceWordstmp) {
            if (!s.equals("")) coincidenceWordsnew.add(s.toUpperCase());
        }
        System.out.println("coincidenceWordsnew = " + coincidenceWordsnew);
    }

    private static LinkedHashMap convertBook(String bookStr) {
        LinkedHashMap<Integer, String> book = new LinkedHashMap<>();
        for (int i = 0; i < bookStr.split(" ").length; i++) {
            book.put(i, bookStr.split(" ")[i]);
        }
        return book;
    }
}
