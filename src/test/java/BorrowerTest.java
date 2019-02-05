import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BorrowerTest {
    Book book;
    Library library;
    Borrower borrower;

    @Before
    public void before(){
        borrower = new Borrower();
        book = new Book("Addicted", "Tony Adams", "Biography");
        library = new Library(5);
        library.addBook(book);
    }

    @Test
    public void countBorrowedBooks(){
        assertEquals(0, borrower.countBorrowedBooks());
    }

    @Test
    public void addBookToBorrowed(){
        borrower.addBorrowedBook(book);
        assertEquals(1, borrower.countBorrowedBooks());
    }

    @Test
    public void canBorrowFromLibrary(){
        borrower.canBorrowBook(library);
        assertEquals(1, borrower.countBorrowedBooks());
        assertEquals(0, library.stockCount());
    }
}
