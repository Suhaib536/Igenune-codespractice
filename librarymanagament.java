abstract class ITEM {
    private String title;
    private String author;

    public ITEM(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public abstract void display();

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

interface Borrow {
    void Borrower();
}

class BOOK extends ITEM implements Borrow {
    private String Genre;

    public BOOK(String title, String author, String Genre) {
        super(title, author);
        this.Genre = Genre;
    }

    public void display() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Genre: " + Genre);
    }

    public void Borrower() {
        System.out.println("This book was written in 10 days.");
    }
}

class BorrowedBook extends BOOK {
    private String borrower;
    private int duedate;

    public BorrowedBook(String title, String author, String Genre, String borrower, int duedate) {
        super(title, author, Genre);
        this.borrower = borrower;
        this.duedate = duedate;
    }

    public void display() {
        super.display();
        System.out.println("Borrower: " + borrower);
        System.out.println("Due Date in: " + duedate + " days");
    }
}

public class librarymanagament {
    public static void main(String[] args) {
        BorrowedBook[] books = new BorrowedBook[3];
        books[0] = new BorrowedBook("Wings of Fire", "A.P.J Abdul Kalam", "Autobiography", "k", 10);
        books[1] = new BorrowedBook("Wings", "A.P.J Abdul Kalam", "Autobiography", "b", 10);
        books[2] = new BorrowedBook("Wings  Fire", "A.P.J Abdul Kalam", "Autobiography", "s", 10);
        
        for (BorrowedBook book : books) {
            book.display();
        }
    }
}
