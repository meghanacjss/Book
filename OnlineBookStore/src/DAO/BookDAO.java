package DAO;

import Models.Book;

public interface BookDAO {

 void addBook(Book book);

 void updatedBooks(Book book);

 void deletedBooks(Book book);
}
