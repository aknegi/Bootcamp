package Question1;

public class Librarian extends User {
    private int retirement;
    Book bookObj = null;

    Librarian(String name, int id, int retirement, String atLibrary) {
        this.name = name;
        this.id = id;
        this.retirement = retirement;
        this.libName = atLibrary;
    }

    public int getRetirement() {
        return retirement;
    }

    public void addBook(String title, String auth, int isbn, int cost) {
        bookObj = new Book(title, auth, isbn, cost);
        books.add(bookObj);
    }

    public void issueBook(String title, boolean issued) {
        System.out.println("check if book is issued or not and take futher actions");
    }

    public void get_bookInfo(String title) {
        if (searchByName(title)) {
            System.out.println("Librarian called the get_bookinfo method");
        } else {
            System.out.println("Book is not available");
        }
    }
}