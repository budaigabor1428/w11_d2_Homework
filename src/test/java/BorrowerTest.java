import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Library library;
    Book book;

    @Before
    public void before () {
        borrower = new Borrower();
        library = new Library(50000);
        book = new Book ("Lord of the Rings", "J.R.R. Tolkien","Fantasy");
    }

    @Test
    public void canCountTheBooksInTheCollection(){
        assertEquals(0, this.collection.collectionCount());
    }

    @Test
    public void canGetBookFromLibrary(){
        borrower.getBookFromLibrary(library);
        assertEquals(1, borrower.collectionCount());
        assertEquals(0, library.bookCount());
    }


}
