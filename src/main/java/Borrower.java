import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> borrowed;

    public Borrower(){
        this.borrowed = new ArrayList<Book>();
    }

    public int countBorrowedBooks(){
        return this.borrowed.size();
    }

    public void addBorrowedBook(Book book){
        this.borrowed.add(book);
    }

    public void canBorrowBook(Library library){
        Book borrowedBook = library.removeBook();
        addBorrowedBook(borrowedBook);
    }

}
