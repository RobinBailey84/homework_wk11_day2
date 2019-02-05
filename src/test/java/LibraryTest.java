import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LibraryTest {

    Book book;
    Library library;

    @Before
    public void before(){
        book = new Book("Ant Middleton","First Man in", "Biography");
        library = new Library(5);
    }

    @Test
    public void checkStock(){
        assertEquals(0, library.stockCount());
    }

    @Test
    public void canAddBook(){
        library.addBook(book);
        assertEquals(1, library.stockCount());
    }

    @Test
    public void stockIsFull(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(5, library.stockCount());
    }

    @Test
    public void bookCanBeRemoved(){
        library.addBook(book);
        library.addBook(book);
        library.removeBook();
        assertEquals(1, library.stockCount());
    }

}
