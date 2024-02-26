package DAO;

import Models.Book;
import Models.Bookstore;

import java.util.List;
import java.util.stream.Collectors;

public class DatabseDAO implements BookDAO{

    Bookstore bookstore = new Bookstore();
    @Override
    public  void addBook(Book book) {
       // Book newBook = new Book("NewBook", "Science", 15);
        List<Book> updatedBooks = bookstore.getBooks().stream()
                .peek(books -> System.out.println(
                        books.getTitle() + " - Category: " + books.getCategory() +
                                " - Quantity: " + books.getQuantity())).collect(Collectors.toList());

System.out.println("new book added successfully");
    }

    @Override
    public void updatedBooks(Book book) {
       // Book newBook1 = new Book("NewBook", "social", 25);
        List<Book> updatedBooks = bookstore.getBooks().stream()
                .peek(books -> System.out.println(
                        books.getTitle() + " - Category: " + books.getCategory() +
                                " - Quantity: " + books.getQuantity()))
                .collect(Collectors.toList());
        System.out.println("New book updated successfully.");
    }

    @Override
    public void deletedBooks(Book book) {
       // Book newBook2 = new Book("NewBook1","History",5);
        List<Book> deletedBooks = bookstore.getBooks().stream()
                .peek(books -> System.out.println(
                        books.getTitle() + " - Category: " + books.getCategory() +
                                " - Quantity: " + books.getQuantity()))
                .collect(Collectors.toList());
    }
}
