package _module2.les_15_161223._books;

import java.util.Comparator;

public class Book {
    private String name;
    private String author;
    private int year;
    static Comparator <Book> BY_NAME = new Comparator<Book>() {
        @Override
        public int compare(Book b1, Book b2) {
           return b1.getName().compareTo(b2.getName());
        }
    };
    static Comparator <Book> BY_AUTHOR = new Comparator<Book>() {
        @Override
        public int compare(Book b1, Book b2) {
            return b1.getAuthor().compareTo(b2.getAuthor());
        }
    };
    static Comparator <Book> BY_YEAR = new Comparator<Book>() {
        @Override
        public int compare(Book b1, Book b2) {
            return Integer.compare(b1.getYear(),b2.getYear());
        }
    };

    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}'+"\n";
    }

}
