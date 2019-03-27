import java.util.ArrayList;

public class Library {
    private ArrayList <Book> library;
    private int capacity;

    public Library(int capacity){
        this.library = new ArrayList<>();
        this.capacity = capacity;
    }

    public int bookCount() {
        return this.library.size();
    }

    public int addBook(Book book) {
        if(this.library.size() < this.capacity) {
            library.add(book);
        }
        return this.bookCount();
    }

    public Book removeBook() {
        return this.library.remove(0);
    }
}
