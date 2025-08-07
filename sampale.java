abstract class Item {
    protected String title;
    protected String author;

    public Item(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public abstract void display();
}

class Book extends Item {
    protected String genre;

    public Book(String title, String author, String genre) {
        super(title, author);
        this.genre = genre;
    }
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
    }
}

class BorrowedBook extends Book {
    private String borrowerName;
    private String dueDate;

    public BorrowedBook(String title, String author, String genre, String borrowerName, String dueDate) {
        super(title, author, genre);
        this.borrowerName = borrowerName;
        this.dueDate = dueDate;
    }

    public void display() {
        super.display();
        System.out.println("Borrower: " + borrowerName);
        System.out.println("Due Date: " + dueDate);
    }
}

public class sampale {
    public static void main(String[] args) {
        BorrowedBook bb = new BorrowedBook(
            "Wings of Fire", 
            "A.P.J Abdul Kalam", 
            "Autobiography", 
            "Suhaib Shafi Jan", 
            "2025-08-15"
        );
        bb.display();
    }
}
