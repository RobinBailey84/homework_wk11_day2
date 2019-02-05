import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before(){
        book = new Book("Addicted", "Tony Adams", "Biography");
    }

    @Test
    public void bookhasTitle() {
        assertEquals("Addicted", book.getTitle());
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("Tony Adams", book.getAuthor());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("Biography", book.getGenre());
    }
}
