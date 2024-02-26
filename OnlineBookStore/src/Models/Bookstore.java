package Models;

import java.util.ArrayList;
import java.util.List;

public class Bookstore {

    public static   List<Book> books;

    public Bookstore() {
        this.books = new ArrayList<>();
    }

    public  void addBook(Book book) {
        books.add(book);
    }

    public  List<Book> getBooks() {
        return books;
    }

}
