import java.util.ArrayList;

public class Library {

    private ArrayList<Library> books;
    private int capacity;

    public Library(){
        this.books = new ArrayList<Library>();
    }

    public int getNoOfBooks() {
        return this.books.size();
    }


    public void addBook(Library book) {
        this.books.add(book);
    }
}
