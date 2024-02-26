package service;
import DAO.DatabseDAO;
import Models.Book;
import Models.Bookstore;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import DAO.BookDAO;
public class AdminService{
 BookDAO databaseDAO = new DatabseDAO();

 public void loginAdmin() {
  Scanner scanner = new Scanner(System.in);
  Bookstore bookstore = new Bookstore();
  System.out.print("Enter your admin username: ");
  String username1 = scanner.nextLine();
  System.out.println("username is correct then go to next step");

  System.out.print("Enter your admin password: ");
  String password1 = scanner.nextLine();
  System.out.println("password is correct");


  System.out.println("1:Add book");
  System.out.println("2:update book");
  System.out.println("3:delete book");
  int choices = scanner.nextInt();
  boolean select = true;
  do{
   switch(choices){
    case 1:

     System.out.print("Enter the title of the book: ");
     String title = scanner.next();
     System.out.print("Enter the category of the book: ");
     String category = scanner.next();
     System.out.print("Enter the quantity of the book: ");
     int quantity = scanner.nextInt();
     Book newBook = new Book(title, category, quantity);
     databaseDAO.addBook(newBook);
     System.out.println("Book added successfully.");
     break;
    case 2:
     System.out.print("Enter the title of the book: ");
     String title1 = scanner.next();
     System.out.print("Enter the category of the book: ");
     String category1 = scanner.next();
     System.out.print("Enter the quantity of the book: ");
     int quantity1 = scanner.nextInt();
     Book newBook1 = new Book(title1, category1, quantity1);
     databaseDAO.addBook(newBook1);
     System.out.println("Book updated successfully.");
     break;
    case 3:
     System.out.print("Enter the title of the book: ");
     String title2 = scanner.next();
     System.out.print("Enter the category of the book: ");
     String category2 = scanner.next();
     System.out.print("Enter the quantity of the book: ");
     int quantity2 = scanner.nextInt();
     Book newBook2 = new Book(title2, category2, quantity2);
     databaseDAO.addBook(newBook2);
     System.out.println("Book deleted successfully.");
     break;
    default:
     System.out.println("invalid choice plz choose valid choice");
     System.exit(0);
   }
  }while(select);

//  Book newBook = new Book("NewBook", "Science", 15);
// databaseDAO.addBook(newBook);
//
//
//
//  System.out.println("Updated list of books:");
//  Book newBook1 = new Book("NewBook", "social", 25);
// databaseDAO.updatedBooks(newBook1);

//  List<Book> updatedBooks = bookstore.getBooks().stream()
//          .peek(book -> System.out.println(
//                  book.getTitle() + " - Category: " + book.getCategory() +
//                          " - Quantity: " + book.getQuantity()))
//          .collect(Collectors.toList());
//  System.out.println("New book updated successfully.");



//  Book newBook2 = new Book("NewBook1","History",5);
//  System.out.println("deleted list of book:");
 // databaseDAO.deletedBooks(newBook2);
//  List<Book> deletedBooks = bookstore.getBooks().stream()
//          .peek(book -> System.out.println(
//                  book.getTitle() + " - Category: " + book.getCategory() +
//                          " - Quantity: " + book.getQuantity()))
//          .collect(Collectors.toList());
 }
}

