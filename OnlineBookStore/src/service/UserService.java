package service;

import Models.Book;
import Models.Bookstore;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import static Models.Bookstore.books;

public class UserService {
    Scanner scanner = new Scanner(System.in);
    public void loginUser() {

        try {
            System.out.println("ENTER LOGIN USERNAME");
            String username = scanner.nextLine();
            System.out.println("ENTER LOGIN PASSWORD");
            String password = scanner.nextLine();
            System.out.print("Enter your credit/debit card number: ");

            int cardNumber = scanner.nextInt();
            scanner.nextLine();

            if (cardNumber >=5) {
                System.out.println("Transaction completed successfully.");
               Bookstore bookstore = new Bookstore();
                bookstore.addBook(new Book("Book1", "Software", 10));
                bookstore.addBook(new Book("Book2", "History", 5));
                bookstore.addBook(new Book("Book3", "English", 15));
                bookstore.addBook(new Book("Book4", "datascience", 35));
                bookstore.addBook(new Book("Book5", "java", 45));

                System.out.println("Available Book Categories:");
                System.out.println("1. Software\n2. History\n3. English\n4. Science\n5. Hardware");
                System.out.println("Enter the category number to view books: ");
                int categoryNumber = scanner.nextInt();
                scanner.nextLine();
                String selectedCategory = getCategoryByChoice(categoryNumber);
                List<Book> booksInCategory = getBooksByCategory(bookstore, selectedCategory);
                System.out.println("Books in " + selectedCategory + " category:");
                booksInCategory.stream().filter(book -> book.getQuantity() > 0)
                        .forEach(book -> System.out.println(book.getTitle() + " - Quantity: " + book.getQuantity()));
//                for (Book book : booksInCategory) {
//                    System.out.println(book.getTitle() + " - Quantity: " + book.getQuantity());
//                }

                System.out.print("Enter the title of the book you want to buy: ");
                String selectedBookTitle = scanner.nextLine();
                int flag=0;
                for (Book book : books) {
                    if (book.getTitle().equalsIgnoreCase(selectedBookTitle)) {
                        flag=1;
                        System.out.println("Order placed successfully for " + book.getTitle());
                        break;
                    }

                }
                if(flag==0)
                {
                    System.out.println("Sorry, the selected book is not available.");
                }

//                if (selectedBook != null && selectedBook.getQuantity() > 0) {
//                    System.out.println("Order placed successfully for " + selectedBook.getTitle());
//                } else {
//                    System.out.println("Sorry, the selected book is not available.");
//                }
            } else {
                System.out.println("Transaction is unsuccessful");
            }

        } catch (InputMismatchException e) {
            System.out.println("Input mismatch exception. Please enter valid input.");
        }
    }


    public static List<Book> getBooksByCategory(Bookstore bookstore, String category) {
        List<Book> booksInCategory = new ArrayList<>();
        for (Book book : bookstore.getBooks()) {
            if (book.getCategory().equalsIgnoreCase(category)) {
                booksInCategory.add(book);
            }
        }
        return booksInCategory;
    }

    public static String getCategoryByChoice(int choice) {
        switch (choice) {
            case 1:
                return "Software";
            case 2:
                return "History";
            case 3:
                return "English";
            case 4:
                return "Science";
            case 5:
                return "Hardware";
            default:
                System.out.println("Invalid category number. Please choose a valid option.");
                System.exit(0);
                return "";
        }
    }
}


