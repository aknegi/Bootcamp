package Question1;

import java.util.ArrayList;
import java.util.List;

public abstract class Library {
    protected String libName;
    private Book bokObj = null;
    static List<Book> books = new ArrayList<Book>();

    public boolean searchByName(String title) {
        for (Book b : books)
            if (b.getTitle().equals(title)) {
                return true;
            }
        return false;
    }

    public void showBooks() {
        for (Book b : books)
            System.out.println(b.getTitle());
    }
}

