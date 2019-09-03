import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void setup(){
        library = new Library();
        book = new Book("The Blade Artist", "Irvine Welsh", "Humorous Fiction");

    }

    @Test
    public void getNoOfBooksInLibrary(){
        assertEquals(0, library.getNoOfBooks());
    }

    @Test
    public void addBook(){
        library.addBook(book);
        assertEquals(1, library.getNoOfBooks());
    }

}
