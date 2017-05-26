package _module3.les_20_170106._3_2_1_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BookListTest {
    public static void main(String[] args) {
        List <Book> books = new ArrayList<>();
        books.add(new Book("Hortsman","Prog java 1", 2015));
        books.add(new Book("Hortsman","Prog java 2", 2016));
        books.add(new Book("Eckel","Thining in java", 2009));
        books.add(new Book("Bloch","Effective java", 2002));
        books.add(new Book("Shildt","Java SE", 2010));
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input year");
        List <Book> booksAfterYear=getBooksAfterYear(scanner.nextInt(),books);
        System.out.println("booksAfterYear = " + booksAfterYear);

        System.out.println("Input author");
        List <Book> booksByAuthor=getBooksByAuthor(scanner.next(),books);
        System.out.println("booksByAuthor = " + booksByAuthor);
    }

    static List <Book> getBooksAfterYear (int year, List <Book> books){
        List <Book> bYear = new ArrayList<>();
        Iterator <Book> bookIterator = books.iterator();
        while (bookIterator.hasNext()){
            Book i = bookIterator.next();
            if (i.getYear()>=year) bYear.add(i);
        }
        return bYear;
    }

    static List <Book> getBooksByAuthor (String author, List <Book> books){
        List <Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) result.add(book);
        }
        return result;
    }
}
