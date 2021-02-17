package Question1;


public class Book {
    private String title;
    private String author;
    private int ISBN;
    private int cost;
    private boolean issued;

    public Book(String title, String author, int ISBN, int cost) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.cost = cost;
        this.issued = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getISBN() {
        return ISBN;
    }
}