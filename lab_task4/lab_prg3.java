import java.util.*;
class Book {
    String title;
    String author;
    double price;
    
    // Parameterized constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Copy constructor
    Book(Book b) {
        this.title = b.title;
        this.author = b.author;
        this.price = b.price;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
}

public class lab4_prg3 {
    public static void main(String[] args) {
        Book firstBook = new Book("Java Programming", "John Doe", 299.99);
        Book secondBook = new Book(firstBook); // copy constructor

        System.out.println("First Book:");
        firstBook.display();

        System.out.println();
        System.out.println("Copied Book:");
        secondBook.display();
    }
}
