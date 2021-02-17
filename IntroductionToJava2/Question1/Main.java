package Question1;

interface BookInfo {
    void get_bookInfo(String title);
}

public class Main {
    public static void main(String[] args) {
        Customer cust = new Customer("Ram", 101, "regular");
        Librarian librarian = new Librarian("Ramesh", 201, 2031, "City Library");
        librarian.addBook("We Can Win", "Shiv Khera", 30001, 499);
        librarian.showBooks();
        cust.get_bookInfo("We Can Win");

    }
}
