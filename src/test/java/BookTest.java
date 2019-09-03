import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before

    public void setup(){
        book = new Book ("The Blade Artist", "Irvine Welsh", "Humourous Fiction");
    }

    @Test
    public void canGetTitle(){
        assertEquals("The Blade Artist", book.getTitle());
    }

    @Test
    public void canGetAuthor(){
        assertEquals("Irvine Welsh", book.getAuthor());
    }

    @Test
    public void canGetGenre(){
        assertEquals("Humourous Fiction", book.getGenre());
    }
}
