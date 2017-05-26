package _module2.les_15_161223._books;

import java.util.Arrays;

public class BookTest {
    public static void main(String[] args) {
        Book [] books = new Book[6];
        books [0] = new Book("War and Peace","Tolstoy",1823);
        books [1] = new Book("Master and Margarite","Bulgakov",1892);
        books [2] = new Book("Crime and punishment","Dostoevskiy",1912);
        books [3] = new Book("The Government Inspector","Gogol",1836);
        books [4] = new Book("Ruslan i Ludmila","Pushkin",1830);
        books [5] = new Book("Evenings on a Farm Near Dikanka","Gogol",1830);

        System.out.println(Arrays.toString(books));
        System.out.println("---------------------");
        Arrays.sort(books,Book.BY_NAME);
        System.out.println("Sort by name:");
        System.out.println(Arrays.toString(books));
        System.out.println("---------------------");
        Arrays.sort(books,Book.BY_AUTHOR);
        System.out.println("Sort by author:");
        System.out.println(Arrays.toString(books));
        System.out.println("---------------------");
        Arrays.sort(books,Book.BY_YEAR);
        System.out.println("Sort by year:");
        System.out.println(Arrays.toString(books));
        System.out.println("---------------------");


        System.out.println("---------------------");
        Arrays.sort(books,Book.BY_YEAR.thenComparing(Book.BY_NAME));
        System.out.println("Sort by year then by name:");
        System.out.println(Arrays.toString(books));
        System.out.println("---------------------");
    }
}
