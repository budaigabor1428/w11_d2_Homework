import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;
    Borrower borrower;

    @Before
    public void before() {
        library = new Library(50000);
        book = new Book("Lord of the Rings", "J.R.R. Tolkien", "Fantasy");
        borrower = new Borrower();
    }

    @Test
    public void canCountTheNumberOfBooksInTheLibrary() {
        assertEquals(0, this.library.bookCount());
    }

    @Test
    public void canAddBookWhenStockIsNotFull() {
        this.library.addBook(book);
        this.library.addBook(book);
        assertEquals(2, library.bookCount());
    }

    @Test
    public void canNotAddBookWhenStockIsFull() {
        library = new Library(2);
        this.library.addBook(book);
        this.library.addBook(book);
        this.library.addBook(book);
        assertEquals(2, this.library.bookCount());

    }

    @Test
    public void canRemoveBookFromLibrary(){
        library.addBook(book);
        library.removeBook();
        assertEquals(0, library.bookCount());
    }


}
